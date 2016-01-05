package cc.blynk.common.model.messages.protocol.appllication;

import cc.blynk.common.model.messages.BinaryMessage;

import static cc.blynk.common.enums.Command.*;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 2/1/2015.
 */
public class GetGraphDataBinaryMessage extends BinaryMessage {

    public GetGraphDataBinaryMessage(int messageId, byte[] data) {
        super(messageId, GET_GRAPH_DATA_RESPONSE, data);
    }

    @Override
    public String toString() {
        return "GetGraphDataBinaryMessage{" + super.toString() + "}";
    }
}