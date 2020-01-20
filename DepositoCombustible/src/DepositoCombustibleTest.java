import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

	@Test
	void testDeposito() {
		DepositoCombustible dep=new DepositoCombustible(100, 70);
		System.out.println("Nivel del depósito:"+dep.getDepositoNivel());
		System.out.println("Capacidad máxima del depósito:"+dep.getDepositoMax());
		System.out.println("¿Deposito vacio?:"+dep.estaVacio());
		if(dep.getDepositoMax()/2==dep.getDepositoNivel()) {
			System.out.println("¿Depósito mitad??: Sí");
		}
		dep.consumir(1);
		System.out.println("Nivel del depósito:"+dep.getDepositoNivel());
		dep.consumir(40);
		System.out.println("Nivel del depósito:"+dep.getDepositoNivel());
		dep.consumir(-20);
		System.out.println("Nivel del depósito:"+dep.getDepositoNivel());
		dep.fill(10);;
		System.out.println("Nivel del depósito:"+dep.getDepositoNivel());
		dep.fill(50);;
		System.out.println("Nivel del depósito:"+dep.getDepositoNivel());
		dep.fill(-15);;
		System.out.println("Nivel del depósito:"+dep.getDepositoNivel());
	}

}
