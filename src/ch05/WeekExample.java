package ch05;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        //Week 열거 타입 변수 선언
        Week today = null;

        //Calendar 얻기
        Calendar cal = Calendar.getInstance();

        //오늘의 요일 얻기(1~7)
        int week = cal.get(Calendar.DAY_OF_WEEK);

        //숫자를 열거 상수로 변환해서 변수에 대입
        today = switch (week) {
            case 1:
                yield Week.MONDAY;
            case 2:
                yield Week.TUESDAY;
            case 3:
                yield Week.WEDNESDAY;
            case 4:
                yield Week.THURSDAY;
            case 5:
                yield Week.FRIDAY;
            case 6:
                yield Week.SATURDAY;
            case 7:
                yield Week.SUNDAY;
            default:
                throw new IllegalStateException("Unexpected value: " + week);
        };

        //열거 타입 변수를 사용
        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 집콕을 합니다.");
        } else {
            System.out.println("열심히 자바를 공부합니다.");
        }
    }
}
