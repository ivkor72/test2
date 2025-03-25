package com.example.test2.controller;


import com.example.test2.model.Usluga;
import com.example.test2.service.UslugaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EntityManager em;
    @Autowired
    private UslugaService uslugaService;

@GetMapping("/person_services/{id}")
    public ResponseEntity<String> getServiceCost(@PathVariable("id") long id) {
    BigDecimal serviceCost = BigDecimal.valueOf(0);
    List<Usluga> allUslugas = uslugaService.getAllUslugas();
    for (Usluga usluga : allUslugas) {
        System.out.println("uslugaId= " + usluga.getId() + "  serviceId= " + id);
        if ((usluga.getId())==(id)) {
            serviceCost.add(usluga.getServiceCost());
            System.out.println("serviceCost= " + serviceCost.toString());
            break;
        }
    }
    return new ResponseEntity<>(serviceCost.toString(), HttpStatus.OK);
}


}
