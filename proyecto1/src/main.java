
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class main {

    public static void main(String[] args) {
        generarLexer();

    }

    public static void generarLexer() {
        String rutaLexer = "J:/Universidad/Vaqueras-Guate/Compi 1/Laboratorio/PROYECTOS/Proyecto1/proyecto1/src/analizadores/Lexer.flex";
        File archivo = new File(rutaLexer);
        JFlex.Main.generate(archivo);
    }

    public static void generarSintax() throws IOException, Exception {
        String rutaLexer = "J:/Universidad/Vaqueras-Guate/Compi 1/Laboratorio/PROYECTOS/Proyecto1/proyecto1/src/analizadores/Lexer.flex";
        String rutaLexerCup = "J:/Universidad/Vaqueras-Guate/Compi 1/Laboratorio/PROYECTOS/Proyecto1/proyecto1/src/analizadores/LexerCup.flex";
        String[] rutaSintax = {"-parser", "Sintax", "J:/Universidad/Vaqueras-Guate/Compi 1/Laboratorio/PROYECTOS/Proyecto1/proyecto1/src/analizadores/Sintax.cup"};
        
        //Generamos el Lexer.flex
        File archivo = new File(rutaLexer);
        JFlex.Main.generate(archivo);

        //Generamos el LexerCup.flex para cup
        File archivo2 = new File(rutaLexerCup);
        JFlex.Main.generate(archivo2);
        
        //Generamos el Sintax.cup
        java_cup.Main.main(rutaSintax);

        //ruta del sym.java
        Path rutaSym = Paths.get("J:/Universidad/Vaqueras-Guate/Compi 1/Laboratorio/PROYECTOS/Proyecto1/proyecto1/src/analizadores/sym.java");

        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }

        Files.move(
                Paths.get("J:/Universidad/Vaqueras-Guate/Compi 1/Laboratorio/PROYECTOS/Proyecto1/proyecto1/sym.java"),
                Paths.get("J:/Universidad/Vaqueras-Guate/Compi 1/Laboratorio/PROYECTOS/Proyecto1/proyecto1/src/analizadores/sym.java")
        );

        //ruta sintax
        Path rutaSin = Paths.get("J:/Universidad/Vaqueras-Guate/Compi 1/Laboratorio/PROYECTOS/Proyecto1/proyecto1/src/analizadores/Sintax.cup");

        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }

        Files.move(
                Paths.get("J:/Universidad/Vaqueras-Guate/Compi 1/Laboratorio/PROYECTOS/Proyecto1/proyecto1/Sintax.java"),
                Paths.get("J:/Universidad/Vaqueras-Guate/Compi 1/Laboratorio/PROYECTOS/Proyecto1/proyecto1/src/analizadores/Sintax.java")
        );

    }

}
