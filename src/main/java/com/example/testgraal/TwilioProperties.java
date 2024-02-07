package com.example.testgraal;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Objects;


@ConfigurationProperties(prefix = "twilio")
public final class TwilioProperties {
    private final String username;

    public TwilioProperties(String username) {
        this.username = username;
    }

    public String username() {
        return username;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (TwilioProperties) obj;
        return Objects.equals(this.username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return "TwilioProperties[" +
                "username=" + username + ']';
    }

}