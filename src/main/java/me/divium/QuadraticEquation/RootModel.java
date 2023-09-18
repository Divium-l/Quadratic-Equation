package me.divium.QuadraticEquation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RootModel {
    @JsonProperty("x1")
    private Double root_1;

    @JsonProperty("x2")
    private Double root_2;

    @JsonProperty("status")
    private Integer rootStatus;

    public RootModel(Double root_1, Double root_2, RootStatus rootStatus) {
        this.root_1 = root_1;
        this.root_2 = root_2;
        this.rootStatus = rootStatus.value();
    }
}
