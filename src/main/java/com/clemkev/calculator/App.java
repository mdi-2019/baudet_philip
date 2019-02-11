package com.clemkev.calculator;

import java.util.Scanner;

public class App
{
    static private Calculator calc;
    static private Boolean run = true;

    public static void main( String[] args )
    {
        System.out.println("Bienvenue dans Super Calculateur !");
        System.out.print("Veuillez choisir un mode : Normal(N) ou Scientifique(S): ");

        Scanner sc = new Scanner(System.in);
        String mode = sc.nextLine().trim();


        if(mode.equals("N") || mode.equals("n")) {
            calc = new CalculatorNormal();
        } else if(mode.equals("S") || mode.equals("s")) {
            calc = new CalculatorScientifique();
        }

        while(run) {
            //TODO: On affiche les commandes disponibles
            System.out.print("Commande " + calc.getCommands() + ": ");
            String cmd = sc.next();

            if (cmd.equals("exit")) {
                run = false;
                break;
            }

            System.out.print("Param : ");
            Double param = sc.nextDouble();
            //TODO: On récupère la commande, et enlève les espaces avant/après
            if(calc.isValid(cmd)) {
                calc.exec(cmd, param);
                System.out.println(calc.getLastRes());
            } else {
                System.out.println("Commande non valide.");
            }
        }

    }
}
