package lib.zj.office.fc.dom4j.tree;

import java.io.Writer;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Entity;
import lib.zj.office.fc.dom4j.Visitor;

/* loaded from: classes3.dex */
public abstract class AbstractEntity extends AbstractNode implements Entity {
    @Override // lib.zj.office.fc.dom4j.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String asXML() {
        return "&" + getName() + ";";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public short getNodeType() {
        return (short) 5;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getPath(Element element) {
        Element parent = getParent();
        if (parent != null && parent != element) {
            return parent.getPath(element) + "/text()";
        }
        return "text()";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getStringValue() {
        return "&" + getName() + ";";
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getUniquePath(Element element) {
        Element parent = getParent();
        if (parent != null && parent != element) {
            return parent.getUniquePath(element) + "/text()";
        }
        return "text()";
    }

    public String toString() {
        return super.toString() + " [Entity: &" + getName() + ";]";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void write(Writer writer) {
        writer.write("&");
        writer.write(getName());
        writer.write(";");
    }
}
