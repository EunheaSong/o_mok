package com.toy_project.o_mok.common;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.LocalDateTime;

import static org.hibernate.type.StandardBasicTypes.UUID;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {
//
//    @Id
//    private String id = UUID.toString();

    @CreatedBy
    private LocalDateTime createDateTime;

    @LastModifiedBy
    private LocalDateTime updateDateTime;
}
