package com.target.Pergunta3;


import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.target.Pergunta3.classes.Faturamento;
/*3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média; */
public class app {
    public static void main(String[] args) {

        try {
            // Criando um objeto ObjectMapper da biblioteca Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // Lendo o arquivo JSON a partir de um InputStream
            InputStream inputStream = app.class.getResourceAsStream("./arquivo/dados.json");

            // Deserializando o arquivo JSON para um array de objetos Faturamento
            List<Faturamento> faturamentos = objectMapper.readValue(inputStream, new TypeReference<List<Faturamento>>(){});

            // Exibindo os objetos lidos do arquivo JSON
            Double menorFaturamento = 0.0;
            Double maiorFaturamento = 0.0;
            Double mediaFaturamento = 0.0;
            Double somaFaturamento = 0.0;
            Integer diasParaIgnorar = 0;
            for (Faturamento faturamento : faturamentos) {
                Double valorFaturamentoAtual = faturamento.getValor();
                
                boolean condicaoMaiorFaturamento = valorFaturamentoAtual > maiorFaturamento;
                boolean condicaoMenorFaturamento =  valorFaturamentoAtual < menorFaturamento;

                maiorFaturamento = condicaoMaiorFaturamento ? valorFaturamentoAtual : maiorFaturamento;
                menorFaturamento = condicaoMenorFaturamento ? valorFaturamentoAtual : menorFaturamento;
                
                if(valorFaturamentoAtual > 0){
                    somaFaturamento+=valorFaturamentoAtual;
                }else{
                    diasParaIgnorar++;
                }
            }
            mediaFaturamento = somaFaturamento/(faturamentos.size() - diasParaIgnorar);
            System.out.println("O valor das médias dos faturamentos é "+ mediaFaturamento );
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
