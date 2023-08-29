package com.toy_project.o_mok.play.domain;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;
import java.util.Arrays;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OMokLog {

    @Id
    private String id;

    @Column
    @Comment("OMokRoomId")
    private String oMokRoomId;

    @Type(JsonType.class)
    @Column(columnDefinition = "longtext")
    @Comment("게임방 내역")
    private Arrays boardHistory;

    @Column(columnDefinition = "OMokRoomId")
    @Comment("생성일")
    private LocalDateTime createDateTime;
}
