import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Baraja {

	private int posicion;
	private Carta[] carta;
	private Carta[] carta2;
	
	
	public Baraja() {
		super();
		this.posicion = posicion;
		this.carta = new Carta [40];
		ArrayList<Integer> posiciones = new ArrayList<Integer>();
		String barajeado[] = new String[40];
		int n=1;
		for (int i=0;i<carta.length;i++){
			String palo="";
			if(i<=9){
				palo="bastos";
			}
		    if(i>9&&i<=19){
				palo="espadas";
			}
			if(i>19&&i<=29){
				palo="copas";
			}
			if(i>29&&i<=39){
				palo="oros";
			}

			if (n<=12){
				this.carta[i]= new Carta(n,palo);
			}
			if(n==8){
				n+=2;
				this.carta[i]= new Carta(n,palo);
			}
			if(n==12){
				this.carta[i]= new Carta(n,palo);
				n=0;
			}
			n++;
		}
		do{
			
			int numero= (int)(Math.random()*40);
			if (posiciones.contains(numero)==false){
				posiciones.add(numero);
			}
		}while (posiciones.size()!=39);
		System.out.println(posiciones);
		try{
			for (int i=0;i<carta.length;i++){
				this.carta2[i]=this.carta[posiciones.get(i)];
			}
		}finally{
			for (int i=0;i<carta.length;i++){
				this.carta2[i]=this.carta[posiciones.get(i)];
			}
		}

	}

	public String toString() {
		return "Baraja [posicion=" + posicion + ", carta=" + Arrays.toString(carta) + "]";
	}

	
	
	
}
