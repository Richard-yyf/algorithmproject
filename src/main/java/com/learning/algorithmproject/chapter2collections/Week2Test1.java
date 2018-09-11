package com.learning.algorithmproject.chapter2collections;

import java.util.Scanner;

/**
 * @author Richard_yyf
 * @Date 2018/8/29
 * @Description 设计函数分别求两个一元多项式的乘积与和。
 * <p>
 * 输入格式:
 * 输入分2行，每行分别先给出多项式非零项的个数，再以指数递降方式输入一个多项式非零项系数和指数（绝对值均为不超过1000的整数）。数字间以空格分隔。
 * <p>
 * 输出格式:
 * 输出分2行，分别以指数递降方式输出乘积多项式以及和多项式非零项的系数和指数。数字间以空格分隔，但结尾不能有多余空格。零多项式应输出[0] [0]。
 * <p>
 * 输入样例:
 * 4 3 4 -5 2  6 1  -2 0
 * 3 5 20  -7 4  3 1
 * <p>
 * 输出样例:
 * 15 24 -25 22 30 21 -10 20 -21 8 35 6 -33 5 14 4 -15 3 18 2 -6 1
 * 5 20 -4 4 -5 2 9 1 -2 0
 */
public class Week2Test1 {

    public static void main(String[] args) {
        int k;
        // 系数
        int coef;
        // 指数
        int expn;
        Scanner in = new Scanner(System.in);
        //输入序列的长度
        System.out.println("please input a number");
        k = in.nextInt();
        //输入序列
        System.out.println("please input the numbers");

        PolyList polyList1 = new PolyList();
        polyList1.theSize = k;
        for (int i = 0; i < k; i++) {
            coef = in.nextInt();
            expn = in.nextInt();
            polyList1.add(coef, expn);
        }

        //输入序列的长度
        System.out.println("please input a number");
        k = in.nextInt();
        //输入序列
        System.out.println("please input the numbers");

        PolyList polyList2 = new PolyList();
        polyList2.theSize = k;
        for (int i = 0; i < k; i++) {
            coef = in.nextInt();
            expn = in.nextInt();
            polyList2.add(coef, expn);
        }
        // 多项式相加
        PolyList.addPoly(polyList1, polyList2).print();
        // 多项式相乘
        PolyList.multiplyPoly(polyList1, polyList2).print();

    }


}
