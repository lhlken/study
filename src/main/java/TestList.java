import com.alibaba.fastjson.JSON;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestList {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList();

        for(int i = 0;i<100;i++) {
            list.add("str"+i);
        }

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        for(int i = 0;i<100;i++) {
            if(i == 50) {
                list.set(50,""+i);
            }
        }

        System.out.println(JSON.toJSONString(list));
    }
}
