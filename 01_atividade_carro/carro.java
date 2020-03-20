package Atividades;

public class Carro {
	
	int nPessoas = 0;
	int maxPessoas = 2;
	float gasolina = 0;
	float maxGasolina = 100;
	float km = 0;
	
	boolean embarcar() {
		if (this.nPessoas < this.maxPessoas) {
			this.nPessoas += 1;
			System.out.println("embarcou");
			return true;
		}
		System.out.println("ta lotado");
		return false;
	}
	
	void abastecer(float gasolina) {
		this.gasolina += gasolina;
		if(this.gasolina > this.maxGasolina);
			this.gasolina = this.maxGasolina;
		
	}
	
	void dirigir(float distancia) {
		if (this.nPessoas == 0) {
			System.out.println("Nao tem quem dirija");
			return;
		}
		if(this.gasolina >= distancia) {
			this.gasolina -= distancia;
			this.km += distancia;
			System.out.println("Dirigindo");
			return;			
		}
		System.out.println("Nao tem gasolina");
		
	}

}
