package com.application.rest.controllers;


import com.application.rest.controllers.dto.MakerDTO;
import com.application.rest.entities.Maker;
import com.application.rest.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/maker")
public class MakerController {

    @Autowired
    private IMakerService makerService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){

        Optional<Maker> makerOptional = makerService.findById(id);

        if(makerOptional.isPresent()){

            Maker maker = makerOptional.get();

            MakerDTO makerDTO = MakerDTO.builder()
                    .id(maker.getId())
                    .name(maker.getName())
                    .productList(maker.getProductList())
                    .build();
            return ResponseEntity.ok(makerDTO);
        }

        return ResponseEntity.notFound().build();

    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){

        List<MakerDTO> makerList = makerService.findAll()
                .stream()
                .map(maker -> MakerDTO.builder()
                        .id(maker.getId())
                        .name(maker.getName())
                .productList(maker.getProductList())
                .build())
                .toList();
        return ResponseEntity.ok(makerList);

    }
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody MakerDTO makerDTO){

        if(makerDTO.getName().isBlank()){
            return ResponseEntity.badRequest().body("Name is required");
        }

        makerService.save(Maker.builder()
                .name(makerDTO.getName())
                .build());
        return ResponseEntity.created(URI.create("/api/maker/save")).build();
    }
}
