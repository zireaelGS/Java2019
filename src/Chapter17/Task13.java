package Chapter17;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        //������� ��������� ��������� �����
        SecureRandom random = new SecureRandom();
        //������� ������ ���� ��� � ������� ��������,������� ���������� ����� ��������
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        //������ ��������� ��������, �������� �������
        List<Character> characters = new ArrayList<>();
        //��������� � ������ ��������� 30 ��������� ��������
        for (int i = 0; i < 30; i++) {
            characters.add(alphabet[random.nextInt(25)]);
        }
        //���������� ������ ��������� � ����� � ��������� �� �����������
        System.out.println("Sort the List in ascending order.");
        characters.stream().sorted().forEach(value -> System.out.print(value + " "));
        System.out.println();
        //���������� ������ ��������� � ����� � ��������� �� ��������
        System.out.println("Sort the List in descending order");
        characters.stream().sorted(Comparator.reverseOrder()).forEach(value -> System.out.print(value + " "));
        System.out.println();
        //���������� ������ ��������� � ����� � ��������� �� �����������, � ��� �� ������� �� ��� ���������
        System.out.println("Display the List in ascending order with duplicates removed.");
        characters.stream().distinct().sorted().forEach(value -> System.out.print(value + " "));
    }
}
