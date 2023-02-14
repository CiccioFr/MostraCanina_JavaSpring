package it.cgmconsulting.mostracanina_ribatti.entity;

import it.cgmconsulting.mostracanina_ribatti.entity.common.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cane extends Data {

    @Id
    @Column(length = 10)
    private String codiceCane;

    @Column(length = 200, nullable = false)
    private String nome;

    @Column(nullable = false)
    // todo tinyint(4)
    private byte altezza;

    @Column(nullable = false, columnDefinition = "DECIMAL(5,2)")
    private double peso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proprietario", nullable = false,
            foreignKey = @ForeignKey(name = "cane_ibfk_1"))
    private Proprietario idProprietario;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codice_razza", nullable = false,
            foreignKey = @ForeignKey(name = "cane_ibfk_2"))
    private Razza codiceRazza;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cane cane = (Cane) o;
        return Objects.equals(codiceCane, cane.codiceCane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codiceCane);
    }
}
