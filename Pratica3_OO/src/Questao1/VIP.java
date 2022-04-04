package Questao1;

public class VIP extends Ingresso {
	public VIP(float valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}
	public float ValorAdicional;
	   
    public float getValorAdicional(){
    return this.ValorAdicional;
    }
    public void setValorAdicional(float valorAdicional){
        this.ValorAdicional = valorAdicional;
    }
    public float valorIngressoVip(float valoringresso){
         Ingresso.ValorIngresso = valoringresso;
         return Ingresso.ValorIngresso + (this.ValorAdicional* Ingresso.ValorIngresso11);       
    }
}
		
	
	

