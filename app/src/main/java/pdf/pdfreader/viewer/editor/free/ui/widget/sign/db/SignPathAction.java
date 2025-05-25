// Auto-fixed: added missing class declaration
public class SignPathAction {
package pdf.pdfreader.viewer.editor.free.ui.widget.sign.db;

/* loaded from: classes3.dex */
public enum SignPathAction {
    LineTo(1),
    MoveTo(2),
    QuadTo(3);
    
    private final int type;

    SignPathAction(int i10) {
        this.type = i10;
    }

    public int getType() {
        return this.type;
    }
}

}
