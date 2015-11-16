package cqupt.first;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileWordsCount {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		//1.读取到字符
		StringBuffer sb = null;
		try {
			// 读取文件
			BufferedReader br = new BufferedReader(new FileReader("c:/1.txt"));
			// 将读取到的数据放入字符缓冲区
			sb = new StringBuffer();
			String s;
			while ((s = br.readLine()) != null) {
				sb.append(s);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("文件未找到！");
		} catch (IOException e) {
			System.out.println("文件读异常！");
		}
		//2.将各个单词和出现的次数添加到TreeMap中
		Pattern pat = Pattern.compile("[a-zA-Z]+");//定义正则表达式匹配单词
		String string = sb.toString();
		Matcher matcher = pat.matcher(string);
		Map<String, Integer> map = new TreeMap<String,Integer>();
		String word = "";
		int times = 0;
		while(matcher.find()){//是否匹配单词
			word = matcher.group();//得到一个单词-树映射的键
			//对单词进行过滤
			if((!word.equals("the")&&!word.equals("is")&&!word.equals("to")&&!word.equals("by")&&!word.equals("a")
					&&!word.equals("and")&&!word.equals("was")&&!word.equals("has")&&!word.equals("had")&&!word.equals("I")
					&&!word.equals("for")&&!word.equals("my")&&!word.equals("me")&&!word.equals("with")&&!word.equals("of")
					&&!word.equals("in")&&!word.equals("on")&&!word.equals("that")&&!word.equals("it")&&!word.equals("The")
					&&!word.equals("at")&&!word.equals("which")&&!word.equals("he")&&!word.equals("as")  
                    &&!word.equals("but")&&!word.equals("his")&&!word.equals("from")&&!word.equals("some")&&!word.equals("be")
                    &&!word.equals("were")&&!word.equals("not") &&!word.equals("they")&&!word.equals("this")&&!word.equals("an")
                    &&!word.equals("no")&&!word.equals("into")&&!word.equals("It")&&!word.equals("there")&&!word.equals("But")
                    &&!word.equals("him")&&!word.equals("could")&&!word.equals("been")&&!word.equals("would")&&!word.equals("she")
                    &&!word.equals("then")&&!word.equals("Then")&&!word.equals("have")&&!word.equals("we")&&!word.equals("t")
                    &&!word.equals("you")&&!word.equals("can")&&!word.equals("one")&&!word.equals("are")&&!word.equals("all")
                    &&!word.equals("And")&&!word.equals("your")&&!word.equals("s")&&!word.equals("do")&&!word.equals("out")
                    &&!word.equals("what")&&!word.equals("about")&&!word.equals("so")&&!word.equals("up")&&!word.equals("re"))
                    &&!word.equals("So")&&!word.equals("get")&&!word.equals("just")&&!word.equals("who")&&!word.equals("these")
                    &&!word.equals("if")&&!word.equals("our")){
				if(map.containsKey(word)){
					times = map.get(word);//得到单词出现的次数
					map.put(word, times+1);
				}else{
					map.put(word, 1);
				}
			}
		}
		//3.根据出现次数排序
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry
				<String,Integer>>(map.entrySet());
		/*
		 * 重写比较器
		 * 取出单词个数(value)比较
		 */
		Comparator<Map.Entry<String, Integer>> comparator = 
				new Comparator<Map.Entry<String, Integer>>() {
		public int compare(Map.Entry<String,Integer> left,Map.Entry<String,Integer> right) {
				return (left.getValue()).compareTo(right.getValue());
			}
		};
		Collections.sort(list,comparator);//进行排序
		//4.打印
		int last = list.size() - 1;
		for (int i = last; i > last-10; i--) {
			String key = list.get(i).getKey();
			Integer value = list.get(i).getValue();
			int j = last-i+1;
			System.out.println("Top"+j+":");
			System.out.println(key+" 次数："+value);
		}
		long time2 = System.currentTimeMillis();
		System.out.println("耗时： ");
		System.out.println(time2 - time1+"ms");
	}
}
