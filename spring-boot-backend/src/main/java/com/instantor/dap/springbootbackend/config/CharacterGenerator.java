package com.instantor.dap.springbootbackend.config;

import com.instantor.dap.springbootbackend.enums.ForceSide;
import com.instantor.dap.springbootbackend.enums.SabreColor;
import com.instantor.dap.springbootbackend.enums.Sex;
import com.instantor.dap.springbootbackend.model.Character;
import com.instantor.dap.springbootbackend.model.Jedi;

import java.util.ArrayList;
import java.util.List;

public class CharacterGenerator {
    private Character anakin;
    private Character luck;
    private Character leia;
    private Character joda;
    private Character obiWan;
    private List<Character> characters;


    public CharacterGenerator() {
        anakin =new Character();
        luck = new Character();
        leia = new Character();
        obiWan = new Character();
        joda = new Character();
        characters = new ArrayList<>();
        createAnakin();
        createJode();
        createLeia();
        createLuck();
        createObi();

    }

    private void createLeia() {
        leia.setName("Leia Organa");
        leia.setSex(Sex.FEMALE);
        characters.add(leia);
    }

    private void createLuck() {
        luck.setName("Luck Skywalker");
        luck.setSex(Sex.MALE);
        Jedi jedi = new Jedi(ForceSide.BRIGHT, SabreColor.BLUE, joda);
        luck.setJedi(jedi);
        characters.add(luck);
    }

    private void createAnakin() {
        anakin.setName("Anakin Skywalker");
        anakin.setSex(Sex.MALE);
        Jedi jedi = new Jedi(ForceSide.BRIGHT, SabreColor.GREEN, obiWan);
        anakin.setJedi(jedi);
        anakin.addChildren(luck);
        anakin.addChildren(leia);
        characters.add(anakin);
    }

    private void createJode() {
        joda.setName("Joda");
        joda.setSex(Sex.MALE);
        Jedi jedi = new Jedi(ForceSide.BRIGHT, SabreColor.GREEN, null);
        joda.setJedi(jedi);
        characters.add(joda);
    }

    private void createObi() {
        obiWan.setName("ObiWan Kenobi");
        obiWan.setSex(Sex.MALE);
        Jedi jedi = new Jedi(ForceSide.BRIGHT, SabreColor.BLUE, null);
        obiWan.setJedi(jedi);
        characters.add(obiWan);
    }


    public Character findByName(String name) {
        name = name.toLowerCase();
        for (Character character: characters) {
            if (character.getName().toLowerCase().contains(name)) {
                return character;
            }
        }
        return null;
    }


}
