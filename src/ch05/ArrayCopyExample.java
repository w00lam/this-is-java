package ch05;

public class ArrayCopyExample {
    public static void main(String[] args) {
        //길이가 3인 배열
        String[] oldStrArray = {"java", "array", "copy"};
        //길이 5인 배열을 새로 생성
        String[] newStrArray = new String[5];
        //배열 항목 복사
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        //배열 항목 출력
        for (String str : newStrArray) {
            System.out.print(str + ", ");
        }
    }
}
