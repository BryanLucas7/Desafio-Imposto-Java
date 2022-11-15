package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner sc= new Scanner(System.in);
	    List<TaxPayer> list=new ArrayList();
	    System.out.print("Quantos contribuintes voce vai digitar? ");
	    int n=sc.nextInt();
	    System.out.println("");
	    for(int i=0;i<n;i++) {
	    	System.out.printf("Digite os dados do %do contribuinte: \n",i+1);
	    	System.out.printf("Renda anual com salario: ");
	    	double salario=sc.nextDouble();
	    	System.out.printf("Renda anual com prestacao de servicos: ");
	    	double servicos=sc.nextDouble();
	    	System.out.printf("Renda anual com ganho de capital: ");
	    	double capital=sc.nextDouble();
	    	System.out.printf("Gastos medicos: ");
	    	double medicos=sc.nextDouble();
	    	System.out.printf("Gastos Educacionais: ");
	    	double educa=sc.nextDouble();
	    	System.out.println("");
	    	TaxPayer person= new TaxPayer(salario,servicos,capital,medicos,educa);
	    	list.add(person);
	    }
	    for(int i=0;i<n;i++) {
	    	System.out.printf("Resumo do %do contribuinte \n",i+1);
	    	System.out.printf("Imposto bruto total: %.2f \n",list.get(i).grossTax());
	    	System.out.printf("Abatimento: %.2f \n",list.get(i).taxRebate());
	    	System.out.printf("Imposto bruto total: %.2f \n",list.get(i).netTax());
	    	
	    	
	    	
	    }
     sc.close();
	}

}
