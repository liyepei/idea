package com.qf.git;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    private Random r = new Random();
    private Scanner sc = new Scanner(System.in);

    public int[] getLuckyRedBall() {
        int[] arr = new int[6];
        int index = 0;
        while (true) {
            if (index == 6) {
                break;
            }
            int randomNumber = r.nextInt(32) + 1;
            if (isContains(arr, randomNumber) == true) {
                continue;
            }
            arr[index] = randomNumber;
            index++;
        }
        Arrays.sort(arr);
        return arr;
    }

    public boolean isContains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public int[] getMyRedBall() {
        System.out.println("请输入6个红球: ");
        int[] arr = new int[6];
        int index = 0;
        while (true) {
            if (index == 6) {
                break;
            }
            int myNumber = sc.nextInt();
            if (isContains(arr, myNumber) == true || myNumber < 1 || myNumber > 32) {
                System.out.println("您输入的数字有误, 请重新输入:");
                continue;
            }
            arr[index] = myNumber;
            index++;
        }
        Arrays.sort(arr);
        return arr;
    }

    public int getLuckyBlueBall() {
        return r.nextInt(16) + 1;
    }

    public int getMyBlueBall() {
        System.out.println("请输入1个蓝球");
        while (true) {
            int myBlueBall = sc.nextInt();
            if (myBlueBall < 1 || myBlueBall > 16) {
                System.out.println("您输入的数字有误, 请重新输入: ");
                continue;
            }
            return myBlueBall;
        }
    }

    /**
     * 获取两个数组中相同元素的个数
     */
    public int getSameRedBallCount(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            // 判断这个元素在b数组中是否存在
            if (isContains(b, num) == true) {
                count++;
            }
        }
        return count;
    }

    /**
     * 此方法用于获取蓝球是否相同
     */
    public boolean isBlueBallSame(int a, int b) {
        return a == b;
    }

    /**
     * 此方法用于根据相同红球个数和蓝球是否相同, 来计算奖金
     */
    public void openLottery(int sameRedBallCount, boolean blueBallSame) {
        if (blueBallSame == true) {
            // 蓝球相同
            if (sameRedBallCount <= 2) {
                System.out.println("5块钱!");
            } else if (sameRedBallCount == 3) {
                System.out.println("10块钱!~");
            } else if (sameRedBallCount == 4) {
                System.out.println("不容易! 200元!~");
            } else if (sameRedBallCount == 5) {
                System.out.println("恭喜中奖3000元!~~");
            } else {
                System.out.println("恭喜您!中奖1000W, 可以在深圳买房了, 剩下的钱还可以慢慢还!");
            }
        } else {
            if (sameRedBallCount == 4) {
                System.out.println("10块钱!~");
            } else if (sameRedBallCount == 5) {
                System.out.println("不容易! 200元!~");
            } else if (sameRedBallCount == 6) {
                System.out.println("恭喜您!中奖500W, 首付够了!~");
            } else {
                System.out.println("再接再厉!~国家和党感谢您!~");
            }
        }
    }
}
