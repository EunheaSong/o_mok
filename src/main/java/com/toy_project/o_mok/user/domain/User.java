package com.toy_project.o_mok.user.domain;

import com.toy_project.o_mok.common.BaseEntity;
import com.toy_project.o_mok.play.domain.OMokRoom;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends BaseEntity {

    @Id
    private String id;

    @Column
    private String nickname;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private int winCount = 0;

    @Column
    private int loseCount = 0;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn()
    private List<OMokRoom> hostRoomList;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn()
    private List<OMokRoom> ParticipantRoomList;

}
