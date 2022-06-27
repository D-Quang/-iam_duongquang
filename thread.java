import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class thread extends JFrame {  //vẽ cửa sổ
    private JLabel labelClock;
 
    public thread() {
        labelClock = new JLabel();
        labelClock.setBounds(20, 80, 80, 20);
        add(labelClock);
        setSize(400, 200);
        setLayout(null);
        setVisible(true);
        // thiết lập lại đồng hồ sau mỗi 1 giây
        try {
            while (true) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int minute = calendar.get(Calendar.MINUTE);
                int second = calendar.get(Calendar.SECOND);
                labelClock.setText(((hour<10)?"0"+hour:hour)+ ":" + ((minute<10)?"0"+minute:minute) + ":" + (((second<10)?"0"+second:second)));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 

    public static void main(String[] args) {
        new thread();
    }
}