package spring.taco;

import com.datastax.oss.driver.api.core.uuid.Uuids;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Table("orders")
public class TacoOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @PrimaryKey
    private UUID id = Uuids.timeBased();

    private Date placedAt = new Date();

    @Column("tacos")
    private List<TacoUDT> tacos = new ArrayList<>();

    public void addTaco (TacoUDT taco) {
        this.tacos.add(taco);
    }


    @NotBlank(message = "Требуется ввести название для доставки")
    private String deliveryName;

    @NotBlank(message = "Требуется ввести название улицы")
    private String deliveryStreet;

    @NotBlank(message = "Требуется ввести название города")
    private String deliveryCity;

    @NotBlank(message = "Требуется ввести название региона")
    private String deliveryState;

    @NotBlank(message = "Требуется ввести почтовый индекс")
    private String deliveryZip;

    @CreditCardNumber(message = "Кредитная карта недействительна")
    private String ccNumber;

    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\\\/])([2-9][0-9])$", message = "Формат должен быть ММ/ГГ")
    private String ccExpiration;

    @Digits(integer = 3, fraction = 0, message = "Неверный CVV-код")
    private String ccCVV;


}
