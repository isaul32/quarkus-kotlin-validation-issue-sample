package li.sau;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class Car {

    @Null(groups = { CarValidationGroups.Post.class })
    @NotNull(groups = { CarValidationGroups.Put.class })
    private Long id;

    @NotBlank
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
