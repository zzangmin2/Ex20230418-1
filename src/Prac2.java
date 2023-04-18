import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Scanner 사용 A,B,C,D,E문자로만 입력을 받아 ArrayList에 저장하고 ArrayList를 검색하여 A,B,C,D,E를 각각 4.0, 3.0, 2.0,1.0,0.0으로 출력하는 프로그램 작성
public class Prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();

        System.out.println("문자 5개를 입력하세요");
        for(int i = 0; i <5; i++)
            a.add(String.valueOf(sc.next()));

        System.out.println("입력한 문자 값");
        for(int i=0; i<a.size(); i++) {
            String n = a.get(i);
            System.out.print(n + " ");
        }
        System.out.println("");

        System.out.println("숫자로 변환");
        for(int i=0; i<5; i++){
            String var = a.get(i);
            float value = 0;
            switch (var){
                case "A": value = 4;
                        break;
                case "B": value = 3;
                        break;
                case "C": value = 2;
                        break;
                case "E": value = 0;
                        break;
            }
            System.out.print(value + " ");
        }


    }
}
