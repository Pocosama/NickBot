package Utils;

import Commands.*;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.HashMap;

/**
 * Created by David on 24/04/2017.
 */
public class Main {

    private static JDA jda;
    public static final CommandParser parser = new CommandParser();

    public static HashMap<String, Command> commands = new HashMap<String, Command>();

    public static void main(String[] args) {

        try {
            jda = new JDABuilder(AccountType.BOT).addEventListener(new BotListener()).setToken("MzA1ODQ5ODc5NzI3NzAyMDE2.C97VGA.-xaAdOM8zrrurEwDhNBCj3KJq2A").buildBlocking();
            jda.setAutoReconnect(true);
        } catch (Exception e){
            e.printStackTrace();
        }
        commands.put("ping", new PingCommand());
        commands.put("lag", new LagCommand());
        commands.put("bash", new BashCommand());
        commands.put("waifu", new WaifuCommand());
        commands.put("game", new GameCommand());
        commands.put("osu", new OsuCommand());
        commands.put("help", new CommandsCommand());
        commands.put("jesus", new JesusnickCommand());
        commands.put("csgo", new CSGOCommand());
        commands.put("brawlhalla", new BrawlCommand());
        commands.put("what", new WhatCommand());
    }

    public static void handleCommand(CommandParser.CommandContainer cmd) {
        if(commands.containsKey(cmd.invoke)) {
            boolean safe = commands.get(cmd.invoke).called(cmd.args, cmd.event);

            if(safe){
                commands.get(cmd.invoke).action(cmd.args, cmd.event);
                commands.get(cmd.invoke).executed(safe, cmd.event);
            } else {
                commands.get(cmd.invoke).executed(safe, cmd.event);
            }
        }
    }
}
