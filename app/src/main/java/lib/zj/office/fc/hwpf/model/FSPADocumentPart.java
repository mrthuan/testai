// Auto-fixed: added missing class declaration
public class FSPADocumentPart {
package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public enum FSPADocumentPart {
    HEADER(41),
    MAIN(40);
    
    private final int fibFieldsField;

    FSPADocumentPart(int i10) {
        this.fibFieldsField = i10;
    }

    public int getFibFieldsField() {
        return this.fibFieldsField;
    }
}

}
