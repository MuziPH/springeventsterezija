package com.linkedin.events.analytics;

import com.linkedin.events.customer.CustomerRegisteredEvent;
import lombok.Data;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Data
public class AnalyticsCustomerRegistrationListener {
    private final AnalyticsService analyticsService;

    @EventListener
    @Async
    public void OnRegistrationEvent(CustomerRegisteredEvent event){
        analyticsService.registerNewCustomer(event.getCustomer());
    }
}
