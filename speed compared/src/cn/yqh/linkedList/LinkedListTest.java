package cn.yqh.linkedList;

import java.util.LinkedList;
import java.util.UUID;

public class LinkedListTest {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();// 此list用于存储随机字符串并测试读取速度
		LinkedList<String> smallList = new LinkedList<String>();// 此smallList用于存储在list集合中的十个字符串，为后面的比较做准备

		// 使用UUID工具直接生成随机字符创并储存在list集合中，
		// 获取的十个字符串存在smallList中；
		for (int i = 0; i < 1000000; i++) {
			String s = UUID.randomUUID().toString();
			if (i % 100000 == 0) {
				smallList.add(s);
				// System.out.println(s);
			}
			list.add(s);

		}
		// 打印两个LinkedList的长度，看看数据存储是否成功
		System.out.println(list.size());
		System.out.println(smallList.size());

		// 接下来测试linkedList的读取速度；

		for (int i = 0; i < 10; i++) {
			// 获取出smallList里面的第i个元素
			String s = smallList.get(i);
			// 测试查找第10 0000*（i+1）个元素的时间
			// 设置开始时间
			long beginTime = System.nanoTime();// 10的负9次方秒
			// 判断list中是否存在s这个元素
			boolean b = list.contains(s);
			// 设置结束时间
			long endTime = System.nanoTime();
			// 若找到，则打印输出用到 的时间
			if (b == true) {
				System.out.println("查找第" + 100000 * (i + 1) + "个元素成功,时间为："
						+ (endTime - beginTime) + "纳秒");
			}
		}
	}

}
