/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import analizadores.MiLexer;
import analizadores.MiLexerCup;
import analizadores.Sintax;
import analizadores.Token;
import analizadores.TokenConstant;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/**
 *
 * @author HP
 */
public class mainFront {

    public static void main(String[] args) {

        analizarSintax();

    }

    /*PROBANDO EL ANALIZADOR
    SINTÁCTICO
     */
    public static void analizarSintax() {

        String texto = "int = 5 , int = 6,\n int = 5, int = 8";

        Sintax sintax = new Sintax(new MiLexerCup(new StringReader(texto)));
        try {
            sintax.parse();
            System.out.println("*-ANALISIS FINALIZADO CON EXITO*-");

            //analizamos el Lexer
        } catch (Exception ex) {
            Logger.getLogger(mainFront.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*PROBANDO EL ANALIZADOR
    LEXICO
     */
    public static void probarLexer() {

        String texto = " 5 \" esto es string\"  12.5";
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        String resultado = "";
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(texto);
            escribir.close();
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            MiLexer lexer = new MiLexer(lector);

            while (true) {
                Token token = lexer.yylex();
                if (token.getType() == TokenConstant.EOF) {
                    resultado += "-FIN-";
                    System.out.println(resultado);
                    return;
                }
                resultado += token.toString();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainFront.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(mainFront.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
