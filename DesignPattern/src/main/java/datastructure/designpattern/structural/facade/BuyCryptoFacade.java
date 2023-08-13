package datastructure.designpattern.structural.facade;

public class BuyCryptoFacade {

    public void buyCryptoCurrency(double amount, String currency){

        DatabaseService databaseService=new DatabaseService();

        User user = databaseService.getUser(UIUserService.getLoggedInUserId());
        if(user.balance() < amount){
            System.out.println("Insufficient balance to perform transactions");
            return;
        }
        CryptoFactory.getCryptoService(currency).buyCurrency(user,amount);
        MailService mailService = new MailService();
        mailService.sendConfirmationMail(user);
        System.out.println(amount +" of " + currency + " bought successfully!");
    }
}
