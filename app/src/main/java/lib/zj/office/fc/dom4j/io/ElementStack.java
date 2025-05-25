package lib.zj.office.fc.dom4j.io;

import androidx.activity.f;
import androidx.activity.r;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.ElementPath;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes3.dex */
class ElementStack implements ElementPath {
    private DispatchHandler handler;
    protected int lastElementIndex;
    protected Element[] stack;

    public ElementStack() {
        this(50);
    }

    private String getHandlerPath(String str) {
        if (this.handler == null) {
            setDispatchHandler(new DispatchHandler());
        }
        if (!str.startsWith(PackagingURIHelper.FORWARD_SLASH_STRING)) {
            if (getPath().equals(PackagingURIHelper.FORWARD_SLASH_STRING)) {
                return r.g(new StringBuilder(), getPath(), str);
            }
            return f.o(new StringBuilder(), getPath(), PackagingURIHelper.FORWARD_SLASH_STRING, str);
        }
        return str;
    }

    @Override // lib.zj.office.fc.dom4j.ElementPath
    public void addHandler(String str, ElementHandler elementHandler) {
        this.handler.addHandler(getHandlerPath(str), elementHandler);
    }

    public void clear() {
        this.lastElementIndex = -1;
    }

    public boolean containsHandler(String str) {
        return this.handler.containsHandler(str);
    }

    @Override // lib.zj.office.fc.dom4j.ElementPath
    public Element getCurrent() {
        return peekElement();
    }

    public DispatchHandler getDispatchHandler() {
        return this.handler;
    }

    @Override // lib.zj.office.fc.dom4j.ElementPath
    public Element getElement(int i10) {
        try {
            return this.stack[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return null;
        }
    }

    @Override // lib.zj.office.fc.dom4j.ElementPath
    public String getPath() {
        if (this.handler == null) {
            setDispatchHandler(new DispatchHandler());
        }
        return this.handler.getPath();
    }

    public Element peekElement() {
        int i10 = this.lastElementIndex;
        if (i10 < 0) {
            return null;
        }
        return this.stack[i10];
    }

    public Element popElement() {
        int i10 = this.lastElementIndex;
        if (i10 < 0) {
            return null;
        }
        Element[] elementArr = this.stack;
        this.lastElementIndex = i10 - 1;
        return elementArr[i10];
    }

    public void pushElement(Element element) {
        int length = this.stack.length;
        int i10 = this.lastElementIndex + 1;
        this.lastElementIndex = i10;
        if (i10 >= length) {
            reallocate(length * 2);
        }
        this.stack[this.lastElementIndex] = element;
    }

    public void reallocate(int i10) {
        Element[] elementArr = this.stack;
        Element[] elementArr2 = new Element[i10];
        this.stack = elementArr2;
        System.arraycopy(elementArr, 0, elementArr2, 0, elementArr.length);
    }

    @Override // lib.zj.office.fc.dom4j.ElementPath
    public void removeHandler(String str) {
        this.handler.removeHandler(getHandlerPath(str));
    }

    public void setDispatchHandler(DispatchHandler dispatchHandler) {
        this.handler = dispatchHandler;
    }

    @Override // lib.zj.office.fc.dom4j.ElementPath
    public int size() {
        return this.lastElementIndex + 1;
    }

    public ElementStack(int i10) {
        this.lastElementIndex = -1;
        this.handler = null;
        this.stack = new Element[i10];
    }
}
