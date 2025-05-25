package lib.zj.pdfeditor;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: PDFPageView.java */
/* loaded from: classes3.dex */
public final class u implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PDFPageView f21735a;

    public u(PDFPageView pDFPageView) {
        this.f21735a = pDFPageView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        WeakReference<d> weakReference;
        int i11 = PDFPageView.f21175y1;
        PDFPageView pDFPageView = this.f21735a;
        if (pDFPageView.p2() && (weakReference = pDFPageView.F0) != null && weakReference.get() != null) {
            weakReference.get().x();
        }
    }
}
