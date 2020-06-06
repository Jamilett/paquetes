package paquetes;


// import com.gm.*; // Importa TODAS las clases del paquete com.gm // Evita muchas lineas de código
// El * No incluye las clases de los subpaquetes, sería import com.gm.contabilidad.*; 

import com.gm.Utileria; // Importa sólo la clase utilería
// El import NO carga automaticamente las clases, éstas se cargan hasta que son usadas en alguna función

public class StaticMain {

    public static void main(String[] args) {
        // 1er FORMA DE LLAMAR UNA CLASE: fully qualified name
        // Utilizamos el nombre completamente calificado para acceder a la clase de otro paquete   
        //com.gm.Utileria.imprimir("Hola"); 
        // nombre de paquete.clase.método;
        // NO SE RECOMIENDA USAR ASÍ ya que se vuelve difícil de leer
        
        // 2a FORMA DE LLAMAR UNA CLASE: haciendo un import (lo más común)
        Utileria.imprimir("Hola"); // **Aquí se carga la clase
        // nombreClase.método

    }
}
