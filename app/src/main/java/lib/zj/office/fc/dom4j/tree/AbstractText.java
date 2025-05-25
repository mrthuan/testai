package lib.zj.office.fc.dom4j.tree;

import java.io.Writer;
import lib.zj.office.fc.dom4j.Text;
import lib.zj.office.fc.dom4j.Visitor;

/* loaded from: classes3.dex */
public abstract class AbstractText extends AbstractCharacterData implements Text {
    @Override // lib.zj.office.fc.dom4j.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String asXML() {
        return getText();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public short getNodeType() {
        return (short) 3;
    }

    public String toString() {
        return super.toString() + " [Text: \"" + getText() + "\"]";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void write(Writer writer) {
        writer.write(getText());
    }
}
