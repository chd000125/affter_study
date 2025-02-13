package com.company.javaportfolio_User;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.table.DefaultTableModel;

public class UserRead implements UserProcess{
	@Override public void exec(ArrayList<UserInfo> users) {
		System.out.println("..........2. read");
		Iterator <UserInfo>  iter= users.iterator();   //1)줄을 서시오
		while(iter.hasNext()) {  //2)처리대상확인
			UserInfo u= iter.next(); //3)꺼내오기
			System.out.println( u.getNo() + "\t" + u.getName()+"\t"+ u.getEmail() + "\t"+ u.getDate());
		}
	}

	@Override public void exec(ArrayList<UserInfo> users, UserView_crud crud) {}

	@Override
	public void exec(UserView_crud crud) {
		UserDao dao = new UserDao();
		dao.getConnection();
		ArrayList<UserInfo> list = dao.readAll(); // db연동 - 전체 데이터 가져오기
		
		//화면 테이블 초기화
		DefaultTableModel model = (DefaultTableModel) crud.table.getModel();
		model.setNumRows(0);
		//화면 데이터 가져오기
		Iterator<UserInfo> iter = list.iterator();
		while ( iter.hasNext() ) {
			UserInfo temp = iter.next();
			Object[] data = {temp.getNo(), temp.getName(), temp.getEmail(), temp.getDate()};
			crud.model.addRow(data);
			}
		}
}
