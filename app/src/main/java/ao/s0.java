package ao;

import android.view.View;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextChangeColorBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextColorView;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class s0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5130a;

    public s0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5130a = readerPreviewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tn.a.b(ReaderPdfApplication.m(), ea.a.p("I2QqXz9lHHQ=", "JzBNKdx9"), ea.a.p("R2UzdCxhBmotY1tsBnIJYyhpUWs=", "PR0i5ZWi"));
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.f5130a;
        readerPreviewActivity.r3(true, false);
        readerPreviewActivity.x2(readerPreviewActivity.f26234p0);
        AddTextChangeColorBottomSheetView addTextChangeColorBottomSheetView = readerPreviewActivity.f26285x3;
        if (addTextChangeColorBottomSheetView != null) {
            int i10 = readerPreviewActivity.f26234p0;
            int childCount = ((am.z1) addTextChangeColorBottomSheetView.f28172y).c.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ((am.z1) addTextChangeColorBottomSheetView.f28172y).c.getChildAt(i11);
                if ((childAt instanceof AddTextColorView) && ((AddTextColorView) childAt).getCenterColor() == i10) {
                    if (childAt.getLeft() > 0) {
                        pdf.pdfreader.viewer.editor.free.utils.extension.g.c(((am.z1) addTextChangeColorBottomSheetView.f28172y).f1696b, childAt);
                        return;
                    } else {
                        childAt.post(new androidx.fragment.app.a1(20, addTextChangeColorBottomSheetView, childAt));
                        return;
                    }
                }
            }
        }
    }
}
