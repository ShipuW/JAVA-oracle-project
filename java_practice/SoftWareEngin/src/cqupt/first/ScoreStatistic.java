package cqupt.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreStatistic {
	HashMap<String, Integer> hashMap;
	ArrayList<Integer> array1 = new ArrayList<Integer>();
	ArrayList<String> array2 = new ArrayList<String>();
	int average;
	public Map<String, Integer> statistic(List<Score> scores){
		for (int i = 0;i<scores.size();i++) {
			Score s = new Score();
			s = scores.get(i);
			hashMap.put(s.stdName,average);
		}
	return hashMap;	
	}
}
