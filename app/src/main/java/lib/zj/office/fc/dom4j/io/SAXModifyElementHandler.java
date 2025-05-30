package lib.zj.office.fc.dom4j.io;

import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.ElementPath;

/* loaded from: classes3.dex */
class SAXModifyElementHandler implements ElementHandler {
    private ElementModifier elemModifier;
    private Element modifiedElement;

    public SAXModifyElementHandler(ElementModifier elementModifier) {
        this.elemModifier = elementModifier;
    }

    public Element getModifiedElement() {
        return this.modifiedElement;
    }

    @Override // lib.zj.office.fc.dom4j.ElementHandler
    public void onEnd(ElementPath elementPath) {
        try {
            Element current = elementPath.getCurrent();
            Element parent = current.getParent();
            if (parent != null) {
                Element modifyElement = this.elemModifier.modifyElement((Element) current.clone());
                this.modifiedElement = modifyElement;
                if (modifyElement != null) {
                    modifyElement.setParent(current.getParent());
                    this.modifiedElement.setDocument(current.getDocument());
                    parent.content().set(parent.indexOf(current), this.modifiedElement);
                }
                current.detach();
            } else if (current.isRootElement()) {
                Element modifyElement2 = this.elemModifier.modifyElement((Element) current.clone());
                this.modifiedElement = modifyElement2;
                if (modifyElement2 != null) {
                    modifyElement2.setDocument(current.getDocument());
                    current.getDocument().setRootElement(this.modifiedElement);
                }
                current.detach();
            }
            if (elementPath instanceof ElementStack) {
                ElementStack elementStack = (ElementStack) elementPath;
                elementStack.popElement();
                elementStack.pushElement(this.modifiedElement);
            }
        } catch (Exception e10) {
            throw new SAXModifyException(e10);
        }
    }

    @Override // lib.zj.office.fc.dom4j.ElementHandler
    public void onStart(ElementPath elementPath) {
        this.modifiedElement = elementPath.getCurrent();
    }
}
