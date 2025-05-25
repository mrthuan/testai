package ao;

import android.view.MotionEvent;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.TextEditorChangeColorBottomSheetView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements ro.d, androidx.activity.result.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5075a;

    public /* synthetic */ j(ReaderPreviewActivity readerPreviewActivity) {
        this.f5075a = readerPreviewActivity;
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        ReaderPreviewActivity.b2(this.f5075a, (Map) obj);
    }

    @Override // ro.d
    public final void g(MotionEvent motionEvent) {
        TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView;
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.f5075a;
        readerPreviewActivity.getClass();
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && (textEditorChangeColorBottomSheetView = readerPreviewActivity.f26291y3) != null && textEditorChangeColorBottomSheetView.H()) {
            readerPreviewActivity.D.post(readerPreviewActivity.f26238p4);
        }
    }
}
