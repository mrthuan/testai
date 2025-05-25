package lib.zj.office.fc.dom4j.tree;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.Writer;
import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.Visitor;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes3.dex */
public abstract class AbstractAttribute extends AbstractNode implements Attribute {
    @Override // lib.zj.office.fc.dom4j.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String asXML() {
        return getQualifiedName() + "=\"" + getValue() + OperatorName.SHOW_TEXT_LINE_AND_SPACE;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode
    public Node createXPathResult(Element element) {
        return new DefaultAttribute(element, getQName(), getValue());
    }

    @Override // lib.zj.office.fc.dom4j.Attribute
    public Object getData() {
        return getValue();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getName() {
        return getQName().getName();
    }

    @Override // lib.zj.office.fc.dom4j.Attribute
    public Namespace getNamespace() {
        return getQName().getNamespace();
    }

    @Override // lib.zj.office.fc.dom4j.Attribute
    public String getNamespacePrefix() {
        return getQName().getNamespacePrefix();
    }

    public String getNamespaceURI() {
        return getQName().getNamespaceURI();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public short getNodeType() {
        return (short) 2;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getPath(Element element) {
        StringBuffer stringBuffer = new StringBuffer();
        Element parent = getParent();
        if (parent != null && parent != element) {
            stringBuffer.append(parent.getPath(element));
            stringBuffer.append(PackagingURIHelper.FORWARD_SLASH_STRING);
        }
        stringBuffer.append("@");
        String namespaceURI = getNamespaceURI();
        String namespacePrefix = getNamespacePrefix();
        if (namespaceURI != null && namespaceURI.length() != 0 && namespacePrefix != null && namespacePrefix.length() != 0) {
            stringBuffer.append(getQualifiedName());
        } else {
            stringBuffer.append(getName());
        }
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.dom4j.Attribute
    public String getQualifiedName() {
        return getQName().getQualifiedName();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getText() {
        return getValue();
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getUniquePath(Element element) {
        StringBuffer stringBuffer = new StringBuffer();
        Element parent = getParent();
        if (parent != null && parent != element) {
            stringBuffer.append(parent.getUniquePath(element));
            stringBuffer.append(PackagingURIHelper.FORWARD_SLASH_STRING);
        }
        stringBuffer.append("@");
        String namespaceURI = getNamespaceURI();
        String namespacePrefix = getNamespacePrefix();
        if (namespaceURI != null && namespaceURI.length() != 0 && namespacePrefix != null && namespacePrefix.length() != 0) {
            stringBuffer.append(getQualifiedName());
        } else {
            stringBuffer.append(getName());
        }
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.dom4j.Attribute
    public void setData(Object obj) {
        String obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            obj2 = obj.toString();
        }
        setValue(obj2);
    }

    @Override // lib.zj.office.fc.dom4j.Attribute
    public void setNamespace(Namespace namespace) {
        throw new UnsupportedOperationException("This Attribute is read only and cannot be changed");
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setText(String str) {
        setValue(str);
    }

    @Override // lib.zj.office.fc.dom4j.Attribute
    public void setValue(String str) {
        throw new UnsupportedOperationException("This Attribute is read only and cannot be changed");
    }

    public String toString() {
        return super.toString() + " [Attribute: name " + getQualifiedName() + " value \"" + getValue() + "\"]";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void write(Writer writer) {
        writer.write(getQualifiedName());
        writer.write("=\"");
        writer.write(getValue());
        writer.write(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
    }
}
