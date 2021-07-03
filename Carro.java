/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genciacarro;

/**
 *
 * @author Davi
 */
public class Carro {
     
     String marca;
      String modelo;
      int numPassageiros;
      double capCombustivel;
      double consumoCombustivel;


 void exibirAutonomia(){
  System.out.println("A autonomia do carro é: "+ capCombustivel *consumoCombustivel);
}

 double obterAutonomia(){
  System.out.println("Método obterAutonomia foi chamado.");
  
  return capCombustivel * consumoCombustivel;
}
//Método com parametro
 double calcularCombustivel (double km){
    double qtdCombustivel = km/consumoCombustivel;
    return qtdCombustivel;
}



}
