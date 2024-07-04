package com.example.trellosecond.repository;

import com.example.trellosecond.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
