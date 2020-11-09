package io.github.dasomel.learn.courses.one.lessons.fiftyseven;

import java.util.ArrayList;

/**
 * 조이스틱
 *
 * 조이스틱으로 알파벳 이름을 완성하세요. 맨 처음엔 A로만 이루어져 있습니다.
 * ex) 완성해야 하는 이름이 세 글자면 AAA, 네 글자면 AAAA
 *
 * 조이스틱을 각 방향으로 움직이면 아래와 같습니다.
 * ▲ - 다음 알파벳
 * ▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
 * ◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
 * ▶ - 커서를 오른쪽으로 이동
 *
 * 예를 들어 아래의 방법으로 JAZ를 만들 수 있습니다.
 * - 첫 번째 위치에서 조이스틱을 위로 9번 조작하여 J를 완성합니다.
 * - 조이스틱을 왼쪽으로 1번 조작하여 커서를 마지막 문자 위치로 이동시킵니다.
 * - 마지막 위치에서 조이스틱을 아래로 1번 조작하여 Z를 완성합니다.
 * 따라서 11번 이동시켜 "JAZ"를 만들 수 있고, 이때가 최소 이동입니다.
 */

public class Solution {

    public static void main(String[] args) {
        String name1 = "JEROEN";
        String name2 = "JAN";

        solution(name1); // 56
        solution(name2); // 23
    }

    public static int solution(String name) {
        int answer = 0;
        return answer;
    }
}
