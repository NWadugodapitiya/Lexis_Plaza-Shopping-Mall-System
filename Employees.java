import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Employees extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String xx;
    private static String z;

    Employees(){
        setLayout(null);


        //__________________________________________________________________________________________________
        Font font1 = new Font ("Microsoft Sans Serif",Font.PLAIN,32);
        Font font2 = new Font ("Microsoft Sans Serif",Font.PLAIN,64);
        Font font3 = new Font ("Microsoft Sans Serif",Font.PLAIN,24);






        JLabel menu1 = new JLabel ("Dashboard");
        menu1.setForeground(new Color(255, 255, 255, 255));
        menu1.setBounds(16,311,158,38);
        add(menu1);
        menu1.setFont(font1);

        JLabel menu2 = new JLabel ("Employees");
        menu2.setForeground(new Color(255, 255, 255, 255));
        menu2.setBounds(16,371,158,38);
        add(menu2);
        menu2.setFont(font1);

        JLabel menu3 = new JLabel ("Shops");
        menu3.setForeground(new Color(255, 255, 255, 255));
        menu3.setBounds(16,431,92,38);
        add(menu3);
        menu3.setFont(font1);

        JLabel menu4 = new JLabel ("Staff");
        menu4.setForeground(new Color(255, 255, 255, 255));
        menu4.setBounds(16,491,67,38);
        add(menu4);
        menu4.setFont(font1);

        JLabel menu5 = new JLabel ("Maintenance");
        menu5.setForeground(new Color(255, 255, 255, 255));
        menu5.setBounds(16,551,184,38);
        add(menu5);
        menu5.setFont(font1);

        JLabel menu6 = new JLabel ("Settings");
        menu6.setForeground(new Color(255, 255, 255, 255));
        menu6.setBounds(16,611,117,38);
        add(menu6);
        menu6.setFont(font1);

        menu1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menu1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        menu2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menu2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        menu3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menu3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        menu4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menu4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        menu5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menu5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        menu6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menu6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        menu1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Dashbord Frame = new Dashbord();
                dispose();
            }
        });


        menu2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Employees Frame = new Employees();
                dispose();
            }
        });

        menu3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                             Shops Frame = new Shops();
                dispose();
            }
        });

        menu4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                            Staff Frame = new Staff();

                dispose();
            }
        });

        menu5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                //              Maintenance Frame = new Maintenance();
                dispose();
            }
        });

        menu6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                //              Settings Frame = new Settings();
                dispose();
            }
        });











        // <--------------------------------------------------------------------menu end---------------------->

        JLabel payments = new JLabel ("Employees");
        payments.setForeground(new Color(41, 126, 255, 255));
        payments.setBounds(382,81,159,37);
        add(payments);
        payments.setFont(font1);


