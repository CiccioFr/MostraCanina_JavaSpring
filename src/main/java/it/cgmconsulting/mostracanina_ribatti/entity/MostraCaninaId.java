package it.cgmconsulting.mostracanina_ribatti.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MostraCaninaId implements Serializable {

    @Column(length = 100, nullable = false)
    private String nomeMostra;

    @Column(nullable = false, columnDefinition = "YEAR")
    private LocalDateTime anno;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MostraCaninaId that = (MostraCaninaId) o;
        return Objects.equals(nomeMostra, that.nomeMostra) && Objects.equals(anno, that.anno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeMostra, anno);
    }
}
