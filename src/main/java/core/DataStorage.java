package core;

import DTO.GeographicCoordinates;
import DTO.ISSData;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class DataStorage {

    private LocalDateTime date;
    private GeographicCoordinates geographicCoordinates;
    private String message;

    public void update(ISSData issData) {
        date = LocalDateTime.ofInstant(Instant.ofEpochMilli(issData.getTimestamp()), TimeZone.getDefault().toZoneId());
        geographicCoordinates = new GeographicCoordinates(issData.getLatitude(), issData.getLongitude());
        message = issData.getMessage();
        System.out.println("Updated storage at " + LocalTime.now());
    }

}
