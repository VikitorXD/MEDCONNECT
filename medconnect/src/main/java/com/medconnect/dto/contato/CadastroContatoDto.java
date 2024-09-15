package com.medconnect.dto.contato;

import com.medconnect.model.Cliente;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record CadastroContatoDto(
        int ddi,
        int ddd,
        Long telefone) {
}
