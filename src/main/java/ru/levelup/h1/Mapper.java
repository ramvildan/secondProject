package ru.levelup.h1;

public class Mapper {
    public User map(String line){
        String[] values = line.split(",");
        return new User(values[0], values[1], Integer.parseInt(values[2]), Integer.parseInt(values[3]));
    }
}
