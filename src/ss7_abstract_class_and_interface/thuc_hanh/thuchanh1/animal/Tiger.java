package ss7_abstract_class_and_interface.thuc_hanh.thuchanh1.animal;

import ss7_abstract_class_and_interface.thuc_hanh.thuchanh1.animal.Animal;

public class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToGo() {
        return "đi bằng 4 chân";
    }
}
