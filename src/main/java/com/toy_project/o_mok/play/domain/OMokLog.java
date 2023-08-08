package com.toy_project.o_mok.play.domain;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import java.util.Arrays;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OMokLog {

    @Id
    private String id; // 방장 id + room id + 참가자 id

    @Type(JsonType.class)
    @Column(columnDefinition = "longtext")
    private Arrays boardHistory;
}
