package io.github.ital023.urlshortener.service;

import io.github.ital023.urlshortener.dto.ShortenUrlRequestDTO;
import io.github.ital023.urlshortener.dto.ShorterUrlResponseDTO;
import io.github.ital023.urlshortener.entities.UrlEntity;
import io.github.ital023.urlshortener.repository.UrlRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.time.LocalDateTime;

@Service
public class UrlService {

    @Autowired
    private UrlRepository urlRepository;

    public ShorterUrlResponseDTO shorterUrl(ShortenUrlRequestDTO shortenUrlRequestDTO,
                                            HttpServletRequest servletRequest){

        String id = generateId();

        UrlEntity urlEntity = UrlEntity
                .builder()
                .id(id)
                .fullUrl(shortenUrlRequestDTO.url())
                .expiresAt(LocalDateTime.now().plusMinutes(5))
                .build();

        urlRepository.save(urlEntity);

        var redirectUrl = servletRequest.getRequestURL().toString().replace("shorten-url", id);

        return new ShorterUrlResponseDTO(redirectUrl);
    }

    public HttpHeaders redirect(String id){
        var url = urlRepository.findById(id);

        if(url.isEmpty()){
            throw new RuntimeException();
        }

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(URI.create(url.get().getFullUrl()));

        return httpHeaders;
    }


    private String generateId(){
        int exists = 1;

        while(exists == 1){
            String id = RandomStringUtils.randomAlphanumeric(5,10);

            if(urlRepository.existsById(id)){
                exists = 1;
            }else{
                return id;
            }

        }
        return null;
    }


}
