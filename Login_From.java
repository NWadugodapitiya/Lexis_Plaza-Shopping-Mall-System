import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login_From extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String xx;
    private static String z;
    Login_From(){
        setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------
        JPanel cbut = new JPanel();
        cbut.setBounds(873,930,176,27);
        cbut.setBackground(new Color(112, 112, 112, 0));
        add(cbut);


        cbut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cbut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        JLabel a = new JLabel();
        a.setIcon(new ImageIcon(getClass().getResource("img/login/Intro.png")));
        a.setBounds(0,0,1920,1080);
        add(a);
//--------------------------------------
        cbut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Thread sing = new Thread(){
                    public void run (){
                        for (int i = 0; i>-1090; i=i-5) {

                            a.setBounds(0,i,1920,1080);
                            cbut.setBounds(0,0,0,0);

                            try{
                                sleep(1);
                            }catch(InterruptedException ex){}
                        }
                    }
                };
                sing.start();
            }
        });

        JTextField t1 = new JTextField();
        t1.setBounds (1282,478,535,56);
        t1.setForeground(Color.BLACK);
        t1.setBackground(new Color(00, 00, 00, 0));
        t1.setBorder(null);
        t1.setEditable(true);
        t1.setOpaque(false);
        add(t1);
        Font Atetl = new Font ("calibri",Font.PLAIN,50);
        t1.setFont(Atetl);


        JPasswordField t2 =new JPasswordField();
        t2.setBounds(1282,630,535,56);
        t2.setForeground(Color.black);
        t2.setBorder(null);
        t2.setEditable(true);
        t2.setOpaque(false);
        add(t2);
        Font t22 = new Font ("calibri",Font.BOLD,35);
        t2.setFont(t22);

        //   User Name

        JLabel l3 = new JLabel ("User ID");
        l3.setForeground(new Color(112, 112, 112, 255));
        l3.setBounds(1273,437,100,27);
        add(l3);
        Font Atel3 = new Font ("Microsoft Sans Serif",Font.BOLD,24);
        l3.setFont(Atel3);

        //   Password

        JLabel V3 = new JLabel ("Password");
        V3.setForeground(new Color(112, 112, 112, 255));
        V3.setBounds(1273,585,150,27);
        add(V3);
        Font AteV3 = new Font ("Microsoft Sans Serif",Font.BOLD,24);
        V3.setFont(AteV3);


      // Logo

        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon(getClass().getResource("img/login/Login_logo.png")));
        logo.setBounds(191,204,656,365);
        add(logo);

//----------------------------------------------------------------------------------------------------------------------
// Buttons






        JPanel but = new JPanel();
        but.setBounds(1273,748,552,68);
        but.setBackground(new Color(112, 112, 112, 0));
        add(but);

        JLabel lo = new JLabel ("Login");
        lo.setForeground(new Color(255, 255, 255, 255));
        lo.setBounds(1510,764,82,38);
        add(lo);
        Font log = new Font ("Microsoft Sans Serif",Font.PLAIN,32);
        lo.setFont(log);

        but.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                but.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

//----------------------------------------------------------------------------------------------------------------------
        t1.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ESCAPE){

                    System.exit(0);

                }
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        but.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                if(t1.getText().isEmpty() && t2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, " Type Item User ID and Password ","Type Item User ID and Password ",JOptionPane.WARNING_MESSAGE);
                } else{

                    Login_User df = new Login_User();

                    String us = t1.getText();
                    df.setUserid(us);

                    String ps = t2.getText();
                    df.setPassword(ps);


                    if(df.getUsname().equals("success")) {
                        JOptionPane.showMessageDialog(null, " Login Success", "Login ok ", JOptionPane.WARNING_MESSAGE);
                        Dashbord Frame = new Dashbord();
                        dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid User ID or Password ","Invalid User ID or Password",JOptionPane.ERROR_MESSAGE);

                        Login_From Frame = new Login_From();
                        dispose();
                    }


            }}
        });










//------------------------------------------------------------------------------------------------------------------------------
        JLabel xmain = new JLabel();
        xmain.setIcon(new ImageIcon(getClass().getResource("img/login/Login.png")));
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
    }
    public static String userid(){
        return z;
    }

}