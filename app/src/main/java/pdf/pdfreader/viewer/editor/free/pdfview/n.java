package pdf.pdfreader.viewer.editor.free.pdfview;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import pdf.pdfreader.viewer.editor.free.ui.widget.TextEditorChangeColorBottomSheetView;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class n implements ViewStub.OnInflateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f26454a;

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class a implements ro.d {
        public a() {
        }

        @Override // ro.d
        public final void g(MotionEvent motionEvent) {
            ReaderPreviewActivity readerPreviewActivity = n.this.f26454a;
            readerPreviewActivity.D.removeCallbacks(readerPreviewActivity.f26238p4);
        }
    }

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class b implements TextEditorChangeColorBottomSheetView.b {
        public b() {
        }
    }

    public n(ReaderPreviewActivity readerPreviewActivity) {
        this.f26454a = readerPreviewActivity;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = (TextEditorChangeColorBottomSheetView) view;
        ReaderPreviewActivity readerPreviewActivity = this.f26454a;
        readerPreviewActivity.f26291y3 = textEditorChangeColorBottomSheetView;
        textEditorChangeColorBottomSheetView.setVisibility(4);
        readerPreviewActivity.f26291y3.J(readerPreviewActivity.f26257t2);
        readerPreviewActivity.f26291y3.setTopTouchListener(new a());
        readerPreviewActivity.f26291y3.setOnCallBackListener(new b());
    }
}
