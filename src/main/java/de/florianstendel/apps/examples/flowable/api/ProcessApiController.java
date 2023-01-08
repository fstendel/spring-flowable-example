package de.florianstendel.apps.examples.flowable.api;

import de.florianstendel.apps.examples.flowable.core.ExampleProcessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProcessApiController {

    private ExampleProcessService exampleProcessService;

    @Autowired
    public ProcessApiController(final ExampleProcessService exampleProcessService){
        this.exampleProcessService = exampleProcessService;
    }


    private Logger _logger = LoggerFactory.getLogger(this.getClass());
    @PostMapping(value = "/startProcess")
    public void startProcess(@RequestBody StartProcessEntity startProcessEntity) {
        _logger.info("Startprocess called with "+startProcessEntity.getUrl() + " & " +startProcessEntity.getNotificalEmailAdress());

        this.exampleProcessService.handleNotificationProcessIngest(
                startProcessEntity.getUrl(),
                startProcessEntity.getNotificalEmailAdress()
        );
    }
}
