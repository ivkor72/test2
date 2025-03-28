package com.example.test2.controller;

import com.example.test2.model.Person;
import com.example.test2.model.Usluga;
import com.example.test2.service.UslugaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private UslugaService uslugaService;

    public Controller(UslugaService uslugaService) {
        this.uslugaService = uslugaService;
    }

@GetMapping(value = "/index")
public String showIndex() {
    return "index";
}

@RequestMapping(value = "/addNewRequest")
    public String addNewRequest(ModelMap model) {
    Person person = new Person();
    model.addAttribute("person", person);
    List<Usluga> uslugas = uslugaService.getAllUslugas();
    model.addAttribute("uslugas", uslugas);
    return "addNewRequest";
}
@RequestMapping(value = "/payments")
    public String showPayments(ModelMap model) {

        return "payments";
}

}
