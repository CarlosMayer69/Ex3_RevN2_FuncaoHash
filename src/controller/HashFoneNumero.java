package controller;

public class HashFoneNumero {

    public HashFoneNumero() {
        super();
    }

    public static int hashFoneNumero(String foneNumber) {
        // Extraia o DDD e o número de telefone
        String ddd = foneNumber.substring(0, 2); // XX
        String number = foneNumber.substring(2); // NNNNNNNNN
        
        // Converta o DDD e o número de telefone em números inteiros
        int dddInt = Integer.parseInt(ddd);
        long numberLong = Long.parseLong(number);
        
        // Combine o DDD e o número de telefone de alguma maneira
        long combined = dddInt * numberLong;
        
        // Calcule o índice hash dentro do intervalo [11, 99]
        int hashIndex = (int) (combined % 89) + 11;
        
        return hashIndex;
    }
}
