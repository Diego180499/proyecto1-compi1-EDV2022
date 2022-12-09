/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import analizadores.MiLexer;
import analizadores.Token;
import analizadores.TokenConstant;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class mainFront {

    public static void main(String[] args) {
            
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
