package com.cqupt.string;

public class TestString2 {
	public static void main(String[] args) {
		String s = "aAAFaaadaSAAAwwwaaaA";
		int b=0,c=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				b++;
			} else {
				c++;
			}
		}
		System.out.println("小写字母数="+b);
		System.out.println("大写字母数="+c);
		System.out.println("---------------");
		int j=0;
		String k ="asdfjavajavaasdfjavaasdfjavaasdfajavasdf" ;
		for(int i=0;i<k.length();i++){
			if(k.indexOf("java", i)==i){
				j++;
			}
		}
		System.out.println("java数="+j);
		System.out.println("----------------");
		String m="aadsfasdfa";
		System.out.println("小写="+m.toLowerCase());
		System.out.println("大写="+m.toUpperCase());
		System.out.println("----------------");
		String w="java,c,html,sql,test,hello";
		String []p=w.split(",");
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
		int co=0;
		int index=k.indexOf("java");
		while(index!=-1){
			co++;
			index=k.indexOf("java", index+4);
		}
		System.out.println(co);
		
        }
	
	
}
