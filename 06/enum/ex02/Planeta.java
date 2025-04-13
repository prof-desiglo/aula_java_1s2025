public enum Planeta {
 TERRA(9.807),
 MERCURIO(3.7),
 VENUS(8.87),
 MARTE(3.73),
 JUPTER(24.79),
 SATURNO(10.44),
 URANO(8.87),
 NETUNO(11.15);

private double gravidade;

Planeta(double gravidade){
	this.gravidade = gravidade;
}

double getGravidade(){
	return this.gravidade;
}

double getMassa(double peso){
	return peso / this.getGravidade();
}

double getPeso(double peso, Planeta p){
	return p.getMassa(peso) * this.getGravidade();
}

}
