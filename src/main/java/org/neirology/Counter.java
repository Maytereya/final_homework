//Создайте класс Счетчик, у которого есть метод add(),
//увеличивающий̆ значение внутренней̆ int переменной̆ на 1 при нажатие “Завести новое животное”
//Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
//Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт.
//Значение считать в ресурсе try, если при заведения животного заполнены все поля.

package org.neirology;

public class Counter implements AutoCloseable {

    private int ia; // commonly for count new animal (+1)

    private boolean closed = false;

    public Counter(int ia) {
        this.ia = ia;
    }

    public int add() {
        if (closed) {
            throw new IllegalStateException("Counter is closed");
        }
        return ia++;
    }

    public void countDecor() {
        System.out.print("Всего животных: ");
        System.out.println(add());
    }

    @Override
    public void close() throws Exception {

        if (!closed) {
            closed = true;
            System.out.println("Ресурс Counter закрыт.");
        } else {
            throw new IllegalStateException("Counter is already closed or was not used in try-with-resources properly");
        }
    }
}
