package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: AppCompatEmojiTextHelper.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f2609a;

    /* renamed from: b  reason: collision with root package name */
    public final i1.f f2610b;

    public j(TextView textView) {
        this.f2609a = textView;
        this.f2610b = new i1.f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f2610b.f18420a.a(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f2609a.getContext().obtainStyledAttributes(attributeSet, k.a.f19437j, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z10) {
        this.f2610b.f18420a.c(z10);
    }

    public final void d(boolean z10) {
        this.f2610b.f18420a.d(z10);
    }
}
