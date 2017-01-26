package utils;

import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

public class STATICS {

    public static Game GAME = new Game() {
        public String getName() {
            return "Currently in development.";
        }

        public String getUrl() {
            return "http://zekro.jimdo.com";
        }

        public GameType getType() {
            return GameType.DEFAULT;
        }
    };

    public static OnlineStatus STATUS = OnlineStatus.ONLINE;

}
