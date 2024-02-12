import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Min Klock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
       this.setResizable(false);

        // https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html#text
        // SimpleDateFormat
        timeFormat = new SimpleDateFormat("hh:mm:ss");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Times new roman",Font.PLAIN,50));
    //    timeLabel.setForeground(new Color(0x00FF00));
    //    timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Times new roman",Font.PLAIN,35));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Times new roman",Font.PLAIN,35));


        time = timeFormat.format(Calendar.getInstance().getTime());

        timeLabel.setText(time);

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();



    }

    private void setTime()  {
     try {
         while (true) {
             time = timeFormat.format(Calendar.getInstance().getTime());
             timeLabel.setText(time);

             day = dayFormat.format(Calendar.getInstance().getTime());
             dayLabel.setText(day);

             date = dateFormat.format(Calendar.getInstance().getTime());
             dateLabel.setText(date);

             Thread.sleep(1000);
         }
     }catch (Exception e ){
         e.printStackTrace();
     }
    }
}
