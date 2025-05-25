package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextView f2670a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f2671b;
    public final /* synthetic */ int c;

    public s(TextView textView, Typeface typeface, int i10) {
        this.f2670a = textView;
        this.f2671b = typeface;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2670a.setTypeface(this.f2671b, this.c);
    }
}
