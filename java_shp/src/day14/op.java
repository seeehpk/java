package day14;

import java.text.DecimalFormat;

public class op {

	public static void main(String[] args) {
		int num = 19999999;
		
		DecimalFormat df = new DecimalFormat("###,###") ;
		System.out.println(df.format(num));
		
		int num2 = 5;
		DecimalFormat df2 = new DecimalFormat("###,###") ;
		System.out.println(df2.format(num2));
	}

}