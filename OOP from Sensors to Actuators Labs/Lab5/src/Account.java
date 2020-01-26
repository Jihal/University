
public class Account {
	String name;
	char accountType;
	double currentBal;
	
	Account(String nam, char accTy, double iniBal){
		name = nam;
		accountType = accTy;
		currentBal = iniBal;
	}
	
	double getBalance() {
		return currentBal;
	}
	
	String getDescription(){
		if(accountType == 'i') {
			return("International account with owner " + name + " has current balance " + currentBal);
		}
		else{
			return("Domestic account with owner " + name + " has current balance " + currentBal);
		}
	}
	
	Account(String nam, char accTy){
		name = nam;
		accountType = accTy;
	}
	
	void setBalance(double amt) {
		currentBal = amt;
	}
	
	void deposit(double amt) {
		if(accountType == 'i') {
			amt = amt - (amt*0.1);
			currentBal += amt;
		}
		else {
			currentBal += amt;
		}
	}
	
	void withdraw(double amt) {
		if(accountType == 'i') {
			amt = amt + (amt*0.1);
			currentBal -= amt;
		}
		else {
			currentBal -=amt;
		}
		
	}
	
	void transferTo(Account name, double amt) {
		withdraw(amt);
		name.deposit(amt);
	}
}
