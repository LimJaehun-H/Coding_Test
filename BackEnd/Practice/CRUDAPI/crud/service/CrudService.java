package crud.service;

import crud.domain.Crud;
import crud.dto.CrudResponse;
import crud.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudService {

    private final CrudRepository crudRepository;

    @Autowired
    public CrudService(CrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    // PostMapping으로 게시글 생성 시
    public CrudResponse save(String title, String content) {
        Crud crud = new Crud(title, content);
        crudRepository.save(crud);
        return CrudResponse.from(crud);
    }

    // PutMapping으로 게시글 수정 시
    public CrudResponse updateContent(Long id, String title, String content) {
        Crud crud = crudRepository.findById(id).orElse(null);
        crud.updateContent(content);
        crudRepository.save(crud);
        return  CrudResponse.from(crud);

    }

    // GetMapping으로 게시글 조회 시
    public CrudResponse findById(Long id) {
        Crud crud = crudRepository.findById(id).orElse(null);
        return CrudResponse.from(crud);
    }

    // DeleteMapping으로 게시글 삭제 시
    public Boolean deleteById(Long id) {
        Crud crud = crudRepository.findById(id).orElse(null);
        if(crud == null)
            return false;
        crudRepository.delete(crud);
        return true;
    }

}
