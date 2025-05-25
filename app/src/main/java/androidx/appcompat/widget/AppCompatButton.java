package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements b1.b, b1.p {

    /* renamed from: a  reason: collision with root package name */
    public final e f2235a;

    /* renamed from: b  reason: collision with root package name */
    public final r f2236b;
    public j c;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private j getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new j(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2235a;
        if (eVar != null) {
            eVar.a();
        }
        r rVar = this.f2236b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (d1.f2567b) {
            return super.getAutoSizeMaxTextSize();
        }
        r rVar = this.f2236b;
        if (rVar != null) {
            return Math.round(rVar.f2661i.f2680e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (d1.f2567b) {
            return super.getAutoSizeMinTextSize();
        }
        r rVar = this.f2236b;
        if (rVar != null) {
            return Math.round(rVar.f2661i.f2679d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (d1.f2567b) {
            return super.getAutoSizeStepGranularity();
        }
        r rVar = this.f2236b;
        if (rVar != null) {
            return Math.round(rVar.f2661i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (d1.f2567b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        r rVar = this.f2236b;
        if (rVar != null) {
            return rVar.f2661i.f2681f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (d1.f2567b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        r rVar = this.f2236b;
        if (rVar == null) {
            return 0;
        }
        return rVar.f2661i.f2677a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return b1.m.g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2235a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2235a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2236b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2236b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        r rVar = this.f2236b;
        if (rVar != null && !d1.f2567b) {
            rVar.f2661i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        super.onTextChanged(charSequence, i10, i11, i12);
        boolean z11 = false;
        r rVar = this.f2236b;
        if (rVar != null && !d1.f2567b) {
            t tVar = rVar.f2661i;
            if (tVar.h() && tVar.f2677a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            rVar.f2661i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView, b1.b
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (d1.f2567b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        r rVar = this.f2236b;
        if (rVar != null) {
            rVar.i(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (d1.f2567b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        r rVar = this.f2236b;
        if (rVar != null) {
            rVar.j(iArr, i10);
        }
    }

    @Override // android.widget.TextView, b1.b
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (d1.f2567b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        r rVar = this.f2236b;
        if (rVar != null) {
            rVar.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2235a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f2235a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b1.m.h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        r rVar = this.f2236b;
        if (rVar != null) {
            rVar.f2654a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2235a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2235a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        r rVar = this.f2236b;
        rVar.l(colorStateList);
        rVar.b();
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2236b;
        rVar.m(mode);
        rVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        r rVar = this.f2236b;
        if (rVar != null) {
            rVar.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z10;
        boolean z11 = d1.f2567b;
        if (z11) {
            super.setTextSize(i10, f10);
            return;
        }
        r rVar = this.f2236b;
        if (rVar != null && !z11) {
            t tVar = rVar.f2661i;
            if (tVar.h() && tVar.f2677a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                tVar.e(f10, i10);
            }
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0.a(context);
        p0.a(getContext(), this);
        e eVar = new e(this);
        this.f2235a = eVar;
        eVar.d(attributeSet, i10);
        r rVar = new r(this);
        this.f2236b = rVar;
        rVar.f(attributeSet, i10);
        rVar.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }
}
