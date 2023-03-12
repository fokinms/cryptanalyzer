package com.javarush.cryptanalyzer.fokin.services;

import com.javarush.cryptanalyzer.fokin.entity.Result;

public interface Function {
    Result execute(String[] parameters);
}
