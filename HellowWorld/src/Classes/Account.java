package Classes;

public class Account {
	// 필드 만들기
	private String ano;
	private String owner;
	private int balance;

	// 생성자 만들기
	public Account() {
		
	}
	
	public Account(String ano, String owner, int banlance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
