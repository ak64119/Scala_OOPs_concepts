///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
//Assignment_Q1 + Q3
//Q1 Write a class AccountInfo with methods deposit and withdraw, 
// and a read-only property balance
//Q3 Extend the following BankAccount class to a CheckingAccount 
//class that charges $1 for every deposit and withdrawal

class AccountInfo {
  private var balance = 0.0;
  def deposit(amt:Double):Double = {
    balance = balance + amt
    return balance
  }
  def withdraw(amt:Double):Double = {
    balance = balance - amt
    return balance
  }
  
  def currbal() = { balance }
}

class  CheckingAccount extends AccountInfo {
  private var balance = 0.0;
  override def deposit(amt:Double):Double = {
    balance = balance + amt - 1
    return balance
  }
  override def withdraw(amt:Double):Double = {
    balance = balance - amt - 1
    return balance 
  }
  override def currbal() = { balance }
}

object AccountInfo_Example{
  def main(Args: Array[String]){
    val CheckingAccount = new CheckingAccount()
    println("Current Balance is :" + CheckingAccount.currbal()) 
    println("Balance after deposit is: " +  CheckingAccount.deposit(100.50))
    println("Balance after withdrawl is: " +  CheckingAccount.withdraw(50.50)) 
  }
}

///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
