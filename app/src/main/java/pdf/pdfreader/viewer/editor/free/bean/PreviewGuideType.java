// Auto-fixed: added missing class declaration
public class PreviewGuideType {
package pdf.pdfreader.viewer.editor.free.bean;

/* loaded from: classes3.dex */
public enum PreviewGuideType {
    PDFCreateEditGuide(3),
    EditModeGuide(4),
    PDFPageManageGuide(7),
    PDF2WordGuide(8),
    AIGuide(9),
    Word2PDFGuide(30),
    ReflowOpen(40),
    ReflowInquiry(50),
    InverseColor(60);
    
    private final int priority;

    PreviewGuideType(int i10) {
        this.priority = i10;
    }

    public int getPriority() {
        return this.priority;
    }
}

}
