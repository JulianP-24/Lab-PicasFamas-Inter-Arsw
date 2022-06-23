package edu.escuelaing.arsw.picasYfamas.controller;


import org.springframework.web.bind.annotation.*;
import edu.escuelaing.arsw.picasYfamas.Service.picasFamasService;


@RestController
@RequestMapping(value = "/")
public class picasFamasController {
    picasFamasService picasFamasService = new picasFamasService();
    int num;
    String mensaje = "";

    @GetMapping("/juego")
    public String hello(@RequestParam(value = "numero") Integer numero) {

        if (!picasFamasService.isFinished()) {
            this.num = numero;
            picasFamasService.play(numero);
            System.out.println(picasFamasService.getListaNumeros());
        } else {
            if (picasFamasService.getVictoria()) {
                mensaje = "ganaste";
                System.out.println(mensaje);
            } else {
                mensaje = "perdiste";
                System.out.println(mensaje);
            }
        }
        return "{<div>" +
                "<h3> picas: </h3>" + 
                "<h3>"  + picasFamasService.getPicas() + 
                "<h3> famas: </h3>" +
                "<h3>" + picasFamasService.getFamas() +  
                "<h3> vidas: </h3>" +
                "<h3>" + picasFamasService.getVidas() +  
            "</div>}";

    }
}
