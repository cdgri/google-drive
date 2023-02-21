package google.drive.domain;

import google.drive.NotificationApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notify_table")
@Data
public class Notify {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String message;

    public static NotifyRepository repository() {
        NotifyRepository notifyRepository = NotificationApplication.applicationContext.getBean(
            NotifyRepository.class
        );
        return notifyRepository;
    }

    public static void notifyStatus(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        Notify notify = new Notify();
        repository().save(notify);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(notify->{
            
            notify // do something
            repository().save(notify);


         });
        */

    }

    public static void notifyStatus(FileIndexed fileIndexed) {
        /** Example 1:  new item 
        Notify notify = new Notify();
        repository().save(notify);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileIndexed.get???()).ifPresent(notify->{
            
            notify // do something
            repository().save(notify);


         });
        */

    }

    public static void notifyStatus(VideofileProcessed videofileProcessed) {
        /** Example 1:  new item 
        Notify notify = new Notify();
        repository().save(notify);

        */

        /** Example 2:  finding and process
        
        repository().findById(videofileProcessed.get???()).ifPresent(notify->{
            
            notify // do something
            repository().save(notify);


         });
        */

    }
}
