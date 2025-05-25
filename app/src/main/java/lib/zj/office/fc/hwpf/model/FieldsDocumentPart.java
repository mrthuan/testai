// Auto-fixed: added missing class declaration
public class FieldsDocumentPart {
package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public enum FieldsDocumentPart {
    ANNOTATIONS(19),
    ENDNOTES(48),
    FOOTNOTES(18),
    HEADER(17),
    HEADER_TEXTBOX(59),
    MAIN(16),
    TEXTBOX(57);
    
    private final int fibFieldsField;

    FieldsDocumentPart(int i10) {
        this.fibFieldsField = i10;
    }

    public int getFibFieldsField() {
        return this.fibFieldsField;
    }
}

}
