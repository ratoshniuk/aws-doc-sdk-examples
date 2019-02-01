package com.example.dynamodb;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

import java.net.URI;

class DynamoHelper {

    private static final String dynamoDbUri = "http://localhost:8042";


    private DynamoHelper() {
    }


    static DynamoDbClient getClient() {
        return DynamoDbClient.builder()
                      .endpointOverride(URI.create(dynamoDbUri))
                      .build();
    }
}
