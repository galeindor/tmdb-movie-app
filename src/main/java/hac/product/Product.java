package hac.product;

import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import java.io.Serializable;

@Component
public class Product implements Serializable {
    @Id
    private int id;

    @NotEmpty(message = "Product name is mandatory")
    private String name;

    @NotEmpty(message = "Product description is mandatory")
    private String description;

    @PositiveOrZero(message = "Product price must be positive or zero")
    private Float price;

    @PositiveOrZero(message = "Product tax must be positive or zero")
    private Float tax = 0.0f;

    private String posterUrl;

    public Product(int id,String name, String description, String posterUrl, Float price) {
        this.name = name;
        this.description = description;
        this.posterUrl = posterUrl;
        this.price = price;
        this.tax = price * 0.1f;
        this.id = id;
    }

    public Product() {
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Float getPrice() {
        return price;
    }
    public String getPosterUrl() {
        return posterUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getTax() {
        return this.tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }
}
