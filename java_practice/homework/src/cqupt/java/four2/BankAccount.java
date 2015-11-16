package cqupt.java.four2;

public class BankAccount implements Comparable<BankAccount>{
	private String bankId;
	private double deposit;
	
	public BankAccount(String id,double deposit){
		this.bankId = id;
		this.deposit = deposit;
	}
	@Override
	//�������
	public int compareTo(BankAccount other) {
		if(this.deposit<other.deposit)
			return -1;
		if(this.deposit>other.deposit)
			return 1;
		return 0;              		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�����˺ţ�"+bankId+"\t���д�"+deposit;
	}




}
