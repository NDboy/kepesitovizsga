package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("Arg must not be empty");
        }
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of(output))){

            writeByContacts(contacts,bw);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    private void writeByContacts(Map<String, String> contacts, BufferedWriter bw) throws IOException{
        for (Map.Entry entry : contacts.entrySet()) {
            bw.write(entry.getKey() + ": " + entry.getValue() + "\n");
        }
    }

}

