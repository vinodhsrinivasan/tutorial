package tacocloud.bean;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@Entity
@Table(name = "Taco_Order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date placedAt;

    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Street is required")
    private String street;
    @NotBlank(message = "City is required")
    private String city;
    @NotBlank(message = "State is required")
    private String state;
    @NotBlank(message = "Zip is required")
    private String zip;
    @NotBlank(message = "Credit Card Number is required")
    //@CreditCardNumber(message = "Not a valid credit card number")
    private String ccNumber;
    @NotBlank(message = "Credit Card Expiration is required")
    private String ccExpiration;
    @NotBlank(message = "CVV is required")
    @Digits(integer = 3, fraction = 0, message = "Invalid CCV")
    private String ccCVV;
    @ManyToMany(targetEntity = Taco.class)
    private List<Taco> tacos = new ArrayList<>();
    @PrePersist
    void placedAt(){
        this.placedAt=new Date();
    }

}
