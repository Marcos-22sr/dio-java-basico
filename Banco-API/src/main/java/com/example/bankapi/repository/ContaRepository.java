package com.example.bankapi.repository;
import com.example.bankapi.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ContaRepository extends JpaRepository<Conta, Long> {
}