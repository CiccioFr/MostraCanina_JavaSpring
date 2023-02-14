package it.cgmconsulting.mostracanina_ribatti.repository;

import it.cgmconsulting.mostracanina_ribatti.entity.Cane;
import it.cgmconsulting.mostracanina_ribatti.payload.response.CaneDetailsResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaneRepository extends JpaRepository<Cane, Long> {

    /**
     * prima
     * @return
     */
    @Query(value = "SELECT new it.cgmconsulting.mostracanina_ribatti.payload.response.CaneDetailsResponse(cane.codiceCane, cane.nome, cane.dataNascita) " +
            "FROM Cane cane " +
            "ORDER BY cane.dataNascita DESC"
    )
    List<CaneDetailsResponse> getCaniDetails();
}
