package Questao1;
public class Camarote extends Ingresso {

	 public Camarote(float valor) {
		super(valor);
	}

	String LocalIngresso;
     
	    public String getLocalIngresso(){
	      return this.LocalIngresso;
	    }
	    public void setLocalIngresso(String local){
	        this.LocalIngresso = local;
	    }
	   
	    public String acessaLocalizacao(){
	        return this.LocalIngresso;
	    }
	    public void imprimeLocalizacao(String local){
	        local = this.LocalIngresso;
	        System.out.println("Local:"+ local);
	    }
	    
	    public void imprimeCamarote(float valor){
	            System.out.println("Camarote:"+ valor );
	              
	    }
	}
