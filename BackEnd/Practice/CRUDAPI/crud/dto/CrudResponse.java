package crud.dto;

import crud.domain.Crud;

public class CrudResponse {
    private Long id;
    private String title;
    private String content;

    public static CrudResponse from(Crud crud){
        CrudResponse crudResponse = new CrudResponse();
        crudResponse.id = crud.getId();
        crudResponse.title = crud.getTitle();
        crudResponse.content = crud.getContent();
        return crudResponse;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
