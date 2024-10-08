package com.medconnect.dto.email;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record CadastroEmailDto(
        @NotNull(message = "O e-mail não pode ser nulo")
        @Email(message = "O e-mail deve ser válido")
        String email
) {

}
