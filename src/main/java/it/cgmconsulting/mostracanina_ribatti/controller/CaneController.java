package it.cgmconsulting.mostracanina_ribatti.controller;

import it.cgmconsulting.mostracanina_ribatti.entity.Cane;
import it.cgmconsulting.mostracanina_ribatti.payload.response.CaneDetailsResponse;
import it.cgmconsulting.mostracanina_ribatti.service.CaneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mostra_canina")
@Validated
@Slf4j
public class CaneController {

    @Autowired
    CaneService caneService;

    /**
     * <p> EndPoint 1 </p>
     * Lista di cani riportante il codice, nome e la data di nascita dei cani ordinati dal più vecchio al più giovane
     *
     * @return
     */
    @GetMapping("/concorrenti")
    public ResponseEntity getCani() {
        List<CaneDetailsResponse> cani = caneService.getCaniDetails();
        return new ResponseEntity(cani, HttpStatus.OK);
    }
}
