package cc.blynk.server.core.model.widgets.outputs;

import cc.blynk.server.core.model.enums.GraphPeriod;
import cc.blynk.server.core.model.enums.PinType;
import cc.blynk.server.core.model.widgets.MultiPinWidget;
import io.netty.channel.Channel;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 12.08.15.
 */
public class HistoryGraph extends MultiPinWidget {

    public GraphPeriod period;

    public boolean showLegends;
    
    @Override
    public boolean isSame(byte pinIn, PinType pinType) {
        return false;
    }

    @Override
    public boolean isSplitMode() {
        return false;
    }

    @Override
    public void updateIfSame(byte pin, PinType type, String value) {
        //logger has no data to display. so no need to update values
    }

    @Override
    public void sendSyncOnActivate(Channel appChannel, int dashId) {
    }

    @Override
    public String getModeType() {
        return null;
    }

    @Override
    public String makeHardwareBody() {
        return null;
    }

    @Override
    public int getPrice() {
        return 900;
    }
}
