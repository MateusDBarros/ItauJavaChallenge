package br.project.itau.service;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TransacaoService {

    private  final Map<String, Object> dataStore = new ConcurrentHashMap<>();

    public void saveData(String key, Object value) {
        dataStore.put(key, value);
        System.out.println("Transação efetuada: ID='" + key + "'.");
    }

    public Object retrieveData(String key) {
        Object value = dataStore.get(key);

        if (value != null)
            System.out.println("Transação: ID='" + key + "'.");
        else
            System.out.println("Nenhuma tranção encontrada");

        return value;
    }


}
