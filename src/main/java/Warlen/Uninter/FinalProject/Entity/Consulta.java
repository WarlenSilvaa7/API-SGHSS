package Warlen.Uninter.FinalProject.Entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataHora;
    private String status;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    @JsonBackReference(value = "paciente-consultas")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "profissional_id")
    @JsonIgnoreProperties({"consultas", "prescricoes", "exames"})
    private ProfissionalDeSaude profissional;


    @OneToMany(mappedBy = "consulta", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Exame> exames;

}
