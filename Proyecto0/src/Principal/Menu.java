package Principal;
import javax.swing.JOptionPane;
import EntradaSalida.ToolsPanel;
import Ejercicios.Metodos;
public class Menu {

	public static void main(String[] args) {
		Menu.MenuU1();
		
			//String menu2="Circulo,Triangulo,Cuadrado,Rectangulo,Salir";
			//Menus.Menu2(menu2);

		}
		
		public static void MenuU1() {
	        String op1,numeroS, categoria, cadena;
	        byte numeroB;
	        int numero,numero1,numero2, op;
	        double numeroD;
	        do {

	           op1 = JOptionPane.showInputDialog("1 - Sumar digitos\n2 - Decimal a binario\n3 - Sistema Agua\n4 - Multiplicacion Rusa "
	           		+ "\n5 - Frecuencia\n6 - Binario Decimal\n7 - Amrstrong\n8 - Digito Mayor\n9 - Total de digitos\n10 - Numero Mayor\n11 "
	           		+ "- Universidad\n12 - Sistema Agua\n13 - Imprime frecuencia\n14 - Numero perfecto\n15 - Cliente\n16 - Filas digitos\17"
	           		+ "-Contar vocales\n18 - Es primo\n19 - Es palindromo\20 - Suma par e impar\21 - Num Prodcut\n22 - Venta cubrebocas\0 - Salir");
	            op = Integer.parseInt(op1);

	            
	            switch (op) {
	                case 1:
	                    numero = ToolsPanel.leerInt("Ingrese los datos");
	                    ToolsPanel.imprimeSalida(Metodos.SumaDigitos(numero));

	                    break;
	                case 2:
	                    numero = ToolsPanel.leerInt("Ingrese un numero");
	                    ToolsPanel.imprimeSalida(Metodos.DecimalBinario(numero));
	                    break;
	                    case 3:
	                    numero = ToolsPanel.leerInt("Ingrese un numero");
	                    ToolsPanel.imprimeSalida(Metodos.MetodoSistemaAgua(numero));
	                    break;
	                    case 4:
	                    numero = ToolsPanel.leerInt("Ingrese un numero");
	                    numero1 = ToolsPanel.leerInt("Ingrese un numero");
	                    ToolsPanel.imprimeSalida(Metodos.MultiRusa(numero,numero1));
	                    break;
	                    case 5:
	                    numero = ToolsPanel.leerByte("Ingrese un numero");
	                    ToolsPanel.imprimeSalida(Metodos.ImprimeFrecuencia((byte) numero));
	                    break;
	                    case 6:
	                    	numeroS=ToolsPanel.leerString("Ingrese el numero binario");
	                    	ToolsPanel.imprimeSalida(Metodos.BinarioDecimal(numeroS));
	                    	break;
	                    case 7:
	                    	numero = ToolsPanel.leerInt("Ingrese un numero");
	                    ToolsPanel.imprimeSalida(Metodos.CalcularAmrstrong(numero)); break;
	                    case 8:
	                    	numero= ToolsPanel.leerInt("Ingresa un numero");
	                    	ToolsPanel.imprimeSalida(Metodos.DigitoMayor(numero)); break;
	                    case 9:
	                    	numero=ToolsPanel.leerInt("Ingrese un numero");
	                    	ToolsPanel.imprimeSalida(Metodos.TotalDigitos(numero));
	                    case 10:
	                    	numero=ToolsPanel.leerInt("Ingrese el primer numero");
	                    	numero1=ToolsPanel.leerInt("Ingrese el segundo numero");
	                    	numero2=ToolsPanel.leerInt("Ingrese el tercer numero");
	                    	ToolsPanel.imprimeSalida(Metodos.NumeroMayor(numero, numero1, numero2)); break;
		                case 11:
		                	categoria=ToolsPanel.leerString("Ingrese categoria");
		                    numeroD= ToolsPanel.leerdouble("Ingrese promedio");
		                    ToolsPanel.imprimeSalida(Metodos.PagoUniversidad(categoria, numeroD));
		                case 12:
		                	numero=ToolsPanel.leerInt("Ingrese los litros");
		                	ToolsPanel.imprimeSalida(Metodos.MetodoSistemaAgua(numero));
		                    break;
		                case 13:
		                	numeroB=ToolsPanel.leerByte("Ingrese numero");
		                	ToolsPanel.imprimeSalida(Metodos.ImprimeFrecuencia(numeroB));
		                case 14:
		                	numero=ToolsPanel.leerInt("ingrese el numero");
		                	ToolsPanel.imprimeSalida(Metodos.NumPerfecto(numero));
		                case 15:
		                	categoria=ToolsPanel.leerString("cliente");
		                	ToolsPanel.imprimeSalida(Metodos.cliente(categoria));
		                case 16:
		                	numero=ToolsPanel.leerInt("ingrese un numero");
		                	ToolsPanel.imprimeSalida(Metodos.filasDigitos(numero));
		                case 17:
		                	cadena=ToolsPanel.leerString("ingrese el texto");
		                	ToolsPanel.imprimeSalida(Metodos.cuentaVocales(cadena));
		                case 18:
		                	numero=ToolsPanel.leerInt("ingrese el numero");
		                	ToolsPanel.imprimeSalida(Metodos.esPrimo(numero));
		                case 19:
		                	cadena=ToolsPanel.leerString("ingrese el texto");
		                	ToolsPanel.imprimeSalida(Metodos.esPalindromo(cadena));
		                case 20:
		                	numero=ToolsPanel.leerInt("ingrese numero");
		                	ToolsPanel.imprimeSalida(Metodos.sumaParImpar(numero));
		                case 21:
		                	numero=ToolsPanel.leerInt("ingrese numero 1");
		                	numero2=ToolsPanel.leerInt("ingrese numero 2");
		                	ToolsPanel.imprimeSalida(Metodos.numProducto(numero, numero2));
		                case 22:
		                	numero=ToolsPanel.leerInt("ingrese numero ");
		                	ToolsPanel.imprimeSalida(Metodos.ventaCubrebocas(numero));

	            }
	        } while (op != 0);
	        JOptionPane.showMessageDialog(null, "Hasta luego...\nVueve pronto");
	    }
	}

