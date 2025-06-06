package lib.zj.office.fc.dom4j.tree;

import java.util.List;

/* loaded from: classes3.dex */
public class DefaultDocumentType extends AbstractDocumentType {
    protected String elementName;
    private List externalDeclarations;
    private List internalDeclarations;
    private String publicID;
    private String systemID;

    public DefaultDocumentType() {
    }

    @Override // lib.zj.office.fc.dom4j.DocumentType
    public String getElementName() {
        return this.elementName;
    }

    @Override // lib.zj.office.fc.dom4j.DocumentType
    public List getExternalDeclarations() {
        return this.externalDeclarations;
    }

    @Override // lib.zj.office.fc.dom4j.DocumentType
    public List getInternalDeclarations() {
        return this.internalDeclarations;
    }

    @Override // lib.zj.office.fc.dom4j.DocumentType
    public String getPublicID() {
        return this.publicID;
    }

    @Override // lib.zj.office.fc.dom4j.DocumentType
    public String getSystemID() {
        return this.systemID;
    }

    @Override // lib.zj.office.fc.dom4j.DocumentType
    public void setElementName(String str) {
        this.elementName = str;
    }

    @Override // lib.zj.office.fc.dom4j.DocumentType
    public void setExternalDeclarations(List list) {
        this.externalDeclarations = list;
    }

    @Override // lib.zj.office.fc.dom4j.DocumentType
    public void setInternalDeclarations(List list) {
        this.internalDeclarations = list;
    }

    @Override // lib.zj.office.fc.dom4j.DocumentType
    public void setPublicID(String str) {
        this.publicID = str;
    }

    @Override // lib.zj.office.fc.dom4j.DocumentType
    public void setSystemID(String str) {
        this.systemID = str;
    }

    public DefaultDocumentType(String str, String str2) {
        this.elementName = str;
        this.systemID = str2;
    }

    public DefaultDocumentType(String str, String str2, String str3) {
        this.elementName = str;
        this.publicID = str2;
        this.systemID = str3;
    }
}
