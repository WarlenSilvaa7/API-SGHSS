package Warlen.Uninter.FinalProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Warlen.Uninter.FinalProject.Entity.ProfissionalDeSaude;

@Repository
public interface ProfissionalDeSaudeRepository extends JpaRepository<ProfissionalDeSaude, Long> {
    
}
