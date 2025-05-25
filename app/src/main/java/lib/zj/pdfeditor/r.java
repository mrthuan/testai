package lib.zj.pdfeditor;

import android.content.DialogInterface;

/* compiled from: PDFPageView.java */
/* loaded from: classes3.dex */
public final class r implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String[] f21570a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PDFPageView f21571b;

    /* compiled from: PDFPageView.java */
    /* loaded from: classes3.dex */
    public class a extends AsyncTask<String, Void, Void> {
        public a() {
        }

        @Override // lib.zj.pdfeditor.AsyncTask
        public final Void b(String[] strArr) {
            r.this.f21571b.G0.setFocusedWidgetChoiceSelected(new String[]{strArr[0]});
            return null;
        }

        @Override // lib.zj.pdfeditor.AsyncTask
        public final void f(Void r12) {
            r.this.f21571b.O0.run();
        }
    }

    public r(PDFPageView pDFPageView, String[] strArr) {
        this.f21571b = pDFPageView;
        this.f21570a = strArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        a aVar = new a();
        this.f21571b.N0 = aVar;
        aVar.c(this.f21570a[i10]);
    }
}
