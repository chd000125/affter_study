package com.company.javaportfolio_User;

import java.util.ArrayList;

public interface UserProcess {
  public void  exec(ArrayList<UserInfo> users) ;
  public void  exec(ArrayList<UserInfo> users, UserView_crud crud);

  public void  exec(UserView_crud crud);   //db-ver  ###
}












//UserCreate /   UserRead  / UserUpdate  / UserDelete
/*
		<<interface>>   UserProcess  
				    (   void  exec(  ArrayList<UserInfo> users     )                       )	  # 처리			    
				    (   void  exec(  ArrayList<UserInfo> users  , UserView view )     )   # 처리, 화면
		↑        ↑             ↑               ↑
    UserCreate         UserRead   UserUpdate   UserDelete
    # list.add            #get+size   #iterator      #iter.remove      
*/