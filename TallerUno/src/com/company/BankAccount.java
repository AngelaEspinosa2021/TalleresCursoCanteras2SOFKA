package com.company;

public class BankAccount
{
    //variables nativas de la clase
    public int accountNumber;
    public String customerDocumentType;
    public String customerDocumentNumber;
    public String customerFullName;
    private double accountBalance;
    protected boolean activated;

    //constructores
    public BankAccount()
    {
        accountNumber=00000000001;
        customerDocumentType="CC";
        customerDocumentNumber="1053777489";
        customerFullName="ANGELA MARIA ESPINOSA GRANADA";
        accountBalance=0;
        activated=false;
    }

    public BankAccount(int accountNumber, String customerDocumentType, String customerDocumentNumber, String customerFullName, double accountBalance,boolean activated)
    {
        this();
        this.accountNumber=accountNumber;
        this.customerDocumentType=customerDocumentType;
        this.customerDocumentNumber=customerDocumentNumber;
        this.customerFullName=customerFullName;
        this.accountBalance=accountBalance;
        this.activated=activated;
    }
    //fin constructores

    //métodos
    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }

    public String getCustomerDocumentType()
    {
        return customerDocumentType;
    }

    public void setCustomerDocumentType(String customerDocumentType)
    {
        this.customerDocumentType=customerDocumentType;
    }

    public String getCustomerDocumentNumber()
    {
        return customerDocumentNumber;
    }

    public void setCustomerDocumentNumber(String customerDocumentNumber)
    {
        this.customerDocumentNumber=customerDocumentNumber;
    }

    public String getCustomerFullName()
    {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName)
    {
        this.customerFullName=customerFullName;
    }

    public double getAccountBalance()
    {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public boolean getActivated()
    {
        return activated;
    }

    public void setActivated(boolean activated)
    {
        this.activated=activated;
    }
    //fin métodos
}
