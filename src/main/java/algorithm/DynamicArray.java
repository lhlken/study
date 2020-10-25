package algorithm;

import com.alibaba.fastjson.JSON;

/**
 * (动态扩容数组)
 *
 *
 * 修改历史:
 * 修改日期    		修改人员   	版本	 		修改内容
 * -------------------------------------------------
 * 2020/10/25  16:14  hwalong     1.0    	初始化创建
 *
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

}
