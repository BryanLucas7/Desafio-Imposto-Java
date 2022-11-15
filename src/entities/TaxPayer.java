package entities;

public class TaxPayer {
	private double salaryIncome;
	private double servicesIncome;
	private  double capitalIncome;
	private  double healthSpending;
	private double educationSpending;
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	public double getSalaryIncome() {
		return salaryIncome;
	}
	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}
	public double getServicesIncome() {
		return servicesIncome;
	}
	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}
	public double getCapitalIncome() {
		return capitalIncome;
	}
	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}
	public double getHealthSpending() {
		return healthSpending;
	}
	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}
	public double getEducationSpending() {
		return educationSpending;
	}
	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax(){
		if ((this.salaryIncome/12)>=3000 && (this.salaryIncome/12)<5000 ) {
			return ((this.salaryIncome)*10)/100;
		}
		else if ((this.salaryIncome/12)>=5000) {
			return((this.salaryIncome)*20)/100;
		}
		return 0;
	}
	public double servicesTax() {
		if(this.servicesIncome>0) {
			return ((this.servicesIncome)*15)/100;
		}
		return 0;
	}
	
	public double capitalTax() {
		if(this.capitalIncome>0) {
			return ((this.capitalIncome)*20)/100;
		}
		return 0;
	}
	public double grossTax() {
		 double salarytax=salaryTax();
		 double servicesTax=servicesTax();
		 double capitalTax=capitalTax();
		 return salarytax+servicesTax+capitalTax;
	}
	public double taxRebate() {
		double impostobruto=this.grossTax();
		if(this.educationSpending+this.healthSpending<(impostobruto*30)/100) {
			return this.educationSpending+this.healthSpending;
		}
		return (impostobruto*30)/100;
	}
	public double netTax() {
		double impostobruto=this.grossTax();
		double abatimento=this.taxRebate();
		return impostobruto-abatimento;
	}
	
}
