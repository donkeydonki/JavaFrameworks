package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

        if (partRepository.count() == 0) {
            InhousePart vial = new InhousePart();
            vial.setName("Vial");
            vial.setPrice(6.99);
            vial.setInv(20);

            InhousePart herb = new InhousePart();
            herb.setName("Herb mix");
            herb.setPrice(4.99);
            herb.setInv(30);

            InhousePart baseLiquid = new InhousePart();
            baseLiquid.setName("Base liquid");
            baseLiquid.setPrice(3.99);
            baseLiquid.setInv(30);

            InhousePart keyIngredient = new InhousePart();
            keyIngredient.setName("Key Ingredient");
            keyIngredient.setPrice(9.99);
            keyIngredient.setInv(40);

            OutsourcedPart cork = new OutsourcedPart();
            cork.setName("Cork stopper");
            cork.setPrice(1.99);
            cork.setInv(40);
            cork.setCompanyName("Cork 'n Things");

            partRepository.save(vial);
            partRepository.save(herb);
            partRepository.save(baseLiquid);
            partRepository.save(keyIngredient);
            partRepository.save(cork);
        }

        if (productRepository.count() == 0) {
            Product calmingPotion = new Product("Calming potion",29.99,20);
            Product healingPotion = new Product("Healing potion",29.99,23);
            Product energyPotion = new Product("Energy Potion",29.99,34);
            Product protectionPotion = new Product("Protection potion",29.99,41);
            Product clarityPotion = new Product("Clarity potion",29.99,35);

            productRepository.save(calmingPotion);
            productRepository.save(healingPotion);
            productRepository.save(energyPotion);
            productRepository.save(protectionPotion);
            productRepository.save(clarityPotion);
        }
    }
}
