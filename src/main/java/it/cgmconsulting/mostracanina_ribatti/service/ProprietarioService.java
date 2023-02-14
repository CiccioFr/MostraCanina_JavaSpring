package it.cgmconsulting.mostracanina_ribatti.service;

import it.cgmconsulting.mostracanina_ribatti.payload.response.ProprietarioResponse;
import it.cgmconsulting.mostracanina_ribatti.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProprietarioService {

    @Autowired
    ProprietarioRepository proprietarioRepository;

    public ProprietarioResponse getProprietario(String nomeCane) {
        return proprietarioRepository.getProprietario(nomeCane);
    }
}
