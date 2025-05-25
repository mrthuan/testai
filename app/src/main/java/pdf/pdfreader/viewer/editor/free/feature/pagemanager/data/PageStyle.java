// Auto-fixed: added missing class declaration
public class PageStyle {
package pdf.pdfreader.viewer.editor.free.feature.pagemanager.data;

/* compiled from: PageStyle.kt */
/* loaded from: classes3.dex */
public enum PageStyle {
    Blank(0),
    Line(1),
    Grid(2),
    Graph(3);
    
    private final int style;

    PageStyle(int i10) {
        this.style = i10;
    }

    public final int getStyle() {
        return this.style;
    }
}

}
