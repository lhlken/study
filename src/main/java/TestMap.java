import com.alibaba.fastjson.JSON;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class TestMap {

    public static void main(String[] args) {
        ConcurrentHashMap<String,String> map1 = new ConcurrentHashMap();
        ConcurrentSkipListMap<String,String> map2 = new ConcurrentSkipListMap<>();


        for(int i = 0;i<100;i++) {
            map1.put("key"+i,"value"+i);
            map2.put("key"+i,"value"+i);
        }

        System.out.println(JSON.toJSONString(map1));
        System.out.println(JSON.toJSONString(map2));



    }
}
