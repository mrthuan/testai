package kl;

import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: TextView.kt */
/* loaded from: classes3.dex */
public final class h {
    public static final void a(AppCompatTextView appCompatTextView, int i10, int i11) {
        if (appCompatTextView.getViewTreeObserver().isAlive()) {
            appCompatTextView.getViewTreeObserver().addOnPreDrawListener(new g(appCompatTextView, i10, i11));
        }
    }
}