//------------------------------------------------------------------------------------------------------------------------------


        JLabel cap1 = new JLabel ("Employer Id");
        cap1.setForeground(new Color(140, 140, 140, 255));
        cap1.setBounds(1448,489,200,27);
        add(cap1);
        cap1.setFont(font3);

        JLabel cap2 = new JLabel ("Name");
        cap2.setForeground(new Color(140, 140, 140, 255));
        cap2.setBounds(1448,557,200,27);
        add(cap2);
        cap2.setFont(font3);

        JLabel cap3 = new JLabel ("NIC");
        cap3.setForeground(new Color(140, 140, 140, 255));
        cap3.setBounds(1448,626,200,27);
        add(cap3);
        cap3.setFont(font3);

        JLabel cap4 = new JLabel ("Contact number 1");
        cap4.setForeground(new Color(140, 140, 140, 255));
        cap4.setBounds(1448,694,200,27);
        add(cap4);
        cap4.setFont(font3);

        JLabel cap5 = new JLabel ("Contact number 2");
        cap5.setForeground(new Color(140, 140, 140, 255));
        cap5.setBounds(1448,764,200,27);
        add(cap5);
        cap5.setFont(font3);

        JLabel cap6 = new JLabel ("Date of birth");
        cap6.setForeground(new Color(140, 140, 140, 255));
        cap6.setBounds(1448,832,200,27);
        add(cap6);
        cap6.setFont(font3);

        JLabel cap7 = new JLabel ("Address");
        cap7.setForeground(new Color(140, 140, 140, 255));
        cap7.setBounds(1448,902,200,27);
        add(cap7);
        cap7.setFont(font3);

        JLabel cap8 = new JLabel ("Owned shop");
        cap8.setForeground(new Color(140, 140, 140, 255));
        cap8.setBounds(1448,970,200,27);
        add(cap8);
        cap8.setFont(font3);

        //-------------------------------------------------------------------------

        JLabel emp_value1  = new JLabel ("234432433");
        emp_value1.setForeground(new Color(0, 0, 0, 255));
        emp_value1.setBounds(1448,510,440,40);
        add(emp_value1);
        emp_value1.setFont(font1);

        JLabel emp_value2  = new JLabel ("Darshana");
        emp_value2.setForeground(new Color(0, 0, 0, 255));
        emp_value2.setBounds(1448,579,440,40);
        add(emp_value2);
        emp_value2.setFont(font1);

        JLabel emp_value3  = new JLabel ("775573767V");
        emp_value3.setForeground(new Color(0, 0, 0, 255));
        emp_value3.setBounds(1448,648,440,40);
        add(emp_value3);
        emp_value3.setFont(font1);

        JLabel emp_value4 = new JLabel ("0701223655");
        emp_value4.setForeground(new Color(0, 0, 0, 255));
        emp_value4.setBounds(1448,717,440,40);
        add(emp_value4);
        emp_value4.setFont(font1);

        JLabel emp_value5 = new JLabel ("0701223655");
        emp_value5.setForeground(new Color(0, 0, 0, 255));
        emp_value5.setBounds(1448,786,440,40);
        add(emp_value5);
        emp_value5.setFont(font1);

        JLabel emp_value6 = new JLabel ("1977 / 07 / 17");
        emp_value6.setForeground(new Color(0, 0, 0, 255));
        emp_value6.setBounds(1448,855,440,40);
        add(emp_value6);
        emp_value6.setFont(font1);

        JLabel emp_value7 = new JLabel ("114/1, vijayapura, Apura");
        emp_value7.setForeground(new Color(0, 0, 0, 255));
        emp_value7.setBounds(1448,924,440,40);
        add(emp_value7);
        emp_value7.setFont(font1);

        JLabel emp_value8 = new JLabel ("Shop 13");
        emp_value8.setForeground(new Color(0, 0, 0, 255));
        emp_value8.setBounds(1448,993,440,40);
        add(emp_value8);
        emp_value8.setFont(font1);








        JPanel but = new JPanel();
        but.setBounds(881,86,276,34);
        but.setBackground(new Color(112, 112, 112, 0));
        add(but);

        but.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                but.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        but.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Employee_payment Frame = new Employee_payment();
                dispose();

            }
        });

//------------------------------------------------------------------------------------------------------------------------------
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ESCAPE){

                    System.exit(0);

                }
            }
        });


        JLabel xmain = new JLabel();
        xmain.setIcon(new ImageIcon(getClass().getResource("img/Employees/Employee.png")));
        xmain.setBounds(0,0,1920,1080);
        add(xmain);

//------------------------------------------------------------------------------------------------------------------------------
        setSize (1920,1080);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBackground(new Color(21,21,21,0));
        setVisible(true);
    }
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        for(UIManager.LookAndFeelInfo lafInfo : UIManager.getInstalledLookAndFeels()){
        }

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        Login_From Frame = new Login_From();

        Frame.addMouseListener(new MouseListener(){
            public void mouseReleased(MouseEvent e) {

            }
            public void mousePressed(MouseEvent e) {
                mouseDownScreenCoords = e.getLocationOnScreen();
                mouseDownCompCoords = e.getPoint();
            }
            public void mouseExited(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseClicked(MouseEvent e) {
            }
        });
        Frame.addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent e) {
            }
            public void mouseDragged(MouseEvent e) {

                Point currCoords = e.getLocationOnScreen();
                Frame.setLocation(mouseDownScreenCoords.x + (currCoords.x -
                                mouseDownScreenCoords.x) - mouseDownCompCoords.x,
                        mouseDownScreenCoords.y + (currCoords.y -
                                mouseDownScreenCoords.y) - mouseDownCompCoords.y);

            }
        });
    }}

