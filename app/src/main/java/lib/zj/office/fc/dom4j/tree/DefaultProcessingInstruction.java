package lib.zj.office.fc.dom4j.tree;

import java.util.Map;
import lib.zj.office.fc.dom4j.Element;

/* loaded from: classes3.dex */
public class DefaultProcessingInstruction extends FlyweightProcessingInstruction {
    private Element parent;

    public DefaultProcessingInstruction(String str, Map map) {
        super(str, map);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public Element getParent() {
        return this.parent;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public boolean isReadOnly() {
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setParent(Element element) {
        this.parent = element;
    }

    @Override // lib.zj.office.fc.dom4j.tree.FlyweightProcessingInstruction, lib.zj.office.fc.dom4j.ProcessingInstruction
    public void setTarget(String str) {
        this.target = str;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setText(String str) {
        this.text = str;
        this.values = parseValues(str);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractProcessingInstruction, lib.zj.office.fc.dom4j.ProcessingInstruction
    public void setValue(String str, String str2) {
        this.values.put(str, str2);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractProcessingInstruction, lib.zj.office.fc.dom4j.ProcessingInstruction
    public void setValues(Map map) {
        this.values = map;
        this.text = toString(map);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public boolean supportsParent() {
        return true;
    }

    public DefaultProcessingInstruction(String str, String str2) {
        super(str, str2);
    }

    public DefaultProcessingInstruction(Element element, String str, String str2) {
        super(str, str2);
        this.parent = element;
    }
}
