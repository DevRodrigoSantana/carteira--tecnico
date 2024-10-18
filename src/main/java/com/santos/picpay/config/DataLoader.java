package com.santos.picpay.config;

import com.santos.picpay.entity.TipoCarteira;
import com.santos.picpay.repository.TipoCarteiraRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
public class DataLoader implements CommandLineRunner {

    private final TipoCarteiraRepository tipoCarteiraRepository;

    public DataLoader(TipoCarteiraRepository tipoCarteiraRepository) {
        this.tipoCarteiraRepository = tipoCarteiraRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(TipoCarteira.Enum.values())
                .forEach(tipo -> tipoCarteiraRepository.save(tipo.get()));
    }
}
