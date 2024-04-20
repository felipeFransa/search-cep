package br.com.felipe.search.main;

public class Main {
    public static void main(String[] args) {
        SearchCEP searchCEP = new SearchCEP();
        Address newAddress = searchCEP.searchAddress("32113460");
        System.out.println(newAddress);
    }
}