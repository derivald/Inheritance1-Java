package application;

import entities.BusinessAccount;

public class App {
    public static void main(String[] args) throws Exception {

        BusinessAccount account = new BusinessAccount();

        account.getBalance();
    }
}
