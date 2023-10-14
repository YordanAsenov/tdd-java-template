package it.xp.tdd.template;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TransactionResult {
    private Double balance;
    private Status status;
}
