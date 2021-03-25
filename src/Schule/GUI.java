package Schule;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 14.01.2021
 * @author 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  static int Zahl1 = 999;
  static int Zahl2 = 999;
  static int RA = 0;
  static int endzahl = 0;
  static String endtext ="";
  static boolean bZahl1 = false;
  static boolean bZahl2 = false;
  private JButton b1 = new JButton();
  private JButton b2 = new JButton();
  private JButton b3 = new JButton();
  private JButton b4 = new JButton();
  private JButton b5 = new JButton();
  private JButton b6 = new JButton();
  private JButton b7 = new JButton();
  private JButton b8 = new JButton();
  private JButton b9 = new JButton();
  private JButton bplus= new JButton();
  private JButton b0 = new JButton();
  private JButton bgleich = new JButton();
  private JButton bminus = new JButton();
  private JButton bX = new JButton();
  private JButton bgeteilt = new JButton();
  private JTextField jNumberField1 = new JTextField();
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    int frameWidth = 240; 
    int frameHeight = 514;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    cp.setBackground(Color.WHITE);
    b1.setBounds(0, 100, 75, 75);
    b1.setText("1");
    b1.setMargin(new Insets(2, 2, 2, 2));
    b1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b1_ActionPerformed(evt);
      }
    });
    cp.add(b1);
    b2.setBounds(75, 100, 75, 75);
    b2.setText("2");
    b2.setMargin(new Insets(2, 2, 2, 2));
    b2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b2_ActionPerformed(evt);
      }
    });
    b2.setBorderPainted(true);
    b2.setContentAreaFilled(true);
    cp.add(b2);
    b3.setBounds(150, 100, 75, 75);
    b3.setText("3");
    b3.setMargin(new Insets(2, 2, 2, 2));
    b3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b3_ActionPerformed(evt);
      }
    });
    cp.add(b3);
    b4.setBounds(0, 175, 75, 75);
    b4.setText("4");
    b4.setMargin(new Insets(2, 2, 2, 2));
    b4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b4_ActionPerformed(evt);
      }
    });
    cp.add(b4);
    b5.setBounds(75, 175, 75, 75);
    b5.setText("5");
    b5.setMargin(new Insets(2, 2, 2, 2));
    b5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b5_ActionPerformed(evt);
      }
    });
    cp.add(b5);
    b6.setBounds(150, 175, 75, 75);
    b6.setText("6");
    b6.setMargin(new Insets(2, 2, 2, 2));
    b6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b6_ActionPerformed(evt);
      }
    });
    cp.add(b6);
    b7.setBounds(0, 250, 75, 75);
    b7.setText("7");
    b7.setMargin(new Insets(2, 2, 2, 2));
    b7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b7_ActionPerformed(evt);
      }
    });
    cp.add(b7);
    b8.setBounds(75, 250, 75, 75);
    b8.setText("8");
    b8.setMargin(new Insets(2, 2, 2, 2));
    b8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b8_ActionPerformed(evt);
      }
    });
    cp.add(b8);
    b9.setBounds(150, 250, 75, 75);
    b9.setText("9");
    b9.setMargin(new Insets(2, 2, 2, 2));
    b9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b9_ActionPerformed(evt);
      }
    });
    cp.add(b9);
    bplus.setBounds(0, 325, 75, 75);
    bplus.setText("+");
    bplus.setMargin(new Insets(2, 2, 2, 2));
    bplus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b_ActionPerformed(evt);
      }
    });
    cp.add(bplus);
    b0.setBounds(75, 325, 75, 75);
    b0.setText("0");
    b0.setMargin(new Insets(2, 2, 2, 2));
    b0.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b0_ActionPerformed(evt);
      }
    });
    cp.add(b0);
    bgleich.setBounds(150, 325, 75, 75);
    bgleich.setText("=");
    bgleich.setMargin(new Insets(2, 2, 2, 2));
    bgleich.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bgleich_ActionPerformed(evt);
      }
    });
    cp.add(bgleich);
    bminus.setBounds(0, 400, 75, 75);
    bminus.setText("-");
    bminus.setMargin(new Insets(2, 2, 2, 2));
    bminus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bminus_ActionPerformed(evt);
      }
    });
    cp.add(bminus);
    bX.setBounds(75, 400, 75, 75);
    bX.setText("X");
    bX.setMargin(new Insets(2, 2, 2, 2));
    bX.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bX_ActionPerformed(evt);
      }
    });
    cp.add(bX);
    bgeteilt.setBounds(150, 400, 75, 75);
    bgeteilt.setText("/");
    bgeteilt.setMargin(new Insets(2, 2, 2, 2));
    bgeteilt.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bgeteilt_ActionPerformed(evt);
      }
    });
    cp.add(bgeteilt);
    jNumberField1.setBounds(0, 0, 225, 101);
    jNumberField1.setText("");
    jNumberField1.addPropertyChangeListener(new java.beans.PropertyChangeListener() { 
      public void propertyChange(java.beans.PropertyChangeEvent evt) { 
        jNumberField1_PropertyChange(evt);
      }
    });
    cp.add(jNumberField1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void b1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  if (bZahl1==false) {
		  Zahl1=1;
		  bZahl1=true;
	  }else if (bZahl2==false) {
		  Zahl2=1;
		  bZahl2=true;
	  }
  } // end of b1_ActionPerformed

  public void b2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  if (bZahl1==false) {
		  Zahl1=2;
		  bZahl1=true;
	  }else if (bZahl2==false) {
		  Zahl2=2;
		  bZahl2=true;
	  }
  } // end of b2_ActionPerformed

  public void b3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  if (bZahl1==false) {
		  Zahl1=3;
		  bZahl1=true;
	  }else if (bZahl2==false) {
		  Zahl2=3;
		  bZahl2=true;
	  }
  } // end of b3_ActionPerformed

  public void b4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  if (bZahl1==false) {
		  Zahl1=4;
		  bZahl1=true;
	  }else if (bZahl2==false) {
		  Zahl2=4;
		  bZahl2=true;
	  }
  } // end of b4_ActionPerformed

  public void b5_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  if (bZahl1==false) {
		  Zahl1=5;
		  bZahl1=true;
	  }else if (bZahl2==false) {
		  Zahl2=5;
		  bZahl2=true;
	  }
  } // end of b5_ActionPerformed

  public void b6_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  if (bZahl1==false) {
		  Zahl1=6;
		  bZahl1=true;
	  }else if (bZahl2==false) {
		  Zahl2=6;
		  bZahl2=true;
	  }
  } // end of b6_ActionPerformed

  public void b7_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  if (bZahl1==false) {
		  Zahl1=7;
		  bZahl1=true;
	  }else if (bZahl2==false) {
		  Zahl2=7;
		  bZahl2=true;
	  }
  } // end of b7_ActionPerformed

  public void b8_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  if (bZahl1==false) {
		  Zahl1=8;
		  bZahl1=true;
	  }else if (bZahl2==false) {
		  Zahl2=8;
		  bZahl2=true;
	  }
  } // end of b8_ActionPerformed

  public void b9_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  if (bZahl1==false) {
		  Zahl1=9;
		  bZahl1=true;
	  }else if (bZahl2==false) {
		  Zahl2=9;
		  bZahl2=true;
	  }
  } // end of b9_ActionPerformed

  public void b_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    RA=3;
  } // end of b_ActionPerformed

  public void b0_ActionPerformed(ActionEvent evt) {
	  if (bZahl1==false) {
		  Zahl1=0;
		  bZahl1=true;
	  }else if (bZahl2==false) {
		  Zahl2=0;
		  bZahl2=true;
	  }
    // TODO hier Quelltext einfügen
  } // end of b0_ActionPerformed

  public void bgleich_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    switch(RA) {
    case 1:
    endzahl=Zahl1-Zahl2;	
    break;
    case 2:
    endzahl=Zahl1*Zahl2;
    break;
    case 3:
    endzahl=Zahl1+Zahl2;
    break;
    case 4:
    endzahl=Zahl1/Zahl2;
    break;
    }
    endtext = Integer.toString (endzahl);
    jNumberField1.setText(endtext);
    bZahl1=false;
    bZahl1=false;
  } // end of bgleich_ActionPerformed

  public void bminus_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    RA=1;
  } // end of bminus_ActionPerformed

  public void bX_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    RA=2;
  } // end of bX_ActionPerformed

  public void bgeteilt_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    RA=4;  
  } // end of bgeteilt_ActionPerformed

  public void jNumberField1_PropertyChange(java.beans.PropertyChangeEvent evt) {
    if (evt.getPropertyName().equals("<Propertyname>")) {
      // TODO hier Quelltext einfügen

    }
  } // end of jNumberField1_PropertyChange

  // Ende Methoden
} // end of class GUI


