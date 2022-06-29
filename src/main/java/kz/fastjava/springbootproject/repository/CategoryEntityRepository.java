package kz.fastjava.springbootproject.repository;

import kz.fastjava.springbootproject.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryEntityRepository extends JpaRepository<CategoryEntity, Long> {
}