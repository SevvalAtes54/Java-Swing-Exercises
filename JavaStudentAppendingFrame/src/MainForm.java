import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    JTextField firstnametextf,lastNameText,emailText,addresArea;
    TextArea resultsArea;
public void initialize(){

    setTitle("hello");
    JLabel firstNameLabel = new JLabel("First Name:");
     firstnametextf = new JTextField();
    JLabel lastNameLabel = new JLabel("Last Name:");
     lastNameText = new JTextField();
    JLabel emailLabel = new JLabel("email:");
     emailText = new JTextField();
    JLabel addresLabel = new JLabel("address:");
     addresArea = new JTextField();
    JButton buttonAdd = new JButton("Add:");
JButton buttonInitialize = new JButton("Inıtıalize:");

buttonAdd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      addStudent(firstnametextf.getText(), lastNameText.getText(), emailText.getText(),addresArea.getText());
    }
});
   JPanel jForm = new JPanel();
   jForm.setLayout(new GridLayout(5,2,10,5));

jForm.add(firstNameLabel);
    jForm.add(firstNameLabel);
    jForm.add(firstnametextf);
    jForm.add(lastNameLabel);
    jForm.add(lastNameText);
    jForm.add(emailLabel);
    jForm.add(emailText);
    jForm.add(addresLabel);
    jForm.add(addresArea);
    jForm.add(buttonAdd);
    jForm.add(buttonInitialize);

    buttonInitialize.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            initializeFields();
        }
    });
     resultsArea = new TextArea();
resultsArea.setEnabled(false);
        JButton btnclr = new JButton("Clear");

        btnclr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultsArea.setText(" ");
            }
        });
        JScrollPane scrollPane = new JScrollPane(resultsArea);

    JPanel jmainForm = new JPanel();
    jmainForm.setLayout(new BorderLayout(10,10));
    jmainForm.add(jForm,BorderLayout.NORTH);
jmainForm.add(resultsArea,BorderLayout.CENTER);
    jmainForm.add(btnclr,BorderLayout.SOUTH);

jmainForm.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
add(jmainForm);
 setSize(400,300);
   setMinimumSize(new Dimension(100,400));
   setVisible(true);
   setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
 void addStudent(String name,String Surname,String email,String address){

    if(name.isEmpty() || Surname.isEmpty() ||email.isEmpty() ||address.isEmpty() ){
     resultsArea.append("\n fill the lanks korrektly\n");
     JOptionPane.showMessageDialog(this,"all fields must be filled");
     return;
    }
    else {
        resultsArea.append(name + "\n" + Surname + "\n" + email + "\n " + address + "\n");
    }


}
void initializeFields(){

    firstnametextf.setText("");
    lastNameText.setText("");
    emailText.setText("");
    addresArea.setText("");
}

}
