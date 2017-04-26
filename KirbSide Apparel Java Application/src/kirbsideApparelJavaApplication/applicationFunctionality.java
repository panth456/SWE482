package kirbsideApparelJavaApplication;

//Needed imports
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class applicationFunctionality {
    
     //Variables
    static String firstName;
    static String lastName;
    static String email;
    static String address1;
    static String address2;
    static String city;
    static String state;
    static int zipCode;
    static String userName;
    static String password;
    public static Customers currentUser;
    static public int lineNumber = 1;
    public static int orderID = 1;
    public static int processID = 1;
    public static LocalDate currentDate;
    
    //Premade constructors for shoes inventory
    static Product s1 = new Product(1, "M8", "Mens Running Product, Black", 75.00, true, "Black", "Men's 8");
    static Product s2 = new Product(2, "M9", "Mens Running Product, Blue", 75.00, true, "Blue", "Men's 9");
    static Product s3 = new Product(3, "M10", "Mens Running Product, Red", 75.00, true, "Red", "Men's 10");
    static Product s4 = new Product(4, "W6", "Womens Running Product, Purple", 80.00, true, "Purple", "Women's 6");
    static Product s5 = new Product(5, "W7", "Womens Running Product, Pink", 80.00, true, "Pink", "Women's 7");
    static Product s6 = new Product(6, "W8", "Womens Running Product, Grey", 85.00, true, "Grey", "Women's 8");
    static Product s7 = new Product(7, "B4", "Boys Running Product, Blue", 55.00, true, "Blue", "Boy's 4");
    static Product s8 = new Product(8, "B5", "Boys Running Product, Green", 50.00, true, "Green", "Boy's 5");
    static Product s9 = new Product(9, "B6", "Boys Running Product, Grey", 45.00, true, "Grey", "Boy's 6");
    static Product s10 = new Product(10, "G4", "Girls Running Product, Pink", 65.00, true, "Pink", "Girl's 4");
    static Product s11 = new Product(11, "G5", "Girls Running Product, Orange", 50.00, true, "Orange", "Girls's 5");
    static Product s12 = new Product(12, "G6", "Girls Running Product, Red", 45.00, true, "Red", "Girl's 6");
    
    //Arrays for storing information
    public static ArrayList<Customers> users = new ArrayList<Customers>();
    public static ArrayList<Order> orders = new ArrayList<Order>();
    public static ArrayList<OrderLine> cartList = new ArrayList<OrderLine>();
    public static ArrayList<Product> productList = new ArrayList<Product>();
    public static ArrayList<OrderLine> orderLines = new ArrayList<OrderLine>();
    public static ArrayList<Payment> payments = new ArrayList<Payment>();
    
    //function to add products to product list
    public static void addProducts()
    {
        productList.add(s1);
        productList.add(s2);
        productList.add(s3);
        productList.add(s4);
        productList.add(s5);
        productList.add(s6);
        productList.add(s7);
        productList.add(s8);
        productList.add(s9);
        productList.add(s10);
        productList.add(s11);
        productList.add(s12);                
    }
    
    //Function to create product info and return created String
    public static String getProductInfo(String item)
    {
        String productInfo = "<html><body>";
        
        if (item.equals("M8")) {
            productInfo += s1.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s1.getItemDescription();
        }
        if (item.equals("M9")) {
            productInfo += s2.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s2.getItemDescription();
        }
        if (item.equals("M10")) {
            productInfo += s3.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s3.getItemDescription();
        }
        if (item.equals("W6")) {
            productInfo += s4.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s4.getItemDescription();
        }
        if (item.equals("W7")) {
            productInfo += s5.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s5.getItemDescription();
        }
        if (item.equals("W8")) {
            productInfo += s6.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s6.getItemDescription();
        }
        if (item.equals("B4")) {
            productInfo += s7.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s7.getItemDescription();
        }
        if (item.equals("B5")) {
            productInfo += s8.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s8.getItemDescription();
        }
        if (item.equals("B6")) {
            productInfo += s9.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s9.getItemDescription();
        }
        if (item.equals("G4")) {
            productInfo += s10.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s10.getItemDescription();
        }
        if (item.equals("G5")) {
            productInfo += s11.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s11.getItemDescription();
        }
        if (item.equals("G6")) {
            productInfo += s12.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s12.getItemDescription();
        }
                
        productInfo += "</body></html>";
        return productInfo;
    }
    
    //Function to add item to cart based on vairable passed in
    public static void addToCart(String item) {
        if (item.equals("M8")) {
            //Creatig a new orderLine, adding it to cartList, and incrementing lineNumber
            OrderLine m8 = new OrderLine(orderID, lineNumber, s1.getItemID(), s1.getUnitPrice(), 1, s1.getColor(), s1.getSize());
            cartList.add(m8);
            lineNumber++;
        }
        if (item.equals("M9")) {
            //Creatig a new orderLine, adding it to cartList, and incrementing lineNumber
            OrderLine m9 = new OrderLine(orderID, lineNumber, s2.getItemID(), s2.getUnitPrice(), 1, s2.getColor(), s2.getSize());
            cartList.add(m9);
            lineNumber++;
        }
        if (item.equals("M10")) {
            //Creatig a new orderLine, adding it to cartList, and incrementing lineNumber
            OrderLine m10 = new OrderLine(orderID, lineNumber, s3.getItemID(), s3.getUnitPrice(), 1, s3.getColor(), s3.getSize());
            cartList.add(m10);
            lineNumber++;
        }
        if (item.equals("W6")) {
            //Creatig a new orderLine, adding it to cartList, and incrementing lineNumber
            OrderLine w6 = new OrderLine(orderID, lineNumber, s4.getItemID(), s4.getUnitPrice(), 1, s4.getColor(), s4.getSize());
            cartList.add(w6);
            lineNumber++;
        }
        if (item.equals("W7")) {
            //Creatig a new orderLine, adding it to cartList, and incrementing lineNumber
            OrderLine w7 = new OrderLine(orderID, lineNumber, s5.getItemID(), s5.getUnitPrice(), 1, s5.getColor(), s5.getSize());
            cartList.add(w7);
            lineNumber++;
        }
        if (item.equals("W8")) {
            //Creatig a new orderLine, adding it to cartList, and incrementing lineNumber
            OrderLine w8 = new OrderLine(orderID, lineNumber, s6.getItemID(), s6.getUnitPrice(), 1, s6.getColor(), s6.getSize());
            cartList.add(w8);
            lineNumber++;
        }
        if (item.equals("B4")) {
            //Creatig a new orderLine, adding it to cartList, and incrementing lineNumber
            OrderLine b4 = new OrderLine(orderID, lineNumber, s7.getItemID(), s7.getUnitPrice(), 1, s7.getColor(), s7.getSize());
            cartList.add(b4);
            lineNumber++;
        }
        if (item.equals("B5")) {
            //Creatig a new orderLine, adding it to cartList, and incrementing lineNumber
            OrderLine b5 = new OrderLine(orderID, lineNumber, s8.getItemID(), s8.getUnitPrice(), 1, s8.getColor(), s8.getSize());
            cartList.add(b5);
            lineNumber++;
        }
        if (item.equals("B6")) {
            //Creatig a new orderLine, adding it to cartList, and incrementing lineNumber
            OrderLine b6 = new OrderLine(orderID, lineNumber, s9.getItemID(), s9.getUnitPrice(), 1, s9.getColor(), s9.getSize());
            cartList.add(b6);
            lineNumber++;
        }
        if (item.equals("G4")) {
            //Creatig a new orderLine, adding it to cartList, and incrementing lineNumber
            OrderLine g4 = new OrderLine(orderID, lineNumber, s10.getItemID(), s10.getUnitPrice(), 1, s10.getColor(), s10.getSize());
            cartList.add(g4);
            lineNumber++;
        }
        if (item.equals("G5")) {
            //Creatig a new orderLine, adding it to cartList, and incrementing lineNumber
            OrderLine g5 = new OrderLine(orderID, lineNumber, s11.getItemID(), s11.getUnitPrice(), 1, s11.getColor(), s11.getSize());
            cartList.add(g5);
            lineNumber++;
        }
        if (item.equals("G6")) {
            //Creatig a new orderLine, adding it to cartList, and incrementing lineNumber
            OrderLine g6 = new OrderLine(orderID, lineNumber, s12.getItemID(), s12.getUnitPrice(), 1, s12.getColor(), s12.getSize());
            cartList.add(g6);
            lineNumber++;
        }
    }
    
    //Function to create  new order and add to the orders arrayList
    public static void createOrder()
    {
        Order currentOrder = new Order(orderID, currentDate.now(), 1, itemTotal(), calculateTax(), (itemTotal() + calculateTax()), currentUser.getUsername());
        orders.add(currentOrder);
    }
    
    //Function to caluclate tax for order
    public static double calculateTax()
    {
        
        //Calculating tax by multiplying total by Iowa state sales tax of 6%
        double calculatedTax = itemTotal() * .06;
        return calculatedTax;
    }
    
    //Function to create a new payment, and add it to the payments arrayList
    public static void addPayment(int orderId, String customerId, String paymentType, int creditCardNumber, int ccvNumber,
            String billingAddress1, String billingAddress2, String billingCity, String billingState, int billingZipCode, 
            String cardHolderName, String expirationDate, int processId, boolean transactionResult) 
    {
        
        Payment tempPayment = new Payment(orderId, customerId, paymentType, creditCardNumber, ccvNumber, billingAddress1, 
                billingAddress2, billingCity, billingState, billingZipCode, cardHolderName, expirationDate, processId, transactionResult);
        payments.add(tempPayment);
        
    }
    
    //Function that creates the data to display in the users shopping cart
    public static String displayCart()
    {
        //html header for organizing the information 
        String cartContents = "<html><body>";
        
        //Iterating through all orderlines in the users cart
        for(int i = 0; i < cartList.size(); ){
            String itemName = "";
            double price = 0;
            //comparing product ids to item id of item in each orderline and assinging values of item name and price when match found
            for(int x =0; x < productList.size(); x++){
                if (productList.get(x).getItemID() == cartList.get(i).getItemID()){
                    itemName = productList.get(x).getItemName();
                    price = productList.get(x).getUnitPrice();
                    break;
                }
            }
            
            //Creating the diplayed infromation with spaces inbetween using html tags
            cartContents += (itemName + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + price + "<br>");
            i++;
        }
        
        //Adding more content to the information to be displayed
        cartContents += "__________________________<br>";
        cartContents += "Total Price &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + itemTotal();
        cartContents += "</body></html>";
        
        return cartContents;
    }
    
    //Function to determine cart total price
    public static double itemTotal() {
        double totalPrice = 0;
        
        //Iterating through all orderlines in the cart
        for (int i = 0; i < cartList.size(); i++) {
            double price = 0;
            
                //iterating through all products and comparing item id of product to item in the order line
                for(int x =0; x < productList.size(); x++){
                    if (productList.get(x).getItemID() == cartList.get(i).getItemID()){
                        
                        //Setting the price of the product if ids match
                        price = productList.get(x).getUnitPrice();
                        break;
                    }
                }
            
                //adding gathered item price from above to total
                totalPrice += price;
        }
        return totalPrice;
    }
    
    //function to authenticate login credentials
    public static int logIn(String enteredUserName, String enteredPassword) {
        int i;

        //Loop through all user data until finding matching user name and password
        for (i = 0; i < users.size();) {

            //Entered password and user name match records, current user is set and 1 returned
            if (enteredUserName.equals(users.get(i).getUsername()) && enteredPassword.equals(users.get(i).getPassword())) {
                currentUser = users.get(i);
                return 1;
            } //User name matches records but password does not, returns 2
            else if (enteredUserName.equals(users.get(i).getUsername()) && !enteredPassword.equals(users.get(i).getPassword())) {
                return 2;
            } else if (i < users.size()) {
                i++;
            }

        }
        //Returning 0 if no account was found matching entered data
        return 0;
    }
    
    //function to create a new customer and loads to the customer arrayList
    public static int createCustomer(String fName, String lName, String email, String address1, String address2, String city, String state, int zip, String userName, String password1, String password2) {

        if (password1.equals(password2)) {

            System.out.println("Passwords match.");
            //Creating customer object to add to customer array
            Customers customerInfo = new Customers(fName, lName, email, address1, address2, city, state, zip, userName, password1);
            //Adding created customer to the customer array
            users.add(customerInfo);

            return 1;
        }

        System.out.println("Test area");
        return 2;

    }
    
    //feature that deletes account information for the logged in user only
    public static int deleteAccount(String fileName) {

        int i = 0;

        while (i < users.size()) {

            if (users.get(i).equals(currentUser)) {

                //Gettnig user confirmation of account deletion
                int confirm = JOptionPane.showConfirmDialog(null, "Are you suer you want to delete your account?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirm == JOptionPane.YES_OPTION) {
                    //Remove item
                    users.remove(i);
                    KirbSideApparelJavaApplication.writeCustomerCsvFile(fileName);
                    currentUser = null;
                    return 1;
                } else if (confirm == JOptionPane.NO_OPTION) {
                    break;
                }
            } else {
                ++i;
            }
        }

        return 0;
    }

    //Function to update a users information
    public static void accountUpdate(String fileName, String fName, 
            String lName, String email, String address1, 
            String address2, String city, String state, int zip) {
        
        int userIndex = users.indexOf(currentUser);
        
        //Updating first name
        users.get(userIndex).setFirstName(fName);
        
        //updating last name
        users.get(userIndex).setLastName(lName);
        
        //Updating email
        users.get(userIndex).setEmail(email);
        
        //Updating address1
        users.get(userIndex).setAddress1(address1);
        
        //Updating address 2
        users.get(userIndex).setAddress2(address2);
        
        //Updating City
        users.get(userIndex).setCity(city);
        
        //Updating State
        users.get(userIndex).setState(state);
        
        //Updating Zip
        users.get(userIndex).setZipCode(zip);
        
        //Posting updates to the CSV file
        KirbSideApparelJavaApplication.writeCustomerCsvFile(fileName);
          
    }
    
    //Function to create String that displays all users orders
    public static String displayOrders()
    {
        //Creating html wrapper
        String orderList = "<html><body>";
        
        //Iterating through all orders in orders arrayList
        for(int x = 0; x < orders.size(); x++)
        {
            //checking if current order username matches the logged in user
            if(currentUser.getUsername().equals(orders.get(x).getCustomerID()))
            {
                //Adding that order to the display output
                orderList += orders.get(x).getOrderID() + "<br>";
                //Iterating through all orderLins for that order
                for(int i = 0; i < orderLines.size(); i++)
                {
                    //Iterating through all products
                    for (int y = 0; y < productList.size(); y++)
                    {
                        //Checking if the product id from the product list matches the product id from the current orderline
                        if (orderLines.get(i).getItemID() == productList.get(y).getItemID())
                        {
                            //Adding to the output display if they match
                            System.out.println(productList.get(y).getItemName());
                            orderList += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + productList.get(y).getItemName() + "<br>";
                        }
                    }
                }
            }
        }
        
        //Adding the ending html wrapper, and returning the created String
        orderList += "</body></html>";
        return orderList;
    }
    
    //Function to get the item details based on variable passed in
    public static String getItemDetails(String product)
    {
        //Creating html wrapper
        String productDetails = "<html><body>";
        
        //Adding product information if passed in variable matches
        if (product.equals("M8")) {
            productDetails += s1.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s1.getItemDescription();
        }
        if (product.equals("M9")) {
            productDetails += s2.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s2.getItemDescription();
        }
        if (product.equals("M10")) {
            productDetails += s3.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s3.getItemDescription();
        }
        if (product.equals("W6")) {
            productDetails += s4.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s4.getItemDescription();
        }
        if (product.equals("W7")) {
            productDetails += s5.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s5.getItemDescription();
        }
        if (product.equals("W8")) {
            productDetails += s6.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s6.getItemDescription();
        }
        if (product.equals("B4")) {
            productDetails += s7.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s7.getItemDescription();
        }
        if (product.equals("B5")) {
            productDetails += s8.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s8.getItemDescription();
        }
        if (product.equals("B6")) {
            productDetails += s9.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s9.getItemDescription();
        }
        if (product.equals("G4")) {
            productDetails += s10.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s10.getItemDescription();
        }
        if (product.equals("G5")) {
            productDetails += s11.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s11.getItemDescription();
        }
        if (product.equals("G6")) {
            productDetails += s12.getItemName() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + s12.getItemDescription();
        }
             
        //Adding ending html wrapper and returning the created String
        productDetails += "</body></html>";
        return productDetails;
    }
    
   
}
