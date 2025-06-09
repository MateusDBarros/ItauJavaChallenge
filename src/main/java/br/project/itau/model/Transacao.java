package br.project.itau.model;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class Transacao {

    private Long id;
    private Float valor;
    private OffsetDateTime dataHora;
}
