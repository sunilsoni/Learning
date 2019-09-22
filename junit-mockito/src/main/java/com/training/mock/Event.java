package com.training.mock;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private Type type;
    private String customerName;
    private LocalDate timestamp;
    public enum Type {REMINDER_SENT, REGISTRATION, INVOICE_ISSUED, PAYMENT, SETTLEMENT}
}
