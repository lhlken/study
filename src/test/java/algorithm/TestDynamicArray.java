package algorithm;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * (类型功能说明描述)
 * <p>
 * <p>
 * 修改历史:
 * 修改日期    		修改人员   	版本	 		修改内容
 * -------------------------------------------------
 * 2020/10/25  17:20  hwalong     1.0    	初始化创建
 *
 * @author hwalong
 * @version 1.0
 */
public class TestDynamicArray {

    @Test
    public void test() {
        DynamicArray<Integer> ints = new DynamicArray<>();
        for(int i = 0;i<100;i++) {
            ints.add(i);
        }
        System.out.println(JSON.toJSONString(ints));
        System.out.println(ints.get(0));
        for(int i = 0;i<98;i++) {
            ints.remove(1);
        }
        System.out.println(JSON.toJSONString(ints));
    }
}
