package ao;

import android.view.View;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class b2 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5019a;

    public b2(ReaderPreviewActivity readerPreviewActivity) {
        this.f5019a = readerPreviewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.f5019a;
        readerPreviewActivity.T2();
        readerPreviewActivity.D.postDelayed(new f0.s(25, this, view), 100L);
    }
}
