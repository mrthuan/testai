package lib.zj.office.fc.dom4j.tree;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.dom4j.DocumentType;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Visitor;

/* loaded from: classes3.dex */
public abstract class AbstractDocumentType extends AbstractNode implements DocumentType {
    @Override // lib.zj.office.fc.dom4j.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String asXML() {
        boolean z10;
        StringBuffer stringBuffer = new StringBuffer("<!DOCTYPE ");
        stringBuffer.append(getElementName());
        String publicID = getPublicID();
        if (publicID != null && publicID.length() > 0) {
            stringBuffer.append(" PUBLIC \"");
            stringBuffer.append(publicID);
            stringBuffer.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            z10 = true;
        } else {
            z10 = false;
        }
        String systemID = getSystemID();
        if (systemID != null && systemID.length() > 0) {
            if (!z10) {
                stringBuffer.append(" SYSTEM");
            }
            stringBuffer.append(" \"");
            stringBuffer.append(systemID);
            stringBuffer.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        }
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getName() {
        return getElementName();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public short getNodeType() {
        return (short) 10;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getPath(Element element) {
        return "";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getText() {
        List internalDeclarations = getInternalDeclarations();
        if (internalDeclarations != null && internalDeclarations.size() > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = internalDeclarations.iterator();
            if (it.hasNext()) {
                stringBuffer.append(it.next().toString());
                while (it.hasNext()) {
                    Object next = it.next();
                    stringBuffer.append("\n");
                    stringBuffer.append(next.toString());
                }
            }
            return stringBuffer.toString();
        }
        return "";
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getUniquePath(Element element) {
        return "";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setName(String str) {
        setElementName(str);
    }

    public String toString() {
        return super.toString() + " [DocumentType: " + asXML() + "]";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void write(Writer writer) {
        boolean z10;
        writer.write("<!DOCTYPE ");
        writer.write(getElementName());
        String publicID = getPublicID();
        if (publicID != null && publicID.length() > 0) {
            writer.write(" PUBLIC \"");
            writer.write(publicID);
            writer.write(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            z10 = true;
        } else {
            z10 = false;
        }
        String systemID = getSystemID();
        if (systemID != null && systemID.length() > 0) {
            if (!z10) {
                writer.write(" SYSTEM");
            }
            writer.write(" \"");
            writer.write(systemID);
            writer.write(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        }
        List internalDeclarations = getInternalDeclarations();
        if (internalDeclarations != null && internalDeclarations.size() > 0) {
            writer.write(" [");
            for (Object obj : internalDeclarations) {
                writer.write("\n  ");
                writer.write(obj.toString());
            }
            writer.write("\n]");
        }
        writer.write(">");
    }
}
