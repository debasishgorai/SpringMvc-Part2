package SpringBootApplication.bindings;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class User {
	@NotEmpty(message="please enter name")
private String name;
	@NotEmpty(message="please enter password")
private String pwd;
	@NotEmpty(message="please enter email")
	@Email(message="please enter valid email")
private String email;
	@NotNull(message="enter phone number")
private Long phno;
@Override
public String toString() {
	return "User [name=" + name + ", pwd=" + pwd + ", email=" + email + ", phno=" + phno + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getPhno() {
	return phno;
}
public void setPhno(Long phno) {
	this.phno = phno;
}
}
