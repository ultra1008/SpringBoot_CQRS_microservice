package com.tamerlan.account.cmd.api.commands;

import com.tamerlan.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class WithdrawFundsCommand extends BaseCommand {
    protected double amount;
}
