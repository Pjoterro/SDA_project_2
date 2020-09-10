package inbound;

import DTO.ISSData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataMapper {

    public static ISSData mapJsonToISSData(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        ISSData issData = null;
        try {
            issData = objectMapper.readValue(json, ISSData.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return issData;
    }

}
