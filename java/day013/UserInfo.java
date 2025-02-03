package com.company.day013;

import java.util.Objects;

class UserInfo {
			   private String name;
			   private int age;
			   public UserInfo() { super(); }
			   public UserInfo(String name, int age) { super(); this.name = name; this.age = age; }
			   public UserInfo(String name ) { super(); this.name = name; }
			   @Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
			   public String getName() { return name; }
			   public void setName(String name) { this.name = name; }
			   public int getAge() { return age; }
			   public void setAge(int age) { this.age = age; }
			   @Override public int hashCode() { return Objects.hash(age, name); }
			   @Override public boolean equals(Object obj) {
				   if (this == obj) return true;
				   if (obj == null) return false;
				   if (getClass() != obj.getClass()) return false;
				   UserInfo other = (UserInfo) obj;
				   return age == other.age && Objects.equals(name, other.name); } 
			}//end class




