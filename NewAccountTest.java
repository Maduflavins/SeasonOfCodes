//package com.StackOverFlow.Doubts4;

public class NewAccountTest {
public static void main(String[] args) {
NewAccount acc1= new NewAccount();
NewAccount acc2= new NewAccount();
acc1.name	=	"accountHolder1 ";
acc1.balance	=	111;
acc2.name	=	"accountHolder2 ";
acc2.balance	=	222;

System.out.println(acc1);
System.out.println(acc2);

//**UPDATED**
//NewAccountTest.displayAccount(acc1);
//NewAccountTest.displayAccount(acc2);    
}

//**UPDATED**
public static void displayAccount(Account accountToDisplay) {
    System.out.printf("\n\nAccount name "+ accountToDisplay.getName()+ "\nAccount Balance "+ accountToDisplay.getBalance());
}

}