package org.example.busapp.model.stop;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StopResponse {
    @JsonProperty(value = "ResponseData")
    private ResponseData responseData;
}
