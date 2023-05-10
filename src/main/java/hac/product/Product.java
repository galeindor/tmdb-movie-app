package hac.product;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Product implements Serializable {
    private String name;
    private String description;
    private Float price;
    private String posterUrl;

    public Product(String name, String description, String posterUrl, Float price) {
        this.name = name;
        this.description = description;
        this.posterUrl = posterUrl;
        this.price = price;
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
}