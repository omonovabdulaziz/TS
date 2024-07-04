package com.example.trellosecond.entity;


import com.example.trellosecond.entity.tmp.AbsLongEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode(callSuper = true)
public class UserTask extends AbsLongEntity {
    @ManyToOne
    private User userId;
    @ManyToOne
    private Task taskId;
}