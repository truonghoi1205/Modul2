package ss7_abstract_class_and_interface.thuc_hanh.thuchanh1.fruit;

import ss7_abstract_class_and_interface.thuc_hanh.thuchanh1.edible.Edible;

public abstract class Fruit implements Edible {
    @Override
    public String howToEat() {
        return "could be fried";
    }
}


