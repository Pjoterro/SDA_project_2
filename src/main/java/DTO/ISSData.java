package DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ISSData {

    @JsonProperty("timestamp")
    private long timestamp;

    @JsonProperty("message")
    private String message;

    @JsonProperty("latitude")
    private long latitude;

    @JsonProperty("longitude")
    private long longitude;

    public long getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public long getLatitude() {
        return latitude;
    }

    public long getLongitude() {
        return longitude;
    }
}
