package lib.zj.office.fc.dom4j;

/* loaded from: classes3.dex */
public interface Attribute extends Node {
    Object getData();

    Namespace getNamespace();

    String getNamespacePrefix();

    String getNamespaceURI();

    QName getQName();

    String getQualifiedName();

    String getValue();

    void setData(Object obj);

    void setNamespace(Namespace namespace);

    void setValue(String str);
}
