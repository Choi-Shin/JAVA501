package p05.search;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int[] score = {80,95,50,35,45,65,80,95,100};
		for (int i=0; i<score.length; i++) {
			ts.add(score[i]);
		}
		
		System.out.println(ts);
		System.out.println("가장 낮은 점수: " + ts.first());
		System.out.println("가장 높은 점수: " + ts.last());
		System.out.println("95점 바로 아래 점수: " + ts.floor(95));
		System.out.println("85점 바래 위 점수: " + ts.ceiling(85));
	}

}
