/**
 * 
 */
import java.io.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.lang.String;

class Exclusion{};

public class Affichage extends Thread{
	String texte; 

	public Affichage (String txt){texte=txt;}
	public void run(){
        synchronized (System.out) {
            //toute la boucle for est la section critique
            for (int i=0; i<texte.length(); i++){
                //sout est la ressource critique
                System.out.print(texte.charAt(i));
                try {sleep(100);} catch(InterruptedException e){};
            }
        }


	}
}
