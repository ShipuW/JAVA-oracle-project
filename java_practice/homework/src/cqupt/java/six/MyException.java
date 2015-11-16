package cqupt.java.six;
//自定义异常类
public class MyException extends Exception {
	private String ErrorMessage;
	
	public MyException(String message){
		//调用父类构造方法
		super(message);
		this.ErrorMessage = message;
	}
	//重写父类的getMessage方法
	public String getMessage(){
		return ErrorMessage+"不是整数！";	
	}

}
