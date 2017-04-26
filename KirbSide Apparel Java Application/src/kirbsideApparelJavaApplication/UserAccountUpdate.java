package kirbsideApparelJavaApplication;

//Needed imports
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserAccountUpdate extends JPanel{
    
    //Creating variables that can be accessed throughout the apoplication
    JTextField updateFnField = new JTextField("First Name");
    JTextField updateLnField = new JTextField("Last name");
    JTextField updateEmailField = new JTextField("Email");
    JTextField updateAddress1Field = new JTextField("Address 1");
    JTextField updateAddress2Field = new JTextField("Address 2");
    JTextField updateCityField = new JTextField("City");
    JTextField updateStateField = new JTextField("State");
    JTextField updateZipCodeField = new JTextField("Zip Code");

    public UserAccountUpdate() {
        
        //Holder for all other components
        JPanel holder = new JPanel();
        
        //Creating buttons and settnig their actionListeners
        JButton updateAccount = new JButton("Update Account");
        updateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAccountActionPerformed(evt);
            }
        });
        JButton cancelRequest = new JButton("Cancel");
        cancelRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRequestActionPerformed(evt);
            }
        });
        
        //Adding the components to holder, and holder to the UserAccountUpdate JPanel        
        add(holder);
        holder.add(updateFnField);
        holder.add(updateLnField);
        holder.add(updateEmailField);
        holder.add(updateAddress1Field);
        holder.add(updateAddress2Field);
        holder.add(updateCityField);
        holder.add(updateStateField);
        holder.add(updateZipCodeField);
        holder.add(updateAccount);
        holder.add(cancelRequest);
    }

    //Setting the preferred size of UserAccountUpdate
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
    
    //Function called when update account button is clicked
    public void updateAccountActionPerformed (java.awt.event.ActionEvent evt){
        
        try {

            //Tries to update the users account
            applicationFunctionality.accountUpdate(KirbSideApparelJavaApplication.USER_FILE_NAME, updateFnField.getText(), 
                    updateLnField.getText(), updateEmailField.getText(), updateAddress1Field.getText(), updateAddress2Field.getText(),
                    updateCityField.getText(), updateStateField.getText(), Integer.parseInt(updateZipCodeField.getText()));

            KirbSideApparelJavaApplication.changeCard("User Page");

        } catch (NumberFormatException e) {

        }
        
    }
    
    public void cancelRequestActionPerformed (java.awt.event.ActionEvent evt){
        //Changes the "display" if the cancel button is clicked
       KirbSideApparelJavaApplication.changeCard("User Page");
        
    }
    
    
}
