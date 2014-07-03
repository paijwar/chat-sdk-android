package com.braunster.chatsdk.events;

import com.braunster.chatsdk.dao.BMessage;
import com.braunster.chatsdk.interfaces.AppEvents;

public abstract class MessageEventListener extends Event {

    public MessageEventListener(String tag, String threadEntityId){
        super(tag, threadEntityId);
    }

    public abstract boolean onMessageReceived(BMessage message);

}
