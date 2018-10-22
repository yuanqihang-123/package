package cn.yqh.vehicle;

public abstract class Vehicle {
	protected String name = null;
	protected Integer toStationTime = null;//默认都是坐汽车 去某一个站点，时间单位为min
	protected Integer leaveStationTime = null;//以min为单位
	protected Integer getTicketTime = null;//以min为单位
	protected Integer checkTicketTime = null;
	protected Integer waitCarTime = null;
	protected Double speed = null;
	protected Double unitPrice = null;
	
	protected Integer length = null;//总距离
	protected Double totalMoney = null;//车票钱
	protected Double totalTime = null;//总花费的时间
	
	
	public abstract void spend();
	public abstract void print();
	
	
	public Vehicle(String name, Integer toStationTime,
			Integer leaveStationTime, Integer getTicketTime,
			Integer checkTicketTime, Integer waitCarTime, Double speed,
			Double unitPrice) {
		super();
		name = name;
		this.toStationTime = toStationTime;
		this.leaveStationTime = leaveStationTime;
		this.getTicketTime = getTicketTime;
		this.checkTicketTime = checkTicketTime;
		this.waitCarTime = waitCarTime;
		this.speed = speed;
		this.unitPrice = unitPrice;
	}
	
}
