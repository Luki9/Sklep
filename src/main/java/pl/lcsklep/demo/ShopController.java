package pl.lcsklep.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

import static com.sun.tools.javac.jvm.ByteCodes.ret;

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
    @GetMapping("/produkt/{id}")
    public String shopInfo(@PathVariable Long id, Model model){
        Optional<Shop> shopOptional = shopRepository.findById(id);

        if(shopOptional.isPresent()){
            Shop shop = shopOptional.get();
            model.addAttribute("sklep",shop);
            return "shop";
        }else{
            return  "redirect:/";
        }
    }
}
