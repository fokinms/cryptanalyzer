package com.javarush.cryptanalyzer.fokin.repository;

import com.javarush.cryptanalyzer.fokin.services.Decode;
import com.javarush.cryptanalyzer.fokin.services.Encode;
import com.javarush.cryptanalyzer.fokin.services.Function;
import com.javarush.cryptanalyzer.fokin.services.NoFunction;

public enum FunctionCode {
    ENCODE(new Encode()), DECODE(new Decode()), NO_FUNCTION(new NoFunction());

    private Function function;

    FunctionCode(Function function) {
        this.function = function;
    }

    public Function getFunction(){
        return this.function;
    }
}
