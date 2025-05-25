package lib.zj.pdfeditor;

import android.view.View;
import java.util.Map;

/* compiled from: PDFReaderView.java */
/* loaded from: classes3.dex */
public final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PDFReaderView f21740a;

    public w(PDFReaderView pDFReaderView) {
        this.f21740a = pDFReaderView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (Map.Entry<ij.d, View> entry : this.f21740a.f21384d.entrySet()) {
            if (entry.getKey().f18533a) {
                ((a0) entry.getValue()).G();
            }
        }
    }
}
