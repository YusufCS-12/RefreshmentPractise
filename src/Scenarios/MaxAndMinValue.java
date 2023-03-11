package Scenarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaxAndMinValue {

	public static void maxValue(List<Integer> list) {

		int biggestValue = list.get(0);

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) > biggestValue) {

				biggestValue = list.get(i);
			}
		}
		System.out.println("En Büyük Sayý : " + " " + biggestValue);
	}

	public static void minValue(List<Integer> list) {

		int smallestValue = list.get(0);

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) < smallestValue) {

				smallestValue = list.get(i);
			}
		}
		System.out.println("En Büyük Sayý : " + " " + smallestValue);
	}

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		
		for (int i = 0; i < 9; i++) {
			
			list.add(r.nextInt(100));
			
		}
		System.out.println(list);
		maxValue(list);
		minValue(list);
		

	}

}
