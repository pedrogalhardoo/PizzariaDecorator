package com.pizzaria;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Pizzaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza pizza = null;
        
        while (pizza == null) {
            System.out.println("Escolha o tipo de massa: \n 1 - Massa Fina (10.00) \n 2 - Massa Espessa (12.00)");
            int tipoMassa = scanner.nextInt();
            
            switch (tipoMassa) {
                case 1:
                    pizza = new MassaFinaPizza();
                    break;
                case 2:
                    pizza = new MassaEspessaPizza();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        
        boolean adicionando = true;
        while (adicionando) {
            System.out.println("Escolha um ingrediente para adicionar: \n 1 - Queijo (1.50) \n 2 - Tomate (0.75) \n 3 - Ovo (1.00) \n 0 - Finalizar Pedido");
            int escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1:
                    pizza = new Queijo(pizza);
                    break;
                case 2:
                    pizza = new Tomate(pizza);
                    break;
                case 3:
                    pizza = new Ovo(pizza);
                    break;
                case 0:
                    adicionando = false;
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }
        
        System.out.println(pizza.getDescription() + " custa $" + pizza.getCost());
        
        scanner.close();
    }
}
