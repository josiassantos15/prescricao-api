package com.josias.prescricao_api.common;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved"),
            @ApiResponse(responseCode = "400", description = "Bad Request - Malformed Request", content = {
                @Content(schema = @Schema(implementation = ErrorInformation.class), mediaType = "application/json",
                        examples = {
                                @ExampleObject(
                                        value = "{\"dateTime\":\"19/09/2023 20:28:01\",\"httpStatus\":400,\"errorMessage\":\"Generic error message\",\"url\":\"/errorMessage\"}"
                                )
                        })
        }),
        @ApiResponse(responseCode = "500", description = "Internal Server Error - Internal server error while trying to process request", content = {
                @Content(schema = @Schema(implementation = ErrorInformation.class), mediaType = "application/json",
                        examples = {
                                @ExampleObject(
                                        value = "{\"dateTime\":\"19/09/2023 20:28:01\",\"httpStatus\":500,\"errorMessage\":\"Error Making Request\",\"url\":\"/errorMessage\"}"
                                )
                        })
        })
})
public interface GeneralOperations {
}