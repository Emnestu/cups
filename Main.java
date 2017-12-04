
/**
   *This program takes in an text file in from an input file stream and uses the Yylex class to process the input and uses its method to output it to the terminal.
   *@author Robert O' Brien
   *@version 1.1
   *@since 4-12-2017
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
public class Main {
public static void main (String args[]) {
        /**
         * This program initialises the <b>File Reader</b> as null,
         * if the program receives no arguements, it terminates.
         * If an arguement is given, it'll progress to the next stage
         */
        FileInputStream fin = null;
        if ((args == null) || (args.length != 1)) {
                System.out.println ("Usage: java test <input-file>");
                System.exit (-1);
        }
        try {
                /**
                   *Takes the inputted file as input to the file stream reader,
                   *creates a <b>Stream Reader</b> to actually read the files it has taken in.
                   *This will send the text in the file into the lexer to be read,
                   *only after going through all the regex rules of the lexer in the first place.
                   *It prints out token by token once it has been processed by the lexer.
                 */
                fin = new FileInputStream (args[0]);
                InputStreamReader isr = new InputStreamReader(fin);
                Yylex lexer = new Yylex (isr);
                Token currentToken = null;
                while ( (currentToken = lexer.next_token()).getTokenID() != Token.EOF)
                        System.out.println (currentToken);

        } catch (IOException ioe) {
                /*prints out an error if there's a problem with the file*/
                System.out.println ("Error opening input file: " + args[0]);
        } catch (Exception e) {
                /* Prints out an error if there's a problem with the input*/
                System.out.println ("Error analysing input: " + e.getMessage());
        }
        finally {
                try { fin.close(); } catch (Exception e) {}
        }
}
}
