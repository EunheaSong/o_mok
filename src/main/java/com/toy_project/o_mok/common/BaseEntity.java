package com.toy_project.o_mok.common;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.LocalDateTime;


public class BaseEntity {

    @CreatedBy
    private LocalDateTime createDateTime;

    @LastModifiedBy
    private LocalDateTime updateDateTime;
}
