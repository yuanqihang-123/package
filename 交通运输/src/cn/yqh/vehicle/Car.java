package cn.yqh.vehicle;

public class Car extends Vehicle{

	
	public Car(String name, Integer toStationTime, Integer leaveStationTime,
			Integer getTicketTime, Integer checkTicketTime,
			Integer waitCarTime, Double speed, Double unitPrice) {
		super(name, toStationTime, leaveStationTime, getTicketTime, checkTicketTime,
				waitCarTime, speed, unitPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void spend() {
		//算花费的总时间
		this.totalTime = this.toStationTime+this.leaveStationTime+this.getTicketTime+this.checkTicketTime+this.waitCarTime
				+(this.length/this.speed);
//		算总花费的车票钱
		this.totalMoney = this.length*this.unitPrice;
	}

	@Override
	public void print() {
		System.out.println(this.name+"花的时间和车票钱分别是："+this.totalTime+"分钟，"+this.totalMoney+"元");
	
	}

	
	
	
	
	
}
