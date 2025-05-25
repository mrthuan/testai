package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.activity.r;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.u0;
import g2.d;
import g2.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n0.f;
import org.xmlpull.v1.XmlPullParserException;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import w8.s;
import w8.w;

/* loaded from: classes2.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet<c> f12278e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet<b> f12279f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f12280g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12281h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12282i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12283j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f12284k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f12285l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f12286m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12287n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f12288o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f12289p;

    /* renamed from: q  reason: collision with root package name */
    public PorterDuff.Mode f12290q;

    /* renamed from: r  reason: collision with root package name */
    public int f12291r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f12292s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f12293t;

    /* renamed from: u  reason: collision with root package name */
    public CharSequence f12294u;

    /* renamed from: v  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f12295v;

    /* renamed from: w  reason: collision with root package name */
    public final g2.d f12296w;

    /* renamed from: x  reason: collision with root package name */
    public final a f12297x;

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f12276y = {R.attr.state_indeterminate};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f12277z = {R.attr.state_error};
    public static final int[][] A = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @SuppressLint({"DiscouragedApi"})
    public static final int B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* loaded from: classes2.dex */
    public class a extends g2.c {
        public a() {
        }

        @Override // g2.c
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = MaterialCheckBox.this.f12288o;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }

        @Override // g2.c
        public final void b(Drawable drawable) {
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f12288o;
            if (colorStateList != null) {
                a.b.g(drawable, colorStateList.getColorForState(materialCheckBox.f12292s, colorStateList.getDefaultColor()));
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes2.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f12299a;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f12299a = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" CheckedState=");
            int i10 = this.f12299a;
            if (i10 != 1) {
                if (i10 != 2) {
                    str = "unchecked";
                } else {
                    str = "indeterminate";
                }
            } else {
                str = "checked";
            }
            return r.g(sb2, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f12299a));
        }
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private String getButtonStateDescription() {
        int i10 = this.f12291r;
        if (i10 == 1) {
            return getResources().getString(R.string.arg_res_0x7f130272);
        }
        if (i10 == 0) {
            return getResources().getString(R.string.arg_res_0x7f130274);
        }
        return getResources().getString(R.string.arg_res_0x7f130273);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12280g == null) {
            int K = t0.K(this, R.attr.colorControlActivated);
            int K2 = t0.K(this, R.attr.colorError);
            int K3 = t0.K(this, R.attr.colorSurface);
            int K4 = t0.K(this, R.attr.colorOnSurface);
            this.f12280g = new ColorStateList(A, new int[]{t0.e0(1.0f, K3, K2), t0.e0(1.0f, K3, K), t0.e0(0.54f, K3, K4), t0.e0(0.38f, K3, K4), t0.e0(0.38f, K3, K4)});
        }
        return this.f12280g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f12288o;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e eVar;
        this.f12285l = s8.a.b(this.f12285l, this.f12288o, b1.c.b(this));
        this.f12286m = s8.a.b(this.f12286m, this.f12289p, this.f12290q);
        if (this.f12287n) {
            g2.d dVar = this.f12296w;
            if (dVar != null) {
                Drawable drawable = dVar.f17437a;
                a aVar = this.f12297x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f17423a == null) {
                        aVar.f17423a = new g2.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f17423a);
                }
                ArrayList<g2.c> arrayList = dVar.f17427e;
                d.b bVar = dVar.f17425b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (dVar.f17427e.size() == 0 && (eVar = dVar.f17426d) != null) {
                        bVar.f17431b.removeListener(eVar);
                        dVar.f17426d = null;
                    }
                }
                Drawable drawable2 = dVar.f17437a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f17423a == null) {
                        aVar.f17423a = new g2.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f17423a);
                } else if (aVar != null) {
                    if (dVar.f17427e == null) {
                        dVar.f17427e = new ArrayList<>();
                    }
                    if (!dVar.f17427e.contains(aVar)) {
                        dVar.f17427e.add(aVar);
                        if (dVar.f17426d == null) {
                            dVar.f17426d = new e(dVar);
                        }
                        bVar.f17431b.addListener(dVar.f17426d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f12285l;
                if ((drawable3 instanceof AnimatedStateListDrawable) && dVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, dVar, false);
                    ((AnimatedStateListDrawable) this.f12285l).addTransition(R.id.indeterminate, R.id.unchecked, dVar, false);
                }
            }
        }
        Drawable drawable4 = this.f12285l;
        if (drawable4 != null && (colorStateList2 = this.f12288o) != null) {
            a.b.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f12286m;
        if (drawable5 != null && (colorStateList = this.f12289p) != null) {
            a.b.h(drawable5, colorStateList);
        }
        super.setButtonDrawable(s8.a.a(this.f12285l, this.f12286m));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f12285l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f12286m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f12289p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f12290q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f12288o;
    }

    public int getCheckedState() {
        return this.f12291r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f12284k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.f12291r == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12281h && this.f12288o == null && this.f12289p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f12276y);
        }
        if (this.f12283j) {
            View.mergeDrawableStates(onCreateDrawableState, f12277z);
        }
        this.f12292s = s8.a.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a10;
        int i10;
        if (this.f12282i && TextUtils.isEmpty(getText()) && (a10 = b1.d.a(this)) != null) {
            if (w.e(this)) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * i10;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a10.getBounds();
                a.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f12283j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f12284k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f12299a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f12299a = getCheckedState();
        return dVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(m.a.a(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f12286m = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(m.a.a(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f12289p == colorStateList) {
            return;
        }
        this.f12289p = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f12290q == mode) {
            return;
        }
        this.f12290q = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f12288o == colorStateList) {
            return;
        }
        this.f12288o = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f12282i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        boolean z10;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f12291r != i10) {
            this.f12291r = i10;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            super.setChecked(z10);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f12294u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f12293t) {
                return;
            }
            this.f12293t = true;
            LinkedHashSet<b> linkedHashSet = this.f12279f;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.f12291r != 2 && (onCheckedChangeListener = this.f12295v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f12293t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f12284k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        CharSequence charSequence;
        if (i10 != 0) {
            charSequence = getResources().getText(i10);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z10) {
        if (this.f12283j == z10) {
            return;
        }
        this.f12283j = z10;
        refreshDrawableState();
        Iterator<c> it = this.f12278e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f12295v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f12294u = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f12281h = z10;
        if (z10) {
            b1.c.c(this, getMaterialThemeColorsTintList());
        } else {
            b1.c.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f12285l = drawable;
        this.f12287n = false;
        b();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018251), attributeSet, i10);
        g2.d dVar;
        int next;
        this.f12278e = new LinkedHashSet<>();
        this.f12279f = new LinkedHashSet<>();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            dVar = new g2.d(context2);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal<TypedValue> threadLocal = f.f22291a;
            Drawable a10 = f.a.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            dVar.f17437a = a10;
            a10.setCallback(dVar.f17428f);
            new d.c(dVar.f17437a.getConstantState());
        } else {
            int i11 = g2.d.f17424g;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    Resources resources2 = context2.getResources();
                    Resources.Theme theme2 = context2.getTheme();
                    g2.d dVar2 = new g2.d(context2);
                    dVar2.inflate(resources2, xml, asAttributeSet, theme2);
                    dVar = dVar2;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException unused) {
                dVar = null;
            }
        }
        this.f12296w = dVar;
        this.f12297x = new a();
        Context context3 = getContext();
        this.f12285l = b1.d.a(this);
        this.f12288o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        u0 e10 = s.e(context3, attributeSet, e8.a.D, i10, 2132018251, new int[0]);
        this.f12286m = e10.e(2);
        if (this.f12285l != null && b9.b.b(context3, false, R.attr.isMaterial3Theme)) {
            if (e10.i(0, 0) == B && e10.i(1, 0) == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f12285l = m.a.a(context3, R.drawable.mtrl_checkbox_button);
                this.f12287n = true;
                if (this.f12286m == null) {
                    this.f12286m = m.a.a(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f12289p = b9.c.b(context3, e10, 3);
        this.f12290q = w.f(e10.h(4, -1), PorterDuff.Mode.SRC_IN);
        this.f12281h = e10.a(10, false);
        this.f12282i = e10.a(6, true);
        this.f12283j = e10.a(9, false);
        this.f12284k = e10.k(8);
        if (e10.l(7)) {
            setCheckedState(e10.h(7, 0));
        }
        e10.n();
        b();
    }
}
