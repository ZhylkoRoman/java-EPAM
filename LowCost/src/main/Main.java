package main;

import DAO.ByteReader;
import DAO.ByteWriter;
import entity.Plane;

import java.io.EOFException;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        Plane plane = new Plane("Kostya", 1488, 228);
        Plane plane2 = new Plane("PIDOR", 148, 2);
        Plane plane3 = new Plane("ERITYAN", 18, 22);
        ByteWriter byteWriter = new ByteWriter("resource/data.txt");
        ByteReader byteReader = new ByteReader("resource/data.txt");
        byteWriter.write(3);
        byteWriter.write(plane);
        byteWriter.write(plane2);
        byteWriter.write(plane3);
        System.out.println(byteReader.read());
        /*Plane restored = (Plane) byteReader.read();
        Plane restored2 = (Plane) byteReader.read();
        Plane restored3 = (Plane) byteReader.read();
        Plane restored4 = (Plane) byteReader.read();
        System.out.println(restored.toString());
        System.out.println(restored2.toString());
        System.out.println(restored3.toString());
        System.out.println(restored4.toString());*/
        byteReader.close();
        byteWriter.close();
    }
}
