package cn.yqh.player;

import cn.yqh.song.Song;
import cn.yqh.main.SongDriver;;

public class Player {
	
	//点歌函数
	public void addSong(SongDriver songdriver,Song song){
		songdriver.master.list.add(song);
		
	}
}
