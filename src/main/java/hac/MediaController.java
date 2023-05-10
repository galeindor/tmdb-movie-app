package hac;

import hac.product.Product;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/media")
public class MediaController {

    @Resource(name = "productList")
    private List<Product> products;

    @GetMapping("/")
    public List<Product> showPurchases() {
        return products;
    }

    @PostMapping("/")
    public boolean addProduct(@RequestBody Product product) {
        return products.add(product);
    }
}