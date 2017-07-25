package com.henderson.cucumber.stepdefs;

import com.henderson.HendoscoreApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HendoscoreApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
