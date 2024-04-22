package ss13_search_algorithm.bai_tap.bai_tap2;

import java.util.LinkedList;
import java.util.Scanner;

public class FindTheConsecutiveStringWithTheGreatestLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> stringMax = new LinkedList<>();
        LinkedList<Character> stringList = new LinkedList<>();
        System.out.println("Vui lòng nhập vào chuỗi: ");
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (stringList.size() > 1 && string.charAt(i) <= stringList.getLast() && stringList.contains(string.charAt(i))) {
                stringList.clear();
            }
            stringList.add(string.charAt(i));
            if(stringList.size() > stringMax.size()) {
                stringMax.clear();
                stringMax.addAll(stringList);
            }
        }
        for (Character character : stringMax) {
            System.out.print(character);
        }
    }
}
