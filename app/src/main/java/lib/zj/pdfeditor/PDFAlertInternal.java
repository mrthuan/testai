package lib.zj.pdfeditor;

import lib.zj.pdfeditor.PDFAlert;

/* loaded from: classes3.dex */
public class PDFAlertInternal {
    public final int buttonGroupType;
    public int buttonPressed;
    public final int iconType;
    public final String message;
    public final String title;

    public PDFAlertInternal(String str, int i10, int i11, String str2, int i12) {
        this.message = str;
        this.iconType = i10;
        this.buttonGroupType = i11;
        this.title = str2;
        this.buttonPressed = i12;
    }

    public PDFAlert toAlert() {
        return new PDFAlert(this.message, PDFAlert.IconType.values()[this.iconType], PDFAlert.ButtonGroupType.values()[this.buttonGroupType], this.title, PDFAlert.ButtonPressed.values()[this.buttonPressed]);
    }

    public PDFAlertInternal(PDFAlert pDFAlert) {
        this.message = pDFAlert.f21159a;
        this.iconType = pDFAlert.f21160b.ordinal();
        this.buttonGroupType = pDFAlert.c.ordinal();
        this.title = pDFAlert.f21159a;
        this.buttonPressed = pDFAlert.f21162e.ordinal();
    }
}
