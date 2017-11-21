package io.ahababo.bot.skills.drinking;

import io.ahababo.bot.Localization;
import io.ahababo.bot.skills.BasicSkill;
import io.ahababo.bot.webserver.WebServer;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;

public class BeerSkill extends BasicSkill {
    @Override
    public SendMessage handle(Message msg) {
        WebServer.getInstance().enableBeer();
        return new SendMessage()
                .setText(Localization.getInstance().get("Beer", "Ready"))
                .setChatId(msg.getChatId());
    }
}
