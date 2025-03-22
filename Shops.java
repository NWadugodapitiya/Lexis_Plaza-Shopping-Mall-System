import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Shops  extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String xx;
    private static String z;

    Shops(){
        setLayout(null);


        //__________________________________________________________________________________________________
        Font font1 = new Font ("Microsoft Sans Serif",Font.PLAIN,32);
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

        JLabel shop1 = new JLabel ("Shop 1");
        shop1.setForeground(new Color(0, 0, 0, 255));
        shop1.setBounds(428,182,105,37);
        add(shop1);
        shop1.setFont(font1);

        JLabel shop2 = new JLabel ("Shop 2");
        shop2.setForeground(new Color(0, 0, 0, 255));
        shop2.setBounds(428,236,105,37);
        add(shop2);
        shop2.setFont(font1);

        JLabel shop3 = new JLabel ("Shop 3");
        shop3.setForeground(new Color(0, 0, 0, 255));
        shop3.setBounds(428,290,105,37);
        add(shop3);
        shop3.setFont(font1);

        JLabel shop4 = new JLabel ("Shop 4");
        shop4.setForeground(new Color(0, 0, 0, 255));
        shop4.setBounds(428,344,105,37);
        add(shop4);
        shop4.setFont(font1);

        JLabel shop5 = new JLabel ("Shop 5");
        shop5.setForeground(new Color(0, 0, 0, 255));
        shop5.setBounds(428,398,105,37);
        add(shop5);
        shop5.setFont(font1);

        JLabel shop6 = new JLabel ("Shop 6");
        shop6.setForeground(new Color(0, 0, 0, 255));
        shop6.setBounds(428,452,105,37);
        add(shop6);
        shop6.setFont(font1);

        JLabel shop7 = new JLabel ("Shop 7");
        shop7.setForeground(new Color(0, 0, 0, 255));
        shop7.setBounds(428,506,105,37);
        add(shop7);
        shop7.setFont(font1);

        JLabel shop8 = new JLabel ("Shop 8");
        shop8.setForeground(new Color(0, 0, 0, 255));
        shop8.setBounds(428,560,105,37);
        add(shop8);
        shop8.setFont(font1);

        JLabel shop9 = new JLabel ("Shop 9");
        shop9.setForeground(new Color(0, 0, 0, 255));
        shop9.setBounds(428,614,105,37);
        add(shop9);
        shop9.setFont(font1);

        JLabel shop10 = new JLabel ("Shop 10");
        shop10.setForeground(new Color(0, 0, 0, 255));
        shop10.setBounds(428,668,120,37);
        add(shop10);
        shop10.setFont(font1);

        JLabel shop11 = new JLabel ("Shop 11");
        shop11.setForeground(new Color(0, 0, 0, 255));
        shop11.setBounds(428,722,120,37);
        add(shop11);
        shop11.setFont(font1);

        JLabel shop12 = new JLabel ("Shop 12");
        shop12.setForeground(new Color(0, 0, 0, 255));
        shop12.setBounds(428,776,120,37);
        add(shop12);
        shop12.setFont(font1);

        JLabel shop13 = new JLabel ("Shop 13");
        shop13.setForeground(new Color(0, 0, 0, 255));
        shop13.setBounds(428,830,120,37);
        add(shop13);
        shop13.setFont(font1);

        JLabel shop14 = new JLabel ("Shop 14");
        shop14.setForeground(new Color(0, 0, 0, 255));
        shop14.setBounds(428,884,120,37);
        add(shop14);
        shop14.setFont(font1);

        JLabel shop15 = new JLabel ("Shop 15");
        shop15.setForeground(new Color(0, 0, 0, 255));
        shop15.setBounds(428,938,120,37);
        add(shop15);
        shop15.setFont(font1);

        JLabel shop16 = new JLabel ("Shop 16");
        shop16.setForeground(new Color(0, 0, 0, 255));
        shop16.setBounds(428,992,120,37);
        add(shop16);
        shop16.setFont(font1);

        JLabel shop17 = new JLabel ("Shop 17");
        shop17.setForeground(new Color(0, 0, 0, 255));
        shop17.setBounds(943,182,120,37);
        add(shop17);
        shop17.setFont(font1);

        JLabel shop18 = new JLabel ("Shop 18");
        shop18.setForeground(new Color(0, 0, 0, 255));
        shop18.setBounds(943,236,120,37);
        add(shop18);
        shop18.setFont(font1);

        JLabel shop19 = new JLabel ("Shop 19");
        shop19.setForeground(new Color(0, 0, 0, 255));
        shop19.setBounds(943,290,120,37);
        add(shop19);
        shop19.setFont(font1);

        JLabel shop20 = new JLabel ("Shop 20");
        shop20.setForeground(new Color(0, 0, 0, 255));
        shop20.setBounds(943,344,120,37);
        add(shop20);
        shop20.setFont(font1);

        JLabel shop21 = new JLabel ("Shop 21");
        shop21.setForeground(new Color(0, 0, 0, 255));
        shop21.setBounds(943,398,120,37);
        add(shop21);
        shop21.setFont(font1);

        JLabel shop22 = new JLabel ("Shop 22");
        shop22.setForeground(new Color(0, 0, 0, 255));
        shop22.setBounds(943,452,120,37);
        add(shop22);
        shop22.setFont(font1);

        JLabel shop23 = new JLabel ("Shop 23");
        shop23.setForeground(new Color(0, 0, 0, 255));
        shop23.setBounds(943,506,120,37);
        add(shop23);
        shop23.setFont(font1);

        JLabel shop24 = new JLabel ("Shop 24");
        shop24.setForeground(new Color(0, 0, 0, 255));
        shop24.setBounds(943,560,120,37);
        add(shop24);
        shop24.setFont(font1);

        JLabel shop25 = new JLabel ("Shop 25");
        shop25.setForeground(new Color(0, 0, 0, 255));
        shop25.setBounds(943,614,120,37);
        add(shop25);
        shop25.setFont(font1);


        JLabel check = new JLabel();
        check.setIcon(new ImageIcon(getClass().getResource("img/shop/check.png")));
        add(check);


        JTextField A1 = new JTextField();


        shop1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,190,22,22);
                A1.setText("#001");
            }
        });

        shop2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,244,22,22);
                A1.setText("#002");
            }
        });

        shop3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,298,22,22);
                A1.setText("#003");
            }
        });

        shop4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,352,22,22);
                A1.setText("#004");
            }
        });

        shop5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,406,22,22);
                A1.setText("#005");
            }
        });

        shop6.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,460,22,22);
                A1.setText("#006");
            }
        });

        shop7.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,514,22,22);
                A1.setText("#007");
            }
        });

        shop8.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop8.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,568,22,22);
                A1.setText("#008");
            }
        });

        shop9.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop9.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,622,22,22);
                A1.setText("#009");
            }
        });

        shop10.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop10.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,676,22,22);
                A1.setText("#010");
            }
        });

        shop11.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop11.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,730,22,22);
                A1.setText("#011");
            }
        });

        shop12.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop12.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,784,22,22);
                A1.setText("#012");
            }
        });

        shop13.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop13.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,838,22,22);
                A1.setText("#013");
            }
        });

        shop14.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop14.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,892,22,22);
                A1.setText("#014");
            }
        });

        shop15.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop15.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,946,22,22);
                A1.setText("#015");
            }
        });

        shop16.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop16.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(382,1000,22,22);
                A1.setText("#016");
            }
        });

        shop17.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop17.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop17.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(897,190,22,22);
                A1.setText("#017");
            }
        });

        shop18.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop18.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop18.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(897,244,22,22);
                A1.setText("#018");
            }
        });

        shop19.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop19.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop19.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(897,298,22,22);
                A1.setText("#019");
            }
        });

        shop20.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop20.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop20.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(897,352,22,22);
                A1.setText("#020");
            }
        });

        shop21.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop21.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop21.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(897,406,22,22);
                A1.setText("#021");
            }
        });

        shop22.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop22.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop22.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(897,460,22,22);
                A1.setText("#022");
            }
        });

        shop23.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop23.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop23.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(897,514,22,22);
                A1.setText("#023");
            }
        });

        shop24.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop24.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop24.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(897,568,22,22);
                A1.setText("#024");
            }
        });

        shop25.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {shop25.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));}});
        shop25.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                check.setBounds(897,622,22,22);
                A1.setText("#025");
            }
        });

