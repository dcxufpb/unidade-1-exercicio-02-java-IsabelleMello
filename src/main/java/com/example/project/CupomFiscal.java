package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";

	private static String Quebra_Linha = System.lineSeparator();

	public static void exercicio01() {
		String cupom = NOME_LOJA + Quebra_Linha;
		cupom += LOGRADOURO + ", " + NUMERO + " " + COMPLEMENTO + Quebra_Linha; 
		cupom += BAIRRO +" - " + MUNICIPIO + " - " + ESTADO + Quebra_Linha;
		cupom += "CEP:" + CEP + " Tel " + TELEFONE + Quebra_Linha;
		cupom += OBSERVACAO + Quebra_Linha;
		cupom += "CNPJ: " + CNPJ + Quebra_Linha;
		cupom += "IE: " + INSCRICAO_ESTADUAL;

		System.out.println(cupom);

	}

	public void exercicio02_tudoVazio() {
		System.out.println(
			Quebra_Linha +
			", " + Quebra_Linha +
			" -  - " + Quebra_Linha +
			"CEP: Tel " + Quebra_Linha +
			Quebra_Linha +
			"CNPJ: " + Quebra_Linha +
			"IE: "
		);
	}

	public static void main(final String[] args) {
		exercicio01();
	}

}
