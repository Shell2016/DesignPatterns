package ru.michaelshell.patterns.behavioral.iterator;

public class JavaDeveloper implements Collection<String> {
    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<String> getIterator() {
        return new JavaDeveloperIterator();
    }

    private class JavaDeveloperIterator implements Iterator<String> {

        int position = 0;

        @Override
        public boolean hasNext() {
            return skills.length > position;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                return null;
            }
            return skills[position++];
        }
    }
}
