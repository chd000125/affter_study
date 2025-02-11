package com.company.test;

import java.util.Calendar;

public class GoldUser {
   public static int cnt = 1;
   private String etc;
   private int no;
   private String userName;
   private String pass;
   private String userEmail;
   private int userMoney;
   private String date;
   
   public GoldUser() { super();  }
   public GoldUser(int no, String userName, String userEmail, int userMoney, String date) {
      super();
      this.no = no;
      this.userName = userName;
      this.userEmail = userEmail;
      this.userMoney = userMoney;
      this.date = date;
   }
   public GoldUser(String userName, String userEmail, int userMoney) {
      super();
      this.no = cnt++;
      this.userName = userName;
      this.userEmail = userEmail;
      this.userMoney = userMoney;
      Calendar cal = Calendar.getInstance();
      this.date = cal.get(1) +"-"+ cal.get(2) +"-"+ cal.get(5);
   }
   
   
   public GoldUser(String userName, String pass, String userEmail) {
      super();
      this.userName = userName;
      this.pass = pass;
      this.userEmail = userEmail;

      this.userMoney = 0;
      Calendar cal = Calendar.getInstance();
      this.date = cal.get(1) +"-"+ cal.get(2) +"-"+ cal.get(5);
   }
   @Override public String toString() {
      return "GoldUser [no=" + no + ", userName=" + userName + ", userEmail=" + userEmail + ", userMoney=" + userMoney
            + ", date=" + date + "]";}
   public static int getCnt() { return cnt; }
   public static void setCnt(int cnt) { GoldUser.cnt = cnt; }
   public int getNo() { return no; }
   public void setNo(int no) { this.no = no; }
   public String getUserName() { return userName; }
   public void setUserName(String userName) { userName = userName; }
   public String getUserEmail() { return userEmail; }
   public void setUserEmail(String userEmail) { userEmail = userEmail; }
   public int getUserMoney() { return userMoney; }
   public void setUserMoney(int userMoney) { userMoney = userMoney; }
   public String getDate() { return date; }
   public void setDate(String date) { this.date = date; }
   public String getPass() { return pass; }
   public void setPass(String pass) { this.pass = pass; }
}
