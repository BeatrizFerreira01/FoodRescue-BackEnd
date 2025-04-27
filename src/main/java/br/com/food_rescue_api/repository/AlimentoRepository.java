package br.com.food_rescue_api.repository;

import br.com.food_rescue_api.model.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Long>, JpaSpecificationExecutor<Alimento> {
}
