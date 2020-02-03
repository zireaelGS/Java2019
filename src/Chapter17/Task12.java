package Chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //������� ������� ��� ����������� ����� � ����������
        Scanner input = new Scanner(System.in);
        //������ ������������ ������ �����������, ��� ������ ����������
        System.out.println("Please, input a sentence assume with no punctuation: ");
        //��������� ��� ����������� � ���������, �������� ��� � ������� ��������,��������� ��� �� ������,
        // �� ������ ������ ������� ����������
        List<String> words = new ArrayList<>(Arrays.asList(input.nextLine().toLowerCase()
                .replaceAll("\\p{P}", "").split(" ")));
        //���������� ��������� � �����, ������� ���������,��������� � ���������� ������� � ������� �� �����
        words.stream().distinct().sorted().forEach(value -> System.out.println(value));

    }
}
