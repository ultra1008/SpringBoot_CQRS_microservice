package com.tamerlan.account.cmd.api.commands;

import com.tamerlan.cqrs.core.commands.BaseCommand;

public class CloseAccountCommand extends BaseCommand {
    public CloseAccountCommand(String id) {
        super(id);
    }
}
