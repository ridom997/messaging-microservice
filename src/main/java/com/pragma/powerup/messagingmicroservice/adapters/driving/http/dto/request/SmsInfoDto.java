package com.pragma.powerup.messagingmicroservice.adapters.driving.http.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static com.pragma.powerup.messagingmicroservice.configuration.Constants.PHONE_REGEX;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SmsInfoDto {
    @NotBlank
    @Schema(example = "3000000000")
    @Pattern(regexp = PHONE_REGEX, message = "Phone is in bad format")
    private String phone;

    @NotBlank
    @Schema(example = "Hello user with phone: 3000000000. Your order is READY! your PIN is: 1111.")
    private String smsBody;
}
