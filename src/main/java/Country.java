import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Country {
    @JsonProperty("post code")
    public String postCode;
    @JsonProperty("country")
    public String country;
    @JsonProperty("country abbreviation")
    public String countryAbbreviation;
    @JsonProperty("places")
    public List<Place> places;
}
