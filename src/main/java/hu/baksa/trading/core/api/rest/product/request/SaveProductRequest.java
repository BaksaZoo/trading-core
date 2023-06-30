package hu.baksa.trading.core.api.rest.product.request;

public record SaveProductRequest(
    String title,
    String description,
    String imageUrl,
    float price
) { }
