import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

final class IntroScreen extends JFrame implements ActionListener
{
  public static final int WIDTH         = 600;
  public static final int HEIGHT        = 300;
  public static final int LINES         = 1;
  public static final int CHAR_PER_LINE = 24;
  
  private JTextArea theText;
  private String name = "No Name Set";
  
  public IntroScreen()
  {
    setSize(WIDTH, HEIGHT);
    setTitle("Java Game Start Screen");
    
    Container ContentPane = getContentPane();
    ContentPane.setLayout(new GridLayout(10, 10, 10, 10));
    
    JMenu memoMenu = new JMenu("Character");
    JMenuItem m;
    
    m = new JMenuItem("Set Character Name");
    m.addActionListener(this);
    memoMenu.add(m);
    
    JMenuBar mBar = new JMenuBar();
    mBar.add(memoMenu);
    setJMenuBar(mBar);
    
    Panel buttonPanel = new Panel();
    buttonPanel.setBackground(Color.black);
    buttonPanel.setLayout(new FlowLayout());
    JButton worldButton = new JButton("World View");
    worldButton.addActionListener(this);
    ContentPane.add(worldButton, BorderLayout.WEST);
    btn.setPreferredSize(new Dimension(40, 40));
    
    JPanel textPanel = new JPanel();
    textPanel.setBackground(Color.GRAY);
    theText = new JTextArea(LINES, CHAR_PER_LINE);
    theText.setBackground(Color.WHITE);
    textPanel.add(theText);
    ContentPane.add(textPanel, BorderLayout.EAST);   




  }
  public void actionPerformed(ActionEvent e)
  {
    String actionCommand = e.getActionCommand();
    
    if(actionCommand.equals("Set Character Name"));
       name = theText.getText();
  }
  public static void main(String[] args)
  {
    IntroScreen gui = new IntroScreen();
    gui.setVisible(true);
  }
}
       
       
  