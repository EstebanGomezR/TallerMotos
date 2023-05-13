public class EstudiantePOO
{
    String identificacion;
    String nombre;
    String curso;
    double notauno;
    double notados;
    double notatres;
}


import java.util.Scanner;
public class Notas
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroEstudiantes;
        EstudiantePOO[] losEstudiantes = new EstudiantePOO[50];
        String identificacion, nombre, curso;
        double nota1, nota2, nota3;
        double promedio = 0;
        System.out.println("Digite la cantidad de Estudiantes: ");
        numeroEstudiantes = sc.nextInt();
        for(int i = 0; i < numeroEstudiantes; i++){
            System.out.println("Digite la identificacion del Estudiante: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Estudiante: ");
            nombre = sc.next();
            System.out.println("Digite el curso del Estudiante: ");
            curso = sc.next();
            System.out.println("Digite la nota 1 del Estudiante: ");
            nota1 = sc.nextDouble();
            System.out.println("Digite la nota 2 del Estudiante: ");
            nota2 = sc.nextDouble();
            System.out.println("Digite la nota 3 del Estudiante: ");
            nota3 = sc.nextDouble();
            EstudiantePOO unEstudiante = new EstudiantePOO();
            unEstudiante.identificacion = identificacion;
            unEstudiante.nombre = nombre;
            unEstudiante.curso = curso;
            unEstudiante.notauno = nota1;
            unEstudiante.notados = nota2;
            unEstudiante.notatres = nota3;
            losEstudiantes[i] = unEstudiante;
        }
    }    
}
