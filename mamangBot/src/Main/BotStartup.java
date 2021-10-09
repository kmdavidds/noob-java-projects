package Main;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class BotStartup {
	public static void main(String[] args) throws LoginException {
		JDABuilder jda = JDABuilder.createDefault(token);
		jda.setActivity(Activity.watching("you sleep"));
		jda.setStatus(OnlineStatus.IDLE);
		jda.addEventListeners(new Commands());
		jda.build();
	}
}
