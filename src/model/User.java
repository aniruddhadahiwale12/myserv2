package model;

public class User {
	
	private int id;
	private String fname, lname, email, password;
	
	public User(){
		
	}
	

	public  User(String fname, String lname, String email, String password) {
		
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		
	}
	
public  User(int id, String fname, String lname, String email, String password) {
		
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		
	}

	public int getUid() {
		return id;
	}

	public void setUid(int uid) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
