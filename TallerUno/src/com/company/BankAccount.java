package com.company;

public class BankAccount
{
    //variables nativas de la clase
    public int accountNumber;
    public String customerDocumentType;
    public String customerDocumentNumber;
    public String customerFullName;
    private double saldo;
    protected boolean activated;

    //constructores
    public BankAccount()
    {
        accountNumber=00000000001;
        customerDocumentType="CC";
        customerDocumentNumber="1053777489";
        customerFullName="ANGELA MARIA ESPINOSA GRANADA";
        saldo=0;
        activated=false;
    }

    public BankAccount(int accountNumber, String customerDocumentType, String customerDocumentNumber, String customerFullName, double saldo,boolean activated)
    {
        this();
        this.accountNumber=accountNumber;
        this.customerDocumentType=customerDocumentType;
        this.customerDocumentNumber=customerDocumentNumber;
        this.customerFullName=customerFullName;
        this.saldo=saldo;
        this.activated=activated;
    }
    //fin constructores

}
