package edu.escuelaing.arsw.picasYfamas.controller;


import org.springframework.web.bind.annotation.*;
import edu.escuelaing.arsw.picasYfamas.Service.picasFamasService;


@RestController
@RequestMapping(value = "/")
public class picasFamasController {
    picasFamasService picasFamasservice = picasFamasService.getInstance();
    int num;
    String mensaje = "";

    @GetMapping("/juego")
    public String hello(@RequestParam(value = "numero") Integer numero) {

        if (!picasFamasservice.isFinished()) {
            this.num = numero;
            picasFamasservice.play(numero);
        } else {
            if (picasFamasservice.getVictoria()) {
                mensaje = "ganaste";
            } else {
                mensaje = "perdiste";
            }
        }
        return "{<div>" +
                "<h3> picas: </h3>" +
                "<h3>" + picasFamasservice.getPicas() +
                "<h3> famas: </h3>" +
                "<h3>" + picasFamasservice.getFamas() +
                "<h3> vidas: </h3>" +
                "<h3>" + picasFamasservice.getVidas() +
                "<h3>" + mensaje +
                "</div>}";
    }

    
}
