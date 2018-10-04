package cn.yqh.song;

public class Song {
	private int id;//歌曲序号
	private String songName;//歌曲名字
	private String singer;//歌手
	private double time;//播放时间
	
	
	//空参构造函数
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	//有参构造，用于初始化以上三个属性
	public Song(int id,String songName, String singer, double time) {
		super();
		this.id = id;
		this.songName = songName;
		this.singer = singer;
		this.time = time;
	}

	
	//以下为 get set方法
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "Song [id=" + id + ", songName=" + songName + ", singer="
				+ singer + ", time=" + time + "]";
	}


	
	
	
	
	
	
	
	
	
	
}
