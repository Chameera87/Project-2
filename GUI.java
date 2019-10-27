import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI implements ActionListener
{
    // instance variables - replace the example below with your own
       private JFrame frame;
       private JPanel displayPanel;
       private JPanel playPanel;

    /**
     * Constructor for objects of class GUI
     */
    
    
    public GUI()
    {
        // initialise instance variables
     makeFrame();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void makeFrame()
    {
        // put your code here
       frame = new JFrame("Snakes and Ladder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       playPanel = new JPanel();
       JPanel tablePanel = new JPanel();
       displayPanel = new JPanel();
       JPanel square = new JPanel();
 Container containerToAddComponents = frame.getContentPane();

 

JLabel label = new JLabel("Paly Panel");
    
   
  
  
    JLabel label2 = new JLabel("Display Panel");
    JLabel label3 = new JLabel("Table Panel"); 
    JLabel startGame = new JLabel("Press start to play ane game");
    JButton start = new JButton("Start");
       JButton start2 = new JButton("Start");
    
    JLabel ladder1Start = new JLabel("- Ladder 1 starts @ 4th square and finishes @ 14th square");
    JLabel ladder2Start = new JLabel("- Ladder  2 starts @ 12th square and finishes @ 22th square"); 
    JLabel linespace = new JLabel(" ");
    JLabel snake1Start = new JLabel("- Snake 1 starts @ 20th square and finishes @ 7th square");
    JLabel snake2Start = new JLabel("- Snake  2 starts @ 16th square and finishes @ 5th square");
    
    
    
    playPanel.add(label);
    playPanel.add(linespace);
    playPanel.add(linespace);
    playPanel.add(startGame);
    playPanel.add(start);
    
    JButton dice = new JButton ("Roll");
    playPanel.add(linespace);
    playPanel.add(Box.createVerticalGlue());
playPanel.add(Box.createRigidArea(new Dimension(5,5)));
    playPanel.add(dice);
    
    
    start.setActionCommand("Start");
    
   start.addActionListener(new ButtonClickListener());
   
    
    displayPanel.add(label2);
    displayPanel.add(ladder1Start);
    displayPanel.add(ladder2Start);
     displayPanel.add(linespace);
     displayPanel.add(snake1Start);
    displayPanel.add(snake2Start);
    displayPanel.add(start2);
    
     start2.setActionCommand("Start");
     
    
    tablePanel.add(label3);
    tablePanel.add(square);
    




// adding buttons into a grid 
JButton[] arrayBtn = new JButton[30];
        // add JButtons dynamically
        
        square.setLayout(new GridLayout(5,6));

       for(int i= arrayBtn.length-1; i >=0; i--) {
            arrayBtn[i] = new JButton(Integer.toString(i +1));
            square.add(arrayBtn[i]);
        }
        


   
// play panel layout        
playPanel.setLayout(new BoxLayout(playPanel, BoxLayout.Y_AXIS));
playPanel.setBorder(BorderFactory.createEmptyBorder());
playPanel.setBorder(BorderFactory.createLineBorder(Color.black));
playPanel.setPreferredSize(new Dimension(300,750));
playPanel.add(Box.createVerticalGlue());
playPanel.add(Box.createRigidArea(new Dimension(10, 10)));


// tablePanel layout
tablePanel.setLayout(new BoxLayout(tablePanel, BoxLayout.Y_AXIS));
tablePanel.setBorder(BorderFactory.createEmptyBorder(0,5,5,5));
tablePanel.setBorder(BorderFactory.createLineBorder(Color.black));
tablePanel.setPreferredSize(new Dimension(400,650));


// display panel layout
displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.Y_AXIS));
displayPanel.setBorder(BorderFactory.createEmptyBorder(0,5,5,5));
displayPanel.setPreferredSize(new Dimension(600,150));


// adding pnaels into frame
frame.add(playPanel,BorderLayout.WEST);
frame.add(tablePanel,BorderLayout.CENTER);
frame.add(displayPanel,BorderLayout.SOUTH);
frame.setPreferredSize(new Dimension(900,800));  

 
    frame.setSize(350,300);
        frame.pack();
        frame.setVisible(true);
        
  
    }
    
       public void actionPerformed(ActionEvent e)
    {
        System.out.println("Action Event Received by GUI frame which is also a listener");
    }
    
    
    public void playGame(){
    
    JLabel humanPlayer = new JLabel ("Please press Roll Dice button to start the game");
    JButton dice = new JButton ("Roll");
    
    }
    
    
    
      public static void main(String[] args)
    {
        new GUI();
    }
    
       private class ButtonClickListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();  
         
         if( command.equals( "Start" ))  {
            JPanel game = new JPanel();
            JLabel humanPlayer = new JLabel ("Please press Roll Dice button to start the game");
    JButton dice = new JButton ("Roll");
    
    //game.add(humanPlayer);
    //game.add(dice);
    //game.setLayout(new BoxLayout(game, BoxLayout.Y_AXIS));
    playPanel.add(humanPlayer);
   playPanel.add(dice);
    
            
         }
        }
    }
}  

