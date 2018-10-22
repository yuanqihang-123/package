package cn.yqh.vehicle;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		
		while(true){
			System.out.println("总的出行方式有：汽车，高铁，飞机");
			System.out.println("请选择你的出行方式和总的路程数");
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			Integer length = sc.nextInt();
			
			
			if(name.equals("汽车")){
				System.out.println("你选择的是汽车，到站时间为30min，离站时间为30min，取票时间为10mmin，检票时间为3min，等车时间为30min");
				Car car = new Car("car",30,30,10,3,30,80.0,0.32);
				car.length = length;
				car.name = name;
				car.spend();
				car.print();
				System.out.println();
				System.out.println();
				continue;
			}
			if(name.equals("高铁")){
				System.out.println("你选择的是高铁，到站时间为40min，离站时间为40min，取票时间为10mmin，检票时间为3min，等车时间为30min");
				HighSpeedRail rail = new HighSpeedRail("highSpeedRail",40,40,10,3,30,250.0,0.45);
				rail.length = length;
				rail.name = name;
				rail.spend();
				rail.print();
				System.out.println();
				System.out.println();
				continue;
			}
			if(name.equals("飞机")){
				System.out.println("你选择的是飞机，到站时间为60min，离站时间为60min，取票时间为20mmin，检票时间为5min，等车时间为30min");
				Aircraft aircraft = new Aircraft("aircraft",60,60,20,5,30,800.0,0.75);
				aircraft.length = length;
				aircraft.name = name;
				aircraft.spend();
				aircraft.print();
				System.out.println();
				System.out.println();
				continue;
			}
			System.out.println("你的输入有误 ，请重新输入！！！");
			System.out.println();
			System.out.println();
		}
	}
	
	
}
