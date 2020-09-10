package inbound;

import DTO.ISSData;

import java.io.IOException;
import java.util.Optional;

public class DataProvider {

    private static final String URL = "http://api.open-notify.org/iss-now.json";

    public static Optional<ISSData> getISSData() {
        String rawJson;
        try {
            rawJson = RawDataProvider.requestCurrentData(URL);
        } catch (IOException e) {
            System.out.println("Error getting data from " + URL);
            e.printStackTrace();
            return Optional.empty();
        }
        return Optional.ofNullable(DataMapper.mapJsonToISSData(rawJson));
    }

}
