package com.example.trellosecond.entity;


import com.example.trellosecond.entity.tmp.AbsLongEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TaskComment extends AbsLongEntity {
    private String comment;
    @ManyToOne
    private Task task;
    @ManyToOne
    private User ownerId;
}