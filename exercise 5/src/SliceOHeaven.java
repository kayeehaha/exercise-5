public class SliceOHeaven {


    public static void processCardPayment(String cardNumber, String expiryDate, int cvv) {

        int cardLength = cardNumber.length();
        if (cardLength != 14) {
            System.out.println("Invalid card");
            return;
        }
        System.out.println("Card accepted");


        int firstCardDigit = Integer.parseInt(cardNumber.substring(0, 1));


        String blacklistedNumber = "12345678901234";
        if (cardNumber.equals(blacklistedNumber)) {
            System.out.println("Card is blacklisted. Please use another card");
            return;
        }


        int lastFourDigits = Integer.parseInt(cardNumber.substring(cardLength - 4));


        StringBuilder cardNumberToDisplay = new StringBuilder();
        cardNumberToDisplay.append(cardNumber.charAt(0));
        for (int i = 1; i < cardLength - 4; i++) {
            cardNumberToDisplay.append("*");
        }
        cardNumberToDisplay.append(cardNumber.substring(cardLength - 4));


        System.out.println("Processed card details:");
        System.out.println("First Digit: " + firstCardDigit);
        System.out.println("Last Four Digits: " + lastFourDigits);
        System.out.println("Masked Card Number: " + cardNumberToDisplay);
    }


    public static void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
        StringBuilder special = new StringBuilder();
        special.append("Today's Special:");
        special.append("\nPizza: ").append(pizzaOfTheDay);
        special.append("\nSide: ").append(sideOfTheDay);
        special.append("\nPrice: ").append(specialPrice);

        System.out.println(special.toString());
    }

    public static void main(String[] args) {

        processCardPayment("12345678901234", "12/25", 123);
        specialOfTheDay("Margherita", "Garlic Bread", "$9.99");
    }
}