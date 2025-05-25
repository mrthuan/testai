package lib.zj.office.fc.dom4j.io;

import a6.h;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;

/* loaded from: classes3.dex */
class PruningElementStack extends ElementStack {
    private ElementHandler elementHandler;
    private int matchingElementIndex;
    private String[] path;

    public PruningElementStack(String[] strArr, ElementHandler elementHandler) {
        this.path = strArr;
        this.elementHandler = elementHandler;
        checkPath();
    }

    private void checkPath() {
        String[] strArr = this.path;
        if (strArr.length >= 2) {
            this.matchingElementIndex = strArr.length - 2;
            return;
        }
        throw new RuntimeException(h.g(new StringBuilder("Invalid path of length: "), this.path.length, " it must be greater than 2"));
    }

    public void pathMatches(Element element, Element element2) {
        this.elementHandler.onEnd(this);
        element.remove(element2);
    }

    @Override // lib.zj.office.fc.dom4j.io.ElementStack
    public Element popElement() {
        Element popElement = super.popElement();
        int i10 = this.lastElementIndex;
        if (i10 == this.matchingElementIndex && i10 >= 0 && validElement(popElement, i10 + 1)) {
            Element element = null;
            int i11 = 0;
            Element element2 = null;
            while (true) {
                if (i11 <= this.lastElementIndex) {
                    element2 = this.stack[i11];
                    if (!validElement(element2, i11)) {
                        break;
                    }
                    i11++;
                } else {
                    element = element2;
                    break;
                }
            }
            if (element != null) {
                pathMatches(element, popElement);
            }
        }
        return popElement;
    }

    public boolean validElement(Element element, int i10) {
        String str = this.path[i10];
        String name = element.getName();
        if (str == name) {
            return true;
        }
        if (str != null && name != null) {
            return str.equals(name);
        }
        return false;
    }

    public PruningElementStack(String[] strArr, ElementHandler elementHandler, int i10) {
        super(i10);
        this.path = strArr;
        this.elementHandler = elementHandler;
        checkPath();
    }
}
