import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Products.*;
import VendingMachines.*;


public class AppFrame extends JFrame{
    private JButton button = new JButton("Купить");
    private JTextField textField = new JTextField(5);
    private JLabel label_1 = new JLabel("Выберите продукт:");
    private JLabel label_2 = new JLabel("Введите сумму:");
    private DefaultListModel<Product> producListModel;
    private VendingMachine vendingMachine;

    // Создаем конструктор класса с одним параметром, передавая его в супер он становится заголовком окна
    public AppFrame(String text){
        super(text);
        this.setBounds(100, 100, 500, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        Container container = this.getContentPane(); 
        container.setLayout(new GridLayout(4, 3, 3, 3));
        container.add(label_1);
        container.add(label_2);
        container.add(textField);

// добавить список продуктов

        container.add(button);
        button.addActionListener(new ActionListener(){
            String message = "Вы ввели не число. Попробуйте еще раз!";
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            try {
                int inputtextfield = Integer.parseInt(textField.getText());

                }catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, message,  "Ошибка", JOptionPane.PLAIN_MESSAGE);

                 }}

                }} );
                }
  
            }


                
// }