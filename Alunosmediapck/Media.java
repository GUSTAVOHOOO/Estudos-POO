package Alunosmediapck;

public class Media {
	
	    public static double mediaSimples(double nota1, double nota2) {
	        return (nota1 + nota2) / 2;
	    }

	    public static double mediaPonderada(double nota1, double nota2, double peso1, double peso2) {
	        return ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);
	    }

	    public static double mediaGeometrica(double nota1, double nota2) {
	        return Math.sqrt(nota1 * nota2);
	    }
	}

