package com.lqbs.mriq;

public class test{

public static void main(String[] args) {
        int count = heihei(1,1);
        System.out.println(count);
    }

    public  static  int heihei(int k, int n){

        int count = 0;

        for(int i = 0; i<=n ;i++){
            String teamp =  String.valueOf(i);
            char[] chars = teamp.toCharArray();
            for(int j =0; j< chars.length ;j++){
                int char_int = chars[j] - '0';
                if (char_int == k  ){
                    count++;
                }
            }
        }


        return count;
    }

}