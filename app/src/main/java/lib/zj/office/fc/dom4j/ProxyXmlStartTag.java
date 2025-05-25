package lib.zj.office.fc.dom4j;

import java.util.Iterator;

/* loaded from: classes3.dex */
public class ProxyXmlStartTag {
    private Element element;
    private DocumentFactory factory = DocumentFactory.getInstance();

    public ProxyXmlStartTag() {
    }

    public int getAttributeCount() {
        Element element = this.element;
        if (element != null) {
            return element.attributeCount();
        }
        return 0;
    }

    public String getAttributeLocalName(int i10) {
        Attribute attribute;
        Element element = this.element;
        if (element != null && (attribute = element.attribute(i10)) != null) {
            return attribute.getName();
        }
        return null;
    }

    public String getAttributeNamespaceUri(int i10) {
        Attribute attribute;
        Element element = this.element;
        if (element != null && (attribute = element.attribute(i10)) != null) {
            return attribute.getNamespaceURI();
        }
        return null;
    }

    public String getAttributePrefix(int i10) {
        Attribute attribute;
        String namespacePrefix;
        Element element = this.element;
        if (element != null && (attribute = element.attribute(i10)) != null && (namespacePrefix = attribute.getNamespacePrefix()) != null && namespacePrefix.length() > 0) {
            return namespacePrefix;
        }
        return null;
    }

    public String getAttributeRawName(int i10) {
        Attribute attribute;
        Element element = this.element;
        if (element != null && (attribute = element.attribute(i10)) != null) {
            return attribute.getQualifiedName();
        }
        return null;
    }

    public String getAttributeValue(int i10) {
        Attribute attribute;
        Element element = this.element;
        if (element != null && (attribute = element.attribute(i10)) != null) {
            return attribute.getValue();
        }
        return null;
    }

    public String getAttributeValueFromName(String str, String str2) {
        Element element = this.element;
        if (element != null) {
            Iterator attributeIterator = element.attributeIterator();
            while (attributeIterator.hasNext()) {
                Attribute attribute = (Attribute) attributeIterator.next();
                if (str.equals(attribute.getNamespaceURI()) && str2.equals(attribute.getName())) {
                    return attribute.getValue();
                }
            }
            return null;
        }
        return null;
    }

    public String getAttributeValueFromRawName(String str) {
        Element element = this.element;
        if (element != null) {
            Iterator attributeIterator = element.attributeIterator();
            while (attributeIterator.hasNext()) {
                Attribute attribute = (Attribute) attributeIterator.next();
                if (str.equals(attribute.getQualifiedName())) {
                    return attribute.getValue();
                }
            }
            return null;
        }
        return null;
    }

    public DocumentFactory getDocumentFactory() {
        return this.factory;
    }

    public Element getElement() {
        return this.element;
    }

    public String getLocalName() {
        return this.element.getName();
    }

    public String getNamespaceUri() {
        return this.element.getNamespaceURI();
    }

    public String getPrefix() {
        return this.element.getNamespacePrefix();
    }

    public String getRawName() {
        return this.element.getQualifiedName();
    }

    public boolean isAttributeNamespaceDeclaration(int i10) {
        Attribute attribute;
        Element element = this.element;
        if (element != null && (attribute = element.attribute(i10)) != null) {
            return "xmlns".equals(attribute.getNamespacePrefix());
        }
        return false;
    }

    public void modifyTag(String str, String str2, String str3) {
        this.element = this.factory.createElement(str3, str);
    }

    public void resetStartTag() {
        this.element = null;
    }

    public void resetTag() {
        this.element = null;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.factory = documentFactory;
    }

    public ProxyXmlStartTag(Element element) {
        this.element = element;
    }
}
