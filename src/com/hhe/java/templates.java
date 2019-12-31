package com.hhe.java;

import com.hhe.bena.Customer;

import java.util.ArrayList;

/**
 * @author huhongwen
 * @create 2019-12-31 17:46
 *
 * IDEA中模板所处的位置
 */

public class templates {
    //prsf
    private static final Customer cust = new Customer();
    //psf
    public static final int NUM = 1;
    //psfi
    public static final int NUM1 = 2;
    //psfs
    public static final String NATION = "china";
    public static final int NUM2 = 10;
    
    //模板一psvm，
    public static void main(String[] args) {
        //sout
        System.out.println("11");
        //soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("templates.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);

        //fori
        String[] arr = new String[]{"tom","jj1","qwe","nuu"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }
        //list.for
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(123);
        objects.add(1231);
        objects.add(1232);
        objects.add(1233);
        for (Object o : objects) {
            System.out.println(o);
        }
        //list.fori
        for (int i = 0; i < objects.size(); i++) {
            
        }
        //list.forr倒序遍历
        for (int i = objects.size() - 1; i >= 0; i--) {
            
        }
    }

    public void method(){
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(123);
        objects.add(1231);
        objects.add(1232);
        //ifn
        if (objects == null) {
            
        }
        //inn
        if (objects != null) {
            
        }
        //xxx.nn.xxx.null
        if (objects != null) {

        }
        if (objects == null) {

        }
    }
}
