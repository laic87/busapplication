package org.example.busapp.model.stop;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    @JsonProperty(value = "StopPointNumber")
    private String stopPointNumber;
    @JsonProperty(value = "StopPointName")
    private String stopPointName;
}
