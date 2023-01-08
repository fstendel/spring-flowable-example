package de.florianstendel.apps.examples.flowable.core.tasks;

import de.florianstendel.apps.examples.flowable.core.SomeSimpleDomainService;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "FetchFromUrlDelegateBean")
public class FetchFromUrlDelegate implements JavaDelegate {

    private Logger _logger = LoggerFactory.getLogger(this.getClass());

    private SomeSimpleDomainService someSimpleDomainService;

    @Autowired
    public FetchFromUrlDelegate(final SomeSimpleDomainService someSimpleDomainService) {
        this.someSimpleDomainService = someSimpleDomainService;
    }
    @Override
    public void execute(DelegateExecution delegateExecution) {
        String inputValue = (String) delegateExecution.getVariable("UrlToFetch");

        // Do some calls for fetching the data here (e.g. REST-call to a service)
        _logger.info("Hey, I just fetched some news from: "+inputValue);

        String dummyFetchedData = "[DataFetchedFrom: " + inputValue+"]";
        delegateExecution.setVariable("FetchedDataVar", dummyFetchedData);

        someSimpleDomainService.doSomeBusinessMagic();
    }
}
