package Warlen.Uninter.FinalProject.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Prescricao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String medicamento;
    private String dosagem;
    private String orientacao;

    @ManyToOne
    @JoinColumn(name = "profissional_id")
    @JsonBackReference(value = "profissional-prescricoes")
    private ProfissionalDeSaude profissional;


    @ManyToOne
    @JoinColumn(name = "paciente_id")
    @JsonBackReference(value = "paciente-prescricoes")
    private Paciente paciente;
}
