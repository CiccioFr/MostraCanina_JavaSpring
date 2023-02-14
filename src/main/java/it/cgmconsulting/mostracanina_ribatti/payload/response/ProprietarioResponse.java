package it.cgmconsulting.mostracanina_ribatti.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProprietarioResponse {
    private int idProprietario;
    private String nome;
    private String cognome;
}
