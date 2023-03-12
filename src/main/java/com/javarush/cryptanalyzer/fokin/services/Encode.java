package com.javarush.cryptanalyzer.fokin.services;

import com.javarush.cryptanalyzer.fokin.entity.Result;
import com.javarush.cryptanalyzer.fokin.repository.ResultCode;
import com.javarush.cryptanalyzer.fokin.exception.ApplicationException;

public class Encode implements Function{
    @Override
    public Result execute(String[] parameters) {
        //      TODO реализовать метод
        try {

        } catch (Exception e) {
            return new Result(ResultCode.ERROR, new ApplicationException("Encode operation finished with exception", e));
        }

        return new Result(ResultCode.OK);
    }
}
