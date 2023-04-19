package com.target.Pergunta3.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Faturamento {
    private int dia;
    private Double valor;
   
}
