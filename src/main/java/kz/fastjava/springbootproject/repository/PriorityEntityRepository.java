package kz.fastjava.springbootproject.repository;

import kz.fastjava.springbootproject.entity.PriorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityEntityRepository extends JpaRepository<PriorityEntity, Long>{
}