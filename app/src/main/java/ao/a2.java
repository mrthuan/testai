package ao;

import android.view.View;
import android.view.ViewStub;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.PreviewCreateEditGuideView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class a2 implements ViewStub.OnInflateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5013a;

    public a2(ReaderPreviewActivity readerPreviewActivity) {
        this.f5013a = readerPreviewActivity;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        this.f5013a.Y4 = (PreviewCreateEditGuideView) view;
    }
}
