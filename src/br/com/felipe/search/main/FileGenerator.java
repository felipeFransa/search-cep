package br.com.felipe.search.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

    public void generator(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter record = new FileWriter(address.cep()+".json");
        record.write(gson.toJson(address));
        record.close();
    }
}
