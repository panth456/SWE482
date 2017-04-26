package kirbsideApparelJavaApplication;

//Needed imoprts
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

class UserPage extends JPanel {

    //Constructor
    public UserPage() {
       //holder for all components 
        JPanel holder = new JPanel();
        
        //Creating buttons and their actionListneres
        JButton deleteAccount = new JButton("Delete Account");
        deleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountActionPerformed(evt);
            }
        });
        
        JButton viewOrders = new JButton("View Orders");
        viewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrdersActionPerformed(evt);
            }
        });
        
        JButton updateAccount = new JButton("Update Account");
        updateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAccountActionPerformed(evt);
            }
        });
        
        //Adding componets to holder, and holder to UserPage
        add(holder);
        holder.add(deleteAccount);
        holder.add(updateAccount);
        holder.add(viewOrders);
        
    }

    //Setting prefered size of UserPage
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
    
    //Function called when delete account is button clicked
    public static void deleteAccountActionPerformed (java.awt.event.ActionEvent evt) {
        
        //calling delete account funciton
        int result = applicationFunctionality.deleteAccount(KirbSideApparelJavaApplication.USER_FILE_NAME);

        //Deciding what to do based on delete account result
        switch (result) {
            case 1:
                //Changing the GUI back to main menu
                KirbSideApparelJavaApplication.changeCard("Main Menu");
                break;

            case 0:
                System.out.println("User canceled request");
                break;

        }
    }
    
    //Function called when update accout button is clicked
    public static void updateAccountActionPerformed (java.awt.event.ActionEvent evt) {
        
        //Changing the "display" to user accout update page
        KirbSideApparelJavaApplication.changeCard("User Account Update Page");
        
    }
    //Function called when view orders button is clicked
    public static void viewOrdersActionPerformed (java.awt.event.ActionEvent evt) {
        
        //Getting infomration to display for users orders
        ViewOrders.orderDisplay.setText(applicationFunctionality.displayOrders());
        //Changing "display" to view orders page
        KirbSideApparelJavaApplication.changeCard("View Orders Page");
        
    }
            
}
