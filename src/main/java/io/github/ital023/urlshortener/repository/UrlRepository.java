package io.github.ital023.urlshortener.repository;

import io.github.ital023.urlshortener.entities.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {

}
