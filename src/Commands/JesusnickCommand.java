package Commands;

import Utils.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.io.File;

/**
 * Created by David on 24/04/2017.
 */
public class JesusnickCommand implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        try {
            event.getTextChannel().sendFile(new File("C:\\Users\\David\\Desktop\\DiscordBot\\src\\Images\\jesusnick.JPG"), null).queue();
        } catch (Exception e){
            e.printStackTrace();
        }
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
