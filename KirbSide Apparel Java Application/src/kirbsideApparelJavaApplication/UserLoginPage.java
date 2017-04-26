package kirbsideApparelJavaApplication;

//Needed imports
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserLoginPage extends JPanel{
    
    
    //Creating variables taht can be accessed throughout the application
    public static int loginType = 0;
    
    JButton logIn = new JButton("LogIn");
    JButton createUserAccount = new JButton("Create Account");
    
    
    JPanel holder = new JPanel();
    
    JTextField userIdField = new JTextField("User Name");
    JTextField passwordField = new JTextField("Password");
    JLabel displayField = new JLabel();
    
    public UserLoginPage() {
        
        //Adding all componets to holder, and holder to UserLogInPage
        add(holder);
        holder.add(Box.createVerticalStrut(100));
        holder.add(userIdField);
        holder.add(Box.createVerticalStrut(50));
        holder.add(passwordField);
        holder.add(Box.createVerticalStrut(50));
        holder.add(displayField);
        holder.add(Box.createVerticalStrut(50));
        holder.add(logIn);
        holder.add(Box.createVerticalStrut(50));
        holder.add(createUserAccount);
        
        //Setting the layout so all items stack on each other
        holder.setLayout(new BoxLayout(holder, BoxLayout.Y_AXIS));
        
        //Action listeners for the buttons
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });
        
        createUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserAccountActionPerformed(evt);
            }
        });
    
    }

    //Setting the preffered size for UserLoginPage
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
    
    //Function called with log in button is clicked
    public void logInActionPerformed (java.awt.event.ActionEvent evt){
        
        //Getting the users input
        String tempUserName = userIdField.getText();
        String tempPassword = passwordField.getText();

        //Validating the login information
        int result = applicationFunctionality.logIn(tempUserName, tempPassword);

        //Deciding what to do based on result of logIn function
        switch (result) {
            case 1:
                //For login success, changing "display" based on loginType 
                // if loginType is 1 it is normal login, if not then they were 
                //redirected to login when trying to checkout
                if (loginType == 0) {
                KirbSideApparelJavaApplication.changeCard("User Page");
                } else {
                    KirbSideApparelJavaApplication.changeCard("Checkout Page");
                }
            break;

            case 2:
                displayField.setText("Password is incorrect, please try again");
            break;

            case 0:
                displayField.setText("Account doesn't exist, please try again");
            break;

        }
        
    }
    
    //Action performed when create user account button is clicked
    public void createUserAccountActionPerformed (java.awt.event.ActionEvent evt){
        
        KirbSideApparelJavaApplication.changeCard("User Account Creation Page");
        
    }
}
