//package Project;


import java.sql.*;
import javax.swing.*;

public class Sqlite {
	Connection conn = null;
	public static Connection dbconnector()
	{
		try{
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Badhan Dass\\Desktop\\Project\\info.sqlite");
			//JOptionPane.showMessageDialog(null, "Connection is Successful");
			return conn;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
