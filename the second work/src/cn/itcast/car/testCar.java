package cn.itcast.car;

import java.util.Scanner;

import org.junit.Test;

public class testCar {

	@Test
	public void test() {
		Car car = new Car();
		System.out.println("请依次输入汽车的品牌（汉字或者英文），颜色（汉字或者英文），轮子数量（数字），重量（数字）：");
		Scanner sc = new Scanner(System.in);
		car.setCname(sc.next());
		car.setColor(sc.next());
		car.setWheels(sc.nextInt());
		car.setWeight(sc.nextDouble());
		System.out.println("输入完毕！此汽车的属性为：");
		System.out.println(car);

	}

}
