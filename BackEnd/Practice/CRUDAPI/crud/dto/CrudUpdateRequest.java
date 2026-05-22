package crud.dto;

public class CrudUpdateRequest {
    private String title;
    private String content;

    public CrudUpdateRequest(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
