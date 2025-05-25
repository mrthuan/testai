package lib.zj.office.fc.dom4j.io;

import lib.zj.office.fc.dom4j.ElementPath;

/* loaded from: classes3.dex */
class PruningDispatchHandler extends DispatchHandler {
    @Override // lib.zj.office.fc.dom4j.io.DispatchHandler, lib.zj.office.fc.dom4j.ElementHandler
    public void onEnd(ElementPath elementPath) {
        super.onEnd(elementPath);
        if (getActiveHandlerCount() == 0) {
            elementPath.getCurrent().detach();
        }
    }
}
