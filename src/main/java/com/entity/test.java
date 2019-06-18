package com.entity;

public class test {

    public static void main(String[] args) {
//        System.out.println(fz("123456", 1));
//        System.out.println(dg("123456",0));
//        System.out.println("123456".substring(0,1));
        System.out.println(reverse("123456789"));
    }

    public static String fz(String context, int a) {

        int b= context.length();
        String [] bb= context.split("");
        String [] dd=new String[b];
        for (int i = 0 ; i< context.length();i++){
                dd[i]=bb[b-1-i];
        }
        for(int i = 0 ; i< context.length();i++){
            System.out.print(dd[i]);
        }

        return null;
    }

    public static String dg(String context,int i){
        if(context.length()-1>=i){
            return dg(context.charAt(i)+context.substring(0,i)+context.substring(i+1),++i);
        }
        return context;
    }
    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

}
