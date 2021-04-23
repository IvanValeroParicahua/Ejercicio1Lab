import java.util.Scanner;


class Calculator {
	
	
  static int add(int a, int b){ 
	  return  a +b ;
	  }

  static int sub(int a, int b){
	  return a-b; 
	  }
  
  static int mul(int a, int b){
  		return a*b; 
  	  }

  static int div(int a, int b){
  		int cociente;
	if (b <=0) {
	System.out.println("Division entre 0 no existe");
	}
	else {
	cociente = a/b;
	return cociente;
	}	
	return 0; 
   }
  static int mod(int a, int b){ 
  	    return a%b; 
  }
  
  
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,a,b;
		double respuesta;
		
		System.out.println("Ingrese primer valor");
		a = scan.nextInt();
		System.out.println("Ingrese segundo valor");
		b = scan.nextInt();
		
		
		System.out.println("Ingrese un numero para seleccionar la operacion");
		System.out.println("1.Adicion");
		System.out.println("2.Sustraccion");
		System.out.println("3.Multiplicacion");
		System.out.println("4.Division");
		System.out.println("5.Modulo");
		x = scan.nextInt();

		switch (x) {
		case 1:
			respuesta = add(a,b);
			System.out.println(respuesta);
			break;
		case 2:
			respuesta = sub(a,b);
			System.out.println(respuesta);
			break;
		case 3:
			respuesta = mul(a,b);
			System.out.println(respuesta);
			break;
		case 4:
			respuesta = div(a,b);
			System.out.println(respuesta);
			break;
		case 5:
			respuesta = mod(a,b);
			System.out.println(respuesta);
			break;
		default:
			System.out.println("Numero invalido");
			break;
		}
}	}

<<<<<<< HEAD
public class Calculator {
	public static void main(String []args){
     }
     public static int sumar(int a, int b){
           return a+b;
       }
     public static int restar(int a, int b){
     	return a - b;
     }
     public static int multiplicar(int a,int b){
     	return a*b;
     }
     public static int dividir(int a,int b){
     	return a/b;
     }
}
=======
>>>>>>> de2ad2c6a851a531fa07596ca388a7dee3023604
