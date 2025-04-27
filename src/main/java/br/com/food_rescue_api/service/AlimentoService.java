package br.com.food_rescue_api.service;

import br.com.food_rescue_api.model.Alimento;
import br.com.food_rescue_api.repository.AlimentoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class AlimentoService {

    private final AlimentoRepository alimentoRepository;

    public AlimentoService(AlimentoRepository alimentoRepository) {
        this.alimentoRepository = alimentoRepository;
    }

    public Page<Alimento> listarAlimentos(String nome, String categoria, Integer quantidadeMin, Integer quantidadeMax, Pageable pageable) {
        Specification<Alimento> spec = Specification.where(null);

        if (nome != null && !nome.isEmpty()) {
            spec = spec.and((root, query, criteriaBuilder) ->
                criteriaBuilder.like(criteriaBuilder.lower(root.get("nome")), "%" + nome.toLowerCase() + "%")
            );
        }

        if (categoria != null && !categoria.isEmpty()) {
            spec = spec.and((root, query, criteriaBuilder) ->
                criteriaBuilder.like(criteriaBuilder.lower(root.get("categoria")), "%" + categoria.toLowerCase() + "%")
            );
        }

        if (quantidadeMin != null) {
            spec = spec.and((root, query, criteriaBuilder) ->
                criteriaBuilder.greaterThanOrEqualTo(root.get("quantidade"), quantidadeMin)
            );
        }

        if (quantidadeMax != null) {
            spec = spec.and((root, query, criteriaBuilder) ->
                criteriaBuilder.lessThanOrEqualTo(root.get("quantidade"), quantidadeMax)
            );
        }

        return alimentoRepository.findAll(spec, pageable);
    }
}
