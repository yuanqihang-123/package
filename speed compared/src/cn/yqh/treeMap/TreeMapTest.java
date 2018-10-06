package cn.yqh.treeMap;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.UUID;

public class TreeMapTest {
	public static void main(String[] args) {

		TreeMap<String,String> treeMap = new TreeMap<String,String>();// 此Map用于存储随机字符串并测试读取速度
		ArrayList<String> smallList = new ArrayList<String>();// 此smallList用于存储在Map集合中的十个字符串，为后面的比较做准备

		// 使用UUID工具直接生成随机字符创并储存在Map集合中，
		// 获取的十个字符串存在smallList中；
		for (int i = 0; i < 1000000; i++) {
			String s = UUID.randomUUID().toString();
			if (i % 100000 == 0) {
				smallList.add(s);
				// System.out.println(s);
			}
			treeMap.put(s, s);

		}
		// 打印treeMap和smallList的长度，看看数据存储是否成功
		System.out.println(treeMap.size());
		System.out.println(smallList.size());

		// 接下来测试treeMap的读取速度；

		for (int i = 0; i < 10; i++) {

			// 依次取出smallList中的10个串，在treeMap中查找，
			String s = smallList.get(i);
			// 设置开始时间
			long beginTime = System.nanoTime();// 10的负9次方秒
			// 判断list中是否存在s这个元素
			boolean b = treeMap.containsKey(s);
			// 设置结束时间
			long endTime = System.nanoTime();
			// 若找到，则打印输出用到 的时间
			if (b == true) {
				System.out.println("查找s" + (i + 1) + "字符串成功,时间为："
						+ (endTime - beginTime) + "纳秒");
			}
		}
	}
}
