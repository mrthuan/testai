package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import p0.a;

/* compiled from: AppCompatCheckedTextViewHelper.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f2574a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f2575b = null;
    public PorterDuff.Mode c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2576d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2577e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2578f;

    public f(CheckedTextView checkedTextView) {
        this.f2574a = checkedTextView;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.f2574a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2576d || this.f2577e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2576d) {
                    a.b.h(mutate, this.f2575b);
                }
                if (this.f2577e) {
                    a.b.i(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }
}
