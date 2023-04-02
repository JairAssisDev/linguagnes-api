package com.jair.linguagnes.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    private List<Linguagem> linguagems=
        List.of(
            new Linguagem("java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),
            new Linguagem("php", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png",2)
        );

    @GetMapping(value = "/linguagem-preferida")
    public String processaLinguagemPreferida(){

      return  "Java! , Jair diz Oi !";
    }
    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagems(){
        return linguagems;
    }
    
    

}
