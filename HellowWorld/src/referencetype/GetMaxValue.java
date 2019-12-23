package referencetype;

public class GetMaxValue {

	public static void main(String[] args) {
		int a = 5, b = 8, c = 3;
		int temp = 0;

		int[] intAry = { 8, 7, 6, 5, 4 };
//		(if 배열[0] < 배열[1]) : 아무것도 하지 않는다.
//		else 
//		      : 배열 [1]과 [0]의 자리를 바꾼다.
//		  (if 배열[1] < 배열[2] : 아무것도 안한다.
//		..
//		..	
//		
		for (int i = 0; i < (intAry.length - 1); i++) {
			for (int j = 0; j < (intAry.length - 1); j++) {
				if (intAry[i] < intAry[i + 1]) {
		               temp = intAry[i]; //temp - 잠깐 숫자를 저장해 놓음
		               intAry[i]
			}
			
			}
		}
        for(int i =0; i< intAry.length; i++) {
        	System.out.println(intAry[i] + " ");
        }
	}

}
