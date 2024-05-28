package ejercicios;

import java.util.Scanner;

public class AppImc {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usuario = new String[4];


        System.out.println("Inicializar app: Presione uno (1) pára ingresar");
        int init = sc.nextInt();

        while(init != 0) {

            System.out.println("1.Registro 2. Inicio de Sesion 3.Salir");

            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:
                    System.out.println("Registrar Paciente");

                    System.out.println("Ingrese su id");
                    String id = sc.nextLine();
                    usuario[0] = id;

                    System.out.println("Ingrese su nombre");
                    String nombre = sc.nextLine();
                    usuario[1]= nombre;

                    System.out.println("Ingrese su correo:");
                    String correo = sc.nextLine();
                    usuario[2]= correo;

                    System.out.println("Ingrese su contraseña:");
                    String contrasena = sc.nextLine();
                    usuario[3] = contrasena;

                    int i = 0;

                    while(i < usuario.length){

                        System.out.println(usuario[i]);

                        i++;

                    }


                    break;
                case 2:
                    System.out.println("Iniciar Sesión");

                    System.out.println("Ingrese el correo que registró:");

                    String correoReg = sc.nextLine();

                    System.out.println("INgrese el password registrado:");

                    String contraRegistrada = sc.nextLine();


                    if(correoReg.equals(usuario[2])  && contraRegistrada.equals(usuario[3])){

                        System.out.println("Bienvenido " + usuario[1]);

                        System.out.println("Calcular IMC");

                    }else{

                        System.out.println("Valide sus credenciales");
                    }


                    break;
                case 3:
                    System.out.println("Salir");
                    init = 0;
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }
        }
    }
}
