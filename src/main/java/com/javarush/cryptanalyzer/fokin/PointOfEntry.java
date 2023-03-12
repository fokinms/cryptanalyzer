package com.javarush.cryptanalyzer.fokin;

import com.javarush.cryptanalyzer.fokin.app.Application;
import com.javarush.cryptanalyzer.fokin.controllers.MainController;
import com.javarush.cryptanalyzer.fokin.entity.Result;
import com.javarush.cryptanalyzer.fokin.view.ConsoleView;
import com.javarush.cryptanalyzer.fokin.view.View;

public class PointOfEntry {
    public static void main(String[] args) {

        View view = new ConsoleView();
        MainController mainController = new MainController(view);
        Application application = new Application(mainController);
        Result result = application.run();

//        TODO вынести в отдельный метод
        switch (result.getResultCode()){
//            TODO обернуть в константы
            case OK -> System.out.println("Application finished successfully");
            case ERROR -> System.out.println("Application finished with exception : " + result.getApplicationException().getMessage() );
        }
        System.out.println(result);

    }
    
}