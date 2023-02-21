package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideofileProcessed extends AbstractEvent {

    private Long id;
    private String urlVideo;

    public VideofileProcessed(Video aggregate) {
        super(aggregate);
    }

    public VideofileProcessed() {
        super();
    }
}
