package Commands;

import Utils.Command;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by David on 24/04/2017.
 */
public class CommandsCommand implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        //System.out.println(event.getAuthor().getName());

        User user = event.getAuthor();
        user.openPrivateChannel().complete();
        user.getPrivateChannel().sendMessage("Commands are: \n-bash \n-brawlhalla \n-help \n-csgo \n-game \n-jesusnick \n-lag \n-osu \n-ping \n-waifu \n-wtf \n-spam \n-wop \n-wat").queue();

        //event.getAuthor().getPrivateChannel().sendMessage("Hello!").queue();

        //event.getPrivateChannel().sendMessage("Too lazy to tell you. Ask Poco.").queue();


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
