package de.florianstendel.apps.examples.flowable.core.tasks;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("StoreDataDelegateBean")
public class StoreDataDelegate implements JavaDelegate {

    private Logger _logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void execute(DelegateExecution delegateExecution) {

        String fetchedData = delegateExecution.getVariable("FetchedDataVar", String.class);
        _logger.info("Cool, will try to store the following data now: " + fetchedData);
        // Do some calls for store the data here (e.g. REST-call to a service)
        _logger.info("Wohoo, data has been stored, proceeding to next task");

    }
}
