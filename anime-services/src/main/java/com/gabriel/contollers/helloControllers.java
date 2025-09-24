package com.gabriel.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Fala  para o spring que isso e um controller rest
public class helloControllers {

    @GetMapping("hi") // Diz para o spring que quando o endpoint for acessado na forma de requisisao http GET ese executa esse metodo
    public String hi (){
        return "hello word";
    }
}
