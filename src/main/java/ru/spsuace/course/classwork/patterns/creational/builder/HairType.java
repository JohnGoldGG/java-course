package ru.spsuace.course.classwork.patterns.creational.builder;

public enum HairType {

    BALD("bald"),
    SHORT("short"),
    CURLY("curly"),
    LONG_STRAIGHT("long straight"),
    LONG_CURLY("long curly");

    private String title;

    private HairType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
