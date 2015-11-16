
package data;

import java.io.Serializable;

 /**
 * �û�״̬�ࡣ
 */
public class UserState implements Serializable{

	private int state;
	private String SName;
	private Integer jqnum;
	
	public UserState() {
		
	}

	public UserState(String SName,int state) {
		this.state = state;
		this.SName = SName;
	}
	
	public static UserState ONLINESTATE = new UserState("����",0);
	public static UserState HIDDENSTATE = new UserState("����",1);
	public static UserState DEPARTURESTATE = new UserState("�뿪",2);
	public static UserState BUSYSTATE = new UserState("��æ",3);
	public static UserState OFFLIENSTATE = new UserState("����",4);
	
	public String toString() {
		return SName;
	}

	public int getState() {
		return state;
	}
	public Integer getJqnum() {
		return jqnum;
	}

	public void setJqnum(Integer jqnum) {
		this.jqnum = jqnum;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String name) {
		SName = name;
	}
	
	/**
	 * �����û�״̬����״̬��Ϣ��
	 * @param state ״̬��
	 * @return ״̬��Ϣ��
	 */
	public static String getStateName(int state){
		String sName = state==DEPARTURESTATE.getState()?DEPARTURESTATE.getSName():
			(state==BUSYSTATE.getState()?BUSYSTATE.getSName():
			(state==HIDDENSTATE.getState()?HIDDENSTATE.getSName():
			(state==ONLINESTATE.getState()?ONLINESTATE.getSName():
			(OFFLIENSTATE.getSName()))));
		return sName;
	}
}