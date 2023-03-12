package com.javarush.cryptanalyzer.fokin.app;

import com.javarush.cryptanalyzer.fokin.controllers.MainController;
import com.javarush.cryptanalyzer.fokin.entity.Result;
import com.javarush.cryptanalyzer.fokin.repository.FunctionCode;
import com.javarush.cryptanalyzer.fokin.services.Function;

import static com.javarush.cryptanalyzer.fokin.constants.FunctionCodeConstants.*;

public class Application {
    private final MainController mainController;

    public Application(MainController mainController) {

        this.mainController = mainController;
    }

    public Result run() {
        String[] parameters = mainController.getView().getParameters();
        String mode = parameters[0];
        Function function = getFunction(mode);
        return function.execute(parameters);
    }

    private Function getFunction(String mode) {
        return switch (mode){
          case "1" -> FunctionCode.valueOf(ENCODE).getFunction();
          case "2" -> FunctionCode.valueOf(DECODE).getFunction();
          default -> FunctionCode.valueOf(NO_FUNCTION).getFunction();
        };
    }
}
