// Auto-fixed: added missing class declaration
public class NoteType {
package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public enum NoteType {
    ENDNOTE(46, 47),
    FOOTNOTE(2, 3);
    
    private final int fibDescriptorsFieldIndex;
    private final int fibTextPositionsFieldIndex;

    NoteType(int i10, int i11) {
        this.fibDescriptorsFieldIndex = i10;
        this.fibTextPositionsFieldIndex = i11;
    }

    public int getFibDescriptorsFieldIndex() {
        return this.fibDescriptorsFieldIndex;
    }

    public int getFibTextPositionsFieldIndex() {
        return this.fibTextPositionsFieldIndex;
    }
}

}
