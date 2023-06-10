package com.pragma.powerup.messagingmicroservice.adapters.driving.http.controller;

import com.pragma.powerup.messagingmicroservice.adapters.driving.http.dto.request.SmsInfoDto;
import com.pragma.powerup.messagingmicroservice.adapters.driving.http.handlers.ISmsHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/sms")
@RequiredArgsConstructor
@SecurityRequirement(name = "jwt")
public class SmsController {

    private final ISmsHandler smsHandler;

    @Operation(summary = "Send a sms",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Sms was send successfully",
                            content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "400", description = "Bad request (check response message)",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))),
                    @ApiResponse(responseCode = "401", description = "Unauthorized request",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))),
                    @ApiResponse(responseCode = "500", description = "Error with the sms provider",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))
            })
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void sendSms(@Valid @RequestBody SmsInfoDto smsInfoDto) {
        smsHandler.sendSms(smsInfoDto);
    }
}
