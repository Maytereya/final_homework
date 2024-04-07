package org.neirology;

public class Animals {
    private String generalType; // домашнее или вьючное
    private String type; // Кошка, Собака, прочее
    private String name; // Банально имя
    private int age; // Банально возраст
    private String commands; // Команды, которые выполняет

    public Animals(String generalType, String type, String name, int age, String commands) {
        this.generalType = generalType;
        this.type = type;
        this.name = name;
        this.age = age;
        this.commands = commands;
    }

    public Animals() {

    }

    public String getGeneralType() {
        return generalType;
    }

    public void setGeneralType(String generalType) {
        this.generalType = generalType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return generalType +
                ", breed: " + type +
                ", name: " + name +
                ", age: " + age +
                ", knowing commands: " + commands;
    }
}
