package br.com.heraoliveira.rpgquest;

import br.com.heraoliveira.rpgquest.app.MenuPrincipal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RpgQuestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RpgQuestApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Questboard iniciado");
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.exibeMenu();
	}
}
