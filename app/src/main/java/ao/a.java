package ao;

import android.view.MotionEvent;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ro.d, ro.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5010a;

    @Override // ro.d
    public final void g(MotionEvent motionEvent) {
        ExecutorService executorService = ReaderPreviewActivity.U5;
        this.f5010a.getClass();
        if (motionEvent != null) {
            motionEvent.getActionMasked();
        }
    }

    @Override // ro.a
    public final void o(Object obj) {
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.f5010a;
        readerPreviewActivity.getClass();
        if (!((Boolean) obj).booleanValue()) {
            readerPreviewActivity.w4();
        }
    }
}
