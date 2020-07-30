package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.SkillDAO;

public class Main{
	public static void main(String args[]) throws ClassNotFoundException, IOException, SQLException {
	SkillDAO skilldao= new SkillDAO();
	List<String> list= new ArrayList<String>();
	list = skilldao.getSkills();
	System.out.println(list);
	}
}
