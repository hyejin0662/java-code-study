package comparator_comparable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem2 {

    public static List<Snack> priceAscendingOrder(List<Snack> snackList) {
        List<Snack> answer = Collections.emptyList();

        Collections.sort(snackList,new Comparator<Snack>() {
            @Override
            public int compare(Snack a, Snack b) {
                return a.price - b.price;
            }
        });
        /*
        int [] a = {6,5,4,3,2,1};
        Array.sort(o, (기준점: 내림차순)); // 1,2,3,4,5,6 => 6,5,4,3,2,1
        answer = snackList;
         */
        answer = snackList;
        return answer;
    }

    public static List<Snack> nameAscendingOrder(List<Snack> snackList) {
        List<Snack> answer = Collections.emptyList();

        Collections.sort(snackList,new Comparator<Snack>() {
            @Override
            public int compare(Snack o1, Snack o2) {
                return o1.name.compareTo(o2.name);               // String 비교
            }
        });
        answer = snackList;
        return answer;
    }
}

class Snack {
    public String name;
    public int price;

    public Snack(String name, int price) {
        this.name = name;
        this.price = price;
    }

    class SnackList {
        public String name;
        public int price;

        public SnackList(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }


}