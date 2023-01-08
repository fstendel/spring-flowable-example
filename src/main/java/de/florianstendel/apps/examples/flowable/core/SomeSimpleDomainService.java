package de.florianstendel.apps.examples.flowable.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SomeSimpleDomainService {

    private Logger _logger = LoggerFactory.getLogger(this.getClass());

    public void doSomeBusinessMagic() {
        _logger.info("Wow, that's easy I executed a bean!");
    }
}
