import java.awt.*;

class MyGame{
static int h = 0, m=0, s=0;  // read in timer section below
public static void main(String agrs[]){

JFrame f= new JFrame("Puzzle game")//Frame can be created without any parameter
Jpanel centre = new JPanel();

//Panel to hold 9 button at centre of frame
JPanel centre = new JPanel();
centre.setLayout(new GridLayout(3,3));

for(){

}
f.add(center);

/* 'Timer' on the top and name of player OR ' Date and Time at the bottom ' are labels*/ 

JLabel date = new JLabel("Date and time",JLabel.CENTER); // to dsplay the date and time in the centre --> JLabel.CENTRE is used
JLabel date = new JLabel("Timer");    // to dsplay the timer in the centre --> JLabel.CENTRE is used
// *******    DEFAULT VALUE of their allignment is 'Left'    ********


// Font style
Font font1 = new Font(Font.SERIF, Font.BOLD, 48); // type ,  style , size
Font font2 = new Font(Font.SANS_SERIF, 3 ,36 );   // number constants can be used for font style (here -->3 = BOLD + ITALIC)
// default font is passed in case an invalid font type is passed
// all three paramerters are necessary to be passed to Font() and in same order (string, int , int)

date.setFont(font2);  // to apply font --> .setFont() is used
date.setFont(font1);


f.add(timer, BorderLayout.NORTH);     /*  to display timer at the top  -->  BorderLayout.NORTH  */
f.add(date, BorderLayout,SOUTH);

LocalDate dt = LocalDate.now();   // to take local time of machine
LocalTime lt = LocalTime.now();   // time will not be updated automatically!!!    ******************************************

date.setText(dt + "\t" + lt);  // set method will set the date and tie to the label


//Timer 
/* it is a counter  */
//  ********* [Showing error but we cant make it final so we have to make it global variable ]  **********  int h=0, m=0, s=0;   // initially al are 0. 

timer.setText(""+h + " : " + m + " : " + s); 
//  **** WOW!!! **** setText method take as string parameter so a empty "" is concatenated before hours 

// To make multiple codes to run PARALLELY --> Thread is used
// here we want the the timer to keep running while the game is being played parallely
// Thread is in --> java.lang package


Thread timer_thread = new Thread(
  /*Lambda to implement run() */
() -> {
         while true()
         {
              s ++;

              if ( s == 60){
                m++;
                s=0;  
              }
              if ( m == 60 ){
                h++;
                m=0;
              }
try{
        Thread.sleep(1000); // takes time in milli second
        // sleep method is static method
        // sleep method throws Interrupted exception 
}
catch (InterrupterException e){}

         }
      }
);


//properties of frame
f.setSize(600,600);
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVsible(true);
