package cqupt.java.six;
//�Զ����쳣��
public class MyException extends Exception {
	private String ErrorMessage;
	
	public MyException(String message){
		//���ø��๹�췽��
		super(message);
		this.ErrorMessage = message;
	}
	//��д�����getMessage����
	public String getMessage(){
		return ErrorMessage+"����������";	
	}

}
