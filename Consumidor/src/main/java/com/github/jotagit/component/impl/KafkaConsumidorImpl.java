package com.github.jotagit.component.impl;

import com.github.jotagit.component.KafkaConsumidor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumidorImpl implements KafkaConsumidor {

    private static final String TOPICO = "topico";

    @Override
    @KafkaListener(topics = TOPICO, groupId = "MeuGrupo")
    public void listen(String message) {
        System.out.println("Received Message in group MeuGrupo: " + message);
    }


}
