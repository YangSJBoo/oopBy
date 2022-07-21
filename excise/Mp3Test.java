package com.excise;

import com.excise.Mp3;

import java.util.Scanner;

public class Mp3Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("请输入MP3的品牌");
        String brand1=in.next();
        System.out.print("请输入MP3的重量");
        double weight1=in.nextDouble();
        System.out.print("请输入MP3的电池类型");
        String type1=in.next();
        System.out.print("请输入MP3的价格");
        int price1=in.nextInt();
        Mp3 mp3=new Mp3();
        mp3.brand=brand1;
        mp3.weight=weight1;
        mp3.type=type1;
        mp3.price=price1;
        mp3.show();
    }
}
