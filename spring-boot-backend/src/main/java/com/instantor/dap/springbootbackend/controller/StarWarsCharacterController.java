package com.instantor.dap.springbootbackend.controller;

import com.instantor.dap.springbootbackend.config.CharacterGenerator;
import com.instantor.dap.springbootbackend.exception.CharacterNotFoundException;
import com.instantor.dap.springbootbackend.model.Character;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1/sw")
public class StarWarsCharacterController {

    /**
     * @return character from Star Wars
     */
    @GetMapping("/character")
    @ResponseStatus(HttpStatus.OK)
    public Character getCharacter(@RequestParam String name) {
        CharacterGenerator generator = new CharacterGenerator();
        Character character =  generator.findByName(name);
        if (character == null) {
            throw new CharacterNotFoundException();
        }
        return character;
    }
}
