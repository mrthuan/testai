package lib.zj.office.fc.dom4j.tree;

import java.io.Writer;
import lib.zj.office.fc.dom4j.Comment;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Visitor;

/* loaded from: classes3.dex */
public abstract class AbstractComment extends AbstractCharacterData implements Comment {
    @Override // lib.zj.office.fc.dom4j.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String asXML() {
        return "<!--" + getText() + "-->";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public short getNodeType() {
        return (short) 8;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractCharacterData, lib.zj.office.fc.dom4j.Node
    public String getPath(Element element) {
        Element parent = getParent();
        if (parent != null && parent != element) {
            return parent.getPath(element) + "/comment()";
        }
        return "comment()";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractCharacterData, lib.zj.office.fc.dom4j.Node
    public String getUniquePath(Element element) {
        Element parent = getParent();
        if (parent != null && parent != element) {
            return parent.getUniquePath(element) + "/comment()";
        }
        return "comment()";
    }

    public String toString() {
        return super.toString() + " [Comment: \"" + getText() + "\"]";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void write(Writer writer) {
        writer.write("<!--");
        writer.write(getText());
        writer.write("-->");
    }
}
