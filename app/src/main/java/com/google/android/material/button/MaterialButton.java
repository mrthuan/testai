package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import b1.m;
import f9.q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;
import w8.w;
import x0.f0;
import x0.n0;

/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, q {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f12184r = {16842911};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f12185s = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public final m8.a f12186d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet<a> f12187e;

    /* renamed from: f  reason: collision with root package name */
    public b f12188f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f12189g;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f12190h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f12191i;

    /* renamed from: j  reason: collision with root package name */
    public String f12192j;

    /* renamed from: k  reason: collision with root package name */
    public int f12193k;

    /* renamed from: l  reason: collision with root package name */
    public int f12194l;

    /* renamed from: m  reason: collision with root package name */
    public int f12195m;

    /* renamed from: n  reason: collision with root package name */
    public int f12196n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12197o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12198p;

    /* renamed from: q  reason: collision with root package name */
    public int f12199q;

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    /* loaded from: classes2.dex */
    public static class c extends c1.a {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public boolean c;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new c[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.c = parcel.readInt() == 1;
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(f10);
    }

    public final boolean a() {
        m8.a aVar = this.f12186d;
        if (aVar != null && !aVar.f21854o) {
            return true;
        }
        return false;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        int i10 = this.f12199q;
        boolean z12 = false;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            m.b.e(this, this.f12191i, null, null, null);
            return;
        }
        if (i10 != 3 && i10 != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            m.b.e(this, null, null, this.f12191i, null);
            return;
        }
        if (i10 == 16 || i10 == 32) {
            z12 = true;
        }
        if (z12) {
            m.b.e(this, null, this.f12191i, null, null);
        }
    }

    public final void c(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        Drawable drawable = this.f12191i;
        boolean z14 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f12191i = mutate;
            a.b.h(mutate, this.f12190h);
            PorterDuff.Mode mode = this.f12189g;
            if (mode != null) {
                a.b.i(this.f12191i, mode);
            }
            int i10 = this.f12193k;
            if (i10 == 0) {
                i10 = this.f12191i.getIntrinsicWidth();
            }
            int i11 = this.f12193k;
            if (i11 == 0) {
                i11 = this.f12191i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f12191i;
            int i12 = this.f12194l;
            int i13 = this.f12195m;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f12191i.setVisible(true, z10);
        }
        if (z10) {
            b();
            return;
        }
        Drawable[] a10 = m.b.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        int i14 = this.f12199q;
        if (i14 != 1 && i14 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 || drawable3 == this.f12191i) {
            if (i14 != 3 && i14 != 4) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z12 || drawable5 == this.f12191i) {
                if (i14 != 16 && i14 != 32) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (!z13 || drawable4 == this.f12191i) {
                    z14 = false;
                }
            }
        }
        if (z14) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f12191i != null && getLayout() != null) {
            int i12 = this.f12199q;
            boolean z13 = true;
            if (i12 != 1 && i12 != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                if (i12 != 3 && i12 != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    if (i12 != 16 && i12 != 32) {
                        z13 = false;
                    }
                    if (z13) {
                        this.f12194l = 0;
                        if (i12 == 16) {
                            this.f12195m = 0;
                            c(false);
                            return;
                        }
                        int i13 = this.f12193k;
                        if (i13 == 0) {
                            i13 = this.f12191i.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i13) - this.f12196n) - getPaddingBottom()) / 2);
                        if (this.f12195m != max) {
                            this.f12195m = max;
                            c(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.f12195m = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i14 = this.f12199q;
            if (i14 != 1 && i14 != 3 && ((i14 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i14 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i15 = this.f12193k;
                if (i15 == 0) {
                    i15 = this.f12191i.getIntrinsicWidth();
                }
                int textLayoutWidth = i10 - getTextLayoutWidth();
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                int e10 = (((textLayoutWidth - f0.e.e(this)) - i15) - this.f12196n) - f0.e.f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    e10 /= 2;
                }
                if (f0.e.d(this) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f12199q != 4) {
                    z13 = false;
                }
                if (z11 != z13) {
                    e10 = -e10;
                }
                if (this.f12194l != e10) {
                    this.f12194l = e10;
                    c(false);
                    return;
                }
                return;
            }
            this.f12194l = 0;
            c(false);
        }
    }

    public String getA11yClassName() {
        boolean z10;
        Class cls;
        if (!TextUtils.isEmpty(this.f12192j)) {
            return this.f12192j;
        }
        m8.a aVar = this.f12186d;
        if (aVar != null && aVar.f21856q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f12186d.f21846g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f12191i;
    }

    public int getIconGravity() {
        return this.f12199q;
    }

    public int getIconPadding() {
        return this.f12196n;
    }

    public int getIconSize() {
        return this.f12193k;
    }

    public ColorStateList getIconTint() {
        return this.f12190h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f12189g;
    }

    public int getInsetBottom() {
        return this.f12186d.f21845f;
    }

    public int getInsetTop() {
        return this.f12186d.f21844e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f12186d.f21851l;
        }
        return null;
    }

    public f9.m getShapeAppearanceModel() {
        if (a()) {
            return this.f12186d.f21842b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f12186d.f21850k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f12186d.f21847h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f12186d.f21849j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f12186d.f21848i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f12197o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            b.b.Y(this, this.f12186d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        m8.a aVar = this.f12186d;
        if (aVar != null && aVar.f21856q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, f12184r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f12185s);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        m8.a aVar = this.f12186d;
        if (aVar != null && aVar.f21856q) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f5506a);
        setChecked(cVar.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.c = this.f12197o;
        return cVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f12186d.f21857r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f12191i != null) {
            if (this.f12191i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f12192j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (a()) {
            m8.a aVar = this.f12186d;
            if (aVar.b(false) != null) {
                aVar.b(false).setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                m8.a aVar = this.f12186d;
                aVar.f21854o = true;
                ColorStateList colorStateList = aVar.f21849j;
                MaterialButton materialButton = aVar.f21841a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(aVar.f21848i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = m.a.a(getContext(), i10);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (a()) {
            this.f12186d.f21856q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        boolean z11;
        m8.a aVar = this.f12186d;
        if (aVar != null && aVar.f21856q) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && isEnabled() && this.f12197o != z10) {
            this.f12197o = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z12 = this.f12197o;
                if (!materialButtonToggleGroup.f12205f) {
                    materialButtonToggleGroup.b(getId(), z12);
                }
            }
            if (this.f12198p) {
                return;
            }
            this.f12198p = true;
            Iterator<a> it = this.f12187e.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f12198p = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (a()) {
            m8.a aVar = this.f12186d;
            if (!aVar.f21855p || aVar.f21846g != i10) {
                aVar.f21846g = i10;
                aVar.f21855p = true;
                aVar.c(aVar.f21842b.g(i10));
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f12186d.b(false).m(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f12191i != drawable) {
            this.f12191i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f12199q != i10) {
            this.f12199q = i10;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f12196n != i10) {
            this.f12196n = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = m.a.a(getContext(), i10);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.f12193k != i10) {
                this.f12193k = i10;
                c(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f12190h != colorStateList) {
            this.f12190h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f12189g != mode) {
            this.f12189g = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(androidx.core.content.a.getColorStateList(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        m8.a aVar = this.f12186d;
        aVar.d(aVar.f21844e, i10);
    }

    public void setInsetTop(int i10) {
        m8.a aVar = this.f12186d;
        aVar.d(i10, aVar.f21845f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f12188f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f12188f;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            m8.a aVar = this.f12186d;
            if (aVar.f21851l != colorStateList) {
                aVar.f21851l = colorStateList;
                MaterialButton materialButton = aVar.f21841a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(c9.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (a()) {
            setRippleColor(androidx.core.content.a.getColorStateList(getContext(), i10));
        }
    }

    @Override // f9.q
    public void setShapeAppearanceModel(f9.m mVar) {
        if (a()) {
            this.f12186d.c(mVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (a()) {
            m8.a aVar = this.f12186d;
            aVar.f21853n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            m8.a aVar = this.f12186d;
            if (aVar.f21850k != colorStateList) {
                aVar.f21850k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (a()) {
            setStrokeColor(androidx.core.content.a.getColorStateList(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (a()) {
            m8.a aVar = this.f12186d;
            if (aVar.f21847h != i10) {
                aVar.f21847h = i10;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            m8.a aVar = this.f12186d;
            if (aVar.f21849j != colorStateList) {
                aVar.f21849j = colorStateList;
                if (aVar.b(false) != null) {
                    a.b.h(aVar.b(false), aVar.f21849j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            m8.a aVar = this.f12186d;
            if (aVar.f21848i != mode) {
                aVar.f21848i = mode;
                if (aVar.b(false) != null && aVar.f21848i != null) {
                    a.b.i(aVar.b(false), aVar.f21848i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f12186d.f21857r = z10;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f12197o);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018227), attributeSet, i10);
        this.f12187e = new LinkedHashSet<>();
        this.f12197o = false;
        this.f12198p = false;
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, e8.a.f16504y, i10, 2132018227, new int[0]);
        this.f12196n = d10.getDimensionPixelSize(12, 0);
        this.f12189g = w.f(d10.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f12190h = b9.c.a(getContext(), d10, 14);
        this.f12191i = b9.c.d(getContext(), d10, 10);
        this.f12199q = d10.getInteger(11, 1);
        this.f12193k = d10.getDimensionPixelSize(13, 0);
        m8.a aVar = new m8.a(this, new f9.m(f9.m.c(context2, attributeSet, i10, 2132018227)));
        this.f12186d = aVar;
        aVar.c = d10.getDimensionPixelOffset(1, 0);
        aVar.f21843d = d10.getDimensionPixelOffset(2, 0);
        aVar.f21844e = d10.getDimensionPixelOffset(3, 0);
        aVar.f21845f = d10.getDimensionPixelOffset(4, 0);
        if (d10.hasValue(8)) {
            int dimensionPixelSize = d10.getDimensionPixelSize(8, -1);
            aVar.f21846g = dimensionPixelSize;
            aVar.c(aVar.f21842b.g(dimensionPixelSize));
            aVar.f21855p = true;
        }
        aVar.f21847h = d10.getDimensionPixelSize(20, 0);
        aVar.f21848i = w.f(d10.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f21849j = b9.c.a(getContext(), d10, 6);
        aVar.f21850k = b9.c.a(getContext(), d10, 19);
        aVar.f21851l = b9.c.a(getContext(), d10, 16);
        aVar.f21856q = d10.getBoolean(5, false);
        aVar.f21859t = d10.getDimensionPixelSize(9, 0);
        aVar.f21857r = d10.getBoolean(21, true);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        int f10 = f0.e.f(this);
        int paddingTop = getPaddingTop();
        int e10 = f0.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d10.hasValue(0)) {
            aVar.f21854o = true;
            setSupportBackgroundTintList(aVar.f21849j);
            setSupportBackgroundTintMode(aVar.f21848i);
        } else {
            aVar.e();
        }
        f0.e.k(this, f10 + aVar.c, paddingTop + aVar.f21844e, e10 + aVar.f21843d, paddingBottom + aVar.f21845f);
        d10.recycle();
        setCompoundDrawablePadding(this.f12196n);
        c(this.f12191i != null);
    }
}
