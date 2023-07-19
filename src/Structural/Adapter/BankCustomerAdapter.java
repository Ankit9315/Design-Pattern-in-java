package Structural.Adapter;

public class BankCustomerAdapter extends BankDetailsAdaptee implements CreditCardTarget{

	@Override
	public void giveBankDetails() {
		// TODO Auto-generated method stub
		setAccountHolder("Archit");
		setAccountNumber(3673839);
		setBankName("IDBI");
	}

	@Override
	public String getCreditCard() {
		// TODO Auto-generated method stub
		return "BankDetails [bankName=" + getBankName() + ", accountHolder=" + getAccountHolder() + ", accountNumber="
				+ getAccountNumber() + "]";
	}

}
