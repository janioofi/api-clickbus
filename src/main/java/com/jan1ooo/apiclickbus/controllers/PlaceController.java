package com.jan1ooo.apiclickbus.controllers;

import com.jan1ooo.apiclickbus.domain.dto.PlaceDTO;
import com.jan1ooo.apiclickbus.domain.service.PlaceService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Place", description = "API Place")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/place")
public class PlaceController {

    private final PlaceService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PlaceDTO> findAll(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PlaceDTO create(@Valid @RequestBody PlaceDTO place){
        return service.create(place);
    }

    @GetMapping("/specific/search")
    @ResponseStatus(HttpStatus.OK)
    public PlaceDTO findBySpecificName(@RequestParam String name){
        return service.findBySpecificName(name);
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    public List<PlaceDTO> findByName(@RequestParam String name){
        return service.findByName(name);
    }

    @PutMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    public PlaceDTO create(@RequestParam String name,@RequestBody PlaceDTO place){
        return service.update(name, place);
    }
}
