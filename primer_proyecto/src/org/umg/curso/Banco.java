package org.umg.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alumno on 26/06/2017.
 */
public class Banco {
    public static void main(String[] args) throws IOException {
        Cliente c = new Cliente();
        c.setNombre("Mauricio");
        c.setEdad(34);
        c.setSalario(8000);

       // System.out.println("Estimado Cliente: "+c.getNombre()+" Su salrio sera de "+c.getSalario());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Su Nombre:");
                try {
            c.setNombre( reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Su edad");
                c.setEdad(Integer.parseInt(reader.readLine()));
        System.out.println("Su Salario");
                c.setSalario(Integer.parseInt(reader.readLine()));

        System.out.println("Estimado Cliente: "+c.getNombre()+" Su salrio sera de "+c.getSalario());
    }
}
