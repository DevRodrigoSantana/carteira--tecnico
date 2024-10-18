package com.santos.picpay.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "carteira")
public class Carteira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_completo")
    private String nomeCompleto;
    @Column(name = "cpf_cnpj",unique = true)
    private String cpfCnpj;
    @Column(name = "email",unique = true)
    private String email;
    @Column(name = "senha")
    private String senha;
    @Column(name = "saldo")
    private BigDecimal saldo = BigDecimal.ZERO;
    @JoinColumn(name ="carteira_id" )
    @ManyToOne
    private TipoCarteira tipoCarteira;
}
