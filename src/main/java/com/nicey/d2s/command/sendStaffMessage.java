package com.nicey.d2s.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.LiteralText;



public class sendStaffMessage {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register(CommandManager.literal("staffmsg")
                .then(CommandManager.literal("set").executes((sendStaffMessage::run)))); //names command, put a ")" at end of code below
        //does stuff here (register)
    }

    public static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        //does stuff here (run)
            //add the "send webhook" thingy here future nicey!
        // how to send a chat message
        context.getSource().sendFeedback(new ("Put message here", true);
        return 1;
    }
}
