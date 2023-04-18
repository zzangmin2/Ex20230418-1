import java.util.Scanner;
import java.util.Vector;

//Scanner를 사용 5개 실수값을 입력받아 벡터에 저장하고, 벡터를 검색하여 가장 큰 수를 출력하는 프로그램 작성
public class Prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();

        System.out.println("실수 5개를 입력하세요");
        for(int i = 0; i <5; i++)
            v.add(Integer.valueOf(sc.nextInt()));

        System.out.println("입력한 숫자 값");
        for(int i=0; i<v.size(); i++) {
            int n = v.get(i);
            System.out.print(n + " ");
        }
        System.out.println("");

        System.out.println("그 중 가장 큰 숫자 값");
        int max = 0;
        for(int i=0; i<v.size(); i++){
            if (max < v.get(i)){
                max = v.get(i);
            }
        }
        System.out.println(max);

    }

}
