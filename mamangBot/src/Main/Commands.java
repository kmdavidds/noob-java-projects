package Main;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split(" ");
		if(args[0].equalsIgnoreCase("makasi")) {
			event.getChannel().sendMessage("sama-sama").queue();
		}
		if(args[0].equalsIgnoreCase("terimakasih")) {
			event.getChannel().sendMessage("sama-sama").queue();
		}
	}
}
