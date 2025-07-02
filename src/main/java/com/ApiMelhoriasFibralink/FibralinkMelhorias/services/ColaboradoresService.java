package com.ApiMelhoriasFibralink.FibralinkMelhorias.services;

import com.ApiMelhoriasFibralink.FibralinkMelhorias.model.Colaboradores;

import java.util.List;
import java.util.Optional;


public interface ColaboradoresService {

        Colaboradores save(Colaboradores colaboradores);

        List<Colaboradores> findAll();

        Optional<Colaboradores> findById(Long id);

        Colaboradores update(Colaboradores colaboradores);

        void deleteById(Long id);

}

