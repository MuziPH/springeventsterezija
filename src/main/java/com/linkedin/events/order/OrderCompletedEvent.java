package com.linkedin.events.order;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class OrderCompletedEvent {
    private final Order order;
}
