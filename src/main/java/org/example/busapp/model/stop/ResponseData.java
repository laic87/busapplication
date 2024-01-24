package org.example.busapp.model.stop;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ResponseData {
    @JsonProperty(value = "Result")
    List<Result> result;
}
