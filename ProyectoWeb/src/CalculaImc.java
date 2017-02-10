
public class CalculaImc {

	public static String calculaImc(double peso, double altura){
		
		double imc=(peso/(altura*altura));
		
		String resultado;
		
		if(imc<16.00){
			  resultado="Infrapeso: Delgadez Severa";
			}else if(imc>=16.00 && imc<=16.99){
			  resultado="Infrapeso: Delgadez moderada";
			}else if(imc>=17.00 && imc<=18.49){
			  resultado="Infrapeso: Delgadez aceptable";
			}else if(imc>=18.50 && imc<=24.99){
			  resultado="Peso Normal";
			}else if(imc>=25.00 && imc<=29.99){
			  resultado="Sobrepeso";
			}else if(imc>=30.00 && imc<=34.99){
			  resultado="Obeso: Tipo I";
			}else if(imc>=35.00 && imc==40.00){
			  resultado="Obeso: Tipo III";
			}else{
			  resultado="Resultado"+altura;
			}
		
		return resultado;
		
	}
	
}
