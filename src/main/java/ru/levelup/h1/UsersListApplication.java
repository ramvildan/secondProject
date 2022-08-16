package ru.levelup.h1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UsersListApplication {

    public static Gson gson = new GsonBuilder().create();
    public static String userToJson(User user) {
        return gson.toJson(user);
    }
    public static void main(String[] args) throws IOException {
        File file = new File("LIST.CSV");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                User user = new User(values[0],values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]));
                String json = UsersListApplication.userToJson(user);
                System.out.println(json);
            }
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }
    }
}
