package crud.repository;

import crud.domain.Crud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends JpaRepository<Crud, Long> {
//    public Crud findById(Long id);
//    public Crud deleteById(Long id);
}
