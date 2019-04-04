package pl.lcsklep.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
class ShopController {

    private ShopRepository shopRepository;


    public ShopController(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;

    }
    @GetMapping("/")
    public String allProducts(Model model) {

        Optional<Shop> shopOptional = shopRepository.findById(8L);
        if(shopOptional.isPresent()){
            Shop shop = shopOptional.get();

        }
        return "";

    }
}
