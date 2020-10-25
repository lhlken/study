package algorithm;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>
 * 修改日期    		修改人员   	版本	 		修改内容 <br>
 * -------------------------------------------------<br>
 * 2020/10/25  16:14  hwalong     1.0    	初始化创建<br>
 * </p>
 *
 * @author hwalong
 * @version 1.0
 */
public class DynamicArray<T extends Object> {

    private Object[] array;

    private int endIndex;
    private int size;

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int size) {
        this.array = new Object[size];
        this.size = size;
        this.endIndex = 0;
    }

    public void add(T t) {
        if(endIndex  >= size) {
            this.array = retain(this.array,size * 2);
            this.size = size*2;
        }
        this.array[endIndex++] = t;

    }

    public Object[] retain(Object[] array,int size) {
        Object[] temp = new Object[size];
        for(int i = 0;i<array.length;i++) {
            temp[i] = array[i];
        }
        return temp;
    }

    public T get(int index) {
        if(index >= this.size || index <0) {
            throw new RuntimeException(String.format("java.lang.ArrayIndexOutOfBoundsException: %s",index));
        }
        return (T)array[index];
    }

    public void remove(int index) {
        if(index >= this.endIndex || index <0) {
            throw new RuntimeException(String.format("java.lang.ArrayIndexOutOfBoundsException: %s",index));
        }
        for(int i = index;i<this.size-1;i++) {
            array[i] = array[i+1];
        }
        endIndex--;
    }

    public Object[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
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