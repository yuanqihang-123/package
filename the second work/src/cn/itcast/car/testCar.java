package cn.itcast.car;

import java.util.Scanner;

import org.junit.Test;

public class testCar {

	@Test
	public void test() {
		Car car = new Car();
		System.out.println("����������������Ʒ�ƣ����ֻ���Ӣ�ģ�����ɫ�����ֻ���Ӣ�ģ����������������֣������������֣���");
		Scanner sc = new Scanner(System.in);
		car.setCname(sc.next());
		car.setColor(sc.next());
		car.setWheels(sc.nextInt());
		car.setWeight(sc.nextDouble());
		System.out.println("������ϣ�������������Ϊ��");
		System.out.println(car);

	}

}
