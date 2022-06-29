package kz.fastjava.springbootproject.repository;

import kz.fastjava.springbootproject.entity.StatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatEntityRepository extends JpaRepository<StatEntity, Long>{
}