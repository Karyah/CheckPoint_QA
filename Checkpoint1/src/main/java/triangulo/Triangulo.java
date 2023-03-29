package triangulo;

public class Triangulo {
	
	public String verificaTipo(int ladoA, int ladoB, int ladoC) {
		if(ladoA < 0 || ladoB < 0 || ladoC < 0) {
			return "Negativo";
			
		}else if(ladoA==ladoB && ladoB==ladoC) {
			return "Equilátero";
			
		}else if((ladoA == ladoB && ladoB != ladoC)|| (ladoA != ladoB && ladoB == ladoC) || (ladoA == ladoC && ladoB != ladoA)) {
			return "Isósceles";
			
		}else return "Escaleno";
			
	}
	
	public boolean verificaTriangulo(int quantidadeLados) {
		if (quantidadeLados == 3) return true;
		else return false;
	}
	
	
}
