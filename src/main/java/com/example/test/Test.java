package com.example.test;

/**
 * @author: lingjun.jlj
 * @date: 2018/9/15 21:25
 * @description:
 */
public class Test {

    public static void main(String[] args) {
//        Object[] elementData  =new Object[10];
//        int elementCount = 2;
//        int index = 1;
//        Object obj = "vector";
//        Object obj1 = "vector1";
//
//        elementData[0] = obj;
//        elementData[1] = obj;
//        elementData[2] = obj1;
//        elementData[3] = obj;
//        System.arraycopy(elementData, index, elementData, index + 1, elementCount - index);
//        System.out.print(elementData.toString());

        System.out.println(System.currentTimeMillis());


//        int n = 9 - 1;
//        n |= n >>> 1;
//        n |= n >>> 2;
//        n |= n >>> 4;
//        n |= n >>> 8;
//        n |= n >>> 16;
//
//        System.out.println(n);
//
//        String a = "123";
//        String b = "123";
//        System.out.println(a == b);


//        String a = new String("100");
//        String b = new String("100");
//        Integer c = new Integer(100);
//        Long d = new Long(100);
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(a.equals(d));
//
//
//        char[] charArray = {'a', 'b', 'c'};
//        char[] charArray1 = charArray;
//        charArray1[1] = 'x';
//        System.out.println(charArray);

        double source = 0.52;
        double d1 = Math.round(source * 100) / 100;

        double d2 = source * 100;
        double d3 = Math.round(d2);
        double d4 = d3 / 100;

        System.out.println(d1);
        System.out.println(d4);


        System.out.println(52 / 100);


        int i = 1;
        int j = 1;
        System.out.println(i++ + j);

    }
}
