import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Products.*;
import VendingMachines.*;


public class AppFrame extends JFrame{
    private JButton button = new JButton("Купить");
    private JTextField moneyTextField = new JTextField(5);
    private JLabel label_1 = new JLabel("Выберите продукт:");
    private JLabel label_2 = new JLabel("Введите сумму:");
    private DefaultListModel<Product> model = new DefaultListModel<>();
    private JList<Product> listProducts = new JList<>();


    // Создаем конструктор класса с одним параметром, передавая его в супер он становится заголовком окна
    public AppFrame(String text, VendingMachine box){
        super(text);

        listProducts.setModel(model);    
               
// переделать на фрейм убрать контейнер

        this.setBounds(100, 100, 500, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        Container container = this.getContentPane(); 
        container.setLayout(new GridLayout(4, 3, 3, 3));
        container.add(label_1);
        container.add(label_2);
        container.add(moneyTextField);

// добавить список продуктов

        container.add(button);
        button.addActionListener(new ActionListener(){
            String message = "Вы ввели не число. Попробуйте еще раз!";
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            try {
                int inputmoney = Integer.parseInt(moneyTextField.getText());
                
            }catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, message,  "Ошибка", JOptionPane.PLAIN_MESSAGE);

                 }}

                }} );
                }
  
            }


                
// } пересмотреть этот код

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import Products.*;
// import VendingMachines.*;


// public class VendingMachinesUI extends JFrame {
//     private VendingMachine vendingMachines;
//     private DefaultListModel<Product> productListModel;
//     private JList<Product> productList;
//     private JTextField moneyInputField;
//     private JButton buyButton;

//     public VendingMachinesUI(VendingMachine vendingMachines) {
//         super("Vending Machines");
//         this.vendingMachines = vendingMachines;

//         // Создаем список продуктов
//         productListModel = new DefaultListModel<>();
//         for (Product product : vendingMachines.getProductAll()) {
//             productListModel.addElement(product);
//         }
//         productList = new JList<>(productListModel);

//         // Создаем поле ввода наличности
//         moneyInputField = new JTextField(10);
//         // moneyInputField.setToolTipText("Выберите товар и введите сумму, затем нажмите \"Купить товар\"");

//         // Создаем кнопку "Купить товар"
//         buyButton = new JButton("Купить товар");
//         buyButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 // Получаем выбранный продукт и введенную наличность
//                 Product selectedProduct = productList.getSelectedValue();
//                 Double money = Double.parseDouble(moneyInputField.getText());

//                 // Покупаем продукт и выводим результат в диалоговом окне
//                 String result = vendingMachines.buy(selectedProduct, money);
//                 JOptionPane.showMessageDialog(VendingMachinesUI.this, result);
//             }
//         });

//         // Создаем панель для размещения элементов интерфейса
//         JPanel panel = new JPanel(new BorderLayout());
//         JLabel instructionLabel = new JLabel("Выберите товар и введите сумму, затем нажмите \"Купить товар\"");
//         panel.add(instructionLabel, BorderLayout.NORTH);
//         panel.add(new JScrollPane(productList), BorderLayout.CENTER);
//         panel.add(moneyInputField, BorderLayout.AFTER_LAST_LINE);
//         panel.add(buyButton, BorderLayout.AFTER_LINE_ENDS);

//         // Добавляем панель на форму
//         setContentPane(panel);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         pack();
//         setLocationRelativeTo(null);
//         setVisible(true);

        
//     }
// }