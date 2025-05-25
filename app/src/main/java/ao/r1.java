package ao;

import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class r1 implements cg.p<Integer, Boolean, tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5129a;

    public r1(ReaderPreviewActivity readerPreviewActivity) {
        this.f5129a = readerPreviewActivity;
    }

    @Override // cg.p
    public final tf.d invoke(Integer num, Boolean bool) {
        String p10;
        String str;
        String str2;
        String str3;
        String p11;
        Integer num2 = num;
        Boolean bool2 = bool;
        if (num2.intValue() != 2 && num2.intValue() != 3) {
            p10 = ea.a.p("RWVy", "dj0LRPrG");
        } else {
            p10 = ea.a.p("W285aQ==", "8S0NjqRg");
        }
        boolean booleanValue = bool2.booleanValue();
        String str4 = "XG4=";
        ReaderPreviewActivity readerPreviewActivity = this.f5129a;
        if (booleanValue) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pdf.pdfreader.viewer.editor.free.utils.p.d(readerPreviewActivity.f26245r1));
            sb2.append(ea.a.p("Xw==", "8vO3TRRW"));
            if (readerPreviewActivity.e3()) {
                p11 = ea.a.p("XG4=", "1HQMuui5");
            } else {
                p11 = ea.a.p("XGZm", "0E4tHf9Q");
            }
            sb2.append(p11);
            sb2.append(ea.a.p("Xw==", "MT6Ma00s"));
            sb2.append(p10);
            pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, ea.a.p("DGkydw==", "ZWzWC7w3"), ea.a.p("RWkudyx2C2UFbVtkDF81bC1jaw==", "N5zKtn8M"), sb2.toString());
        } else {
            if (num2.intValue() != 2 && num2.intValue() != 0) {
                str = "bg==";
                str2 = "KlJSLel3";
            } else {
                str = "eQ==";
                str2 = "7BWIWcQE";
            }
            String p12 = ea.a.p(str, str2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(pdf.pdfreader.viewer.editor.free.utils.p.d(readerPreviewActivity.f26245r1));
            sb3.append(ea.a.p("Xw==", "r5kMcrk6"));
            if (readerPreviewActivity.e3()) {
                str3 = "K24vP409";
            } else {
                str4 = "BGZm";
                str3 = "bjkqekpm";
            }
            sb3.append(ea.a.p(str4, str3));
            sb3.append(ea.a.p("Xw==", "rfbPSO9G"));
            sb3.append(p10);
            sb3.append(ea.a.p("Xw==", "ssssOiNQ"));
            sb3.append(p12);
            pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, ea.a.p("RWkudw==", "5aMThP1i"), ea.a.p("OWlUdyZjWG4uaSR1EF8LbFxjaw==", "N4rc3pZ4"), sb3.toString());
        }
        ReaderPreviewActivity.d2(readerPreviewActivity, num2.intValue());
        return null;
    }
}
