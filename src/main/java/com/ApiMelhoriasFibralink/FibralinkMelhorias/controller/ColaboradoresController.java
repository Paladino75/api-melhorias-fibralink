package com.ApiMelhoriasFibralink.FibralinkMelhorias.controller;

import com.ApiMelhoriasFibralink.FibralinkMelhorias.model.Colaboradores;
import com.ApiMelhoriasFibralink.FibralinkMelhorias.services.ColaboradoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class ColaboradoresController {
    @RestController
    @RequestMapping("/chamados")
    public class ProductController {

        @Autowired
        private ColaboradoresService productService;

        @GetMapping
        public ResponseEntity<List<Colaboradores>> findAll() {
            return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
        }

        @GetMapping("/{id}")
        public ResponseEntity<Optional<Colaboradores>> findById(@PathVariable Long id) {
            return ResponseEntity.status(HttpStatus.OK).body(productService.findById(id));
        }

        @PostMapping
        public ResponseEntity<Colaboradores> create(@RequestBody Colaboradores colaboradores) {
            return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(colaboradores));
        }

        @PutMapping
        public ResponseEntity<Colaboradores> update(@RequestBody Colaboradores colaboradores) {
            return ResponseEntity.status(HttpStatus.OK).body(productService.update(colaboradores));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<?> delete(@PathVariable Long id) {
            productService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
    }
}
