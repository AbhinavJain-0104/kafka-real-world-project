package abhinav.springboot.entity;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

@Entity
@Table(name = "wikimedia_recentchange")
@Getter
@Setter
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String wikiEventData;

    @Transient
    private JsonNode parsedData;

    public void parseData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            this.parsedData = mapper.readTree(wikiEventData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getType() {
        return parsedData.get("type").asText();
    }

    public String getTitle() {
        return parsedData.get("title").asText();
    }

    public String getUser() {
        return parsedData.get("user").asText();
    }

    public String getTimestamp() {
        return parsedData.get("timestamp").asText();
    }

    public String getComment() {
        return parsedData.get("comment").asText();
    }
}