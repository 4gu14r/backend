package com.hub.taskmng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hub.taskmng.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
