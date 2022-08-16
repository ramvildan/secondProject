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
            String line = reader.readLine();
            String[] values = line.split(",");
            // в цикле сделать split

        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }
    }
}
