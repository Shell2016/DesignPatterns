package ru.michaelshell.patterns.behavioral.iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        String[] skills = new String[] {"Java", "SQL", "Docker", "Git", "Spring"};
        JavaDeveloper michaelShell = new JavaDeveloper("Michael Shell", skills);

        Iterator<String> shellIterator = michaelShell.getIterator();
        System.out.println(michaelShell.getName() + " skills: ");
        while (shellIterator.hasNext()) {
            System.out.print(shellIterator.next() + " ");
        }
    }
}
