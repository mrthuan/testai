package lib.zj.office.fc.dom4j;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import lib.zj.office.fc.dom4j.tree.AbstractNode;
import lib.zj.office.fc.dom4j.tree.DefaultNamespace;
import lib.zj.office.fc.dom4j.tree.NamespaceCache;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes3.dex */
public class Namespace extends AbstractNode {
    protected static final NamespaceCache CACHE;
    public static final Namespace NO_NAMESPACE;
    public static final Namespace XML_NAMESPACE;
    private int hashCode;
    private String prefix;
    private String uri;

    static {
        NamespaceCache namespaceCache = new NamespaceCache();
        CACHE = namespaceCache;
        XML_NAMESPACE = namespaceCache.get(ContentTypes.EXTENSION_XML, "http://www.w3.org/XML/1998/namespace");
        NO_NAMESPACE = namespaceCache.get("", "");
    }

    public Namespace(String str, String str2) {
        this.prefix = str == null ? "" : str;
        this.uri = str2 == null ? "" : str2;
    }

    public static Namespace get(String str, String str2) {
        return CACHE.get(str, str2);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String asXML() {
        StringBuffer stringBuffer = new StringBuffer(10);
        String prefix = getPrefix();
        if (prefix != null && prefix.length() > 0) {
            stringBuffer.append("xmlns:");
            stringBuffer.append(prefix);
            stringBuffer.append("=\"");
        } else {
            stringBuffer.append("xmlns=\"");
        }
        stringBuffer.append(getURI());
        stringBuffer.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        return stringBuffer.toString();
    }

    public int createHashCode() {
        int hashCode = this.uri.hashCode() ^ this.prefix.hashCode();
        if (hashCode == 0) {
            return 47806;
        }
        return hashCode;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode
    public Node createXPathResult(Element element) {
        return new DefaultNamespace(element, getPrefix(), getURI());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Namespace) {
            Namespace namespace = (Namespace) obj;
            if (hashCode() == namespace.hashCode()) {
                if (this.uri.equals(namespace.getURI()) && this.prefix.equals(namespace.getPrefix())) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public short getNodeType() {
        return (short) 13;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getPath(Element element) {
        StringBuffer stringBuffer = new StringBuffer(10);
        Element parent = getParent();
        if (parent != null && parent != element) {
            stringBuffer.append(parent.getPath(element));
            stringBuffer.append(PackagingURIHelper.FORWARD_SLASH_CHAR);
        }
        stringBuffer.append(getXPathNameStep());
        return stringBuffer.toString();
    }

    public String getPrefix() {
        return this.prefix;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getStringValue() {
        return this.uri;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getText() {
        return this.uri;
    }

    public String getURI() {
        return this.uri;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getUniquePath(Element element) {
        StringBuffer stringBuffer = new StringBuffer(10);
        Element parent = getParent();
        if (parent != null && parent != element) {
            stringBuffer.append(parent.getUniquePath(element));
            stringBuffer.append(PackagingURIHelper.FORWARD_SLASH_CHAR);
        }
        stringBuffer.append(getXPathNameStep());
        return stringBuffer.toString();
    }

    public String getXPathNameStep() {
        String str = this.prefix;
        if (str != null && !"".equals(str)) {
            return "namespace::" + this.prefix;
        }
        return "namespace::*[name()='']";
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = createHashCode();
        }
        return this.hashCode;
    }

    public String toString() {
        return super.toString() + " [Namespace: prefix " + getPrefix() + " mapped to URI \"" + getURI() + "\"]";
    }

    public static Namespace get(String str) {
        return CACHE.get(str);
    }
}
