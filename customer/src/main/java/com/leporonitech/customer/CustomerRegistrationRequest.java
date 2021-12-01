package com.leporonitech.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
