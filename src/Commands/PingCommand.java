package Commands;

import Utils.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by David on 24/04/2017.
 */
public class PingCommand implements Command{

    //private final String HELP = "USAGE: ~!ping";

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        event.getTextChannel().sendMessage("I HAVE 99999999 PING WHAT THE FUCK").queue();
    }

    @Override
    public String help() {
        return null;
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {
        return;
    }

}
