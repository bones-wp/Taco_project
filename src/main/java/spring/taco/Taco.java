package spring.taco;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min = 5, message = "Имя должно быть не короче 5 символов")
    private String name;

    @NotNull
    @Size(min = 1, message = "Вы должны выбрать хотя бы 1 ингредиент")
    private List<Ingredient> ingredients;

    private Long id;

    private Date createdAt = new Date();

}
