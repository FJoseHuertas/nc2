package testing;

import com.challenge.conversor.*;

import java.io.IOException;
import java.util.Scanner;

public class TestConversor {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entradaUsuario = new Scanner(System.in);
        int opcionUsuario = 0;


        String menu = """
                \n***************************************************
                *** Bienvenido a mi conversor de monedas ***
                
                1) Pesos Cop ==>> Dólar Estadounidense.
                2) Peso Cop ==>> Euro.
                3) Peso Cop ==>> Libra Esterlina.
                4) Dólar Estadounidense ==>> Peso cop.
                5) Euro ==>> Peso Cop
                6) Libra Esterlina ==>> Peso Cop.             
                
                7) Salir
                
                """;

        while (opcionUsuario != 7){

            System.out.println(menu);
            System.out.println("Elija una opcion, por favor: ");
            opcionUsuario = (entradaUsuario.nextInt());

            switch (opcionUsuario){
                case 1:
                    System.out.println("Elija el monto: ");
                    double monto = entradaUsuario.nextDouble();
                    ConvertirMonedas convertirMonedas1 = new ConvertirMonedas("COP", "USD", monto);
                    convertirMonedas1.obtenerMonedas();
                    break;
                case 2:
                    double monto1 = entradaUsuario.nextDouble();
                    ConvertirMonedas convertirMonedas2 = new ConvertirMonedas("COP", "EUR", monto1);
                    convertirMonedas2.obtenerMonedas();
                case 3:
                    double monto2 = entradaUsuario.nextDouble();
                    ConvertirMonedas convertirMonedas3 = new ConvertirMonedas("COP", "USD", monto2);
                    convertirMonedas3.obtenerMonedas();
                    break;
                case 4:
                    double monto3 = entradaUsuario.nextDouble();
                    ConvertirMonedas convertirMonedas4 = new ConvertirMonedas("COP", "USD", monto3);
                    convertirMonedas4.obtenerMonedas();
                    break;
            }
        }
        System.out.println("***Finalizando el programa***");
    }
}
