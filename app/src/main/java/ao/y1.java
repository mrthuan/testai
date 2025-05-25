package ao;

import android.view.View;
import android.view.ViewStub;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.PreviewEditGuideView;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class y1 implements ViewStub.OnInflateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5152a;

    public y1(ReaderPreviewActivity readerPreviewActivity) {
        this.f5152a = readerPreviewActivity;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        this.f5152a.X4 = (PreviewEditGuideView) view;
    }
}
