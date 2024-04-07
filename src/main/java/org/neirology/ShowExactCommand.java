package org.neirology;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowExactCommand {

    public ShowExactCommand() {
    }

    Scanner scanner = new Scanner(System.in);

    public void addCommand(ArrayList<Animals> animalsList) {
        System.out.print("Input here the name of the animal, to see which command it knows: ");
        String chooseAnimal = scanner.nextLine();

        for (Animals animals : animalsList) {
            if (animals.getName().equals(chooseAnimal)) {
                System.out.println(animals.getType() + ", named " + animals.getName() + ": knows exact commands: " + animals.getCommands());
                break;
            }
        }
    }
}
