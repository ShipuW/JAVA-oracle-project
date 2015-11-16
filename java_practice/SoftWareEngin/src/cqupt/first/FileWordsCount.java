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
		//1.��ȡ���ַ�
		StringBuffer sb = null;
		try {
			// ��ȡ�ļ�
			BufferedReader br = new BufferedReader(new FileReader("c:/1.txt"));
			// ����ȡ�������ݷ����ַ�������
			sb = new StringBuffer();
			String s;
			while ((s = br.readLine()) != null) {
				sb.append(s);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ���");
		} catch (IOException e) {
			System.out.println("�ļ����쳣��");
		}
		//2.���������ʺͳ��ֵĴ�����ӵ�TreeMap��
		Pattern pat = Pattern.compile("[a-zA-Z]+");//����������ʽƥ�䵥��
		String string = sb.toString();
		Matcher matcher = pat.matcher(string);
		Map<String, Integer> map = new TreeMap<String,Integer>();
		String word = "";
		int times = 0;
		while(matcher.find()){//�Ƿ�ƥ�䵥��
			word = matcher.group();//�õ�һ������-��ӳ��ļ�
			//�Ե��ʽ��й���
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
					times = map.get(word);//�õ����ʳ��ֵĴ���
					map.put(word, times+1);
				}else{
					map.put(word, 1);
				}
			}
		}
		//3.���ݳ��ִ�������
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry
				<String,Integer>>(map.entrySet());
		/*
		 * ��д�Ƚ���
		 * ȡ�����ʸ���(value)�Ƚ�
		 */
		Comparator<Map.Entry<String, Integer>> comparator = 
				new Comparator<Map.Entry<String, Integer>>() {
		public int compare(Map.Entry<String,Integer> left,Map.Entry<String,Integer> right) {
				return (left.getValue()).compareTo(right.getValue());
			}
		};
		Collections.sort(list,comparator);//��������
		//4.��ӡ
		int last = list.size() - 1;
		for (int i = last; i > last-10; i--) {
			String key = list.get(i).getKey();
			Integer value = list.get(i).getValue();
			int j = last-i+1;
			System.out.println("Top"+j+":");
			System.out.println(key+" ������"+value);
		}
		long time2 = System.currentTimeMillis();
		System.out.println("��ʱ�� ");
		System.out.println(time2 - time1+"ms");
	}
}
