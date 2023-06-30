package com.example.demo.controller;

import com.example.demo.bean.Persona;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Persona obtenerPersona(HttpServletRequest request){
        Persona person = new Persona();
        person.setNombre("Polla");
        person.setApellidos("Elizondo");
        person.setDocumento("3121701245");
        return person;
    }

}
