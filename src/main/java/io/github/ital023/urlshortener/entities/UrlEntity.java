package io.github.ital023.urlshortener.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "urls")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UrlEntity {

    @Id
    private String id;

    private String fullUrl;

    @Indexed(expireAfterSeconds = 0)
    private LocalDateTime expiresAt;

}
