package it.cgmconsulting.mostracanina_ribatti.service;

import it.cgmconsulting.mostracanina_ribatti.payload.response.CaneDetailsResponse;
import it.cgmconsulting.mostracanina_ribatti.repository.CaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class CaneService {

    @Autowired
    CaneRepository caneRepository;

    public List<CaneDetailsResponse> getCaniDetails() {
        return caneRepository.getCaniDetails();
    }
}
