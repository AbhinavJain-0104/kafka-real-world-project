package abhinav.springboot;

import abhinav.springboot.entity.WikimediaData;
import abhinav.springboot.repository.WikimediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.text.Format;

@Service
public class KafkaDatabaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);
    private WikimediaDataRepository dataRepository;

    public KafkaDatabaseConsumer(WikimediaDataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @KafkaListener(topics = "wikimedia_recentchange",groupId = "myGroup")
    public void consume(String message){
        LOGGER.info(String.format("Event Message Received -> %s",message));
        WikimediaData wikimediaData=new WikimediaData();
        wikimediaData.setWikiEventData(message);

        dataRepository.save(wikimediaData);


    }
}
