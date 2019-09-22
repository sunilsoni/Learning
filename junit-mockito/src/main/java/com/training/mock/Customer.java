package com.training.mock;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private long id;
    private String firstName;
    private String lastName;
}
