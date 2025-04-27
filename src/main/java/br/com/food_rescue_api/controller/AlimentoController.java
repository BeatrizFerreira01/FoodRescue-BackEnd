package br.com.food_rescue_api.controller;

import br.com.food_rescue_api.model.Alimento;
import br.com.food_rescue_api.service.AlimentoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alimentos")
@CrossOrigin(origins = "*")
public class AlimentoController {

    private final AlimentoService alimentoService;

    public AlimentoController(AlimentoService alimentoService) {
        this.alimentoService = alimentoService;
    }

    @GetMapping
    public Page<Alimento> listarAlimentos(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) String categoria,
            @RequestParam(required = false) Integer quantidadeMin,
            @RequestParam(required = false) Integer quantidadeMax,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return alimentoService.listarAlimentos(nome, categoria, quantidadeMin, quantidadeMax, pageable);
    }
}
