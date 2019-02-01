package 2;

public class Parent extends Person {
	private String name;
	private String baan;
	private double bankAccount;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setBaan(String baan) {
		this.baan = baan;
	}
	public String getBaan() {
		return this.baan;
	}

	public void setBankAccount(double bankAccount) {
		this.bankAccount = bankAccount;
	}
	public double getBankAccount() {
		return this.bankAccount;
	}
	
	
}
