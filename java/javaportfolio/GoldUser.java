package com.company.javaportfolio;

import java.util.Calendar;

public class GoldUser {
   public static int cnt = 0;
   private int no;
   private String userName;
   private String pass;
   private String userEmail;
   private int userMoney;
   private String date;

   public GoldUser() { super();  }
   public GoldUser(int no, String userName, String pass, String userEmail, int userMoney, String date) {
	      super();
	      this.no = no;
	      this.userName = userName;
	      this.pass = pass;
	      this.userEmail = userEmail;
	      this.userMoney = userMoney;
	      this.date = date;
	   }
   public GoldUser(String userName, String pass, String userEmail) {
      super();
      this.no = ++cnt;
      this.userName = userName;
      this.pass = pass;
      this.userEmail = userEmail;
      this.userMoney = userMoney;
      Calendar cal = Calendar.getInstance();
      this.date = cal.get(1) +"-"+ cal.get(2) +"-"+ cal.get(5);
   }
   @Override public String toString() {
      return "GoldUser [no=" + no + ", userName=" + userName + ", userEmail=" + userEmail + ", userMoney=" + userMoney
            + ", date=" + date + "]";}
   public int getNo() { return no; }
   public void setNo(int no) { this.no = no; }
   public String getUserName() { return userName; }
   public void setUserName(String userName) { this.userName = userName; }
   public String getUserEmail() { return userEmail; }
   public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
   public int getUserMoney() { return userMoney; }
   public void setUserMoney(int userMoney) { this.userMoney = userMoney; }
   public String getDate() { return date; }
   public void setDate(String date) { this.date = date; }
   public String getPass() { return pass; }
   public void setPass(String pass) { this.pass = pass; }
}