//------------------------------------------------------------------------------------------------------------------------------

        DocumentListener documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
            }

            public void insertUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
            }

            private void printIt(DocumentEvent documentEvent) {
//                if(A1.getText().isEmpty()){
//                    q01.setBounds(557,55,70,20);
//
//                }
//                else {
//                    q01.setBounds(0,0,0,0);
//
//                }
//
//                try{
//                    Class.forName("com.mysql.jdbc.Driver");
//                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");
//                    Statement st = (Statement) con.createStatement();
//
//                    ResultSet rs=st.executeQuery("SELECT * FROM user_register WHERE user_id = '"+A1.getText()+ "' && User ='"+User.getText()+"'&& Grade ='"+Grade.getText()+"'&& Class ='"+G_Class.getText()+"'");
//
//                    while(rs.next()){
//                        String first_name= rs.getString("first_name");
//                        String last_name= rs.getString("last_name");
//                        String address= rs.getString("Address");
//                        String date_of_birth= rs.getString("Date_of_birth");
//                        String tel1= rs.getString("Tel1");
//
//
//                        //     user_id	first_name	last_name	password	Date_Time	User	Backup_Code	update_date	Grade	Class	Tel1		Subject	Address	Date_of_birth
//
//                        A2.setText(first_name+" "+last_name);
//                        A3.setText(address);
//                        A4.setText(date_of_birth);
//                        A5.setText(tel1);
//
//
//
//                    }
//                } catch (Exception ew) {
//                    System.out.println(ew);
//                }
            }
        };

        A1.getDocument().addDocumentListener(documentListener);

