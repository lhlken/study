import java.util.ArrayList;
import java.util.List;

public class TestBox {

//    public static void main(String[] args) {
//        Integer a= 1;
//        Integer b = 2;
//        Integer c = 3;
//        Integer d = 3;
//        Integer e = 321;
//        Integer f = 321;
//        Long g = 3L;
//        System.out.println(c == d);
//        System.out.println(e == f);
//        System.out.println(c == (a+b));
//        System.out.println(c.equals(a+b));
//        System.out.println(g == (a+b));
//        System.out.println(g.equals(a+b));
//    }

    public static void main(String[] args) {
//        java.util.Set<Integer> dcGroupSets = new java.util.HashSet();
//        dcGroupSets.add(1);
//        dcGroupSets.add(111);
//        dcGroupSets.add(145);
//        System.out.println(dcGroupSets.contains(144));

        List<Person> people = new ArrayList<>();
        Person aa = new Person(1,"aa");
        Person bb = new Person(2,"bb");
        Person cc = new Person(3,"cc");
        Person dd = new Person(4,"dd");
        people.add(aa);
        people.add(bb);
        people.add(cc);
        people.add(dd);
        for(int i =0;i<people.size();i++) {
            if(people.get(i).getId() == 1) {
                people.remove(i);
                i--;
            }else {
                System.out.println(people.get(i).getId());
            }

        }
    }
}
