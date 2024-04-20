package br.com.felipe.search.main;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("enter CEP:");
        Scanner readingCEP =new Scanner(System.in);
        var cep = readingCEP.nextLine();
        SearchCEP searchCEP = new SearchCEP();

        try {
            Address newAddress = searchCEP.searchAddress(cep);
            System.out.println(newAddress);
            FileGenerator newgenerator = new FileGenerator();
            newgenerator.generator(newAddress);
        }catch (RuntimeException | IOException error){
            System.out.println("Error CEP");
            System.out.println(error.getMessage());
        }
    }
}