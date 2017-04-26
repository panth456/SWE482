package kirbsideApparelJavaApplication;

//Needed imiports
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateUserAccount extends JPanel{

    //Button to create user account
    JButton createUserAccount = new JButton("Create Account");
    
    //Holder for all other Swing components
    JPanel holder = new JPanel();
    
    //Text fields to gather user input for new customer
    JTextField firstNameField = new JTextField("First Name");
    JTextField lastNameField = new JTextField("Last name");
    JTextField emailField = new JTextField("Email");
    JTextField address1Field = new JTextField("Address 1");
    JTextField address2Field = new JTextField("Address 2");
    JTextField cityField = new JTextField("City");
    JTextField stateField = new JTextField("State");
    JTextField zipCodeField = new JTextField("Zip Code");
    JTextField userNameField = new JTextField("User Name");
    JTextField password1Field = new JTextField("Password");
    JTextField password2Field = new JTextField("Password");
    
    //Constructor for new CreateUserAccount JPanel
    public CreateUserAccount() {
        
        //Adding all components to the holder, and the holder to the CreateUserAccount JPanel
        add(holder);
        holder.add(firstNameField);
        holder.add(lastNameField);
        holder.add(emailField);
        holder.add(address1Field);
        holder.add(address2Field);
        holder.add(cityField);
        holder.add(stateField);
        holder.add(zipCodeField);
        holder.add(userNameField);
        holder.add(password1Field);
        holder.add(password2Field);
        holder.add(createUserAccount);
        
        //Action listener for create user account button
        createUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserAccountActionPerformed(evt);
            }
        });
    }

    //Setting preferred size of CreateUserAccount JPanel
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
    
    //Method call when create user account button is clicked
    private void createUserAccountActionPerformed(java.awt.event.ActionEvent evt) {
    
        //Try-catch in case no zip is entered
        try {
            //Gathering data from textfields
            String fName = firstNameField.getText();
            String lName = lastNameField.getText();
            String tempEmail = emailField.getText();
            String sAddress1 = address1Field.getText();
            String sAddress2 = address2Field.getText();
            String tempCity = cityField.getText();
            String tempState = stateField.getText();
            int tempZip = Integer.parseInt(zipCodeField.getText());
            String tempUserName = userNameField.getText();
            String tempPassword1 = password1Field.getText();
            String tempPassword2 = password2Field.getText();

            //Creating the new customer
            int result = applicationFunctionality.createCustomer(fName, lName, tempEmail, sAddress1, sAddress2, tempCity, tempState, tempZip, tempUserName, tempPassword1, tempPassword2);

            //Choosing what to do based on return of createCustomer function
            switch (result) {
                case 1:
                    //Changing the GUI back to main menu
                    KirbSideApparelJavaApplication.changeCard("Main Menu"); 
                    break;

                case 2:
                    System.out.println("Passwords don't match");
                    break;

            }
        } catch (NumberFormatException e) {

        }
        
    }
}
