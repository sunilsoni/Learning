package com.training.mock;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class InvoiceStorage {

    public boolean hasOutstandingInvoice(Customer customer) {
        return true;
    }
}
