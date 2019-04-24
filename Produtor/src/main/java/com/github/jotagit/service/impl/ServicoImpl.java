package com.github.jotagit.service.impl;

import com.github.jotagit.service.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ServicoImpl implements Servico {


    @Value("${kafka.topico}")
    private String TOPICO;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public Boolean publicarEventoBasico(String mensagem){

        //recuperar objetos falsos

        //publicar objetos falsos
        kafkaTemplate.send(TOPICO, mensagem);

        return Boolean.TRUE;
    }


}
