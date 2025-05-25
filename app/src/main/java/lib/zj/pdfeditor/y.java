package lib.zj.pdfeditor;

import android.util.Base64;

/* compiled from: PDFReflowView.java */
/* loaded from: classes3.dex */
public final class y extends AsyncTask<Void, Void, byte[]> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ PDFReflowView f21741i;

    public y(PDFReflowView pDFReflowView) {
        this.f21741i = pDFReflowView;
    }

    @Override // lib.zj.pdfeditor.AsyncTask
    public final byte[] b(Void[] voidArr) {
        PDFReflowView pDFReflowView = this.f21741i;
        return pDFReflowView.f21260a.html(pDFReflowView.c);
    }

    @Override // lib.zj.pdfeditor.AsyncTask
    public final void f(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr2 != null && bArr2.length > 0) {
            this.f21741i.loadData(Base64.encodeToString(bArr2, 0), "text/html; charset=utf-8", "base64");
        }
    }
}
