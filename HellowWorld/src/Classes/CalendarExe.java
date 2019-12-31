package Classes;

public class CalendarExe {
	// 1월부터 12월까지의 달력을 만들어보기
	// 1~7월까지 홀수는 31일이이고, 2월 28일,
	public static void main(String[] args) {
		int month = 12;
		
		String[] weeks = {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		for(int i=0; i<weeks.length; i++) {
			System.out.print("  "+weeks [i]);
		}
		
		for (int i =1; i<getFirstDayofMonth(month); i++) {

		}
		
		//7일 단위로 출력
		for(int i =1; i<=getMaxDate(month);i++) {
			System.out.printf("%3d", i);
			if(i%7==0) {
				System.out.println();
			}
		}
		System.out.println(getMaxDate(11));
	}
	public static int getFirstDayofMonth(int month) {

		return 0;
	}

	// 매개값은 월이 들어가도록, 해당월의 날짜수
	public static int getMaxDate(int month) {
		int dayCnt = 0;
		if (month <= 7) {
			if (month % 2 == 1) {//나머지가 1이니까 홀수
				dayCnt = 31;
			} else if (month == 2) { //month가 2면 28일
				dayCnt = 28;
			} else { //그외
				dayCnt = 30;
			}
		} else {
			if (month % 2 == 0) { //나눴을때 나머지가 0이면 31일
				dayCnt = 31;
			} else {  //나머지가 0이아니면 30일
				dayCnt = 30;
			}
		}
		return 0; // 마지막 int의 결과값을 받아야하므로 숫자
	}
}
