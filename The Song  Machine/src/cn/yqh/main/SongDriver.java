package cn.yqh.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cn.yqh.master.Master;
import cn.yqh.player.Player;
import cn.yqh.song.Song;

public class SongDriver {
	public Master master;// 主持人
	public Player player;// 点歌的人
	public static SongDriver songdriver = new SongDriver();// new
															// 一个songDriver类，此类调用构造方法初始化了Master和Player类

	// 空参构造函数，用于初始化master和player。
	public SongDriver() {
		super();
		this.master = new Master();
		this.player = new Player();
	}

	// 程序的入口，从这里启动
	public static void main(String[] args) {

		// 按照题目的意图来，先new一个SongDriver 对象，此对象仅仅用于初始化Master和Player对象

		// 封装好一些歌曲实例，供程序使用
		List<Song> selectsong = new ArrayList<Song>();
		selectsong.add(new Song(1, "小跳蛙", "歌手1", 3.0));
		selectsong.add(new Song(2, "流浪的子弹", "歌手2", 3.0));
		selectsong.add(new Song(3, "年少有为", "歌手3", 3.0));
		selectsong.add(new Song(4, "可不可以", "歌手4", 3.0));
		selectsong.add(new Song(5, "怎么选择", "歌手5", 3.0));
		selectsong.add(new Song(6, "醉千年", "歌手6", 3.0));
		selectsong.add(new Song(7, "走马", "歌手7", 3.0));
		selectsong.add(new Song(8, "卡路里", "歌手8", 3.0));
		selectsong.add(new Song(9, "违背的青春", "歌手9", 3.0));
		selectsong.add(new Song(10, "陷阱", "歌手10", 3.0));

		System.out.println("			欢迎进入皇家点歌平台 ：				");
		while (true) {

			System.out
					.println("-----------------------------------------------------------------");
			System.out.println("			     请选择你的身份：				");
			System.out.println("		              用户请输入1，主持人请输入2.           ");
			Scanner sc = new Scanner(System.in);
			int identity = sc.nextInt();

			if (identity != 1 && identity != 2) {
				System.out.println("你输入的序号有误，请重新输入，谢谢配合！");

			}

			if (identity == 1) {
				System.out.println("   欢迎进入用户页面！所有可选择的歌曲如下：");
				for (Song song : selectsong) {
					System.out.println(song);
				}
				System.out.println("请按照id选择歌曲,若输入9999则结束点歌");

				while (true) {
					long id = sc.nextLong() - 1;
					// 判断用户输入的ID是否合法
					int size = selectsong.size();
					if (id == 9998) {
						break;
					}
					if (id < 0 || id > (size - 1)) {
						// 判断当前可选择歌曲列表的长度

						System.out.println("您输入的ID有误，请输入1到" + size
								+ "之间的数字");
						break;
					} else {
						// 先根据id从selectsong集合中 取值，再把取出来的元素放到 主持人的点歌集合list中

						Song song = selectsong.get((int) id);
						songdriver.player.addSong(songdriver, song);// 调用用户的方法进行存歌
					}

				}

			}

			if (identity == 2) {
				System.out.println("   欢迎进入主持人页面，当前所有被点的歌如下：");
				for (int i = 0; i < songdriver.master.list.size(); i++) {
					System.out.println("第" + (i + 1) + "首歌:");
					System.out.println(songdriver.master.list.get(i));
				}
				System.out.println("请主持人根据顺序选择要播放的歌曲：(若输入9999则结束点歌)");
				/*
				 * long masterId = sc.nextLong();
				 * songdriver.master.play(masterId);
				 */
				while (true) {
					long masterId = sc.nextLong() - 1;
					// 判断用户输入的ID是否合法
					int size = songdriver.master.list.size();
					if (masterId == 9998) {
						break;
					}
					if (masterId < 0 || masterId > (size - 1)) {
						// 判断当前可选择歌曲列表的长度

						System.out.println("您输入的ID有误，请输入1到" + size 
								+ "之间的数字");
						break;
					} else {
						// 根据主持人输入的masterID播放相应的歌曲

						songdriver.master.play(masterId);
					}

				}
			}

		}
	}
}