//------------------------------------------------------------------------------------------------------------------------------











        JLabel cap1 = new JLabel ("Shop id");
        cap1.setForeground(new Color(140, 140, 140, 255));
        cap1.setBounds(1448,489,200,27);
        add(cap1);
        cap1.setFont(font3);

        JLabel cap2 = new JLabel ("Shop name");
        cap2.setForeground(new Color(140, 140, 140, 255));
        cap2.setBounds(1448,557,200,27);
        add(cap2);
        cap2.setFont(font3);

        JLabel cap3 = new JLabel ("Shop category ");
        cap3.setForeground(new Color(140, 140, 140, 255));
        cap3.setBounds(1448,626,200,27);
        add(cap3);
        cap3.setFont(font3);

        JLabel cap4 = new JLabel ("Shop fees");
        cap4.setForeground(new Color(140, 140, 140, 255));
        cap4.setBounds(1448,694,200,27);
        add(cap4);
        cap4.setFont(font3);

        JLabel cap5 = new JLabel ("Shop Owner");
        cap5.setForeground(new Color(140, 140, 140, 255));
        cap5.setBounds(1448,764,200,27);
        add(cap5);
        cap5.setFont(font3);

        JLabel cap6 = new JLabel ("Registered date");
        cap6.setForeground(new Color(140, 140, 140, 255));
        cap6.setBounds(1448,832,200,27);
        add(cap6);
        cap6.setFont(font3);

        JLabel cap7 = new JLabel ("Shop Address");
        cap7.setForeground(new Color(140, 140, 140, 255));
        cap7.setBounds(1448,902,200,27);
        add(cap7);
        cap7.setFont(font3);


        //-------------------------------------------------------------------------

        JLabel emp_value1  = new JLabel ("#013");
        emp_value1.setForeground(new Color(0, 0, 0, 255));
        emp_value1.setBounds(1448,510,440,40);
        add(emp_value1);
        emp_value1.setFont(font1);

        JLabel emp_value2  = new JLabel ("Smart Dresses");
        emp_value2.setForeground(new Color(0, 0, 0, 255));
        emp_value2.setBounds(1448,579,440,40);
        add(emp_value2);
        emp_value2.setFont(font1);

        JLabel emp_value3  = new JLabel ("Cloth shop");
        emp_value3.setForeground(new Color(0, 0, 0, 255));
        emp_value3.setBounds(1448,648,440,40);
        add(emp_value3);
        emp_value3.setFont(font1);

        JLabel emp_value4 = new JLabel ("Rs. 60,000");
        emp_value4.setForeground(new Color(0, 0, 0, 255));
        emp_value4.setBounds(1448,717,440,40);
        add(emp_value4);
        emp_value4.setFont(font1);

        JLabel emp_value5 = new JLabel ("Darshana Hewage");
        emp_value5.setForeground(new Color(0, 0, 0, 255));
        emp_value5.setBounds(1448,786,440,40);
        add(emp_value5);
        emp_value5.setFont(font1);

        JLabel emp_value6 = new JLabel ("2020 / 07 / 17");
        emp_value6.setForeground(new Color(0, 0, 0, 255));
        emp_value6.setBounds(1448,855,440,40);
        add(emp_value6);
        emp_value6.setFont(font1);

        JLabel emp_value7 = new JLabel ("Shop 013");
        emp_value7.setForeground(new Color(0, 0, 0, 255));
        emp_value7.setBounds(1448,924,440,40);
        add(emp_value7);
        emp_value7.setFont(font1);










        JPanel but = new JPanel();
        but.setBounds(881,81,276,34);
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

                Rent_shop Frame = new Rent_shop();
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
        xmain.setIcon(new ImageIcon(getClass().getResource("img/shop/Shop.png")));
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

