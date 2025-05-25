package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements b1.p {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2253d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final e f2254a;

    /* renamed from: b  reason: collision with root package name */
    public final r f2255b;
    public final i c;

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2254a;
        if (eVar != null) {
            eVar.a();
        }
        r rVar = this.f2255b;
        if (rVar != null) {
            rVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2254a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2254a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2255b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2255b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.b.P(this, editorInfo, onCreateInputConnection);
        return this.c.g(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2254a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f2254a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f2255b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f2255b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(m.a.a(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.c.i(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.e(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2254a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2254a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        r rVar = this.f2255b;
        rVar.l(colorStateList);
        rVar.b();
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2255b;
        rVar.m(mode);
        rVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        r rVar = this.f2255b;
        if (rVar != null) {
            rVar.g(context, i10);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0.a(context);
        p0.a(getContext(), this);
        u0 m10 = u0.m(getContext(), attributeSet, f2253d, i10, 0);
        if (m10.l(0)) {
            setDropDownBackgroundDrawable(m10.e(0));
        }
        m10.n();
        e eVar = new e(this);
        this.f2254a = eVar;
        eVar.d(attributeSet, i10);
        r rVar = new r(this);
        this.f2255b = rVar;
        rVar.f(attributeSet, i10);
        rVar.b();
        i iVar = new i(this);
        this.c = iVar;
        iVar.f(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener e10 = iVar.e(keyListener);
            if (e10 == keyListener) {
                return;
            }
            super.setKeyListener(e10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }
}
