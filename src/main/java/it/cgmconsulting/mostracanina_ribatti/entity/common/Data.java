package it.cgmconsulting.mostracanina_ribatti.entity.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class Data implements Serializable {

    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate dataNascita;

}
