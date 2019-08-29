package com.koo.tracki.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koo.tracki.db.RecordDaoImpl;
import com.koo.tracki.db.RecordDto;

@Service
public class StatisticServiceImpl implements StatisticService {

	@Autowired
	private RecordDaoImpl recordDao;

	@Override
	public void test() {
		System.out.println("called");
		double[] x = { 1, 2, 4, 8 };
		double[] y = { 2, 4, 8, 16 };
		double corr = new PearsonsCorrelation().correlation(y, x);

		System.out.println(corr);
	}

	@Override
	public List<RecordDto> collectRecord(String uid) {
		System.out.println("collect record : " + uid);
		return recordDao.getUserRecord(uid);
	}

	@Override
	public double[] getCorrelation(List<RecordDto> records) {
		
		System.out.println(records);
		/*ArrayList<Double> moodList = new ArrayList<>();
		ArrayList<Double[]> factorsList = new ArrayList<Double[]>();*/

		List<Double> moods = new ArrayList<Double>();
		List<Double> f1s = new ArrayList<Double>();
		List<Double> f2s = new ArrayList<Double>();
		List<Double> f3s = new ArrayList<Double>();
		List<Double> f4s = new ArrayList<Double>();
	
		int idx = 0;
		for (RecordDto dto : records) {
			moods.add((double)dto.getScrMood());
			f1s.add((double)dto.getScrF1());
			f2s.add((double)dto.getScrF2());
			f3s.add((double)dto.getScrF3());
			f4s.add((double)dto.getScrF4());
			idx++;
		}
		
		double[] moodArr = moods.stream().mapToDouble(Double::doubleValue).toArray();
		double[] f1Arr = f1s.stream().mapToDouble(Double::doubleValue).toArray();
		double[] f2Arr = f2s.stream().mapToDouble(Double::doubleValue).toArray();
		double[] f3Arr = f3s.stream().mapToDouble(Double::doubleValue).toArray();
		double[] f4Arr = f4s.stream().mapToDouble(Double::doubleValue).toArray();
		
		
		System.out.println("result size : " + idx);
		double[] results = {0,0, 0, 0};
		
		try {
				results[0] = new PearsonsCorrelation().correlation(moodArr, f1Arr); 
				  results[1] = new PearsonsCorrelation().correlation(moodArr, f2Arr); 
				  results[2] = new PearsonsCorrelation().correlation(moodArr, f3Arr); 
				  results[3] = new PearsonsCorrelation().correlation(moodArr, f4Arr);	
				
		} catch(Exception e) {
			System.out.println("errrrr!!!!!!!");
					
				}
		System.out.println("moods: "+moodArr);
		return results;
	}

}
