package br.com.mio.di.bao.heaps;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class FindTheRunningMedian {

	public static void main(String[] args) {
		double[] values = {12,4,5,3,8,7};
		List<Double> aux = new LinkedList<>();
		int mid = 0;
		
		for(double value : values) {
			aux.add(value);
			Collections.sort(aux, new Comparator<Double>() {
				public int compare(Double o1, Double o2) {
					return o1.compareTo(o2);
				}
			});
			if(isEven(aux)) {
				double median = (aux.get(mid) + aux.get(mid - 1)) / 2;
				System.out.println(median);
			} else {
				System.out.println(aux.get(mid));
				mid += 1;
			}
		}

	}
	


	private static boolean isEven(List<Double> values) {
		return ((values.size() % 2) == 0);
	}
	
	
}
