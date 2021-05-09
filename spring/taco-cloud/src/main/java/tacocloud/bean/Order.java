package tacocloud.bean;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;


@Data
public class Order {

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
}
