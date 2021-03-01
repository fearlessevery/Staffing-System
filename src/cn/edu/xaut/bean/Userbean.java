package cn.edu.xaut.bean;
public class Userbean{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String username;
	private String password;
	private String realname;
	private String telnumber;
	private String emialaddress;
	private String partment;
	@Override
	public String toString() {
		return "Userbean [id=" + id + ", username=" + username + ", password=" + password + ", realname=" + realname
				+ ", telnumber=" + telnumber + ", emialaddress=" + emialaddress + ", partment=" + partment + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String Password) {
		this.password=Password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String Username) {
		this.username=Username;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getTelnumber() {
		return telnumber;
	}
	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}
	public String getEmialaddress() {
		return emialaddress;
	}
	public void setEmialaddress(String emialaddress) {
		this.emialaddress = emialaddress;
	}
	public String getPartment() {
		return partment;
	}
	public void setPartment(String partment) {
		this.partment = partment;
	}
	
}