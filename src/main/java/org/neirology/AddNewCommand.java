package org.neirology;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewCommand {

    public AddNewCommand() {
    }

    Scanner scanner = new Scanner(System.in);

    public void addCommand(ArrayList<Animals> animalsList) {
        System.out.println("Список животных и команд, которые они знают: ");
        for (Animals animals : animalsList)
            System.out.println("Животное: " + animals.getType() + ", его имя: " + animals.getName() + ", команды: " + animals.getCommands());

        System.out.println("Введите имя животного для обучения: ");
        String chooseAnimal = scanner.nextLine();
        System.out.println("Введите новую команду для этого животного: ");
        String newCommand = scanner.nextLine();

        for (int i = 0; i < animalsList.size(); i++) {
            if (animalsList.get(i).getName().equals(chooseAnimal)) {
                Animals trainedAnimal = animalsList.get(i);
                String oldCommands = trainedAnimal.getCommands();
                trainedAnimal.setCommands(oldCommands + ", " + newCommand);
                animalsList.remove(i);

                System.out.println("Животное обучено новым командам: ");
                System.out.println(trainedAnimal);
                animalsList.add(trainedAnimal);
                break;
            }
        }

      //  ShowAllAnimals showAllAnimals = new ShowAllAnimals();
      //  showAllAnimals.showAllAnimals(animalsList);
    }
}
