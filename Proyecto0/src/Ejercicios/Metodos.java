package Ejercicios;
import javax.swing.JOptionPane;
	//import static Metodos.ferecuencia.ImprimeFrecuencia;
import EntradaSalida.ToolsPanel;
import EntradaSalida.ToolsPanel;
public class Metodos {

    public static int DigitoMayor(int numero) {
        int resultado = 0;
        while (numero > 0) {
            resultado += numero % 10;
            numero = numero / 10;
        }
        return resultado;
    }

    public static int NumeroMayor(int n1, int n2, int n3) {
        int mayor;
        if (n1 > n2) {
            if (n1 > n3) {
                mayor = n1;
            } else {
                mayor = n3;
            }
        } else if (n2 > n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        return mayor;
    }

    public static int TotalDigitos(int numero) {
        int cifras = 0;
        while (numero != 0) {
            numero = numero / 10;
            cifras++;
        }
        return cifras;
    }

    public static int SumaDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero = numero / 10;
        }
        return suma;
    }

    public static boolean CalcularAmrstrong(int numero) {
        int aux = numero, sum=0;
        while(aux>0) {
        	sum+=Math.pow(aux%10, 3);
        	aux/=10;
        }
        return (sum == numero);
        
    }

    public static int DecimalBinario(int numero) {
        int binario = 0, digito, multi = 1;
        // System.out.println(Integer.toBinaryString(numero));
        while (numero != 0) {
            digito = numero % 2;
            binario = binario + digito * multi;
            multi = multi * 10;

            numero = numero / 2;
        }
        return binario;
    }

    public static double PagoUniversidad(String categoria, double prom) {
double adeudo=0;
int pago=0;
        switch (categoria.toLowerCase()) {
            case "a":pago=1200;
            if(prom>80 && prom<=100)
            	adeudo=pago-(pago*.15);
            else
            	if (prom>75 && prom<=80)
            		adeudo=pago-(pago*.08);
            
                break;
            case "b": pago=1000;
            if(prom>80 && prom<=100)
            	adeudo=pago-(pago*.15);
            else
            	if (prom>75 && prom<=80)
            		adeudo=pago-(pago*.08);
                break;
            case "c": pago=900;
            if(prom>80 && prom<=100)
            	adeudo=pago-(pago*.15);
            else
            	if (prom>75 && prom<=80)
            		adeudo=pago-(pago*.08);
                break;
            case "d": pago=600;
            if(prom>80 && prom<=100)
            	adeudo=pago-(pago*.15);
            else
            	if (prom>75 && prom<=80)
            		adeudo=pago-(pago*.08);
                break;

        }

        return (adeudo);

    }

    public static int MetodoSistemaAgua(int litagua) {
        int consumo;
        float iva, pago = 0;
        switch ((litagua >= 0 && litagua <= 99) ? 1 : (litagua >= 100 && litagua <= 499) ? 2 : (litagua >= 500 && litagua <= 599) ? 3 : (litagua >= 600 && litagua <= 999) ? 4 : (litagua >= 1000) ? 5 : 6) {
            case 1:
                pago = litagua * 40;
                break;
            case 2:
                pago = litagua * 60;
                break;
            case 3:
                pago = litagua * 80;
                break;
            case 4:
                consumo = litagua * 80;
                iva = (2 * consumo) / 100;
                pago = consumo + iva;
                break;
            case 5:
                consumo = litagua * 100;
                iva = (2 * consumo) / 100;
                pago = consumo + iva;
                break;
            default:
                ToolsPanel.salidaError("error\nDatos no admitidos");

        }
        return (int) pago;
    }
    public static int MultiRusa(int multiplicador, int multiplicando){
        int suma=0;
        while(multiplicador!=0){
            if(multiplicador % 2 != 0){
                suma = suma + multiplicando;
            }
            multiplicador = multiplicador / 2;
            multiplicando = multiplicando * 2;
        } 
        return suma;
}
    public static String ImprimeFrecuencia(byte numero) {
    	String cad=" ";
    	for(int i=1; i<=numero; i++) {
    		cad+="*";
    	}
		return cad;
    	
    	
    }
    public static String BinarioDecimal(String Binario) {
    	int bin,digito,decimal = 0,exponente = 0;
    	String deci;
    	bin= Integer.parseInt(Binario);
    	do{
            
            digito = bin % 10;
            decimal = decimal + digito * (int) Math.pow(2, exponente);
            exponente++;
            bin = bin / 10;
            }
            while(bin!=0);{
            deci=Integer.toString(decimal);
            }
    	
		return deci;
    }
    public static String cliente (String nCliente) {
    	return (nCliente);
    }
    public static double montoAdeudo(double consumo) {
    	double adeudo=0;
    	if(consumo>100) 
    		adeudo=consumo*40;
    	else 
    		if (consumo>100 && consumo<500)
    			adeudo=(consumo-100)*60+4000;
    		else 
    			if(consumo>=500 && consumo<=1000)
    				adeudo =(consumo-499)*80+33940;
    			else
    				if(consumo>1000)
    					adeudo=(consumo-1000)*100+113940;
    	if(adeudo>600)
    		adeudo=(adeudo*.02)+adeudo;
    	return(adeudo);
    	}
    public static boolean NumPerfecto(int numero) {
    	boolean nPerfecto = false;
    	int suma=0;
    	for(int i = 1; i<numero; i++) {
    		if(numero%i == 0) {
    			suma= suma+i;
    		}
    	}
    	if(suma==numero)
    		nPerfecto=true;
    	return (nPerfecto);
    }
    public static String filasDigitos(int filas) {
    	String calculo=" ";
    	for(int x=1; x<=filas; x++) {
    		 
    		for(int y=0; y<=((x-1)+y); x++) {
    			if (y%2==1) {
    				calculo+= y+ " ";
    			}
    		}
    		calculo+="\n";
    	}
    	return calculo;
    }
    public static String cuentaVocales(String cadena) {
    	byte a=0,e=0,i=0,o=0,u=0;
    	byte f=0;
    	String cad=" ";
    	while(f<cadena.length()) {
    		switch (cadena.charAt(f)) {
    		case 'A':
    		case 'a': a++; break;
    		case 'E':
    		case 'e': e++; break;
    		case 'I':
    		case 'i': i++; break;
    		case 'O':
    		case 'o': o++; break;
    		case 'U':
    		case 'u': u++; break;
    		}
    		f++;
    	}
    	cad="a="+ Metodos.ImprimeFrecuencia(a)+"\n"+"e="+ Metodos.ImprimeFrecuencia(e)+"\n"+"i="+Metodos.ImprimeFrecuencia(i)
    	+"\n"+"\n"+"o="+ Metodos.ImprimeFrecuencia(o)+"\n"+"u="+Metodos.ImprimeFrecuencia(u)+"\n";
    	return cad;
    }
    
    public static String esPrimo(int numero) {
    	boolean primo=false;
    	for(int i=2; i<numero; i++)
    		if(numero%2==0)
    			primo=false;
    		else 
    			primo=true;
    	if(primo)
    		return "Es un numero primo";
    	else 
    		return "No es un numero primo";
    		
    }
    public static boolean esPalindromo(String palabra) {
    	palabra = palabra.toLowerCase().replace("","").replace("", "");
    	int cont=0, inverso=palabra.length()-1;
    	boolean palindromo= false;
    	while((cont<inverso)&&(!palindromo)) {
    		if(palabra.charAt(cont)==palabra.charAt(inverso)) {
    			cont++;
    			inverso--;
    		} else {
    			palindromo=true;
    		}
    	}
    	return palindromo;
    }
    public static double pintura(double base, double altura) {
    	double m2=0;
    	double litros=0;
    	m2=base*altura;
    	litros=m2/3;
    		return (litros*67);
    }
    public static String sumaParImpar(int cont) {
    	int i=1, sumPares=0, sumImpares=0;
    	while (i<=cont) {
    		if(i%2==0)
    			sumPares+=i;
    		else
    			sumImpares+=i;
    		i++;
    	}
    	return "La suma de los numeros pares son: "+sumPares+ "\nLa suma de ñps nuemeros impares son: "+sumImpares;
    }
    public static int numProducto(int num1, int num2) {
    	int suma=0;
    	for(int i=0; i<num2; i++)
    		suma+=num1;
    	return suma;
    }
    public static int ventaCubrebocas(int cantidad) {
    	int costo=0;
    	if(cantidad>10)
    		costo=100;
    	else
    		if(cantidad>=5 && cantidad<=10)
    			costo=120;
    		else 
    			if(cantidad<=4)
    				costo=150;
    	return (cantidad*costo);
    }
    
    }