package com.example.bankapi.service;
import com.example.bankapi.model.Conta;
import com.example.bankapi.repository.ContaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ContaService {
    private final ContaRepository repository;
    public Conta criarConta(String titular) {
        Conta conta = Conta.builder().titular(titular).saldo(BigDecimal.ZERO).build();
        return repository.save(conta);
    }
    public List<Conta> listarContas() {
        return repository.findAll();
    }
    public Conta buscarConta(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Conta não encontrada"));
    }
    public Conta depositar(Long id, BigDecimal valor) {
        Conta conta = buscarConta(id);
        conta.setSaldo(conta.getSaldo().add(valor));
        return repository.save(conta);
    }
    public Conta sacar(Long id, BigDecimal valor) {
        Conta conta = buscarConta(id);
        if (conta.getSaldo().compareTo(valor) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        conta.setSaldo(conta.getSaldo().subtract(valor));
        return repository.save(conta);
    }
}