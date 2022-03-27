package Questao1;
public class Carnaval {

	public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        Normal normal = new Normal();
        CamaroteInferior camaroteinferior = new CamaroteInferior();
        CamaroteSuperior camarotesuperior = new CamaroteSuperior();
        VIP vip = new VIP();
        ingresso.setValorIngresso(71);
        vip.setValorAdicional(0.7f);
        camaroteinferior.setLocalIngresso("terreo");
        camarotesuperior.setTaxaAdicional(0.5f);
        normal.setValorIngresso(70);
        normal.imprimeingressoNormal(normal.getValorIngresso());
        System.out.println("Ingresso Vip:"+vip.valorIngressoVip(ingresso.getValorIngresso()));
        System.out.println("Ingresso Vip Camarote Inferior:"+vip.valorIngressoVip(ingresso.getValorIngresso()));
        camaroteinferior.imprimeLocalizacao(camaroteinferior.getLocalIngresso());
        camarotesuperior.setValorAdicional(35);
        camarotesuperior.setValorIngresso(70);
        System.out.println("Ingresso Vip Camarote Superior:"+ camarotesuperior.valorIngressoAdd(vip.getValorAdicional()));
	}
}

