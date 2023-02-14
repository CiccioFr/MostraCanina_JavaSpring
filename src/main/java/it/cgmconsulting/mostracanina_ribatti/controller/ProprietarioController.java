package it.cgmconsulting.mostracanina_ribatti.controller;

import it.cgmconsulting.mostracanina_ribatti.payload.response.ProprietarioResponse;
import it.cgmconsulting.mostracanina_ribatti.service.ProprietarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mostra_canina")
@Validated
@Slf4j
public class ProprietarioController {

    @Autowired
    ProprietarioService proprietarioService;

    /**
     * Ricerca il Proprietario partendo dal nome del Cane
     * <p> Url: localhost:8083/mostra_canina/proprietario/{nomeCane} </p>
     * @param nomeCane nome del cane
     * @return
     */
    @GetMapping("/proprietario/{nomeCane}")
    public ResponseEntity getProprietario(@PathVariable String nomeCane){
        ProprietarioResponse proprietario = proprietarioService.getProprietario(nomeCane);
        return new ResponseEntity(proprietario, HttpStatus.OK);
    }
}
