package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton implements b1.p {

    /* renamed from: a  reason: collision with root package name */
    public final e f2288a;

    /* renamed from: b  reason: collision with root package name */
    public final r f2289b;
    public j c;

    public AppCompatToggleButton(Context context) {
        this(context, null);
    }

    private j getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new j(this);
        }
        return this.c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2288a;
        if (eVar != null) {
            eVar.a();
        }
        r rVar = this.f2289b;
        if (rVar != null) {
            rVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2288a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2288a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2289b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2289b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2288a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f2288a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f2289b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f2289b;
        if (rVar != null) {
            rVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2288a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2288a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        r rVar = this.f2289b;
        rVar.l(colorStateList);
        rVar.b();
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2289b;
        rVar.m(mode);
        rVar.b();
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p0.a(getContext(), this);
        e eVar = new e(this);
        this.f2288a = eVar;
        eVar.d(attributeSet, i10);
        r rVar = new r(this);
        this.f2289b = rVar;
        rVar.f(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }
}
