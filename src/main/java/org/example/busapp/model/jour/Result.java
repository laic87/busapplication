package org.example.busapp.model.jour;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    @JsonProperty(value = "LineNumber")
    private String lineNumber;
    @JsonProperty(value = "JourneyPatternPointNumber")
    private String journeyPatternPointNumber;
}
