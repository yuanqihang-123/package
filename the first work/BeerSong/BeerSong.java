package cn.itcast.beersong;

public class BeerSong {
	public static void main(String[] args) {

		int beerNum = 99;// ȫ�ֱ���beerNum,

		String word = "bottles";

		while (beerNum > 0) {
			
			if (beerNum == 1) {word = "bottle";}// �ֲ���������ʣ�����һ��ƿ�ӵ�ʱ��Ӧ��ʹ�õ�����bottle
			
			
			System.out.println(beerNum + " " + word + " of beer on the wall.");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;
		}// whileѭ������

		System.out.println("No more bottles of beer on the wall");// ��ʣ��0��ƿ��ʱ�����No more bottles of beer on the wall��

	}

}