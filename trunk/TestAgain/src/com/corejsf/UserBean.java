package com.corejsf;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable {
   private String name;
   private String password;
   private String greeting;
   
   public String getName() { return name; }   
   public void setName(String newValue) { name = newValue;
   System.out.println("Name:" + name);
   }

   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; 
   System.out.println("Password:" + password);}
	public String getGreeting() {
		if ( name != null) {
		if (name.length() == 0 )
			return "Don't try blank text"; 
		else
			return "Hello Mr Human being";
		}
		else return "";
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}   
	   
   
}
