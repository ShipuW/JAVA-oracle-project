package ques127.cqupt;

public class Bam extends Building{
	public static void main(String[] args) {
		Building build1 = new Building();
		Bam bam1 = new Bam();
		
		Bam bam2 = (Bam)build1;
		Object obj1 = (Object)build1;
		Building buidl2 = (Building)bam1;
		Building build3 = (Building)obj1;
		Building buidl4 = (Building)bam2;
	}
}
