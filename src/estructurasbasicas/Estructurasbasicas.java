
package estructurasbasicas;


public class Estructurasbasicas {

    public static void main(String[] args) {

        int numero=0;
        double decimales=0.5;
        String caracteres= "ü";
        boolean binario=false;

        float nota = 85;
        float Maxapr = 60;

//Estructuras de decision
/*if (nota >= Maxapr){
System.out.println("Aprobo la clase con exito");
}
else{
System.out.println("reprobo la clase");
}*/

//Operador terniario o condicional

System.out.println(nota>Maxapr ? "Aprobo la calse con exito" : "Reprobo la clase");
System.out.println(!binario);

if (nota <60){
System.out.println("Reprobado");
} else if(nota < 80){
System.out.println("Bueno");
}else if (nota < 90){
System.out.println("Muy Bueno");
}else {
System.out.println("Excelent");
}


switch (numero){
case 0:
    System.out.println(5+5);
    break;
case 1:
    System.out.println(10+10);
    break;
default:
System.out.println(5+5);


}



// Operadores Logicos
// And &
// OR |


// Estructuras repetitivas

while (numero > 10){
System.out.println("Hola");
numero++;
// Operadores Incremento "++" Reducir "--"
}

do {
System.out.println("Hola");
numero++;
} while (numero>10);

/*for pendiente*/

int prueba = 10;
int nuevovalor = 20;

    System.out.println(prueba++);
//USando Operador de incremento

nuevovalor += prueba;

    System.out.println("Nuevo Valor =" + nuevovalor);

    }
    
}

