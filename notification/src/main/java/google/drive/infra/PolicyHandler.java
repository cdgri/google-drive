package google.drive.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import google.drive.config.kafka.KafkaProcessor;
import google.drive.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    NotifyRepository notifyRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploaded'"
    )
    public void wheneverFileUploaded_NotifyStatus(
        @Payload FileUploaded fileUploaded
    ) {
        FileUploaded event = fileUploaded;
        System.out.println(
            "\n\n##### listener NotifyStatus : " + fileUploaded + "\n\n"
        );

        // Sample Logic //
        Notify.notifyStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileIndexed'"
    )
    public void wheneverFileIndexed_NotifyStatus(
        @Payload FileIndexed fileIndexed
    ) {
        FileIndexed event = fileIndexed;
        System.out.println(
            "\n\n##### listener NotifyStatus : " + fileIndexed + "\n\n"
        );

        // Sample Logic //
        Notify.notifyStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='VideofileProcessed'"
    )
    public void wheneverVideofileProcessed_NotifyStatus(
        @Payload VideofileProcessed videofileProcessed
    ) {
        VideofileProcessed event = videofileProcessed;
        System.out.println(
            "\n\n##### listener NotifyStatus : " + videofileProcessed + "\n\n"
        );

        // Sample Logic //
        Notify.notifyStatus(event);
    }
}
