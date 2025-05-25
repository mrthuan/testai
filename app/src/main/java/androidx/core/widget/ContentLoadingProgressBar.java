package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.activity.k;
import b1.e;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final e f3540a;

    /* renamed from: b  reason: collision with root package name */
    public final k f3541b;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f3540a);
        removeCallbacks(this.f3541b);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3540a);
        removeCallbacks(this.f3541b);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3540a = new e(this, 0);
        this.f3541b = new k(this, 2);
    }
}
