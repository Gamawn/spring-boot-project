package kz.fastjava.springbootproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "tasklist")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "title", nullable = false, length = 45)
    private String title;
    @Basic
    @Column(name = "completed_count")
    private Long completedCount;
    @Basic
    @Column(name = "uncompleted_count")
    private Long uncompletedCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(completedCount, that.completedCount) && Objects.equals(uncompletedCount, that.uncompletedCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, title, completedCount, uncompletedCount);
    }
}
