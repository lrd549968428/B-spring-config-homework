package com.thoughtworks.capability.gtb.demospringconfig;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties("mail")
@Data
@ToString
public class MailConfig {

    private String hostname;
    private int port;
    private String from;

    private List<String> defaultRecipients;
    private Map<String, Boolean> additionalHeaders;
    private Credentials credentials;
}
