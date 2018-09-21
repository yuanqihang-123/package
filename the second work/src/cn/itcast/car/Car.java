package cn.itcast.car;

public class Car {
	private String name;
	private String color;
	private int wheels;
	private double weight;

	public Car() {
		super();

	}

	public Car(String cname, String color, int wheels, double weight) {
		super();
		this.name = cname;
		this.color = color;
		this.wheels = wheels;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "�������� [����Ʒ��=" + name + ", ������ɫ=" + color + ", ���Ӹ���="
				+ wheels + ", ����=" + weight + "]";
	}

	public String getCname() {
		return name;
	}

	public void setCname(String cname) {
		this.name = cname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
