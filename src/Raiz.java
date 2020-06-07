
public class Raiz extends Thread{
	double numero;
	public Raiz(double numero){
		this.numero = numero;
	}
	@Override
	public void run(){
		Double resultado = Math.sqrt(this.numero);
		System.out.println("Raíz cuadrada = " + resultado);
	}
}
