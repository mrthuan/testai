package lib.zj.office.fc.dom4j.tree;

import lib.zj.office.fc.dom4j.CharacterData;
import lib.zj.office.fc.dom4j.Element;

/* loaded from: classes3.dex */
public abstract class AbstractCharacterData extends AbstractNode implements CharacterData {
    @Override // lib.zj.office.fc.dom4j.CharacterData
    public void appendText(String str) {
        setText(getText() + str);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getPath(Element element) {
        Element parent = getParent();
        if (parent != null && parent != element) {
            return parent.getPath(element) + "/text()";
        }
        return "text()";
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getUniquePath(Element element) {
        Element parent = getParent();
        if (parent != null && parent != element) {
            return parent.getUniquePath(element) + "/text()";
        }
        return "text()";
    }
}
