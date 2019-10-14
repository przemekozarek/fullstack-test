package com.instantor.dap.springbootbackend.config;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterGeneratorTest {



    @Test
    public void findByName() {

        //given
        CharacterGenerator testedClass = new CharacterGenerator();

        //when
        Character character = testedClass.findByName("anakin");

        //then

        assertNotNull("this character should have children", character.getChildren());
        assertNotNull("this character should be jedi", character.getJedi());

    }

    @Test
    public void findByNameNotFound() {

        //given
        CharacterGenerator testedClass = new CharacterGenerator();

        //when
        Character character = testedClass.findByName("definitlyNotCorrectName");

        //then
        assertNull("this character should be null" ,character);


    }
}