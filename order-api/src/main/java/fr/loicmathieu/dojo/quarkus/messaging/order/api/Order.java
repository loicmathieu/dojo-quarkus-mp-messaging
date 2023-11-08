package fr.loicmathieu.dojo.quarkus.messaging.order.api;

public record Order (
    int nbItem,
    int totalPrice,
    String userId,
    String shippingAddress
) {}
