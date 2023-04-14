package com.tamerlan.account.cmd.api.commands;

import com.tamerlan.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class DepositFundsCommand extends BaseCommand {
    private double amount;
}
