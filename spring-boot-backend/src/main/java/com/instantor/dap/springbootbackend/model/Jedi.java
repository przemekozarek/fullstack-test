package com.instantor.dap.springbootbackend.model;

import com.instantor.dap.springbootbackend.enums.ForceSide;
import com.instantor.dap.springbootbackend.enums.SabreColor;

public class Jedi {

    private ForceSide forceSide;
    private SabreColor sabreColor;
    private Character master;

    public Jedi(ForceSide force, SabreColor color, Character master) {
       this.forceSide = force;
       this.sabreColor = color;
       this.master = master;
    }

    public Jedi() {
    }

    public ForceSide getForceSide() {
        return forceSide;
    }

    public void setForceSide(ForceSide forceSide) {
        this.forceSide = forceSide;
    }

    public SabreColor getSabreColor() {
        return sabreColor;
    }

    public void setSabreColor(SabreColor sabreColor) {
        this.sabreColor = sabreColor;
    }

    public Character getMaster() {
        return master;
    }

    public void setMaster(Character master) {
        this.master = master;
    }
}
