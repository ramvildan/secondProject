package ru.levelup.h1;

import java.util.Objects;

public class User {
private String login;
private String name;
private int age;
private int bonusPoints;

    public User(String login, String name, int age, int bonusPoints) {
        this.login = login;
        this.name = name;
        this.age = age;
        this.bonusPoints = bonusPoints;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && bonusPoints == user.bonusPoints && Objects.equals(login, user.login) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, name, age, bonusPoints);
    }
}
