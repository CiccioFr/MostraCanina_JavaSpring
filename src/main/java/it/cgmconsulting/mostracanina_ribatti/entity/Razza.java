package it.cgmconsulting.mostracanina_ribatti.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Razza {

    @Id
    private byte codiceRazza;

    @Column(length = 100, nullable = false)
    private String nomeRazza;

//    @Column(nullable = false, columnDefinition = "DECIMAL" ,precision = 5, scale = 2) -> decimal(10,0)
    @Column(nullable = false, columnDefinition = "DECIMAL(5,2)")
    private double pesoStandard;

    @Column(nullable = false)
    private byte altezzaStandard;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Razza razza = (Razza) o;
        return codiceRazza == razza.codiceRazza;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codiceRazza);
    }
}
