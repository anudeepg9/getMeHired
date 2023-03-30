package basics;

public class InterThread {

	int amount=6500;    
    
	synchronized void withdraw(int amount){    
	    System.out.println("User Initiated Withdrawal of "+amount);    
	    
	    if(this.amount<amount){    
	    	System.out.println("You have Low Balance. Waiting for Deposit");    
	    try{wait();}catch(Exception e){}    
	    }    
	    this.amount-=amount;    
	    System.out.println("Withdrawl was successfull. Your Current Balance is: "+this.amount);    
	}    
	    
	synchronized void deposit(int amount){    
		System.out.println("User Initiated Deposit of "+amount);   
		this.amount+=amount;    
		System.out.println("DEposit Done. Current Balance is: "+this.amount);    
		notify();    
	}    

	public static void main(String[] args) {   
		
		final InterThread it =new InterThread();    
		new Thread(){    
			public void run(){it.withdraw(9000);}    
		}.start();    
		
		new Thread(){    
		public void run(){it.deposit(15000);}    
		}.start();    
		    
	}

}
