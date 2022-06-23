package edu.escuelaing.arsw.picasYfamas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.escuelaing.arsw.picasYfamas.Service.picasFamasService;

@SpringBootApplication
public class PicasYfamasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicasYfamasApplication.class, args);
		picasFamasService picasFamasservice = picasFamasService.getInstance();
		System.out.println(picasFamasservice.generateRamdomNum());
		
	}

}
