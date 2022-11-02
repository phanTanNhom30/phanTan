package entity;

public class TaiKhoan {
	private String email;
	private String userName;
	private String passWord;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiKhoan other = (TaiKhoan) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}
	public TaiKhoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaiKhoan(String email, String userName, String passWord) {
		super();
		this.email = email;
		this.userName = userName;
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "TaiKhoan [email=" + email + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
}
