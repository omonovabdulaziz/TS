package com.example.trellosecond.entity;


import com.example.trellosecond.entity.enums.Progress;
import com.example.trellosecond.entity.tmp.AbsLongEntity;
import jakarta.persistence.Entity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode(callSuper = true)
public class Task extends AbsLongEntity {
    private Progress progress;
    private String text;
}