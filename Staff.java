import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Staff extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String xx;
    private static String z;

    Staff(){
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

        JLabel payments = new JLabel ("Staff");
        payments.setForeground(new Color(41, 126, 255, 255));
        payments.setBounds(382,81,170,37);
        add(payments);
        payments.setFont(font1);


        JFrame frame = new JFrame();
        JTable table = new JTable();

        Object[] columns = {"Staff Id","Name","Join date","Monthly salary","Status"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);


        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(382, 156, 1090, 897);
        frame.setLayout(null);
        add(pane);

        Object[] row = new Object[5];

//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("SELECT * FROM user_library WHERE user_id = "+Integer.parseInt(UID));
//
//            while (rs.next()) {
//
//                row[0] = rs.getString("Book_Name");
//                row[1] = xed.getText();
//                row[2] = rs.getString("Date_taken");
//                row[3] = rs.getString("Until_when");
//
//
//                // add row to the model
//                model.addRow(row);
//                //int i = table.getSelectedRow();
//
//            }
//        } catch (Exception ew) {
//            System.out.println(ew);
//        }

//------------------------------------------------------------------------------------------------------------------------------







//  Add New Worker
        JPanel but = new JPanel();
        but.setBounds(1519,156,376,48);
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

                Staff_add Frame = new Staff_add();
                dispose();

            }
        });

//  Change Staff Details
        JPanel but1 = new JPanel();
        but1.setBounds(1519,230,376,48);
        but1.setBackground(new Color(112, 112, 112, 0));
        add(but1);

        but1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                but1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        but1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Staff_add Frame = new Staff_add();
                dispose();

            }
        });

//  Remove Worker

        JPanel but2 = new JPanel();
        but2.setBounds(1519,304,376,48);
        but2.setBackground(new Color(112, 112, 112, 0));
        add(but2);

        but2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                but2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        but2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Staff_add Frame = new Staff_add();
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
        xmain.setIcon(new ImageIcon(getClass().getResource("img/staff/Staff.png")));
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

