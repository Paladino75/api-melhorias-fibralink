package com.ApiMelhoriasFibralink.FibralinkMelhorias.services;

import com.ApiMelhoriasFibralink.FibralinkMelhorias.model.Colaboradores;
import com.ApiMelhoriasFibralink.FibralinkMelhorias.repository.ColaboradoresRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ColaboradoresServiceImpl implements ColaboradoresService{
    @Autowired
    private ColaboradoresRepository colaboradoresRepository;

    @Override
    public Colaboradores save(Colaboradores colaboradores) {
        return colaboradoresRepository.save(colaboradores);
    }

    @Override
    public List<Colaboradores> findAll() {
        return colaboradoresRepository.findAll();
    }

    @Override
    public Optional<Colaboradores> findById(Long id) {
        return colaboradoresRepository.findById(id);
    }

    @Override
    public Colaboradores update(Colaboradores product) {
        return colaboradoresRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        colaboradoresRepository.deleteById(id);
    }
}
