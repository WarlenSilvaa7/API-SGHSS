package Warlen.Uninter.FinalProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Warlen.Uninter.FinalProject.Entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Paciente findByCpf(String cpf);  
}

