package com.PerfumeStore.PerfumeStore.shared.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String resourceName, Object key) {
        super(generateMessage(resourceName, key.toString()));
    }
    private static String generateMessage(String resourceName, String key) {
        StringBuilder messageBuilder = new StringBuilder(resourceName).
                append(" Resource With Key = ").append(key).append(" Not Found.");
        return messageBuilder.toString();
    }
}