package com.qf.git;

import java.util.Arrays;

public class LotteryTest {
    public static void main(String[] args) {
        Lottery l = new Lottery();
        // 1. 获取中奖的红球数组(随机)
        int[] luckyRedBall = l.getLuckyRedBall();
        System.out.println("中奖的红球数组: " + Arrays.toString(luckyRedBall));
        // 2. 获取中奖的蓝球(随机)
        int luckyBlueBall = l.getLuckyBlueBall();
        System.out.println("中奖的蓝球: " + luckyBlueBall);
        // 3. 获取自己的红球数组(键盘录入)
        int[] myRedBall = l.getMyRedBall();
        System.out.println("我的红球数组: " + Arrays.toString(myRedBall));
        // 4. 获取自己的蓝球(键盘录入)
        int myBlueBall = l.getMyBlueBall();
        System.out.println("我的蓝球: " + myBlueBall);
        // 5. 获取相同红球的个数
        int sameRedBallCount = l.getSameRedBallCount(luckyRedBall, myRedBall);
        System.out.println("相同的红球个数: " + sameRedBallCount);
        // 6. 获取蓝球是否相同
        boolean blueBallSame = l.isBlueBallSame(luckyBlueBall, myBlueBall);
        // 7. 计算奖金
        l.openLottery(sameRedBallCount, blueBallSame);
    }
}