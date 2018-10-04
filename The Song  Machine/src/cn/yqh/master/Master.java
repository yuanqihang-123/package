package cn.yqh.master;

import java.util.ArrayList;
import java.util.List;

import cn.yqh.song.Song;

public class Master {
	
	//歌曲列表
	public static List<Song> list ;
	//空参构造函数，初始化list
	public Master() {
		super();
		list = new ArrayList<Song>();
	}
	
	//播放歌曲函数
	public void play(long id){
		Song song = list.get((int) id);
		System.out.println(song.getSongName()+"正在播放！");
		
		System.out.println();
		System.out.println();
		System.out.println();
		//播放完此歌曲，就把此歌曲从已选择的list集合中移除
		list.remove((int)id);
		System.out.println("剩下的歌曲列表:");
		//显示 list中剩下的歌曲列表
		/*for (Song s : list) {
			System.out.println(s);
		}*/
		if(list.size()==0){
			System.out.println("所选择的歌曲播放完毕！");
		}else{
			for (int i = 0;i<list.size();i++) {
				System.out.println("第"+(i+1)+"首歌:");
				System.out.println(list.get(i));
			}
		}
		
	}
	
	
}
