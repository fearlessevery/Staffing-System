package cn.edu.xaut.bean;

import java.sql.Date;
import java.sql.Timestamp;

public class StudentBean {
	private int stuid;
	private String stuname;
	private String stucolledg;
	private String stutel;
	private String stuemail;
	private Date birthday;
	private Timestamp lasttime;//z最后一次登陆时间
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStucolledg() {
		return stucolledg;
	}
	public void setStucolledg(String stucolledg) {
		this.stucolledg = stucolledg;
	}
	public String getStutel() {
		return stutel;
	}
	public void setStutel(String stutel) {
		this.stutel = stutel;
	}
	public String getStuemail() {
		return stuemail;
	}
	public void setStuemail(String stuemail) {
		this.stuemail = stuemail;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Timestamp getLasttime() {
		return lasttime;
	}
	public void setLasttime(Timestamp lasttime) {
		this.lasttime = lasttime;
	}
	@Override
	public String toString() {//用来显示学生信息，不用打印每个字段
		return "StudentBean [stuid=" + stuid + ", stuname=" + stuname + ", stucolledg=" + stucolledg + ", stutel="
				+ stutel + ", stuemail=" + stuemail + ", birthday=" + birthday + ", lasttime=" + lasttime + "]";
	}
	
}
