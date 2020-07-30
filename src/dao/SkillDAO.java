package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import utility.ConnectionManager;

public class SkillDAO{
	
	
	public List<String> getSkills() throws ClassNotFoundException, IOException, SQLException
	{
		
		ConnectionManager cm = new ConnectionManager();
		Connection con = null;
		String sql="select skills from team order by name asc";
		con=cm.getConnection();
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		List<String> skill = new ArrayList<String>();
		while(rs.next())
		{
			skill.add(rs.getString("skills"));
		}
 		return skill;
		
	}
	
}
