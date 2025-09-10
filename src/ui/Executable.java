package ui;

import model.Controller;
import java.util.Scanner;

public class Executable {

    // Atributos de la clase Ejecutable
	private Scanner reader;
	private Controller cont;

    // tipoAcceso tipoDato (clase) nombreAtributo;


	public Executable() {
		reader = new Scanner(System.in);
		cont = new Controller();
	}

	public void run()
	{
        cont.crearTarjeta(50000, false);

	}

	public static void main(String[] args) {
		Executable mainApp = new Executable();
		mainApp.run();
	}
}