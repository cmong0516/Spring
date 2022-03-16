package sample3;

import java.util.Date;
import java.util.Properties;

public class UserVO {
	private String userName;
	private Properties per;
	private Date my_date;

	public UserVO() {
		super();
		
	}

//	public UserVO(String userName, Properties per, Date my_date) {
//		super();
//		this.userName = userName;
//		this.per = per;
//		this.my_date = my_date;
//	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Properties getPer() {
		return per;
	}

	public void setPer(Properties per) {
		this.per = per;
	}

	public Date getMy_date() {
		return my_date;
	}

	public void setMy_date(Date my_date) {
		this.my_date = my_date;
	}

	@Override
	public String toString() {
		return "UserVO [userName=" + userName + ", per=" + per + ", my_date=" + my_date + "]";
	}

}
