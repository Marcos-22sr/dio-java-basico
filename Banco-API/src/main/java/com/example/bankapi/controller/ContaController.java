package com.example.bankapi.controller;
import com.example.bankapi.model.Conta;
import com.example.bankapi.service.ContaService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;
@RestController
@RequestMapping("/api/contas")
@RequiredArgsConstructor
public class ContaController {
    private final ContaService service;
    @PostMapping
    @Operation(summary = "Criar uma nova conta")
    public Conta criarConta(@RequestParam String titular) {
        return service.criarConta(titular);
    }
    @GetMapping
    @Operation(summary = "Listar todas as contas")
    public List<Conta> listarContas() {
        return service.listarContas();
    }
    @GetMapping("/{id}")
    @Operation(summary = "Buscar uma conta pelo ID")
    public Conta buscarConta(@PathVariable Long id) {
        return service.buscarConta(id);
    }
    @PostMapping("/{id}/depositar")
    @Operation(summary = "Realizar um depósito")
    public Conta depositar(@PathVariable Long id, @RequestParam BigDecimal valor) {
        return service.depositar(id, valor);
    }
    @PostMapping("/{id}/sacar")
    @Operation(summary = "Realizar um saque")
    public Conta sacar(@PathVariable Long id, @RequestParam BigDecimal valor) {
        return service.sacar(id, valor);
    }
}