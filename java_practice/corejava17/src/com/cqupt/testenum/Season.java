package com.cqupt.testenum;

public enum Season {
		spring("chuntian"),
		autumn(100),
		summer{
			public int  cal(int a,int b){
				return a+b;
			}
		};
		public  int cal(int a,int b){
			return 0;
		}
		private Season(String s) {
			// TODO Auto-generated constructor stub
			System.out.println(s);
		}
		
		private Season(int a){
			System.out.println(a);
		}
		//private ����ʡ�ԣ�ö�����͵Ĺ��췽��Ĭ��˽�е�
		private Season(){
			System.out.println("true");
			
		}
		/*public int  cal(int a,int b){
			return a+b;
		}*/
		
}

