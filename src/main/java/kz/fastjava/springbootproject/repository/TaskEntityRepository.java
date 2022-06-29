package kz.fastjava.springbootproject.repository;

import kz.fastjava.springbootproject.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskEntityRepository extends JpaRepository<TaskEntity, Long> {
}