package com.toy_project.o_mok.play.domain;

import java.util.List;

public class RealTimeOMokRoom {
    //처음에 선은 승률이 낮은 쪽에 줌. 이후 선은 패자에게.
    //누가 , 누구에게, 몇번째 점에, 무슨 색 돌을.

    /*
    흰 돌을 잡은 사람이 한 행위 : white 어쩌구
    검은 돌을 잡은 사람이 한 행위 : black 어쩌구
     */
    private List<Integer> point; //ex. (3, 10) -> 바깥 배열의 인덱스 3번 째 -> 3번 인덱스의 10번 인덱스 자리.
    // [index 0 ~ 14 ][index 0 ~ 14 ] ... 14

    private String userId;

    private char color; //white : W or black : B

}
