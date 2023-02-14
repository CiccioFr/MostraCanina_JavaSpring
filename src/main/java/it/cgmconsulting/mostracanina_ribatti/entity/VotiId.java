package it.cgmconsulting.mostracanina_ribatti.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VotiId implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_giudice", nullable = false,
            foreignKey = @ForeignKey(name = "voti_ibfk_2"/*,
                    // TODO viene ignorata (provato CASCADE)
                    foreignKeyDefinition = "FOREIGN KEY (id_giudice) REFERENCES cane(id_giudice) ON DELETE RESTRICT ON UPDATE RESTRICT" */ )
    )
    private Giudice giudice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codice_cane", nullable = false,
            foreignKey = @ForeignKey(name = "voti_ibfk_3")
    )
    private Cane cane;

    @ManyToOne
    @JoinColumns(value = {
            @JoinColumn(name = "nome_mostra", referencedColumnName = "nomeMostra"),
            @JoinColumn(name = "anno", referencedColumnName = "anno")
    }, foreignKey = @ForeignKey(name = "voti_ibfk_1"))
    private MostraCanina mostraCanina;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VotiId votiId = (VotiId) o;
        return Objects.equals(giudice, votiId.giudice) && Objects.equals(cane, votiId.cane) && Objects.equals(mostraCanina, votiId.mostraCanina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(giudice, cane, mostraCanina);
    }
}
