import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Place {

    @JsonProperty("place name")
    public String placeName;
    @JsonProperty("longitude")
    public String longitude;
    @JsonProperty("state")
    public String state;
    @JsonProperty("state abbreviation")
    public String stateAbbreviation;
    @JsonProperty("latitude")
    public String latitude;

}
