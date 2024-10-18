package com.santos.picpay.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tipo_carteira")
public class TipoCarteira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tipo")
    private String tipo;

    @AllArgsConstructor
    public enum Enum {
        USUARIO(1L,"usuario"),
        LOJISTA(2L,"lojista");

        private Long id;
        private String tipo;

        public TipoCarteira get(){
            return new TipoCarteira(id,tipo);
        }
    }


}

