package view;

import controller.HashFoneNumero;

public class Principal {

    public static void main(String[] args) {
        // Exemplos de números de telefone
        String[] foneNumeros = {
            "11987654321", "21987654321", "31987654321", 
            "41987654321", "51987654321", "61987654321"
        };
        
        for (String foneNumero : foneNumeros) {
            int hashIndex = HashFoneNumero.hashFoneNumero(foneNumero);
            System.out.println("Telefone número: " + foneNumero + " -> Hash index: " + hashIndex);
        }
    }
}
