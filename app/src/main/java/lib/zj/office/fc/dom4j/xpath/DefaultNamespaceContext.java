package lib.zj.office.fc.dom4j.xpath;

import java.io.Serializable;
import java.util.Iterator;
import javax.xml.namespace.NamespaceContext;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.Node;

/* loaded from: classes3.dex */
public class DefaultNamespaceContext implements NamespaceContext, Serializable {
    private final Element element;

    public DefaultNamespaceContext(Element element) {
        this.element = element;
    }

    public static DefaultNamespaceContext create(Object obj) {
        Element element;
        if (obj instanceof Element) {
            element = (Element) obj;
        } else if (obj instanceof Document) {
            element = ((Document) obj).getRootElement();
        } else if (obj instanceof Node) {
            element = ((Node) obj).getParent();
        } else {
            element = null;
        }
        if (element == null) {
            return null;
        }
        return new DefaultNamespaceContext(element);
    }

    @Override // javax.xml.namespace.NamespaceContext
    public String getNamespaceURI(String str) {
        return null;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public String getPrefix(String str) {
        return null;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public Iterator getPrefixes(String str) {
        return null;
    }

    public String translateNamespacePrefixToUri(String str) {
        Namespace namespaceForPrefix;
        if (str != null && str.length() > 0 && (namespaceForPrefix = this.element.getNamespaceForPrefix(str)) != null) {
            return namespaceForPrefix.getURI();
        }
        return null;
    }
}
