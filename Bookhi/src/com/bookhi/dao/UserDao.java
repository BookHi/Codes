package com.bookhi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookhi.entity.User;
import com.bookhi.utils.DBBean;

public class UserDao {
	
	public Boolean save(User user){
		String sql="INSERT INTO user (username, pwd, nickname, city,phone,email,lastLoginIp) VALUES ('"+user.getUsername()+"', md5("+user.getPwd()+"),'"+user.getNickname()+"', '"+user.getCity()+"', '"+user.getPhone()+"', '"+user.getEmail()+"', '"+user.getLastLoginIp()+"');";
		int result = DBBean.getInstance().executeUpdate(sql);
	 	if(result==1){
	 		return true;
	 	}
	 	return false;   
	}
	public User query(String username,String pwd){
		String sql="select * from user where username='"+username+"' and pwd= md5("+pwd+")";
		ResultSet result = DBBean.getInstance().executeQuery(sql);
		User user;
		try {
			if(result.next()){
				user=new User(username,result.getString("pwd"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return null;
	}
}
