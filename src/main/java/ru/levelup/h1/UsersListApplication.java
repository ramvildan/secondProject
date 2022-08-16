package ru.levelup.h1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsersListApplication {
    public static void main(String[] args) throws IOException {
        File file = new File("LIST.CSV");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] valuesOfUsers = line.split(",");
                for (int i = 0; i < valuesOfUsers.length; i++) {
//                    System.out.print(valuesOfUsers[i] + " ");
                }
            }

            // в цикле сделать split

        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }
    }
}
