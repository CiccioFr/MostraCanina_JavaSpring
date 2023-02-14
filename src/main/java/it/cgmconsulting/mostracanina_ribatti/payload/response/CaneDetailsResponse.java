package it.cgmconsulting.mostracanina_ribatti.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CaneDetailsResponse {
    private String codiceCane;
    private String nome;
    private LocalDate dataNascita;
}
