package lib.zj.office.fc.dom4j.tree;

import java.util.Collections;
import java.util.Map;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Node;

/* loaded from: classes3.dex */
public class FlyweightProcessingInstruction extends AbstractProcessingInstruction {
    protected String target;
    protected String text;
    protected Map values;

    public FlyweightProcessingInstruction() {
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode
    public Node createXPathResult(Element element) {
        return new DefaultProcessingInstruction(element, getTarget(), getText());
    }

    @Override // lib.zj.office.fc.dom4j.ProcessingInstruction
    public String getTarget() {
        return this.target;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getText() {
        return this.text;
    }

    @Override // lib.zj.office.fc.dom4j.ProcessingInstruction
    public String getValue(String str) {
        String str2 = (String) this.values.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // lib.zj.office.fc.dom4j.ProcessingInstruction
    public Map getValues() {
        return Collections.unmodifiableMap(this.values);
    }

    public void setTarget(String str) {
        throw new UnsupportedOperationException("This PI is read-only and cannot be modified");
    }

    public FlyweightProcessingInstruction(String str, Map map) {
        this.target = str;
        this.values = map;
        this.text = toString(map);
    }

    public FlyweightProcessingInstruction(String str, String str2) {
        this.target = str;
        this.text = str2;
        this.values = parseValues(str2);
    }
}
