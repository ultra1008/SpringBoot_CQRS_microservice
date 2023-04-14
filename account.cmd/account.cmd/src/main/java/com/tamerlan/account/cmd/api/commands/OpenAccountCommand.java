package com.tamerlan.account.cmd.api.commands;

import com.tamerlan.account.common.dto.AccountType;
import com.tamerlan.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}
