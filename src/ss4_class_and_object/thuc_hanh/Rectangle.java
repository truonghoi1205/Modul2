package ss4_class_and_object.thuc_hanh;

public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int getS() {
        return length * width;

    }

    int getC() {
        return (length + width) * 2;

    }

    String showRectangle() {
       return "width= " + width + ", length= " + length;
    }

    String editRectangle(int width, int length) {
        return "width= " + width + ", length= " + length;
    }

    String displayRectangle() {
       return ", dt= " + getS() + ", cv= " + getC();
    }
}
