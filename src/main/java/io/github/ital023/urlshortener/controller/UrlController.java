package io.github.ital023.urlshortener.controller;

import io.github.ital023.urlshortener.dto.ShortenUrlRequestDTO;
import io.github.ital023.urlshortener.dto.ShorterUrlResponseDTO;
import io.github.ital023.urlshortener.entities.UrlEntity;
import io.github.ital023.urlshortener.repository.UrlRepository;
import io.github.ital023.urlshortener.service.UrlService;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class UrlController {

    @Autowired
    private UrlService urlService;

    @PostMapping("/shorten-url")
    public ResponseEntity<ShorterUrlResponseDTO> shorterUrl(@RequestBody ShortenUrlRequestDTO shortenUrlRequestDTO,
                                                            HttpServletRequest servletRequest){

        ShorterUrlResponseDTO responseDTO = urlService.shorterUrl(shortenUrlRequestDTO, servletRequest);

        return ResponseEntity.ok(responseDTO);
    }




}
