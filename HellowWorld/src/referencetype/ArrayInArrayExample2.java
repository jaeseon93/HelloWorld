package referencetype;

public class ArrayInArrayExample2 {

	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
        
		int num = 1;
		//그림을 그래서 배열의 규칙을 잘보기.
		intAry[0][0] = 1;
		intAry[0][1] = 6;
		intAry[0][2] = 11;
	
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				intAry[i][j] = (i + 1) + (j*5);
			}
		}
		//출력해주는 아이
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(intAry[i][j] + " ");
			}
			System.out.println();
		}

	}
}
