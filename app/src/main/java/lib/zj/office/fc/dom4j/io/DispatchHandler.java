package lib.zj.office.fc.dom4j.io;

import java.util.ArrayList;
import java.util.HashMap;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.ElementPath;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class DispatchHandler implements ElementHandler {
    private ElementHandler defaultHandler;
    private boolean atRoot = true;
    private String path = PackagingURIHelper.FORWARD_SLASH_STRING;
    private ArrayList pathStack = new ArrayList();
    private ArrayList handlerStack = new ArrayList();
    private HashMap handlers = new HashMap();

    public void addHandler(String str, ElementHandler elementHandler) {
        this.handlers.put(str, elementHandler);
    }

    public boolean containsHandler(String str) {
        return this.handlers.containsKey(str);
    }

    public int getActiveHandlerCount() {
        return this.handlerStack.size();
    }

    public ElementHandler getHandler(String str) {
        return (ElementHandler) this.handlers.get(str);
    }

    public String getPath() {
        return this.path;
    }

    @Override // lib.zj.office.fc.dom4j.ElementHandler
    public void onEnd(ElementPath elementPath) {
        ElementHandler elementHandler;
        HashMap hashMap = this.handlers;
        if (hashMap != null && hashMap.containsKey(this.path)) {
            ArrayList arrayList = this.handlerStack;
            arrayList.remove(arrayList.size() - 1);
            ((ElementHandler) this.handlers.get(this.path)).onEnd(elementPath);
        } else if (this.handlerStack.isEmpty() && (elementHandler = this.defaultHandler) != null) {
            elementHandler.onEnd(elementPath);
        }
        ArrayList arrayList2 = this.pathStack;
        this.path = (String) arrayList2.remove(arrayList2.size() - 1);
        if (this.pathStack.size() == 0) {
            this.atRoot = true;
        }
    }

    @Override // lib.zj.office.fc.dom4j.ElementHandler
    public void onStart(ElementPath elementPath) {
        ElementHandler elementHandler;
        Element current = elementPath.getCurrent();
        this.pathStack.add(this.path);
        if (this.atRoot) {
            this.path += current.getName();
            this.atRoot = false;
        } else {
            this.path += PackagingURIHelper.FORWARD_SLASH_STRING + current.getName();
        }
        HashMap hashMap = this.handlers;
        if (hashMap != null && hashMap.containsKey(this.path)) {
            ElementHandler elementHandler2 = (ElementHandler) this.handlers.get(this.path);
            this.handlerStack.add(elementHandler2);
            elementHandler2.onStart(elementPath);
        } else if (this.handlerStack.isEmpty() && (elementHandler = this.defaultHandler) != null) {
            elementHandler.onStart(elementPath);
        }
    }

    public ElementHandler removeHandler(String str) {
        return (ElementHandler) this.handlers.remove(str);
    }

    public void resetHandlers() {
        this.atRoot = true;
        this.path = PackagingURIHelper.FORWARD_SLASH_STRING;
        this.pathStack.clear();
        this.handlerStack.clear();
        this.handlers.clear();
        this.defaultHandler = null;
    }

    public void setDefaultHandler(ElementHandler elementHandler) {
        this.defaultHandler = elementHandler;
    }
}
