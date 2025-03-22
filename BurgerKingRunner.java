class BurgerKingRunner
{
	public static void main(String abc[])
	{
	double foodPrice = BurgerKing.takeOrder("Burger");
	System.out.println(foodPrice);
	double foodPriceWithQuantity = BurgerKing.takeOrder("Burger", 7);
	System.out.println(foodPriceWithQuantity);
	}
	
}