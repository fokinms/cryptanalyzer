package com.javarush.cryptanalyzer.fokin.services;

import com.javarush.cryptanalyzer.fokin.entity.Result;
import com.javarush.cryptanalyzer.fokin.repository.ResultCode;
import com.javarush.cryptanalyzer.fokin.exception.ApplicationException;

public class NoFunction implements Function{
    @Override
    public Result execute(String[] parameters) {
//      TODO написать метод
        try {

        } catch (Exception e) {
            return new Result(ResultCode.ERROR, new ApplicationException("NoFunction operation finished with exception", e));
        }

        return new Result(ResultCode.OK);
    }
}
