package com.example.spring_boot_api.web;

import com.example.spring_boot_api.models.Medico;

public record UpdateMedicoDTO(Long id, String nome, String email, String crm, String especialidade,
                              String logradouro, String bairro, String complemento, String numero,
                              String cep, String cidade, String uf, String telefone) {

    public UpdateMedicoDTO(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade().name(),
                medico.getLogradouro(), medico.getBairro(), medico.getComplemento(), medico.getNumero(),
                medico.getCep(), medico.getCidade(), medico.getUf(), medico.getTelefone());
    }
}
