package miniems.common.component;

import java.util.List;
import miniems.common.channel.Channel;

public interface Component {
    String id();
    List<Channel> channels();
}
