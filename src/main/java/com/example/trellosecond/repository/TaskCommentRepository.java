package com.example.trellosecond.repository;

import com.example.trellosecond.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskCommentRepository extends JpaRepository<Message, Long> {
}
