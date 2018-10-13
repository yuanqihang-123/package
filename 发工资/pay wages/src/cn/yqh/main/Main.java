package cn.yqh.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import cn.yqh.employee.Employee;

public class Main {
	public static void main(String[] args) {

		// 总营业额随机生成
		Random rom = new Random();
		double totalMoney = (100000000 + rom.nextInt(500000));

		// 算出股东的分红总钱数，员工生日奖励500，经理生日奖励1000
		double shareHolderwages = (totalMoney - 3000 * 6 - 500 * 6 - 10000 * 5 - 1000 * 5) / (10);

		Employee employee1 = new Employee("员工1", 3000, new SimpleDateFormat(
				"1997-02-03"));
		Employee employee2 = new Employee("员工2", 3000, new SimpleDateFormat(
				"1997-03-03"));
		Employee employee3 = new Employee("员工3", 3000, new SimpleDateFormat(
				"1997-04-03"));
		Employee employee4 = new Employee("员工4", 3000, new SimpleDateFormat(
				"1997-05-03"));
		Employee employee5 = new Employee("员工5", 3000, new SimpleDateFormat(
				"1997-06-03"));
		Employee employee6 = new Employee("员工6", 3000, new SimpleDateFormat(
				"1997-07-03"));
		Employee manager1 = new Employee("经理1", 10000, new SimpleDateFormat(
				"1997-07-03"));
		Employee manager2 = new Employee("经理2", 10000, new SimpleDateFormat(
				"1997-04-03"));
		Employee manager3 = new Employee("经理3", 10000, new SimpleDateFormat(
				"1997-05-03"));
		Employee manager4 = new Employee("经理4", 10000, new SimpleDateFormat(
				"1997-05-03"));
		Employee manager5 = new Employee("经理5", 10000, new SimpleDateFormat(
				"1997-08-03"));
		Employee Shareholder1 = new Employee("股东1", shareHolderwages * 0.3,
				new SimpleDateFormat("1997-08-03"));
		Employee Shareholder2 = new Employee("股东2", shareHolderwages * 0.2,
				new SimpleDateFormat("1997-08-03"));
		Employee Shareholder3 = new Employee("股东3", shareHolderwages * 0.4,
				new SimpleDateFormat("1997-08-03"));

		List<Employee> list = new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(manager1);
		list.add(manager2);
		list.add(manager3);
		list.add(manager4);
		list.add(manager5);
		list.add(Shareholder1);
		list.add(Shareholder2);
		list.add(Shareholder3);

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("---------------------------");
			System.out.println("请选择要查询的对象：");
			System.out
					.println("1.查询个人                                              2.查询所有");
			int num = sc.nextInt();
			if (num !=1 && num !=2) {
				System.out.println("输入有误，重新来，傻子！这都能输错！");
			}
			if (num == 1) {
				System.out.println("请输入要查询的人的名字");
				String name = sc.next();
				for (Employee employee : list) {
					if (employee.getName().equals(name)) {

						// 判断此人为什么职位
						if (employee.getWages() == 3000) {
							System.out.println("这位员工你好，你的工资为：");
							for (int i = 0; i < 12; i++) {
								if (employee.getBirthday().MONTH_FIELD==i) {
									System.out.print("第" + (i + 1) + "个月："
											+ 3500+"	");
								}
								System.out.print("第" + (i + 1) + "个月：" + 3000+"	");
							}
							System.out.println();
							System.out.println("所有月份的工资都告诉你了，你还想查某一个月的吗？坑定是不用啦！");
							break;
						}

						else if (employee.getWages() == 10000) {
							System.out.println("这位经理你好，你的工资为：");
							for (int i = 0; i < 12; i++) {
								if (employee.getBirthday().MONTH_FIELD==i) {
									System.out.print("第" + (i + 1) + "个月："
											+ 11000+"	");
								}
								System.out.print("第" + (i + 1) + "个月：" + 10000+"	");
							}
							System.out.println();
							System.out.println("所有月份的工资都告诉你了，你还想查某一个月的吗？坑定是不用啦！");
							break;
						} else {
							System.out.println("这位股东你好，你的分红为："
									+ employee.getWages());
							break;
						}

						
					}
					
				}
				
				
			}
			

			if (num == 2) {
				for (Employee employee : list) {
					if (employee.getWages() == 3000) {
						System.out.println(employee.getName() + "工资为：");
						for (int i = 0; i < 12; i++) {
							if (employee.getBirthday().MONTH_FIELD==i) {
								System.out.print("第" + (i + 1) + "个月：" + 3500+"	");
							}
							System.out.print("第" + (i + 1) + "个月：" + 3000+"	");
						}
						System.out.println();
					}

					else if (employee.getWages() == 10000) {
						System.out.println(employee.getName() + "工资为：");
						for (int i = 0; i < 12; i++) {
							if (employee.getBirthday().MONTH_FIELD==i) {
								System.out.print("第" + (i + 1) + "个月：" + 11000+"	");
							}
							System.out.print("第" + (i + 1) + "个月：" + 10000+"	");
						}
						System.out.println();

					} else {
						System.out.println(employee.getName() + "分红为："
								+ employee.getWages());

					}

				}
			}

		}
	}
}
