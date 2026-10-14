package br.com.senai.aberturaordensservico.service;

import org.springframework.stereotype.Service;

import br.com.senai.aberturaordensservico.model.Equipamento;
import br.com.senai.aberturaordensservico.repository.EquipamentoRepository;
import br.com.senai.aberturaordensservico.repository.EquipamentoRepository;

@Service 
public class EquipamentoService {
    private EquipamentoRepository equipamentoRepository;

    public EquipamentoService (EquipamentoRepository equipamentoRepository) {
        this.equipamentoRepository = equipamentoRepository;
    }

    public Equipamento cadastrar(Equipamento equipamento) {
        return EquipamentoRepository.save(equipamento);
    }
}
