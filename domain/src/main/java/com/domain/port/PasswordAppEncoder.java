package com.domain.port;

public interface PasswordAppEncoder {

    String encode(String rawPassword);
    boolean matches(String rawPassword, String encodedPassword);
}
