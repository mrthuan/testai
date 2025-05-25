package lib.zj.office.fc.dom4j.tree;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import lib.zj.office.fc.dom4j.CDATA;
import lib.zj.office.fc.dom4j.Visitor;

/* loaded from: classes3.dex */
public abstract class AbstractCDATA extends AbstractCharacterData implements CDATA {
    @Override // lib.zj.office.fc.dom4j.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String asXML() {
        StringWriter stringWriter = new StringWriter();
        try {
            write(stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public short getNodeType() {
        return (short) 4;
    }

    public String toString() {
        return super.toString() + " [CDATA: \"" + getText() + "\"]";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void write(Writer writer) {
        writer.write("<![CDATA[");
        if (getText() != null) {
            writer.write(getText());
        }
        writer.write("]]>");
    }
}
