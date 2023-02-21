package google.drive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "View_table")
@Data
public class View {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String fileSize;
    private String fileName;
    private Boolean isIndexed;
    private Boolean isUploaded;
    private String urlVideo;
}
