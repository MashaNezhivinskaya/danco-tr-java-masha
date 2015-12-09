public class MainClass
{
  public static void main(String[] args)
  {
    Bank bank = new Bank();
    Client client = new Client();
    Score score = new Score();
    Card card = new Card();
    BankSystem bankSystem= new BankSystem(card);
  }
}

