package cn.itcast.beersong;

public class BeerSong {
	public static void main(String[] args) {

		int beerNum = 99;// 全局变量beerNum,

		String word = "bottles";

		while (beerNum > 0) {
			
			if (beerNum == 1) {word = "bottle";}// 局部变量，当剩下最后一个瓶子的时候，应该使用单数的bottle
			
			
			System.out.println(beerNum + " " + word + " of beer on the wall.");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;
		}// while循环结束

		System.out.println("No more bottles of beer on the wall");// 当剩下0个瓶子时，输出No more bottles of beer on the wall。

	}

}