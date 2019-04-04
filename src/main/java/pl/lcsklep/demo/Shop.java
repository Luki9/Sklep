package pl.lcsklep.demo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String products;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate registrationDate;

    @Enumerated(EnumType.STRING)
    private TargetAudience targetAudience;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public TargetAudience getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(TargetAudience targetAudience) {
        this.targetAudience = targetAudience;
    }
}
