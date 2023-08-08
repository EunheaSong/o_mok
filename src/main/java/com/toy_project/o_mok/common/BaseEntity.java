package com.toy_project.o_mok.common;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {

    @CreatedBy
    private LocalDateTime createDateTime;

    @LastModifiedBy
    private LocalDateTime updateDateTime;
}
