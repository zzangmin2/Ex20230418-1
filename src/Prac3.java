import java.util.HashMap;
import java.util.Scanner;

//hashmap = <String, Integer> 컬렉션을 생성하고 에스프레소는 2000원, 아메리카노는 2500원, 카푸치노는 3000원, 카페라떼는 3500원으로 설정하고 Scanner 입력으로 음료명이 입력되면 가격을 출력
public class Prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        h.put("에스프레소", 2000);
        h.put("아메리카노", 2500);
        h.put("카푸치노", 3500);

        while(true) {
            System.out.println("마시고 싶은 음료");
            String menu = sc.next();
            Integer price = h.get(menu);
            if (price == null) System.out.println(menu + "는 없는 음료입니다.");
            else System.out.println(price);

            System.out.println("음료 더 드시겠습니까? Y or N");
            String answer = sc.next();

            if(answer.equals("N")){
                sc.close();
                break;
            }
        }





    }
}
