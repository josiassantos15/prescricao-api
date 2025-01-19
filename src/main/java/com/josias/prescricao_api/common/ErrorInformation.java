package com.josias.prescricao_api.common;

import io.swagger.v3.oas.annotations.media.Schema;

public record ErrorInformation(
        @Schema(description = "Http Status", example = "500")
        Integer httpStatus,

        @Schema(description = "Feature that Generated the Error", example = "/genericResourse")
        String url,

        @Schema(description = "Error message caught by Exception", example = "Internal Server Error")
        String errorMessage) {
}