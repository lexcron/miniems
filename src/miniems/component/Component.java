package miniems.component;

import java.util.List;
import miniems.channel.Channel;

public interface Component {
    String id();
    List<Channel<?>> channels();
}
