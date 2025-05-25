package lib.zj.office.fc.ss.format;

/* loaded from: classes3.dex */
public class CellFormatResult {
    public final boolean applies;
    public final String text;
    public final int textColor;

    public CellFormatResult(boolean z10, String str, int i10) {
        this.applies = z10;
        this.text = str;
        this.textColor = z10 ? i10 : -1;
    }
}
