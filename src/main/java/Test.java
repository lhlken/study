import com.alibaba.fastjson.JSON;

public class Test {

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("hello world");
////        Thread.sleep(60000);
//
//        Boolean ss = null;
//        System.out.println(ss);

//        if(ss) {
//            System.out.println(11);
//        }else {
//            System.out.println(22);
//        }

//        Integer a = null;
//        System.out.println(10 > a);


        int[][][] arr = new int[3][][];
        arr[0] = new int[10][];
        arr[0][0] = new int[3];
        arr[0][0][0] = 1;

//        System.out.println(arr[0].length);
//        System.out.println(arr.length);
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
        System.out.println(JSON.toJSONString(arr));

    }
}
