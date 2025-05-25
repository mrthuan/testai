package rm;

import android.text.Layout;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import b1.m;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PreInstallUserGuidePagerAdapter.kt */
/* loaded from: classes3.dex */
public final class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f29629a;

    public c(AppCompatTextView appCompatTextView) {
        this.f29629a = appCompatTextView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        AppCompatTextView appCompatTextView = this.f29629a;
        Layout layout = appCompatTextView.getLayout();
        if (layout != null && layout.getLineCount() >= 3) {
            int dimensionPixelSize = appCompatTextView.getResources().getDimensionPixelSize(R.dimen.sp_22);
            int dimensionPixelSize2 = appCompatTextView.getResources().getDimensionPixelSize(R.dimen.sp_15);
            try {
                m.c(appCompatTextView);
                m.b(appCompatTextView, dimensionPixelSize2, dimensionPixelSize);
                appCompatTextView.setMaxLines(2);
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
}
