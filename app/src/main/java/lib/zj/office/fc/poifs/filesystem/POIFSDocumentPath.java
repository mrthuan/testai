package lib.zj.office.fc.poifs.filesystem;

import java.io.File;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public class POIFSDocumentPath {
    private static final POILogger log = POILogFactory.getLogger(POIFSDocumentPath.class);
    private String[] components;
    private int hashcode;

    public POIFSDocumentPath(String[] strArr) {
        this.hashcode = 0;
        if (strArr == null) {
            this.components = new String[0];
            return;
        }
        this.components = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str != null && str.length() != 0) {
                this.components[i10] = strArr[i10];
            } else {
                throw new IllegalArgumentException("components cannot contain null or empty strings");
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this != obj) {
            POIFSDocumentPath pOIFSDocumentPath = (POIFSDocumentPath) obj;
            if (pOIFSDocumentPath.components.length != this.components.length) {
                return false;
            }
            int i10 = 0;
            while (true) {
                String[] strArr = this.components;
                if (i10 >= strArr.length) {
                    break;
                } else if (!pOIFSDocumentPath.components[i10].equals(strArr[i10])) {
                    return false;
                } else {
                    i10++;
                }
            }
        }
        return true;
    }

    public String getComponent(int i10) {
        return this.components[i10];
    }

    public POIFSDocumentPath getParent() {
        int length = this.components.length - 1;
        if (length < 0) {
            return null;
        }
        POIFSDocumentPath pOIFSDocumentPath = new POIFSDocumentPath(null);
        String[] strArr = new String[length];
        pOIFSDocumentPath.components = strArr;
        System.arraycopy(this.components, 0, strArr, 0, length);
        return pOIFSDocumentPath;
    }

    public int hashCode() {
        if (this.hashcode == 0) {
            int i10 = 0;
            while (true) {
                String[] strArr = this.components;
                if (i10 >= strArr.length) {
                    break;
                }
                this.hashcode = strArr[i10].hashCode() + this.hashcode;
                i10++;
            }
        }
        return this.hashcode;
    }

    public int length() {
        return this.components.length;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int length = length();
        stringBuffer.append(File.separatorChar);
        for (int i10 = 0; i10 < length; i10++) {
            stringBuffer.append(getComponent(i10));
            if (i10 < length - 1) {
                stringBuffer.append(File.separatorChar);
            }
        }
        return stringBuffer.toString();
    }

    public POIFSDocumentPath() {
        this.hashcode = 0;
        this.components = new String[0];
    }

    public POIFSDocumentPath(POIFSDocumentPath pOIFSDocumentPath, String[] strArr) {
        this.hashcode = 0;
        if (strArr == null) {
            this.components = new String[pOIFSDocumentPath.components.length];
        } else {
            this.components = new String[pOIFSDocumentPath.components.length + strArr.length];
        }
        int i10 = 0;
        while (true) {
            String[] strArr2 = pOIFSDocumentPath.components;
            if (i10 >= strArr2.length) {
                break;
            }
            this.components[i10] = strArr2[i10];
            i10++;
        }
        if (strArr != null) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str = strArr[i11];
                if (str != null) {
                    if (str.length() == 0) {
                        log.log(POILogger.WARN, "Directory under " + pOIFSDocumentPath + " has an empty name, not all OLE2 readers will handle this file correctly!");
                    }
                    this.components[pOIFSDocumentPath.components.length + i11] = strArr[i11];
                } else {
                    throw new IllegalArgumentException("components cannot contain null");
                }
            }
        }
    }
}
