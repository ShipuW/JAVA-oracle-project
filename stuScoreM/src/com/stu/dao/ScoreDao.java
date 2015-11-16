package com.stu.dao;

import java.util.List;

import com.stu.model.Score;

public interface ScoreDao {
	
	public List<Score> getByCourse(int cno);
	
	public List<Score> getByStu(String sno);
	
	public boolean delByCno(int cno);
	
	public boolean delBystu(String sno);
	
	public boolean delByscid(int scid);
	
	public boolean updateByscid(Score sc);
	
}
