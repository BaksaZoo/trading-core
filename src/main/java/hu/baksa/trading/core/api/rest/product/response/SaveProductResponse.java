package hu.baksa.trading.core.api.rest.product.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

public record SaveProductResponse(
        Long id
) {

    @JsonIgnore
    public URI getCreatedUri(){
        return ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id())
                .toUri();
    }
}
