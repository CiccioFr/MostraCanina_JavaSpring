package it.cgmconsulting.mostracanina_ribatti.repository;

import it.cgmconsulting.mostracanina_ribatti.entity.Cane;
import it.cgmconsulting.mostracanina_ribatti.entity.Proprietario;
import it.cgmconsulting.mostracanina_ribatti.payload.response.ProprietarioResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {

    @Query(value = "SELECT new it.cgmconsulting.mostracanina_ribatti.payload.response.ProprietarioResponse(" +
            "prop.idProprietario, prop.nome, prop.cognome) " +
            "FROM Proprietario prop " +
            "LEFT JOIN Cane cane ON prop.idProprietario = cane.idProprietario.idProprietario " +
            "WHERE cane.nome = :nomeCane")
    ProprietarioResponse getProprietario(@Param("nomeCane") String nomeCane);
}
