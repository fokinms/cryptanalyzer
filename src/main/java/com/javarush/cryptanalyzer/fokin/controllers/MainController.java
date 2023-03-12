package com.javarush.cryptanalyzer.fokin.controllers;

import com.javarush.cryptanalyzer.fokin.view.View;

public class MainController {

    private View view;

    public MainController(View view) {

        this.view = view;
    }

    public View getView() {
        return view;
    }
}
