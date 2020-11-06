package io.github.dasomel.learn.courses.one.lessons.thirteen;

import java.util.*;

/**
 * 문제 설명
 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 *
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 *
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 조건
 * 시험은 최대 10,000 문제로 구성되어있습니다.
 * 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 */

public class Solution {

    public static void main(String[] args) {
        int[] answers1 = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};

        solution(answers1);
        solution(answers2);
    }

    public static int[] solution(int[] answers) {
        int[] answer = {0, 0, 0};

        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        int al = answers.length;
        int al1 = answer1.length;
        int al2 = answer2.length;
        int al3 = answer3.length;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println(s + ": " + answer + " [p: " + pCount  + ", y: " + yCount + "]");

        for (int i=0; i < al; i++) {
//            System.out.print(answers[i]);

//            System.out.println((i % 5));

            if (answers[i] == answer1[(i % al1)]) {
                answer[0]++;
            }
            if (answers[i] == answer2[(i % al2)]) {
                answer[1]++;
            }
            if (answers[i] == answer3[(i % al3)]) {
                answer[2]++;
            }
        }

        int maxInt = Math.max(Math.max(answer[0], answer[1]), answer[2]);

        ArrayList<Integer> list = new ArrayList<>();

        if(maxInt == answer[0]) { list.add(1); }
        if(maxInt == answer[1]) { list.add(2); }
        if(maxInt == answer[2]) { list.add(3); }

//        System.out.println(Arrays.toString(list.stream().mapToInt(i -> i.intValue()).toArray()));
        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
