import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;

public class Rent_shop extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String xx;
    private static String z;

    Rent_shop(){
        setLayout(null);


        //__________________________________________________________________________________________________
        Font font1 = new Font ("Microsoft Sans Serif",Font.PLAIN,32);
        Font font3 = new Font ("Microsoft Sans Serif",Font.PLAIN,24);
        Font Atet2 = new Font ("Microsoft Sans Serif",Font.PLAIN,30);





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


//

        JLabel payments = new JLabel ("Rent Shop");
        payments.setForeground(new Color(41, 126, 255, 255));
        payments.setBounds(382,81,170,37);
        add(payments);
        payments.setFont(font1);



        JLabel cap1 = new JLabel ("Employee ID");
        cap1.setForeground(new Color(140, 140, 140, 255));
        cap1.setBounds(386,180,200,27);
        add(cap1);
        cap1.setFont(font3);

        JLabel cap2 = new JLabel ("First name");
        cap2.setForeground(new Color(140, 140, 140, 255));
        cap2.setBounds(386,273,200,27);
        add(cap2);
        cap2.setFont(font3);

        JLabel cap3 = new JLabel ("Last name ");
        cap3.setForeground(new Color(140, 140, 140, 255));
        cap3.setBounds(386,366,200,27);
        add(cap3);
        cap3.setFont(font3);

        JLabel cap4 = new JLabel ("NIC");
        cap4.setForeground(new Color(140, 140, 140, 255));
        cap4.setBounds(386,459,200,27);
        add(cap4);
        cap4.setFont(font3);

        JLabel cap5 = new JLabel ("Email");
        cap5.setForeground(new Color(140, 140, 140, 255));
        cap5.setBounds(386,552,200,27);
        add(cap5);
        cap5.setFont(font3);

        JLabel cap6 = new JLabel ("Contact number 1");
        cap6.setForeground(new Color(140, 140, 140, 255));
        cap6.setBounds(386,645,200,27);
        add(cap6);
        cap6.setFont(font3);

        JLabel cap7 = new JLabel ("Contact number 2");
        cap7.setForeground(new Color(140, 140, 140, 255));
        cap7.setBounds(386,738,200,27);
        add(cap7);
        cap7.setFont(font3);

        JLabel cap8 = new JLabel ("Address");
        cap8.setForeground(new Color(140, 140, 140, 255));
        cap8.setBounds(386,831,200,27);
        add(cap8);
        cap8.setFont(font3);

        JLabel cap9 = new JLabel ("Shop ID");
        cap9.setForeground(new Color(140, 140, 140, 255));
        cap9.setBounds(964,180,200,27);
        add(cap9);
        cap9.setFont(font3);

        JLabel cap10 = new JLabel ("Shop name");
        cap10.setForeground(new Color(140, 140, 140, 255));
        cap10.setBounds(964,273,200,27);
        add(cap10);
        cap10.setFont(font3);

        JLabel cap11 = new JLabel ("Category ");
        cap11.setForeground(new Color(140, 140, 140, 255));
        cap11.setBounds(964,366,200,27);
        add(cap11);
        cap11.setFont(font3);

        JLabel cap12 = new JLabel ("Shop Address");
        cap12.setForeground(new Color(140, 140, 140, 255));
        cap12.setBounds(964,459,200,27);
        add(cap12);
        cap12.setFont(font3);

        JLabel cap13 = new JLabel ("Monthly fees");
        cap13.setForeground(new Color(140, 140, 140, 255));
        cap13.setBounds(964,552,200,27);
        add(cap13);
        cap13.setFont(font3);

        JLabel cap14 = new JLabel ("Contact number");
        cap14.setForeground(new Color(140, 140, 140, 255));
        cap14.setBounds(964,645,200,27);
        add(cap14);
        cap14.setFont(font3);

        JLabel cap15 = new JLabel ("Employee Picture");
        cap15.setForeground(new Color(140, 140, 140, 255));
        cap15.setBounds(1536,180,200,27);
        add(cap15);
        cap15.setFont(font3);

        JLabel cap16 = new JLabel ("Employee NIC Picture");
        cap16.setForeground(new Color(140, 140, 140, 255));
        cap16.setBounds(1536,620,255,27);
        add(cap16);
        cap16.setFont(font3);

        JTextField A1 = new JTextField();
        A1.setBounds (386,225,465,33);
        A1.setForeground(Color.BLACK);
        A1.setBackground(new Color(101, 52, 216, 0));
        A1.setBorder(null);
        A1.setEditable(true);
        A1.setOpaque(false);
        add(A1);
        A1.setFont(Atet2);

        JTextField A2 = new JTextField();
        A2.setBounds (386,316,465,33);
        A2.setForeground(Color.BLACK);
        A2.setBackground(new Color(101, 52, 216, 0));
        A2.setBorder(null);
        A2.setEditable(true);
        A2.setOpaque(false);
        add(A2);
        A2.setFont(Atet2);

        JTextField A3 = new JTextField();
        A3.setBounds (386,409,465,33);
        A3.setForeground(Color.BLACK);
        A3.setBackground(new Color(101, 52, 216, 0));
        A3.setBorder(null);
        A3.setEditable(true);
        A3.setOpaque(false);
        add(A3);
        A3.setFont(Atet2);

        JTextField A4 = new JTextField();
        A4.setBounds (386,503,465,33);
        A4.setForeground(Color.BLACK);
        A4.setBackground(new Color(101, 52, 216, 0));
        A4.setBorder(null);
        A4.setEditable(true);
        A4.setOpaque(false);
        add(A4);
        A4.setFont(Atet2);

        JTextField A5 = new JTextField();
        A5.setBounds (386,595,465,33);
        A5.setForeground(Color.BLACK);
        A5.setBackground(new Color(101, 52, 216, 0));
        A5.setBorder(null);
        A5.setEditable(true);
        A5.setOpaque(false);
        add(A5);
        A5.setFont(Atet2);

        JTextField A6 = new JTextField();
        A6.setBounds (386,688,465,33);
        A6.setForeground(Color.BLACK);
        A6.setBackground(new Color(101, 52, 216, 0));
        A6.setBorder(null);
        A6.setEditable(true);
        A6.setOpaque(false);
        add(A6);
        A6.setFont(Atet2);

        JTextField A7 = new JTextField();
        A7.setBounds (386,782,465,33);
        A7.setForeground(Color.BLACK);
        A7.setBackground(new Color(101, 52, 216, 0));
        A7.setBorder(null);
        A7.setEditable(true);
        A7.setOpaque(false);
        add(A7);
        A7.setFont(Atet2);

        JTextField A8 = new JTextField();
        A8.setBounds (386,875,465,33);
        A8.setForeground(Color.BLACK);
        A8.setBackground(new Color(101, 52, 216, 0));
        A8.setBorder(null);
        A8.setEditable(true);
        A8.setOpaque(false);
        add(A8);
        A8.setFont(Atet2);

        JTextField e1 = new JTextField();
        e1.setBounds (964,224,465,33);
        e1.setForeground(Color.BLACK);
        e1.setBackground(new Color(101, 52, 216, 0));
        e1.setBorder(null);
        e1.setEditable(true);
        e1.setOpaque(false);
        add(e1);
        e1.setFont(Atet2);

        JTextField e2 = new JTextField();
        e2.setBounds (964,317,465,33);
        e2.setForeground(Color.BLACK);
        e2.setBackground(new Color(101, 52, 216, 0));
        e2.setBorder(null);
        e2.setEditable(true);
        e2.setOpaque(false);
        add(e2);
        e2.setFont(Atet2);

        JTextField e3 = new JTextField();
        e3.setBounds (964,410,465,33);
        e3.setForeground(Color.BLACK);
        e3.setBackground(new Color(101, 52, 216, 0));
        e3.setBorder(null);
        e3.setEditable(true);
        e3.setOpaque(false);
        add(e3);
        e3.setFont(Atet2);

        JTextField e4 = new JTextField();
        e4.setBounds (964,503,465,33);
        e4.setForeground(Color.BLACK);
        e4.setBackground(new Color(101, 52, 216, 0));
        e4.setBorder(null);
        e4.setEditable(true);
        e4.setOpaque(false);
        add(e4);
        e4.setFont(Atet2);

        JTextField e5 = new JTextField();
        e5.setBounds (964,596,465,33);
        e5.setForeground(Color.BLACK);
        e5.setBackground(new Color(101, 52, 216, 0));
        e5.setBorder(null);
        e5.setEditable(true);
        e5.setOpaque(false);
        add(e5);
        e5.setFont(Atet2);

        JTextField e6 = new JTextField();
        e6.setBounds (964,689,465,33);
        e6.setForeground(Color.BLACK);
        e6.setBackground(new Color(101, 52, 216, 0));
        e6.setBorder(null);
        e6.setEditable(true);
        e6.setOpaque(false);
        add(e6);
        e6.setFont(Atet2);








//  Clear Data
        JPanel but = new JPanel();
        but.setBounds(1414,942,475,48);
        but.setBackground(new Color(112, 112, 112, 0));
        add(but);

        but.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                but.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        but.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                A1.setText("");
                A2.setText("");
                A3.setText("");
                A4.setText("");
                A5.setText("");
                A6.setText("");
                A7.setText("");
                A8.setText("");
                e1.setText("");
                e2.setText("");
                e3.setText("");
                e4.setText("");
                e5.setText("");
                e6.setText("");
            }
        });

//  Register Now

        JPanel but2 = new JPanel();
        but2.setBounds(1414,1016,475,48);
        but2.setBackground(new Color(112, 112, 112, 0));
        add(but2);

        but2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                but2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        but2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {


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
        xmain.setIcon(new ImageIcon(getClass().getResource("img/shop/Rent_shop.png")));
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

