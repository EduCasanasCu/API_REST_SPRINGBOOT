package com.application.rest.controllers;

import com.application.rest.controllers.dto.ProductDTO;
import com.application.rest.entities.Product;
import com.application.rest.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){

        Optional<Product> productOptional = productService.findById(id);

        if(productOptional.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        Product product = productOptional.get();

        ProductDTO productDTO = ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .maker(product.getMaker())
                .build();

        return ResponseEntity.ok(productDTO);
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){

        List<Product> productList = productService.findAll();

        if(productList.isEmpty()){
            return ResponseEntity.badRequest().body("List is empty");
        }

        List<ProductDTO> productDTOList = productList
                .stream()
                .map(product -> ProductDTO.builder()
                        .id(product.getId())
                        .name(product.getName())
                        .price(product.getPrice())
                        .maker(product.getMaker())
                        .build()
                ).toList();
        return ResponseEntity.ok(productDTOList);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody ProductDTO productDTO){

        if(productDTO.getName().isBlank()){
            return ResponseEntity.badRequest().body("Name is required");
        }

        Product product = Product.builder()
                        .name(productDTO.getName())
                        .price(productDTO.getPrice())
                        .maker(productDTO.getMaker())
                        .build();

        productService.save(product);

        return ResponseEntity.created(URI.create("/api/product/save")).build();

    }

    

}
