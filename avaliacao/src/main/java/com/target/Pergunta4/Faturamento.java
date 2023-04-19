package com.target.Pergunta4;

import java.util.HashMap;
import java.util.Map;

public class Faturamento {
    public Map<String, Double> faturamentMap = new HashMap<String, Double>();

    public  void imprimirPercentualDeFaturamento() {
        Double total = this.calcularTotal();
        for (String key : this.faturamentMap.keySet()) {
            //Capturamos o valor a partir da chave
            Double valorRelativo = faturamentMap.get(key);
            System.out.println(key + " tem o percentual de " + Math.round((valorRelativo/total)*100) +"%");
     }
    }

    public  Map<String, Double> PreencherFaturamento() {
        faturamentMap.put("SP", 67836.43);
        faturamentMap.put("RJ", 36678.66);
        faturamentMap.put("MG", 29229.88);
        faturamentMap.put("ES", 27165.48);
        faturamentMap.put("Outros", 19849.53);
        return faturamentMap;
    }

    public  Double calcularTotal() {
        Double totalFaturamento = 0.0;
        for (Double valor : faturamentMap.values()) {
            totalFaturamento += valor;
        }
        return totalFaturamento;
    }
}
