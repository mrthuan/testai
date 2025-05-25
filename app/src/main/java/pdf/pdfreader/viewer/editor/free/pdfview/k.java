package pdf.pdfreader.viewer.editor.free.pdfview;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class k implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public int f26439a = 0;

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f26440a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup.MarginLayoutParams f26441b;

        public a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f26440a = view;
            this.f26441b = marginLayoutParams;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26440a.setLayoutParams(this.f26441b);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = this.f26439a;
        if (i18 == 0) {
            this.f26439a = view.getMeasuredHeight();
        } else if (i18 == view.getMeasuredHeight()) {
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i19 = marginLayoutParams.topMargin;
            if (i19 < 0 && (-i19) == this.f26439a) {
                marginLayoutParams.topMargin = -view.getMeasuredHeight();
                view.post(new a(view, marginLayoutParams));
            }
            this.f26439a = view.getMeasuredHeight();
        }
    }
}
