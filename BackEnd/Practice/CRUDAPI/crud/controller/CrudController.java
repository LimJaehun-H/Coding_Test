package crud.controller;

import crud.dto.CrudCreateRequest;
import crud.dto.CrudResponse;
import crud.dto.CrudUpdateRequest;
import crud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CrudController {

    private final CrudService crudService;

    @Autowired
    public CrudController(CrudService crudService) {
        this.crudService = crudService;
    }

    @PostMapping("/crud/create")
    public ResponseEntity<CrudResponse> create(@RequestBody CrudCreateRequest request){
        CrudResponse response = crudService.save(request.getTitle(), request.getContent());
        if(response == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping("/crud/find/{id}")
    public ResponseEntity<CrudResponse> findById(@PathVariable Long id){
        CrudResponse response = crudService.findById(id);
        if(response == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(response);
    }

    @PutMapping("/crud/update/{id}")
    public ResponseEntity<CrudResponse> update(@PathVariable Long id, @RequestBody CrudUpdateRequest request){
        CrudResponse response = crudService.updateContent(id, request.getTitle(), request.getContent());
        if(response == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/crud/delete{id}")
    public void deleteById(@PathVariable Long id){
        crudService.deleteById(id);
    }
}
