package lib.zj.office.fc.poifs.filesystem;

import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes3.dex */
public class DocumentDescriptor {
    private int hashcode = 0;
    private String name;
    private POIFSDocumentPath path;

    public DocumentDescriptor(POIFSDocumentPath pOIFSDocumentPath, String str) {
        if (pOIFSDocumentPath != null) {
            if (str != null) {
                if (str.length() != 0) {
                    this.path = pOIFSDocumentPath;
                    this.name = str;
                    return;
                }
                throw new IllegalArgumentException("name cannot be empty");
            }
            throw new NullPointerException("name must not be null");
        }
        throw new NullPointerException("path must not be null");
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this != obj) {
            DocumentDescriptor documentDescriptor = (DocumentDescriptor) obj;
            if (!this.path.equals(documentDescriptor.path) || !this.name.equals(documentDescriptor.name)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.hashcode == 0) {
            this.hashcode = this.path.hashCode() ^ this.name.hashCode();
        }
        return this.hashcode;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer((this.path.length() + 1) * 40);
        for (int i10 = 0; i10 < this.path.length(); i10++) {
            stringBuffer.append(this.path.getComponent(i10));
            stringBuffer.append(PackagingURIHelper.FORWARD_SLASH_STRING);
        }
        stringBuffer.append(this.name);
        return stringBuffer.toString();
    }
}
