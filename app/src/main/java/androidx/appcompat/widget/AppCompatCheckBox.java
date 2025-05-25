package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements b1.o, b1.p {

    /* renamed from: a  reason: collision with root package name */
    public final g f2237a;

    /* renamed from: b  reason: collision with root package name */
    public final e f2238b;
    public final r c;

    /* renamed from: d  reason: collision with root package name */
    public j f2239d;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    private j getEmojiTextViewHelper() {
        if (this.f2239d == null) {
            this.f2239d = new j(this);
        }
        return this.f2239d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2238b;
        if (eVar != null) {
            eVar.a();
        }
        r rVar = this.c;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        g gVar = this.f2237a;
        if (gVar != null) {
            gVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2238b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2238b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // b1.o
    public ColorStateList getSupportButtonTintList() {
        g gVar = this.f2237a;
        if (gVar != null) {
            return gVar.f2580b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        g gVar = this.f2237a;
        if (gVar != null) {
            return gVar.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2238b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f2238b;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g gVar = this.f2237a;
        if (gVar != null) {
            if (gVar.f2583f) {
                gVar.f2583f = false;
                return;
            }
            gVar.f2583f = true;
            gVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        r rVar = this.c;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        r rVar = this.c;
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
        e eVar = this.f2238b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2238b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // b1.o
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        g gVar = this.f2237a;
        if (gVar != null) {
            gVar.f2580b = colorStateList;
            gVar.f2581d = true;
            gVar.a();
        }
    }

    @Override // b1.o
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        g gVar = this.f2237a;
        if (gVar != null) {
            gVar.c = mode;
            gVar.f2582e = true;
            gVar.a();
        }
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        r rVar = this.c;
        rVar.l(colorStateList);
        rVar.b();
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        r rVar = this.c;
        rVar.m(mode);
        rVar.b();
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0.a(context);
        p0.a(getContext(), this);
        g gVar = new g(this);
        this.f2237a = gVar;
        gVar.b(attributeSet, i10);
        e eVar = new e(this);
        this.f2238b = eVar;
        eVar.d(attributeSet, i10);
        r rVar = new r(this);
        this.c = rVar;
        rVar.f(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(m.a.a(getContext(), i10));
    }
}
