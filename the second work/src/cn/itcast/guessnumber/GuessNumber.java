package cn.itcast.guessnumber;

import java.util.Scanner;
/**
 * ����С��Ϸ
 * 
 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100); // ���������
//        System.out.println(number);
        int guess;// �û��µ�����
        int count = 0;// �²����
        System.out.println("��������һ��0��99֮��������������ʲô��");
        // �û��²������
        do {
            guess = input.nextInt();
            if (number < guess) {
                System.out.println("���˵㣬�ٲ£�");
                count++;
            } else if (number > guess) {
                System.out.println("С�˵㣬�ٲ£�");
                count++;
            } else {
                count++;
                break;
            }
        } while (true);
         System.out.println("���������"+number);
         System.out.println("���µĴ�����"+count);
        // ���ݲ²������������
        if (count == 1) {
        	System.out.println("��̫�����ˣ�");
        } else if (count >= 2 && count <= 5) {
        	System.out.println("�����ٽ�������");
        } else {
        	System.out.println("ҪŬ������");
        }
    }
}