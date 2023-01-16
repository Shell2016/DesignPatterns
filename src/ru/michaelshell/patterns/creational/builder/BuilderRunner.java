package ru.michaelshell.patterns.creational.builder;

public class BuilderRunner {
    public static void main(String[] args) {
        User user = User.builder()
                .email("1@1.ru")
                .name("Michael")
                .build();

        System.out.println(user);
    }
}
