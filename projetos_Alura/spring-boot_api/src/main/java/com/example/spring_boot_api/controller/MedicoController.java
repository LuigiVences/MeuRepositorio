package com.example.spring_boot_api.controller;

import com.example.spring_boot_api.service.MedicoService;
import com.example.spring_boot_api.web.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class  MedicoController {
    private final MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }
    //Por padrão, o método http devolve o código 200 se a requisição for processada com sucesso.
    @PostMapping
    public ResponseEntity<String> cadastrarMedico(@RequestBody @Valid DadosMedicoDTO dadosMedicoDTO){
        medicoService.cadastrarMedico(dadosMedicoDTO);
        return ResponseEntity.ok("Medico Cadastrado com Sucesso!");
    }

    @GetMapping
    public ResponseEntity<Page<ListMedicoDTO>>listarMedicos(@PageableDefault(size = 10, sort = {"nome"})
                                            Pageable pageable){
         var page = medicoService.listarMedicosDTO(pageable);
         return ResponseEntity.ok(page);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<?> atualizarMedico(@RequestBody @Valid UpdatePessoaDTO updatePessoaDTO,
                                                           @PathVariable Long id){
       return medicoService.atualizaMedico(updatePessoaDTO);
    }
    //Por padrão, o http devolve o código 2044 pra dizer que a requisição foi processada com sucesso
    //e que não possui um corpo

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> deletarMedico(@PathVariable Long id){
        return medicoService.deletarMedico(id);
    }
}
