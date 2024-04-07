package org.neirology;

import java.util.ArrayList;
import java.util.Scanner;

public class Navigation {
    public Navigation() {
    }

    Scanner scanner = new Scanner(System.in);
    private String command = "run"; // run никак не используется, просто инициализация "со смыслом".

    public void navigate(ArrayList<Animals> animalsList,
                         ShowAllAnimals showAllAnimals,
                         AddNewCommand addNewCommand,
                         AddNewAnimal addAnimal,
                         ShowExactCommand showExactCommand) throws Exception {

        while (!command.equals("exit")) {
            command = scanner.nextLine();

            // Проверяем, не является ли введенная команда "exit-ом"
            if (command.equals("exit")) {
                System.out.println("Bye!");
                break; // Выход из цикла
            } else if (command.equals("list")) {
                showAllAnimals.showAllAnimals(animalsList);
            } else if (command.equals("new command")) {
                addNewCommand.addCommand(animalsList);
            } else if (command.equals("new animal")) {
                addAnimal.addOneAnimal(animalsList);
            } else if (command.equals("what command")) {
                showExactCommand.addCommand(animalsList);
            } else {
                System.out.println("Unknown command, try again");
            }
            System.out.print("input command here: ");
        }
    }
}
