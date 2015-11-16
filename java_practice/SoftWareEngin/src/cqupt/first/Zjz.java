package cqupt.first;


public class Zjz {
	public static void main(String[] args) {
		
		int i = -100 ;
		for(i = 0;i<100;i++){
			for(i = 200;i>=100;i--){
				while(i == 100){
					i *=i;
				}
			}
		}
		System.out.println(i);
	}
}
