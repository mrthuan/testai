package kl;

import android.text.Layout;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import b1.m;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: TextView.kt */
/* loaded from: classes3.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f19866a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f19867b = 3;
    public final /* synthetic */ int c = R.dimen.sp_14;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f19868d = R.dimen.sp_11;

    public f(AppCompatTextView appCompatTextView) {
        this.f19866a = appCompatTextView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        AppCompatTextView appCompatTextView = this.f19866a;
        Layout layout = appCompatTextView.getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            int i10 = this.f19867b;
            if (lineCount > i10) {
                int dimensionPixelSize = appCompatTextView.getResources().getDimensionPixelSize(this.c);
                int dimensionPixelSize2 = appCompatTextView.getResources().getDimensionPixelSize(this.f19868d);
                try {
                    m.c(appCompatTextView);
                    m.b(appCompatTextView, dimensionPixelSize2, dimensionPixelSize);
                    appCompatTextView.setMaxLines(i10);
                    appCompatTextView.postInvalidate();
                    if (appCompatTextView.getViewTreeObserver().isAlive()) {
                        appCompatTextView.getViewTreeObserver().removeOnPreDrawListener(this);
                        return true;
                    }
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            }
            return true;
        }
        return true;
    }
}
