package org.neirology;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddNewAnimal {

    public AddNewAnimal() {
    }

    public void addOneAnimal(ArrayList<Animals> animalList) throws Exception {

        String[] arrTypesOfCarryingAnimal = new String[]{"Лошадь", "лошадь", "Конь", "конь", "Верблюд", "верблюд", "Осел", "осел"};
        String[] arrTypesOfDomesticAnimal = new String[]{"Кошка", "кот", "Кот", "Хомяк", "хомяк", "кошка", "собака", "пес", "Собака", "Пес"};
        String generalTypeOfAnimal = "Any unrecognised animal";
        int ageOfAnimal = -1;

        ShowExactAnimal showExactAnimal = new ShowExactAnimal();
        Scanner scanner = new Scanner(System.in);



        System.out.print("Input animal's name: ");
        String nameOfAnimal = scanner.nextLine();
        System.out.print("Input its age: ");

        while (ageOfAnimal < 0) {
            try {
                ageOfAnimal = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Введенные данные не являются целым числом. Пожалуйста, попробуйте снова.");
                System.out.print("Input its age: ");
            }
        }
        System.out.print("Input animal's breed: ");
        String typeOfAnimal = scanner.nextLine();

        for (String s : arrTypesOfCarryingAnimal)
            if (typeOfAnimal.equals(s)) {
                generalTypeOfAnimal = "Working animal";
                break;
            }
        for (String l : arrTypesOfDomesticAnimal)
            if (typeOfAnimal.equals(l)) {
                generalTypeOfAnimal = "Domestic animal";
                break;
            }
        System.out.print("Input animal's commands: ");
        String commandsOfAnimal = scanner.nextLine();

        Animals oneAnimal = new Animals(generalTypeOfAnimal, typeOfAnimal, nameOfAnimal, ageOfAnimal, commandsOfAnimal);

        try (Counter counter = new Counter(animalList.size())) {
            counter.add();
            counter.countDecor();
        } catch (IOException e) {
            e.getStackTrace();
        }
        animalList.add(oneAnimal);
        showExactAnimal.showOneAnimal(oneAnimal);

    }


}
