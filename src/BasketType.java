import java.util.List;

public interface BasketType {
    //This method will grab  a specific item object given the assigned choice number
    Product getItemFromBasket(int ite);

    //This method will return a list of all the items in the user's basket
    List<Item> returnAllBasketItems();

    //This method takes an item object and adds it to the User's basket
    void addItemToBasket(Item item);

    //This method will allow us to determine if an item is present in the user's basket or not (so that we may adjust the quantity or add the item to the basket)
    boolean contains(int ite);

    //This method will add or adjust the quantity of an item in the user's basket
    void adjustBasketState(int i, int quantity, RegularBasket regularBasket, List<Item> MenuAvail, RegularMenu object );

    //This method calculates the sales tax
    double SalesTax(Item i);

    //This method calculates the price of an imported item
    double imprtTaxtotal(Item i);

    //This method calculates general pricing
    double Calculate(Item i, double price, double priceAfterTax);

    //Calculates the price of a taxable item
    double taxTotal(Item i);

    //Calculates the price of a general item
    double nontaxTotal(Item i);

    //Calculates the price of both a taxable and imported item
    double imprtandTaxtotal(Item i);
}
