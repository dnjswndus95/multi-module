package com.example.chargingstationcore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@AllArgsConstructor
public class ChargingStationDetailInfo {

    @Getter
    public static class requestDto {
        @NotNull
        @JsonProperty("chargingStationId")
        private String chargingStationId;
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class responseDto {
        private String chargingStationId;
        private String chargingStationName;
        private Date createDate;
    }
}
