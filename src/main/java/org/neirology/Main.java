package org.neirology;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {

        //Инициализации
        ArrayList<Animals> animalsList = new ArrayList<>();
        AddNewAnimal addAnimal = new AddNewAnimal();
        ShowAllAnimals showAllAnimals = new ShowAllAnimals();
        AddNewCommand addNewCommand = new AddNewCommand();
        ShowExactCommand showExactCommand = new ShowExactCommand();
        Navigation navigation = new Navigation();
        MenuInstructions instructions = new MenuInstructions();

        // Инструкция к меню
        instructions.instruct();

        //Первичное заполнение (чтобы было)
        animalsList.addFirst(new Animals("Domestic Animal", "Dog", "Gaf", 5, "Bark!"));
        animalsList.add(new Animals("Domestic Animal", "Cat", "Kitty", 3, "Sleep"));
        animalsList.add(new Animals("Domestic Animal", "Hamster", "Puffy", 1, "Run the Circle"));
        animalsList.add(new Animals("Working Animal", "Horse", "Horsy", 5, "Gallop"));
        animalsList.add(new Animals("Working Animal", "Camel", "Camy", 10, "Gallop"));
        animalsList.add(new Animals("Working Animal", "Donkey", "Donny", 6, "Tract"));

        // Навигация
        navigation.navigate(animalsList,
                showAllAnimals,
                addNewCommand,
                addAnimal,
                showExactCommand);

        // Попытка использовать counter после закрытия ресурса (закомментил намеренно)
//        try (Counter counter = new Counter(7)) {
//            counter.add();
//            counter.close(); // Явное закрытие для демонстрации исключения
//            counter.add(); // Это вызовет исключение, так как счетчик уже закрыт
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
        //       }
    }
}