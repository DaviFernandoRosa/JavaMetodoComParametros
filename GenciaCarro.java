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
public class GenciaCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

             Carro van = new Carro();
                
                van.marca = "Fiat";
                van.modelo = "Ducato";
                van.numPassageiros = 10;
                van.consumoCombustivel = 0.2;


           Carro fusca = new Carro();
                
                fusca.marca = "VW";
                fusca.modelo = "Fusca";
                fusca.numPassageiros = 5;
                fusca.consumoCombustivel = 0.4;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);

        van.exibirAutonomia();

        double autonomia = fusca.obterAutonomia();
        System.out.println("A autonomia do carro é: " +autonomia);
        System.out.println("A autonomia do carro é: " + van.obterAutonomia());


        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("qtdCombustivel10 = "+ qtdCombustivel10);
        System.out.println("qtdCombustivel15 = "+ qtdCombustivel15);



    }

}
