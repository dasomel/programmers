package io.github.dasomel.learn.courses.one.lessons.nineteen;

import java.util.ArrayList;

/**
 * 문제 설명
 * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
 *
 * 제한사항
 * prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
 * prices의 길이는 2 이상 100,000 이하입니다.
*/

public class Solution {

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        solution(prices); // 4, 3, 1, 1, 0
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = i+1; j < answer.length; j++) {
                    System.out.println("prices["+i+"]: " + prices[i] +  ", prices["+j+"]: " + prices[j]);
                if (prices[i] > prices[j]) {
                    answer[i] = j-i;
                    System.out.println("1answer[" + i + "]: " + answer[i]);
                    break;
                }
                if (j==answer.length-1) {
                    answer[i] = j-i;
                    System.out.println("2answer[" + i + "]: " + answer[i]);
                }
            }
        }
        return answer;
    }
}
