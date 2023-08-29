package com.toy_project.o_mok.play.domain;

import com.toy_project.o_mok.common.BaseEntity;
import com.toy_project.o_mok.user.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OMokRoom extends BaseEntity {

    @Id
    private String id;

    @Column
    private String roomName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn()
    private User host;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn()
    private User Participant;
}
