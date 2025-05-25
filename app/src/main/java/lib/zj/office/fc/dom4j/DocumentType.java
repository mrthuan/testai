package lib.zj.office.fc.dom4j;

import java.util.List;

/* loaded from: classes3.dex */
public interface DocumentType extends Node {
    String getElementName();

    List getExternalDeclarations();

    List getInternalDeclarations();

    String getPublicID();

    String getSystemID();

    void setElementName(String str);

    void setExternalDeclarations(List list);

    void setInternalDeclarations(List list);

    void setPublicID(String str);

    void setSystemID(String str);
}
