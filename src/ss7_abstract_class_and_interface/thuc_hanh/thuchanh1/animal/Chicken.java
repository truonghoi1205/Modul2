package ss7_abstract_class_and_interface.thuc_hanh.thuchanh1.animal;

import ss7_abstract_class_and_interface.thuc_hanh.thuchanh1.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToGo() {
        return "đi bằng 2 chân";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
