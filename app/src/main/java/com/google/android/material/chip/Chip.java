package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import b9.c;
import b9.d;
import com.google.android.gms.common.api.Api;
import com.google.android.material.chip.a;
import f8.h;
import f9.m;
import f9.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import v0.f;
import w8.f;
import w8.p;
import w8.s;
import w8.w;
import x0.f0;
import x0.n0;
import y0.f;

/* loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0165a, q, f<Chip> {

    /* renamed from: x  reason: collision with root package name */
    public static final Rect f12300x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f12301y = {16842913};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f12302z = {16842911};

    /* renamed from: e  reason: collision with root package name */
    public com.google.android.material.chip.a f12303e;

    /* renamed from: f  reason: collision with root package name */
    public InsetDrawable f12304f;

    /* renamed from: g  reason: collision with root package name */
    public RippleDrawable f12305g;

    /* renamed from: h  reason: collision with root package name */
    public View.OnClickListener f12306h;

    /* renamed from: i  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f12307i;

    /* renamed from: j  reason: collision with root package name */
    public f.a<Chip> f12308j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12309k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12310l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12311m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12312n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12313o;

    /* renamed from: p  reason: collision with root package name */
    public int f12314p;

    /* renamed from: q  reason: collision with root package name */
    public int f12315q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f12316r;

    /* renamed from: s  reason: collision with root package name */
    public final b f12317s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f12318t;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f12319u;

    /* renamed from: v  reason: collision with root package name */
    public final RectF f12320v;

    /* renamed from: w  reason: collision with root package name */
    public final a f12321w;

    /* loaded from: classes2.dex */
    public class b extends d1.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // d1.a
        public final int n(float f10, float f11) {
            Rect rect = Chip.f12300x;
            Chip chip = Chip.this;
            if (chip.e() && chip.getCloseIconTouchBounds().contains(f10, f11)) {
                return 1;
            }
            return 0;
        }

        @Override // d1.a
        public final void o(ArrayList arrayList) {
            boolean z10 = false;
            arrayList.add(0);
            Rect rect = Chip.f12300x;
            Chip chip = Chip.this;
            if (chip.e()) {
                com.google.android.material.chip.a aVar = chip.f12303e;
                if (aVar != null && aVar.K) {
                    z10 = true;
                }
                if (z10 && chip.f12306h != null) {
                    arrayList.add(1);
                }
            }
        }

        @Override // d1.a
        public final boolean s(int i10, int i11, Bundle bundle) {
            boolean z10 = false;
            if (i11 == 16) {
                Chip chip = Chip.this;
                if (i10 == 0) {
                    return chip.performClick();
                }
                if (i10 == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f12306h;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z10 = true;
                    }
                    if (chip.f12318t) {
                        chip.f12317s.x(1, 1);
                    }
                }
            }
            return z10;
        }

        @Override // d1.a
        public final void t(y0.f fVar) {
            boolean z10;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f12303e;
            if (aVar != null && aVar.Q) {
                z10 = true;
            } else {
                z10 = false;
            }
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
            accessibilityNodeInfo.setCheckable(z10);
            accessibilityNodeInfo.setClickable(chip.isClickable());
            fVar.h(chip.getAccessibilityClassName());
            fVar.m(chip.getText());
        }

        @Override // d1.a
        public final void u(int i10, y0.f fVar) {
            String str = "";
            if (i10 == 1) {
                Chip chip = Chip.this;
                CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    fVar.j(closeIconContentDescription);
                } else {
                    CharSequence text = chip.getText();
                    Context context = chip.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    fVar.j(context.getString(R.string.arg_res_0x7f130275, objArr).trim());
                }
                fVar.g(chip.getCloseIconTouchBoundsInt());
                fVar.b(f.a.f31955g);
                fVar.f31951a.setEnabled(chip.isEnabled());
                return;
            }
            fVar.j("");
            fVar.g(Chip.f12300x);
        }

        @Override // d1.a
        public final void v(int i10, boolean z10) {
            if (i10 == 1) {
                Chip chip = Chip.this;
                chip.f12312n = z10;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f12320v;
        rectF.setEmpty();
        if (e() && this.f12306h != null) {
            com.google.android.material.chip.a aVar = this.f12303e;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.c0()) {
                float f10 = aVar.f12337d0 + aVar.f12336c0 + aVar.O + aVar.f12335b0 + aVar.f12334a0;
                if (a.c.a(aVar) == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.f12319u;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.f12344k0.f31051f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f12311m != z10) {
            this.f12311m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f12310l != z10) {
            this.f12310l = z10;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0165a
    public final void a() {
        d(this.f12315q);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i10) {
        int i11;
        this.f12315q = i10;
        int i12 = 0;
        if (!this.f12313o) {
            InsetDrawable insetDrawable = this.f12304f;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f12304f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
            g();
            return;
        }
        int max = Math.max(0, i10 - ((int) this.f12303e.f12361z));
        int max2 = Math.max(0, i10 - this.f12303e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f12304f;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f12304f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
            g();
            return;
        }
        if (max2 > 0) {
            i11 = max2 / 2;
        } else {
            i11 = 0;
        }
        if (max > 0) {
            i12 = max / 2;
        }
        int i13 = i12;
        if (this.f12304f != null) {
            Rect rect = new Rect();
            this.f12304f.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i11 && rect.right == i11) {
                g();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f12304f = new InsetDrawable((Drawable) this.f12303e, i11, i13, i11, i13);
        g();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f12318t) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!this.f12317s.m(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f12318t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.f12317s;
        bVar.getClass();
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i11 = ShapeTypes.DOUBLE_WAVE;
                                        }
                                    } else {
                                        i11 = 17;
                                    }
                                } else {
                                    i11 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z11 = false;
                                while (i10 < repeatCount && bVar.q(i11, null)) {
                                    i10++;
                                    z11 = true;
                                }
                                z10 = z11;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i12 = bVar.f16045l;
                    if (i12 != Integer.MIN_VALUE) {
                        bVar.s(i12, 16, null);
                    }
                    z10 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z10 = bVar.q(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z10 = bVar.q(1, null);
            }
        }
        if (z10 && bVar.f16045l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i10;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f12303e;
        boolean z10 = false;
        if (aVar != null && com.google.android.material.chip.a.D(aVar.L)) {
            com.google.android.material.chip.a aVar2 = this.f12303e;
            ?? isEnabled = isEnabled();
            int i11 = isEnabled;
            if (this.f12312n) {
                i11 = isEnabled + 1;
            }
            int i12 = i11;
            if (this.f12311m) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.f12310l) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.f12312n) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.f12311m) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.f12310l) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            if (!Arrays.equals(aVar2.f12360y0, iArr)) {
                aVar2.f12360y0 = iArr;
                if (aVar2.c0()) {
                    z10 = aVar2.F(aVar2.getState(), iArr);
                }
            }
        }
        if (z10) {
            invalidate();
        }
    }

    public final boolean e() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            Drawable drawable2 = aVar.L;
            if (drawable2 != null) {
                drawable = p0.a.d(drawable2);
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        boolean z10;
        if (e()) {
            com.google.android.material.chip.a aVar = this.f12303e;
            if (aVar != null && aVar.K) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f12306h != null) {
                f0.o(this, this.f12317s);
                this.f12318t = true;
                return;
            }
        }
        f0.o(this, null);
        this.f12318t = false;
    }

    public final void g() {
        this.f12305g = new RippleDrawable(c9.a.c(this.f12303e.D), getBackgroundDrawable(), null);
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar.f12362z0) {
            aVar.f12362z0 = false;
            aVar.A0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.f12305g;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.q(this, rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        boolean z10;
        if (!TextUtils.isEmpty(this.f12316r)) {
            return this.f12316r;
        }
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null && aVar.Q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ViewParent parent = getParent();
            if (!(parent instanceof ChipGroup) || !((ChipGroup) parent).f12327h.f30993d) {
                return "android.widget.Button";
            }
            return "android.widget.RadioButton";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f12304f;
        if (insetDrawable == null) {
            return this.f12303e;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.f12359y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, aVar.B());
    }

    public Drawable getChipDrawable() {
        return this.f12303e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.f12337d0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar == null || (drawable = aVar.G) == null) {
            return null;
        }
        return p0.a.d(drawable);
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.H;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.f12361z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar == null || (drawable = aVar.L) == null) {
            return null;
        }
        return p0.a.d(drawable);
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.f12336c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.f12335b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.C0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f12318t) {
            b bVar = this.f12317s;
            if (bVar.f16045l == 1 || bVar.f16044k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.D;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        return this.f12303e.f17164a.f17186a;
    }

    public h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.U;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.f12334a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            return aVar.Z;
        }
        return 0.0f;
    }

    public final void h() {
        com.google.android.material.chip.a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f12303e) != null) {
            int A = (int) (aVar.A() + aVar.f12337d0 + aVar.f12334a0);
            com.google.android.material.chip.a aVar2 = this.f12303e;
            int z10 = (int) (aVar2.z() + aVar2.W + aVar2.Z);
            if (this.f12304f != null) {
                Rect rect = new Rect();
                this.f12304f.getPadding(rect);
                z10 += rect.left;
                A += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.e.k(this, z10, paddingTop, A, paddingBottom);
        }
    }

    public final void i() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f12321w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.b.Y(this, this.f12303e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f12301y);
        }
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null && aVar.Q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, f12302z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f12318t) {
            b bVar = this.f12317s;
            int i11 = bVar.f16045l;
            if (i11 != Integer.MIN_VALUE) {
                bVar.j(i11);
            }
            if (z10) {
                bVar.q(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        boolean z11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null && aVar.Q) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i11 = -1;
            if (chipGroup.c) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 < chipGroup.getChildCount()) {
                        View childAt = chipGroup.getChildAt(i12);
                        if (childAt instanceof Chip) {
                            if (chipGroup.getChildAt(i12).getVisibility() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                continue;
                            } else if (((Chip) childAt) == this) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        i12++;
                    } else {
                        i13 = -1;
                        break;
                    }
                }
                i10 = i13;
            } else {
                i10 = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i11 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.c.a(i11, 1, i10, false, isChecked(), 1).f31968a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        PointerIcon systemIcon;
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            return systemIcon;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f12314p != i10) {
            this.f12314p = i10;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L18;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L49
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L50
        L21:
            boolean r0 = r5.f12310l
            if (r0 == 0) goto L50
            if (r1 != 0) goto L4e
            r5.setCloseIconPressed(r3)
            goto L4e
        L2b:
            boolean r0 = r5.f12310l
            if (r0 == 0) goto L44
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f12306h
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.f12318t
            if (r0 == 0) goto L42
            com.google.android.material.chip.Chip$b r0 = r5.f12317s
            r0.x(r2, r2)
        L42:
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            r5.setCloseIconPressed(r3)
            goto L51
        L49:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
        L4e:
            r0 = r2
            goto L51
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r2 = r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f12316r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12305g) {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12305g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.G(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.G(aVar.f12338e0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar == null) {
            this.f12309k = z10;
        } else if (aVar.Q) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.H(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.H(m.a.a(aVar.f12338e0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.I(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.I(androidx.core.content.a.getColorStateList(aVar.f12338e0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.J(aVar.f12338e0.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null && aVar.f12359y != colorStateList) {
            aVar.f12359y = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateList;
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null && aVar.f12359y != (colorStateList = androidx.core.content.a.getColorStateList(aVar.f12338e0, i10))) {
            aVar.f12359y = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.K(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.K(aVar.f12338e0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f12303e;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.B0 = new WeakReference<>(null);
            }
            this.f12303e = aVar;
            aVar.D0 = false;
            aVar.B0 = new WeakReference<>(this);
            d(this.f12315q);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null && aVar.f12337d0 != f10) {
            aVar.f12337d0 = f10;
            aVar.invalidateSelf();
            aVar.E();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            float dimension = aVar.f12338e0.getResources().getDimension(i10);
            if (aVar.f12337d0 != dimension) {
                aVar.f12337d0 = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.L(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.L(m.a.a(aVar.f12338e0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.M(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.M(aVar.f12338e0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.N(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.N(androidx.core.content.a.getColorStateList(aVar.f12338e0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.O(aVar.f12338e0.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null && aVar.f12361z != f10) {
            aVar.f12361z = f10;
            aVar.invalidateSelf();
            aVar.E();
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            float dimension = aVar.f12338e0.getResources().getDimension(i10);
            if (aVar.f12361z != dimension) {
                aVar.f12361z = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null && aVar.W != f10) {
            aVar.W = f10;
            aVar.invalidateSelf();
            aVar.E();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            float dimension = aVar.f12338e0.getResources().getDimension(i10);
            if (aVar.W != dimension) {
                aVar.W = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.P(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.P(androidx.core.content.a.getColorStateList(aVar.f12338e0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.Q(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.Q(aVar.f12338e0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.R(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        v0.a aVar;
        com.google.android.material.chip.a aVar2 = this.f12303e;
        if (aVar2 != null && aVar2.P != charSequence) {
            String str = v0.a.f30459d;
            Locale locale = Locale.getDefault();
            int i10 = v0.f.f30479a;
            boolean z10 = true;
            if (f.a.a(locale) != 1) {
                z10 = false;
            }
            if (z10) {
                aVar = v0.a.f30462g;
            } else {
                aVar = v0.a.f30461f;
            }
            aVar2.P = aVar.c(charSequence, aVar.c);
            aVar2.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.S(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.S(aVar.f12338e0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.R(m.a.a(aVar.f12338e0, i10));
        }
        f();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.T(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.T(aVar.f12338e0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.U(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.U(aVar.f12338e0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.V(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.V(androidx.core.content.a.getColorStateList(aVar.f12338e0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.m(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f12303e == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.f12303e;
            if (aVar != null) {
                aVar.C0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f12313o = z10;
        d(this.f12315q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 == 8388627) {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.V = hVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.V = h.b(aVar.f12338e0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.X(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.X(aVar.f12338e0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.Y(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.Y(aVar.f12338e0.getResources().getDimension(i10));
        }
    }

    @Override // w8.f
    public void setInternalOnCheckedChangeListener(f.a<Chip> aVar) {
        this.f12308j = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f12303e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.E0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f12307i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f12306h = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.Z(colorStateList);
        }
        if (!this.f12303e.f12362z0) {
            g();
        }
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.Z(androidx.core.content.a.getColorStateList(aVar.f12338e0, i10));
            if (!this.f12303e.f12362z0) {
                g();
            }
        }
    }

    @Override // f9.q
    public void setShapeAppearanceModel(m mVar) {
        this.f12303e.setShapeAppearanceModel(mVar);
    }

    public void setShowMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.U = hVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.U = h.b(aVar.f12338e0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (aVar.D0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        com.google.android.material.chip.a aVar2 = this.f12303e;
        if (aVar2 != null && !TextUtils.equals(aVar2.E, charSequence)) {
            aVar2.E = charSequence;
            aVar2.f12344k0.f31049d = true;
            aVar2.invalidateSelf();
            aVar2.E();
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.f12344k0.b(dVar, aVar.f12338e0);
        }
        i();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null && aVar.f12334a0 != f10) {
            aVar.f12334a0 = f10;
            aVar.invalidateSelf();
            aVar.E();
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            float dimension = aVar.f12338e0.getResources().getDimension(i10);
            if (aVar.f12334a0 != dimension) {
                aVar.f12334a0 = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            float applyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            p pVar = aVar.f12344k0;
            d dVar = pVar.f31051f;
            if (dVar != null) {
                dVar.f5384k = applyDimension;
                pVar.f31047a.setTextSize(applyDimension);
                aVar.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null && aVar.Z != f10) {
            aVar.Z = f10;
            aVar.invalidateSelf();
            aVar.E();
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            float dimension = aVar.f12338e0.getResources().getDimension(i10);
            if (aVar.Z != dimension) {
                aVar.Z = dimension;
                aVar.invalidateSelf();
                aVar.E();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.W(z10);
        }
        f();
    }

    public Chip(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018241), attributeSet, i10);
        int resourceId;
        this.f12319u = new Rect();
        this.f12320v = new RectF();
        this.f12321w = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet, i10);
        Context context3 = aVar.f12338e0;
        int[] iArr = e8.a.f16488i;
        TypedArray d10 = s.d(context3, attributeSet, iArr, i10, 2132018241, new int[0]);
        aVar.F0 = d10.hasValue(37);
        Context context4 = aVar.f12338e0;
        ColorStateList a10 = c.a(context4, d10, 24);
        if (aVar.f12357x != a10) {
            aVar.f12357x = a10;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList a11 = c.a(context4, d10, 11);
        if (aVar.f12359y != a11) {
            aVar.f12359y = a11;
            aVar.onStateChange(aVar.getState());
        }
        float dimension = d10.getDimension(19, 0.0f);
        if (aVar.f12361z != dimension) {
            aVar.f12361z = dimension;
            aVar.invalidateSelf();
            aVar.E();
        }
        if (d10.hasValue(12)) {
            aVar.K(d10.getDimension(12, 0.0f));
        }
        aVar.P(c.a(context4, d10, 22));
        aVar.Q(d10.getDimension(23, 0.0f));
        aVar.Z(c.a(context4, d10, 36));
        String text = d10.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(aVar.E, text);
        p pVar = aVar.f12344k0;
        if (!equals) {
            aVar.E = text;
            pVar.f31049d = true;
            aVar.invalidateSelf();
            aVar.E();
        }
        d dVar = (!d10.hasValue(0) || (resourceId = d10.getResourceId(0, 0)) == 0) ? null : new d(context4, resourceId);
        dVar.f5384k = d10.getDimension(1, dVar.f5384k);
        pVar.b(dVar, context4);
        int i11 = d10.getInt(3, 0);
        if (i11 == 1) {
            aVar.C0 = TextUtils.TruncateAt.START;
        } else if (i11 == 2) {
            aVar.C0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i11 == 3) {
            aVar.C0 = TextUtils.TruncateAt.END;
        }
        aVar.O(d10.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            aVar.O(d10.getBoolean(15, false));
        }
        aVar.L(c.d(context4, d10, 14));
        if (d10.hasValue(17)) {
            aVar.N(c.a(context4, d10, 17));
        }
        aVar.M(d10.getDimension(16, -1.0f));
        aVar.W(d10.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            aVar.W(d10.getBoolean(26, false));
        }
        aVar.R(c.d(context4, d10, 25));
        aVar.V(c.a(context4, d10, 30));
        aVar.T(d10.getDimension(28, 0.0f));
        aVar.G(d10.getBoolean(6, false));
        aVar.J(d10.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            aVar.J(d10.getBoolean(8, false));
        }
        aVar.H(c.d(context4, d10, 7));
        if (d10.hasValue(9)) {
            aVar.I(c.a(context4, d10, 9));
        }
        aVar.U = h.a(context4, d10, 39);
        aVar.V = h.a(context4, d10, 33);
        float dimension2 = d10.getDimension(21, 0.0f);
        if (aVar.W != dimension2) {
            aVar.W = dimension2;
            aVar.invalidateSelf();
            aVar.E();
        }
        aVar.Y(d10.getDimension(35, 0.0f));
        aVar.X(d10.getDimension(34, 0.0f));
        float dimension3 = d10.getDimension(41, 0.0f);
        if (aVar.Z != dimension3) {
            aVar.Z = dimension3;
            aVar.invalidateSelf();
            aVar.E();
        }
        float dimension4 = d10.getDimension(40, 0.0f);
        if (aVar.f12334a0 != dimension4) {
            aVar.f12334a0 = dimension4;
            aVar.invalidateSelf();
            aVar.E();
        }
        aVar.U(d10.getDimension(29, 0.0f));
        aVar.S(d10.getDimension(27, 0.0f));
        float dimension5 = d10.getDimension(13, 0.0f);
        if (aVar.f12337d0 != dimension5) {
            aVar.f12337d0 = dimension5;
            aVar.invalidateSelf();
            aVar.E();
        }
        aVar.E0 = d10.getDimensionPixelSize(4, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        d10.recycle();
        TypedArray d11 = s.d(context2, attributeSet, iArr, i10, 2132018241, new int[0]);
        this.f12313o = d11.getBoolean(32, false);
        this.f12315q = (int) Math.ceil(d11.getDimension(20, (float) Math.ceil(w.b(getContext(), 48))));
        d11.recycle();
        setChipDrawable(aVar);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        aVar.m(f0.i.i(this));
        TypedArray d12 = s.d(context2, attributeSet, iArr, i10, 2132018241, new int[0]);
        boolean hasValue = d12.hasValue(37);
        d12.recycle();
        this.f12317s = new b(this);
        f();
        if (!hasValue) {
            setOutlineProvider(new p8.b(this));
        }
        setChecked(this.f12309k);
        setText(aVar.E);
        setEllipsize(aVar.C0);
        i();
        if (!this.f12303e.D0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.f12313o) {
            setMinHeight(this.f12315q);
        }
        this.f12314p = f0.e.d(this);
        super.setOnCheckedChangeListener(new p8.a(this, 0));
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.J(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            aVar.O(z10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            Context context2 = aVar.f12338e0;
            aVar.f12344k0.b(new d(context2, i10), context2);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f12303e;
        if (aVar != null) {
            Context context = aVar.f12338e0;
            aVar.f12344k0.b(new d(context, i10), context);
        }
        i();
    }

    /* loaded from: classes2.dex */
    public class a extends r.d {
        public a() {
        }

        @Override // r.d
        public final void j(Typeface typeface, boolean z10) {
            CharSequence text;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f12303e;
            if (aVar.D0) {
                text = aVar.E;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            chip.requestLayout();
            chip.invalidate();
        }

        @Override // r.d
        public final void f(int i10) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }
}
