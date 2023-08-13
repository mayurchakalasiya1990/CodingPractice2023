package datastructure.designpattern.structural.facade;

public class Client {
    public static void main(String[] args) {
        BuyCryptoFacade buyCryptoFacade=new BuyCryptoFacade();
        buyCryptoFacade.buyCryptoCurrency(1000,"BTC");
        buyCryptoFacade.buyCryptoCurrency(10001,"BTC");
    }
}
