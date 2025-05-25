package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.u0;
import com.google.android.material.internal.CheckableImageButton;
import f2.o;
import f9.h;
import f9.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k9.i;
import k9.p;
import k9.q;
import k9.r;
import k9.u;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import v0.f;
import w8.s;
import w8.w;
import x0.f0;
import x0.n0;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: y0  reason: collision with root package name */
    public static final int[][] f13014y0 = {new int[]{16842919}, new int[0]};
    public boolean A;
    public CharSequence B;
    public boolean C;
    public f9.h D;
    public f9.h E;
    public StateListDrawable F;
    public boolean G;
    public f9.h H;
    public f9.h I;
    public m J;
    public boolean K;
    public final int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public final Rect T;
    public final Rect U;
    public final RectF V;
    public Typeface W;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f13015a;

    /* renamed from: a0  reason: collision with root package name */
    public ColorDrawable f13016a0;

    /* renamed from: b  reason: collision with root package name */
    public final u f13017b;

    /* renamed from: b0  reason: collision with root package name */
    public int f13018b0;
    public final com.google.android.material.textfield.a c;

    /* renamed from: c0  reason: collision with root package name */
    public final LinkedHashSet<g> f13019c0;

    /* renamed from: d  reason: collision with root package name */
    public EditText f13020d;

    /* renamed from: d0  reason: collision with root package name */
    public ColorDrawable f13021d0;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f13022e;

    /* renamed from: e0  reason: collision with root package name */
    public int f13023e0;

    /* renamed from: f  reason: collision with root package name */
    public int f13024f;

    /* renamed from: f0  reason: collision with root package name */
    public Drawable f13025f0;

    /* renamed from: g  reason: collision with root package name */
    public int f13026g;

    /* renamed from: g0  reason: collision with root package name */
    public ColorStateList f13027g0;

    /* renamed from: h  reason: collision with root package name */
    public int f13028h;

    /* renamed from: h0  reason: collision with root package name */
    public ColorStateList f13029h0;

    /* renamed from: i  reason: collision with root package name */
    public int f13030i;

    /* renamed from: i0  reason: collision with root package name */
    public int f13031i0;

    /* renamed from: j  reason: collision with root package name */
    public final q f13032j;

    /* renamed from: j0  reason: collision with root package name */
    public int f13033j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f13034k;

    /* renamed from: k0  reason: collision with root package name */
    public int f13035k0;

    /* renamed from: l  reason: collision with root package name */
    public int f13036l;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f13037l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f13038m;

    /* renamed from: m0  reason: collision with root package name */
    public int f13039m0;

    /* renamed from: n  reason: collision with root package name */
    public f f13040n;

    /* renamed from: n0  reason: collision with root package name */
    public int f13041n0;

    /* renamed from: o  reason: collision with root package name */
    public AppCompatTextView f13042o;

    /* renamed from: o0  reason: collision with root package name */
    public int f13043o0;

    /* renamed from: p  reason: collision with root package name */
    public int f13044p;

    /* renamed from: p0  reason: collision with root package name */
    public int f13045p0;

    /* renamed from: q  reason: collision with root package name */
    public int f13046q;

    /* renamed from: q0  reason: collision with root package name */
    public int f13047q0;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f13048r;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f13049r0;

    /* renamed from: s  reason: collision with root package name */
    public boolean f13050s;

    /* renamed from: s0  reason: collision with root package name */
    public final com.google.android.material.internal.a f13051s0;

    /* renamed from: t  reason: collision with root package name */
    public AppCompatTextView f13052t;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f13053t0;

    /* renamed from: u  reason: collision with root package name */
    public ColorStateList f13054u;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f13055u0;

    /* renamed from: v  reason: collision with root package name */
    public int f13056v;

    /* renamed from: v0  reason: collision with root package name */
    public ValueAnimator f13057v0;

    /* renamed from: w  reason: collision with root package name */
    public f2.d f13058w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f13059w0;

    /* renamed from: x  reason: collision with root package name */
    public f2.d f13060x;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f13061x0;

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f13062y;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f13063z;

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.c.f13075g;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f13020d.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f13051s0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends x0.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f13068d;

        public e(TextInputLayout textInputLayout) {
            this.f13068d = textInputLayout;
        }

        @Override // x0.a
        public final void d(View view, y0.f fVar) {
            CharSequence charSequence;
            boolean z10;
            String str;
            View.AccessibilityDelegate accessibilityDelegate = this.f31416a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f13068d;
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean z11 = !TextUtils.isEmpty(charSequence);
            boolean z12 = !TextUtils.isEmpty(hint);
            boolean z13 = !textInputLayout.f13049r0;
            boolean z14 = !TextUtils.isEmpty(error);
            if (!z14 && TextUtils.isEmpty(counterOverflowDescription)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z12) {
                str = hint.toString();
            } else {
                str = "";
            }
            u uVar = textInputLayout.f13017b;
            AppCompatTextView appCompatTextView = uVar.f19719b;
            if (appCompatTextView.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView);
                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
            } else {
                accessibilityNodeInfo.setTraversalAfter(uVar.f19720d);
            }
            if (z11) {
                fVar.m(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                fVar.m(str);
                if (z13 && placeholderText != null) {
                    fVar.m(str + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                fVar.m(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    fVar.k(str);
                } else {
                    if (z11) {
                        str = ((Object) charSequence) + ", " + str;
                    }
                    fVar.m(str);
                }
                boolean z15 = true ^ z11;
                if (i10 >= 26) {
                    accessibilityNodeInfo.setShowingHintText(z15);
                } else {
                    fVar.f(4, z15);
                }
            }
            accessibilityNodeInfo.setMaxTextLength((charSequence == null || charSequence.length() != counterMaxLength) ? -1 : -1);
            if (z10) {
                if (!z14) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.f13032j.f19708y;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView2);
            }
            textInputLayout.c.b().n(fVar);
        }

        @Override // x0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f13068d.c.b().o(accessibilityEvent);
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes2.dex */
    public interface h {
        void a();
    }

    /* loaded from: classes2.dex */
    public static class i extends c1.a {
        public static final Parcelable.Creator<i> CREATOR = new a();
        public CharSequence c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f13069d;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new i[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f13069d = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.c) + "}";
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            TextUtils.writeToParcel(this.c, parcel, i10);
            parcel.writeInt(this.f13069d ? 1 : 0);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private Drawable getEditTextBoxBackground() {
        boolean z10;
        int i10;
        EditText editText = this.f13020d;
        if (editText instanceof AutoCompleteTextView) {
            if (editText.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int K = t0.K(this.f13020d, R.attr.colorControlHighlight);
                int i11 = this.M;
                int[][] iArr = f13014y0;
                if (i11 == 2) {
                    Context context = getContext();
                    f9.h hVar = this.D;
                    TypedValue c10 = b9.b.c(context, R.attr.colorSurface, "TextInputLayout");
                    int i12 = c10.resourceId;
                    if (i12 != 0) {
                        i10 = androidx.core.content.a.getColor(context, i12);
                    } else {
                        i10 = c10.data;
                    }
                    f9.h hVar2 = new f9.h(hVar.f17164a.f17186a);
                    int e02 = t0.e0(0.1f, K, i10);
                    hVar2.n(new ColorStateList(iArr, new int[]{e02, 0}));
                    hVar2.setTint(i10);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{e02, i10});
                    f9.h hVar3 = new f9.h(hVar.f17164a.f17186a);
                    hVar3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
                } else if (i11 == 1) {
                    f9.h hVar4 = this.D;
                    int i13 = this.S;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{t0.e0(0.1f, K, i13), i13}), hVar4, hVar4);
                } else {
                    return null;
                }
            }
        }
        return this.D;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.F == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.F = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.F.addState(new int[0], f(false));
        }
        return this.F;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.E == null) {
            this.E = f(true);
        }
        return this.E;
    }

    public static void k(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f13020d == null) {
            if (getEndIconMode() != 3) {
                boolean z10 = editText instanceof TextInputEditText;
            }
            this.f13020d = editText;
            int i10 = this.f13024f;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f13028h);
            }
            int i11 = this.f13026g;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f13030i);
            }
            this.G = false;
            i();
            setTextInputAccessibilityDelegate(new e(this));
            Typeface typeface = this.f13020d.getTypeface();
            com.google.android.material.internal.a aVar = this.f13051s0;
            boolean m10 = aVar.m(typeface);
            boolean o10 = aVar.o(typeface);
            if (m10 || o10) {
                aVar.i(false);
            }
            float textSize = this.f13020d.getTextSize();
            if (aVar.f12652l != textSize) {
                aVar.f12652l = textSize;
                aVar.i(false);
            }
            float letterSpacing = this.f13020d.getLetterSpacing();
            if (aVar.f12643g0 != letterSpacing) {
                aVar.f12643g0 = letterSpacing;
                aVar.i(false);
            }
            int gravity = this.f13020d.getGravity();
            aVar.l((gravity & (-113)) | 48);
            if (aVar.f12648j != gravity) {
                aVar.f12648j = gravity;
                aVar.i(false);
            }
            this.f13020d.addTextChangedListener(new a());
            if (this.f13027g0 == null) {
                this.f13027g0 = this.f13020d.getHintTextColors();
            }
            if (this.A) {
                if (TextUtils.isEmpty(this.B)) {
                    CharSequence hint = this.f13020d.getHint();
                    this.f13022e = hint;
                    setHint(hint);
                    this.f13020d.setHint((CharSequence) null);
                }
                this.C = true;
            }
            if (this.f13042o != null) {
                n(this.f13020d.getText());
            }
            q();
            this.f13032j.b();
            this.f13017b.bringToFront();
            com.google.android.material.textfield.a aVar2 = this.c;
            aVar2.bringToFront();
            Iterator<g> it = this.f13019c0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            aVar2.l();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            t(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.B)) {
            this.B = charSequence;
            com.google.android.material.internal.a aVar = this.f13051s0;
            if (charSequence == null || !TextUtils.equals(aVar.G, charSequence)) {
                aVar.G = charSequence;
                aVar.H = null;
                Bitmap bitmap = aVar.K;
                if (bitmap != null) {
                    bitmap.recycle();
                    aVar.K = null;
                }
                aVar.i(false);
            }
            if (!this.f13049r0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f13050s == z10) {
            return;
        }
        if (z10) {
            AppCompatTextView appCompatTextView = this.f13052t;
            if (appCompatTextView != null) {
                this.f13015a.addView(appCompatTextView);
                this.f13052t.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f13052t;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f13052t = null;
        }
        this.f13050s = z10;
    }

    public final void a(float f10) {
        com.google.android.material.internal.a aVar = this.f13051s0;
        if (aVar.f12633b == f10) {
            return;
        }
        if (this.f13057v0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f13057v0 = valueAnimator;
            valueAnimator.setInterpolator(x8.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, f8.b.f17142b));
            this.f13057v0.setDuration(x8.a.c(getContext(), R.attr.motionDurationMedium4, ShapeTypes.ACTION_BUTTON_END));
            this.f13057v0.addUpdateListener(new d());
        }
        this.f13057v0.setFloatValues(aVar.f12633b, f10);
        this.f13057v0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f13015a;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            s();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r6 = this;
            f9.h r0 = r6.D
            if (r0 != 0) goto L5
            return
        L5:
            f9.h$b r1 = r0.f17164a
            f9.m r1 = r1.f17186a
            f9.m r2 = r6.J
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r6.M
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L27
            int r0 = r6.O
            if (r0 <= r2) goto L22
            int r0 = r6.R
            if (r0 == 0) goto L22
            r0 = r4
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L3b
            f9.h r0 = r6.D
            int r1 = r6.O
            float r1 = (float) r1
            int r5 = r6.R
            r0.t(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            r0.s(r1)
        L3b:
            int r0 = r6.S
            int r1 = r6.M
            if (r1 != r4) goto L52
            android.content.Context r0 = r6.getContext()
            r1 = 2130968904(0x7f040148, float:1.7546475E38)
            int r0 = pdf.pdfreader.viewer.editor.free.utils.t0.J(r0, r1, r3)
            int r1 = r6.S
            int r0 = o0.a.c(r1, r0)
        L52:
            r6.S = r0
            f9.h r1 = r6.D
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.n(r0)
            f9.h r0 = r6.H
            if (r0 == 0) goto L97
            f9.h r1 = r6.I
            if (r1 != 0) goto L66
            goto L97
        L66:
            int r1 = r6.O
            if (r1 <= r2) goto L6f
            int r1 = r6.R
            if (r1 == 0) goto L6f
            r3 = r4
        L6f:
            if (r3 == 0) goto L94
            android.widget.EditText r1 = r6.f13020d
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L80
            int r1 = r6.f13031i0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L86
        L80:
            int r1 = r6.R
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L86:
            r0.n(r1)
            f9.h r0 = r6.I
            int r1 = r6.R
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.n(r1)
        L94:
            r6.invalidate()
        L97:
            r6.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final int c() {
        float e10;
        if (!this.A) {
            return 0;
        }
        int i10 = this.M;
        com.google.android.material.internal.a aVar = this.f13051s0;
        if (i10 != 0) {
            if (i10 != 2) {
                return 0;
            }
            e10 = aVar.e() / 2.0f;
        } else {
            e10 = aVar.e();
        }
        return (int) e10;
    }

    public final f2.d d() {
        f2.d dVar = new f2.d();
        dVar.c = x8.a.c(getContext(), R.attr.motionDurationShort2, 87);
        dVar.f17038d = x8.a.d(getContext(), R.attr.motionEasingLinearInterpolator, f8.b.f17141a);
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f13020d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f13022e != null) {
            boolean z10 = this.C;
            this.C = false;
            CharSequence hint = editText.getHint();
            this.f13020d.setHint(this.f13022e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f13020d.setHint(hint);
                this.C = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f13015a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f13020d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f13061x0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f13061x0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        f9.h hVar;
        super.draw(canvas);
        boolean z10 = this.A;
        com.google.android.material.internal.a aVar = this.f13051s0;
        if (z10) {
            aVar.d(canvas);
        }
        if (this.I != null && (hVar = this.H) != null) {
            hVar.draw(canvas);
            if (this.f13020d.isFocused()) {
                Rect bounds = this.I.getBounds();
                Rect bounds2 = this.H.getBounds();
                float f10 = aVar.f12633b;
                int centerX = bounds2.centerX();
                bounds.left = f8.b.b(f10, centerX, bounds2.left);
                bounds.right = f8.b.b(f10, centerX, bounds2.right);
                this.I.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        if (this.f13059w0) {
            return;
        }
        boolean z11 = true;
        this.f13059w0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f13051s0;
        if (aVar != null) {
            z10 = aVar.r(drawableState) | false;
        } else {
            z10 = false;
        }
        if (this.f13020d != null) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (!f0.g.c(this) || !isEnabled()) {
                z11 = false;
            }
            t(z11, false);
        }
        q();
        w();
        if (z10) {
            invalidate();
        }
        this.f13059w0 = false;
    }

    public final boolean e() {
        if (this.A && !TextUtils.isEmpty(this.B) && (this.D instanceof k9.i)) {
            return true;
        }
        return false;
    }

    public final f9.h f(boolean z10) {
        float f10;
        float dimensionPixelOffset;
        int i10;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z10) {
            f10 = dimensionPixelOffset2;
        } else {
            f10 = 0.0f;
        }
        EditText editText = this.f13020d;
        if (editText instanceof MaterialAutoCompleteTextView) {
            dimensionPixelOffset = ((MaterialAutoCompleteTextView) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        m.a aVar = new m.a();
        aVar.e(f10);
        aVar.f(f10);
        aVar.c(dimensionPixelOffset2);
        aVar.d(dimensionPixelOffset2);
        m mVar = new m(aVar);
        Context context = getContext();
        Paint paint = f9.h.f17163w;
        TypedValue c10 = b9.b.c(context, R.attr.colorSurface, f9.h.class.getSimpleName());
        int i11 = c10.resourceId;
        if (i11 != 0) {
            i10 = androidx.core.content.a.getColor(context, i11);
        } else {
            i10 = c10.data;
        }
        f9.h hVar = new f9.h();
        hVar.k(context);
        hVar.n(ColorStateList.valueOf(i10));
        hVar.m(dimensionPixelOffset);
        hVar.setShapeAppearanceModel(mVar);
        h.b bVar = hVar.f17164a;
        if (bVar.f17192h == null) {
            bVar.f17192h = new Rect();
        }
        hVar.f17164a.f17192h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        hVar.invalidateSelf();
        return hVar;
    }

    public final int g(int i10, boolean z10) {
        int compoundPaddingLeft = this.f13020d.getCompoundPaddingLeft() + i10;
        if (getPrefixText() != null && !z10) {
            return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f13020d;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public f9.h getBoxBackground() {
        int i10 = this.M;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.D;
    }

    public int getBoxBackgroundColor() {
        return this.S;
    }

    public int getBoxBackgroundMode() {
        return this.M;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e10 = w.e(this);
        RectF rectF = this.V;
        if (e10) {
            return this.J.f17218h.a(rectF);
        }
        return this.J.f17217g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e10 = w.e(this);
        RectF rectF = this.V;
        if (e10) {
            return this.J.f17217g.a(rectF);
        }
        return this.J.f17218h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e10 = w.e(this);
        RectF rectF = this.V;
        if (e10) {
            return this.J.f17215e.a(rectF);
        }
        return this.J.f17216f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e10 = w.e(this);
        RectF rectF = this.V;
        if (e10) {
            return this.J.f17216f.a(rectF);
        }
        return this.J.f17215e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f13035k0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f13037l0;
    }

    public int getBoxStrokeWidth() {
        return this.P;
    }

    public int getBoxStrokeWidthFocused() {
        return this.Q;
    }

    public int getCounterMaxLength() {
        return this.f13036l;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f13034k && this.f13038m && (appCompatTextView = this.f13042o) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f13063z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f13062y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f13027g0;
    }

    public EditText getEditText() {
        return this.f13020d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.f13075g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.f13075g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.f13081m;
    }

    public int getEndIconMode() {
        return this.c.f13077i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.f13082n;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.f13075g;
    }

    public CharSequence getError() {
        q qVar = this.f13032j;
        if (qVar.f19700q) {
            return qVar.f19699p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f13032j.f19703t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f13032j.f19702s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f13032j.f19701r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        q qVar = this.f13032j;
        if (qVar.f19707x) {
            return qVar.f19706w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f13032j.f19708y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A) {
            return this.B;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f13051s0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        com.google.android.material.internal.a aVar = this.f13051s0;
        return aVar.f(aVar.f12658o);
    }

    public ColorStateList getHintTextColor() {
        return this.f13029h0;
    }

    public f getLengthCounter() {
        return this.f13040n;
    }

    public int getMaxEms() {
        return this.f13026g;
    }

    public int getMaxWidth() {
        return this.f13030i;
    }

    public int getMinEms() {
        return this.f13024f;
    }

    public int getMinWidth() {
        return this.f13028h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.f13075g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.f13075g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f13050s) {
            return this.f13048r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f13056v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f13054u;
    }

    public CharSequence getPrefixText() {
        return this.f13017b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f13017b.f19719b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f13017b.f19719b;
    }

    public m getShapeAppearanceModel() {
        return this.J;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f13017b.f19720d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f13017b.f19720d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f13017b.f19723g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f13017b.f19724h;
    }

    public CharSequence getSuffixText() {
        return this.c.f13084p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.f13085q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.f13085q;
    }

    public Typeface getTypeface() {
        return this.W;
    }

    public final int h(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f13020d.getCompoundPaddingRight();
        if (getPrefixText() != null && z10) {
            return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
        }
        return compoundPaddingRight;
    }

    public final void i() {
        boolean z10;
        int i10 = this.M;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (this.A && !(this.D instanceof k9.i)) {
                        m mVar = this.J;
                        int i11 = k9.i.f19660y;
                        if (mVar == null) {
                            mVar = new m();
                        }
                        this.D = new i.b(new i.a(mVar, new RectF()));
                    } else {
                        this.D = new f9.h(this.J);
                    }
                    this.H = null;
                    this.I = null;
                } else {
                    throw new IllegalArgumentException(a6.h.g(new StringBuilder(), this.M, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.D = new f9.h(this.J);
                this.H = new f9.h();
                this.I = new f9.h();
            }
        } else {
            this.D = null;
            this.H = null;
            this.I = null;
        }
        r();
        w();
        boolean z11 = false;
        if (this.M == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.N = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (b9.c.e(getContext())) {
                this.N = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f13020d != null && this.M == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z11 = true;
            }
            if (z11) {
                EditText editText = this.f13020d;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.e.k(editText, f0.e.f(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), f0.e.e(this.f13020d), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (b9.c.e(getContext())) {
                EditText editText2 = this.f13020d;
                WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                f0.e.k(editText2, f0.e.f(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), f0.e.e(this.f13020d), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.M != 0) {
            s();
        }
        EditText editText3 = this.f13020d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.M;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f10;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        int i10;
        int i11;
        if (!e()) {
            return;
        }
        int width = this.f13020d.getWidth();
        int gravity = this.f13020d.getGravity();
        com.google.android.material.internal.a aVar = this.f13051s0;
        boolean b10 = aVar.b(aVar.G);
        aVar.I = b10;
        Rect rect = aVar.f12644h;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                if (b10) {
                    f10 = rect.right;
                    f11 = aVar.f12649j0;
                } else {
                    i11 = rect.left;
                    f12 = i11;
                }
            } else if (b10) {
                i11 = rect.left;
                f12 = i11;
            } else {
                f10 = rect.right;
                f11 = aVar.f12649j0;
            }
            float max = Math.max(f12, rect.left);
            rectF = this.V;
            rectF.left = max;
            rectF.top = rect.top;
            if (gravity == 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (aVar.I) {
                        i10 = rect.right;
                        f13 = i10;
                    } else {
                        f13 = aVar.f12649j0 + max;
                    }
                } else if (aVar.I) {
                    f13 = aVar.f12649j0 + max;
                } else {
                    i10 = rect.right;
                    f13 = i10;
                }
            } else {
                f13 = (width / 2.0f) + (aVar.f12649j0 / 2.0f);
            }
            rectF.right = Math.min(f13, rect.right);
            rectF.bottom = aVar.e() + rect.top;
            if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                float f14 = rectF.left;
                float f15 = this.L;
                rectF.left = f14 - f15;
                rectF.right += f15;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.O);
                k9.i iVar = (k9.i) this.D;
                iVar.getClass();
                iVar.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
        }
        f10 = width / 2.0f;
        f11 = aVar.f12649j0 / 2.0f;
        f12 = f10 - f11;
        float max2 = Math.max(f12, rect.left);
        rectF = this.V;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f13 = (width / 2.0f) + (aVar.f12649j0 / 2.0f);
        rectF.right = Math.min(f13, rect.right);
        rectF.bottom = aVar.e() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    public final void l(TextView textView, int i10) {
        boolean z10 = true;
        try {
            textView.setTextAppearance(i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            textView.setTextAppearance(2132017600);
            textView.setTextColor(androidx.core.content.a.getColor(getContext(), R.color.design_error));
        }
    }

    public final boolean m() {
        q qVar = this.f13032j;
        if (qVar.f19698o == 1 && qVar.f19701r != null && !TextUtils.isEmpty(qVar.f19699p)) {
            return true;
        }
        return false;
    }

    public final void n(Editable editable) {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        v0.a aVar;
        ((t5.f) this.f13040n).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        boolean z12 = this.f13038m;
        int i12 = this.f13036l;
        String str = null;
        if (i12 == -1) {
            this.f13042o.setText(String.valueOf(i10));
            this.f13042o.setContentDescription(null);
            this.f13038m = false;
        } else {
            if (i10 > i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f13038m = z10;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.f13042o;
            int i13 = this.f13036l;
            if (this.f13038m) {
                i11 = R.string.arg_res_0x7f1300a1;
            } else {
                i11 = R.string.arg_res_0x7f1300a0;
            }
            appCompatTextView.setContentDescription(context.getString(i11, Integer.valueOf(i10), Integer.valueOf(i13)));
            if (z12 != this.f13038m) {
                o();
            }
            String str2 = v0.a.f30459d;
            Locale locale = Locale.getDefault();
            int i14 = v0.f.f30479a;
            if (f.a.a(locale) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                aVar = v0.a.f30462g;
            } else {
                aVar = v0.a.f30461f;
            }
            AppCompatTextView appCompatTextView2 = this.f13042o;
            String string = getContext().getString(R.string.arg_res_0x7f1300a2, Integer.valueOf(i10), Integer.valueOf(this.f13036l));
            if (string == null) {
                aVar.getClass();
            } else {
                str = aVar.c(string, aVar.c).toString();
            }
            appCompatTextView2.setText(str);
        }
        if (this.f13020d != null && z12 != this.f13038m) {
            t(false, false);
            w();
            q();
        }
    }

    public final void o() {
        int i10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f13042o;
        if (appCompatTextView != null) {
            if (this.f13038m) {
                i10 = this.f13044p;
            } else {
                i10 = this.f13046q;
            }
            l(appCompatTextView, i10);
            if (!this.f13038m && (colorStateList2 = this.f13062y) != null) {
                this.f13042o.setTextColor(colorStateList2);
            }
            if (this.f13038m && (colorStateList = this.f13063z) != null) {
                this.f13042o.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f13051s0.h(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        int compoundPaddingTop;
        boolean z13;
        int compoundPaddingBottom;
        boolean z14;
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f13020d;
        if (editText != null) {
            Rect rect = this.T;
            w8.c.a(this, editText, rect);
            f9.h hVar = this.H;
            if (hVar != null) {
                int i14 = rect.bottom;
                hVar.setBounds(rect.left, i14 - this.P, rect.right, i14);
            }
            f9.h hVar2 = this.I;
            if (hVar2 != null) {
                int i15 = rect.bottom;
                hVar2.setBounds(rect.left, i15 - this.Q, rect.right, i15);
            }
            if (this.A) {
                float textSize = this.f13020d.getTextSize();
                com.google.android.material.internal.a aVar = this.f13051s0;
                if (aVar.f12652l != textSize) {
                    aVar.f12652l = textSize;
                    aVar.i(false);
                }
                int gravity = this.f13020d.getGravity();
                aVar.l((gravity & (-113)) | 48);
                if (aVar.f12648j != gravity) {
                    aVar.f12648j = gravity;
                    aVar.i(false);
                }
                if (this.f13020d != null) {
                    boolean e10 = w.e(this);
                    int i16 = rect.bottom;
                    Rect rect2 = this.U;
                    rect2.bottom = i16;
                    int i17 = this.M;
                    if (i17 != 1) {
                        if (i17 != 2) {
                            rect2.left = g(rect.left, e10);
                            rect2.top = getPaddingTop();
                            rect2.right = h(rect.right, e10);
                        } else {
                            rect2.left = this.f13020d.getPaddingLeft() + rect.left;
                            rect2.top = rect.top - c();
                            rect2.right = rect.right - this.f13020d.getPaddingRight();
                        }
                    } else {
                        rect2.left = g(rect.left, e10);
                        rect2.top = rect.top + this.N;
                        rect2.right = h(rect.right, e10);
                    }
                    int i18 = rect2.left;
                    int i19 = rect2.top;
                    int i20 = rect2.right;
                    int i21 = rect2.bottom;
                    Rect rect3 = aVar.f12644h;
                    if (rect3.left == i18 && rect3.top == i19 && rect3.right == i20 && rect3.bottom == i21) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        rect3.set(i18, i19, i20, i21);
                        aVar.S = true;
                    }
                    if (this.f13020d != null) {
                        TextPaint textPaint = aVar.U;
                        textPaint.setTextSize(aVar.f12652l);
                        textPaint.setTypeface(aVar.f12672z);
                        textPaint.setLetterSpacing(aVar.f12643g0);
                        float f10 = -textPaint.ascent();
                        rect2.left = this.f13020d.getCompoundPaddingLeft() + rect.left;
                        if (this.M == 1 && this.f13020d.getMinLines() <= 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            compoundPaddingTop = (int) (rect.centerY() - (f10 / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.f13020d.getCompoundPaddingTop();
                        }
                        rect2.top = compoundPaddingTop;
                        rect2.right = rect.right - this.f13020d.getCompoundPaddingRight();
                        if (this.M == 1 && this.f13020d.getMinLines() <= 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            compoundPaddingBottom = (int) (rect2.top + f10);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.f13020d.getCompoundPaddingBottom();
                        }
                        rect2.bottom = compoundPaddingBottom;
                        int i22 = rect2.left;
                        int i23 = rect2.top;
                        int i24 = rect2.right;
                        Rect rect4 = aVar.f12642g;
                        if (rect4.left == i22 && rect4.top == i23 && rect4.right == i24 && rect4.bottom == compoundPaddingBottom) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            rect4.set(i22, i23, i24, compoundPaddingBottom);
                            aVar.S = true;
                        }
                        aVar.i(false);
                        if (e() && !this.f13049r0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        EditText editText;
        int max;
        super.onMeasure(i10, i11);
        EditText editText2 = this.f13020d;
        com.google.android.material.textfield.a aVar = this.c;
        if (editText2 != null && this.f13020d.getMeasuredHeight() < (max = Math.max(aVar.getMeasuredHeight(), this.f13017b.getMeasuredHeight()))) {
            this.f13020d.setMinimumHeight(max);
            z10 = true;
        } else {
            z10 = false;
        }
        boolean p10 = p();
        if (z10 || p10) {
            this.f13020d.post(new c());
        }
        if (this.f13052t != null && (editText = this.f13020d) != null) {
            this.f13052t.setGravity(editText.getGravity());
            this.f13052t.setPadding(this.f13020d.getCompoundPaddingLeft(), this.f13020d.getCompoundPaddingTop(), this.f13020d.getCompoundPaddingRight(), this.f13020d.getCompoundPaddingBottom());
        }
        aVar.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f5506a);
        setError(iVar.c);
        if (iVar.f13069d) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != this.K) {
            f9.d dVar = this.J.f17215e;
            RectF rectF = this.V;
            float a10 = dVar.a(rectF);
            float a11 = this.J.f17216f.a(rectF);
            float a12 = this.J.f17218h.a(rectF);
            float a13 = this.J.f17217g.a(rectF);
            m mVar = this.J;
            ge.a aVar = mVar.f17212a;
            m.a aVar2 = new m.a();
            ge.a aVar3 = mVar.f17213b;
            aVar2.f17223a = aVar3;
            float a14 = m.a.a(aVar3);
            if (a14 != -1.0f) {
                aVar2.e(a14);
            }
            aVar2.f17224b = aVar;
            float a15 = m.a.a(aVar);
            if (a15 != -1.0f) {
                aVar2.f(a15);
            }
            ge.a aVar4 = mVar.c;
            aVar2.f17225d = aVar4;
            float a16 = m.a.a(aVar4);
            if (a16 != -1.0f) {
                aVar2.c(a16);
            }
            ge.a aVar5 = mVar.f17214d;
            aVar2.c = aVar5;
            float a17 = m.a.a(aVar5);
            if (a17 != -1.0f) {
                aVar2.d(a17);
            }
            aVar2.e(a11);
            aVar2.f(a10);
            aVar2.c(a13);
            aVar2.d(a12);
            m mVar2 = new m(aVar2);
            this.K = z10;
            setShapeAppearanceModel(mVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        i iVar = new i(super.onSaveInstanceState());
        if (m()) {
            iVar.c = getError();
        }
        com.google.android.material.textfield.a aVar = this.c;
        boolean z11 = true;
        if (aVar.f13077i != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !aVar.f13075g.isChecked()) {
            z11 = false;
        }
        iVar.f13069d = z11;
        return iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (r3.c() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (r3.f13084p != null) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f13020d;
        if (editText == null || this.M != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = a0.f2488a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(androidx.appcompat.widget.h.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f13038m && (appCompatTextView = this.f13042o) != null) {
            mutate.setColorFilter(androidx.appcompat.widget.h.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f13020d.refreshDrawableState();
        }
    }

    public final void r() {
        EditText editText = this.f13020d;
        if (editText != null && this.D != null) {
            if ((this.G || editText.getBackground() == null) && this.M != 0) {
                EditText editText2 = this.f13020d;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.d.q(editText2, editTextBoxBackground);
                this.G = true;
            }
        }
    }

    public final void s() {
        if (this.M != 1) {
            FrameLayout frameLayout = this.f13015a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c10 = c();
            if (c10 != layoutParams.topMargin) {
                layoutParams.topMargin = c10;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.S != i10) {
            this.S = i10;
            this.f13039m0 = i10;
            this.f13043o0 = i10;
            this.f13045p0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.a.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f13039m0 = defaultColor;
        this.S = defaultColor;
        this.f13041n0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f13043o0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f13045p0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.M) {
            return;
        }
        this.M = i10;
        if (this.f13020d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.N = i10;
    }

    public void setBoxCornerFamily(int i10) {
        m mVar = this.J;
        mVar.getClass();
        m.a aVar = new m.a(mVar);
        f9.d dVar = this.J.f17215e;
        ge.a p10 = b.b.p(i10);
        aVar.f17223a = p10;
        float a10 = m.a.a(p10);
        if (a10 != -1.0f) {
            aVar.e(a10);
        }
        aVar.f17226e = dVar;
        f9.d dVar2 = this.J.f17216f;
        ge.a p11 = b.b.p(i10);
        aVar.f17224b = p11;
        float a11 = m.a.a(p11);
        if (a11 != -1.0f) {
            aVar.f(a11);
        }
        aVar.f17227f = dVar2;
        f9.d dVar3 = this.J.f17218h;
        ge.a p12 = b.b.p(i10);
        aVar.f17225d = p12;
        float a12 = m.a.a(p12);
        if (a12 != -1.0f) {
            aVar.c(a12);
        }
        aVar.f17229h = dVar3;
        f9.d dVar4 = this.J.f17217g;
        ge.a p13 = b.b.p(i10);
        aVar.c = p13;
        float a13 = m.a.a(p13);
        if (a13 != -1.0f) {
            aVar.d(a13);
        }
        aVar.f17228g = dVar4;
        this.J = new m(aVar);
        b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f13035k0 != i10) {
            this.f13035k0 = i10;
            w();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f13031i0 = colorStateList.getDefaultColor();
            this.f13047q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f13033j0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f13035k0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f13035k0 != colorStateList.getDefaultColor()) {
            this.f13035k0 = colorStateList.getDefaultColor();
        }
        w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f13037l0 != colorStateList) {
            this.f13037l0 = colorStateList;
            w();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.P = i10;
        w();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.Q = i10;
        w();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f13034k != z10) {
            Editable editable = null;
            q qVar = this.f13032j;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f13042o = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.W;
                if (typeface != null) {
                    this.f13042o.setTypeface(typeface);
                }
                this.f13042o.setMaxLines(1);
                qVar.a(this.f13042o, 2);
                x0.h.h((ViewGroup.MarginLayoutParams) this.f13042o.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f13042o != null) {
                    EditText editText = this.f13020d;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                qVar.g(this.f13042o, 2);
                this.f13042o = null;
            }
            this.f13034k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        Editable text;
        if (this.f13036l != i10) {
            if (i10 > 0) {
                this.f13036l = i10;
            } else {
                this.f13036l = -1;
            }
            if (this.f13034k && this.f13042o != null) {
                EditText editText = this.f13020d;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                n(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f13044p != i10) {
            this.f13044p = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f13063z != colorStateList) {
            this.f13063z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f13046q != i10) {
            this.f13046q = i10;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f13062y != colorStateList) {
            this.f13062y = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f13027g0 = colorStateList;
        this.f13029h0 = colorStateList;
        if (this.f13020d != null) {
            t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.c.f13075g.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.c.f13075g.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        com.google.android.material.textfield.a aVar = this.c;
        CharSequence text = i10 != 0 ? aVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = aVar.f13075g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        com.google.android.material.textfield.a aVar = this.c;
        Drawable a10 = i10 != 0 ? m.a.a(aVar.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = aVar.f13075g;
        checkableImageButton.setImageDrawable(a10);
        if (a10 != null) {
            ColorStateList colorStateList = aVar.f13079k;
            PorterDuff.Mode mode = aVar.f13080l;
            TextInputLayout textInputLayout = aVar.f13070a;
            p.a(textInputLayout, checkableImageButton, colorStateList, mode);
            p.c(textInputLayout, checkableImageButton, aVar.f13079k);
        }
    }

    public void setEndIconMinSize(int i10) {
        com.google.android.material.textfield.a aVar = this.c;
        if (i10 >= 0) {
            if (i10 != aVar.f13081m) {
                aVar.f13081m = i10;
                CheckableImageButton checkableImageButton = aVar.f13075g;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                CheckableImageButton checkableImageButton2 = aVar.c;
                checkableImageButton2.setMinimumWidth(i10);
                checkableImageButton2.setMinimumHeight(i10);
                return;
            }
            return;
        }
        aVar.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i10) {
        this.c.f(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.c;
        View.OnLongClickListener onLongClickListener = aVar.f13083o;
        CheckableImageButton checkableImageButton = aVar.f13075g;
        checkableImageButton.setOnClickListener(onClickListener);
        p.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.f13083o = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f13075g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.f13082n = scaleType;
        aVar.f13075g.setScaleType(scaleType);
        aVar.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.c;
        if (aVar.f13079k != colorStateList) {
            aVar.f13079k = colorStateList;
            p.a(aVar.f13070a, aVar.f13075g, colorStateList, aVar.f13080l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.c;
        if (aVar.f13080l != mode) {
            aVar.f13080l = mode;
            p.a(aVar.f13070a, aVar.f13075g, aVar.f13079k, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.c.g(z10);
    }

    public void setError(CharSequence charSequence) {
        q qVar = this.f13032j;
        if (!qVar.f19700q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            qVar.c();
            qVar.f19699p = charSequence;
            qVar.f19701r.setText(charSequence);
            int i10 = qVar.f19697n;
            if (i10 != 1) {
                qVar.f19698o = 1;
            }
            qVar.i(i10, qVar.f19698o, qVar.h(qVar.f19701r, charSequence));
            return;
        }
        qVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        q qVar = this.f13032j;
        qVar.f19703t = i10;
        AppCompatTextView appCompatTextView = qVar.f19701r;
        if (appCompatTextView != null) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.g.f(appCompatTextView, i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q qVar = this.f13032j;
        qVar.f19702s = charSequence;
        AppCompatTextView appCompatTextView = qVar.f19701r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        q qVar = this.f13032j;
        if (qVar.f19700q != z10) {
            qVar.c();
            TextInputLayout textInputLayout = qVar.f19691h;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(qVar.f19690g);
                qVar.f19701r = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_error);
                qVar.f19701r.setTextAlignment(5);
                Typeface typeface = qVar.B;
                if (typeface != null) {
                    qVar.f19701r.setTypeface(typeface);
                }
                int i10 = qVar.f19704u;
                qVar.f19704u = i10;
                AppCompatTextView appCompatTextView2 = qVar.f19701r;
                if (appCompatTextView2 != null) {
                    textInputLayout.l(appCompatTextView2, i10);
                }
                ColorStateList colorStateList = qVar.f19705v;
                qVar.f19705v = colorStateList;
                AppCompatTextView appCompatTextView3 = qVar.f19701r;
                if (appCompatTextView3 != null && colorStateList != null) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = qVar.f19702s;
                qVar.f19702s = charSequence;
                AppCompatTextView appCompatTextView4 = qVar.f19701r;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                int i11 = qVar.f19703t;
                qVar.f19703t = i11;
                AppCompatTextView appCompatTextView5 = qVar.f19701r;
                if (appCompatTextView5 != null) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    f0.g.f(appCompatTextView5, i11);
                }
                qVar.f19701r.setVisibility(4);
                qVar.a(qVar.f19701r, 0);
            } else {
                qVar.f();
                qVar.g(qVar.f19701r, 0);
                qVar.f19701r = null;
                textInputLayout.q();
                textInputLayout.w();
            }
            qVar.f19700q = z10;
        }
    }

    public void setErrorIconDrawable(int i10) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.h(i10 != 0 ? m.a.a(aVar.getContext(), i10) : null);
        p.c(aVar.f13070a, aVar.c, aVar.f13072d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.c;
        CheckableImageButton checkableImageButton = aVar.c;
        View.OnLongClickListener onLongClickListener = aVar.f13074f;
        checkableImageButton.setOnClickListener(onClickListener);
        p.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.f13074f = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.c;
        if (aVar.f13072d != colorStateList) {
            aVar.f13072d = colorStateList;
            p.a(aVar.f13070a, aVar.c, colorStateList, aVar.f13073e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.c;
        if (aVar.f13073e != mode) {
            aVar.f13073e = mode;
            p.a(aVar.f13070a, aVar.c, aVar.f13072d, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        q qVar = this.f13032j;
        qVar.f19704u = i10;
        AppCompatTextView appCompatTextView = qVar.f19701r;
        if (appCompatTextView != null) {
            qVar.f19691h.l(appCompatTextView, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q qVar = this.f13032j;
        qVar.f19705v = colorStateList;
        AppCompatTextView appCompatTextView = qVar.f19701r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f13053t0 != z10) {
            this.f13053t0 = z10;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        q qVar = this.f13032j;
        if (isEmpty) {
            if (qVar.f19707x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!qVar.f19707x) {
            setHelperTextEnabled(true);
        }
        qVar.c();
        qVar.f19706w = charSequence;
        qVar.f19708y.setText(charSequence);
        int i10 = qVar.f19697n;
        if (i10 != 2) {
            qVar.f19698o = 2;
        }
        qVar.i(i10, qVar.f19698o, qVar.h(qVar.f19708y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q qVar = this.f13032j;
        qVar.A = colorStateList;
        AppCompatTextView appCompatTextView = qVar.f19708y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        q qVar = this.f13032j;
        if (qVar.f19707x != z10) {
            qVar.c();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(qVar.f19690g);
                qVar.f19708y = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_helper_text);
                qVar.f19708y.setTextAlignment(5);
                Typeface typeface = qVar.B;
                if (typeface != null) {
                    qVar.f19708y.setTypeface(typeface);
                }
                qVar.f19708y.setVisibility(4);
                AppCompatTextView appCompatTextView2 = qVar.f19708y;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.g.f(appCompatTextView2, 1);
                int i10 = qVar.f19709z;
                qVar.f19709z = i10;
                AppCompatTextView appCompatTextView3 = qVar.f19708y;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setTextAppearance(i10);
                }
                ColorStateList colorStateList = qVar.A;
                qVar.A = colorStateList;
                AppCompatTextView appCompatTextView4 = qVar.f19708y;
                if (appCompatTextView4 != null && colorStateList != null) {
                    appCompatTextView4.setTextColor(colorStateList);
                }
                qVar.a(qVar.f19708y, 1);
                qVar.f19708y.setAccessibilityDelegate(new r(qVar));
            } else {
                qVar.c();
                int i11 = qVar.f19697n;
                if (i11 == 2) {
                    qVar.f19698o = 0;
                }
                qVar.i(i11, qVar.f19698o, qVar.h(qVar.f19708y, ""));
                qVar.g(qVar.f19708y, 1);
                qVar.f19708y = null;
                TextInputLayout textInputLayout = qVar.f19691h;
                textInputLayout.q();
                textInputLayout.w();
            }
            qVar.f19707x = z10;
        }
    }

    public void setHelperTextTextAppearance(int i10) {
        q qVar = this.f13032j;
        qVar.f19709z = i10;
        AppCompatTextView appCompatTextView = qVar.f19708y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f13055u0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.A) {
            this.A = z10;
            if (!z10) {
                this.C = false;
                if (!TextUtils.isEmpty(this.B) && TextUtils.isEmpty(this.f13020d.getHint())) {
                    this.f13020d.setHint(this.B);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f13020d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.B)) {
                        setHint(hint);
                    }
                    this.f13020d.setHint((CharSequence) null);
                }
                this.C = true;
            }
            if (this.f13020d != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        com.google.android.material.internal.a aVar = this.f13051s0;
        aVar.k(i10);
        this.f13029h0 = aVar.f12658o;
        if (this.f13020d != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f13029h0 != colorStateList) {
            if (this.f13027g0 == null) {
                com.google.android.material.internal.a aVar = this.f13051s0;
                if (aVar.f12658o != colorStateList) {
                    aVar.f12658o = colorStateList;
                    aVar.i(false);
                }
            }
            this.f13029h0 = colorStateList;
            if (this.f13020d != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.f13040n = fVar;
    }

    public void setMaxEms(int i10) {
        this.f13026g = i10;
        EditText editText = this.f13020d;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f13030i = i10;
        EditText editText = this.f13020d;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f13024f = i10;
        EditText editText = this.f13020d;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f13028h = i10;
        EditText editText = this.f13020d;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.f13075g.setContentDescription(i10 != 0 ? aVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.f13075g.setImageDrawable(i10 != 0 ? m.a.a(aVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        com.google.android.material.textfield.a aVar = this.c;
        if (z10 && aVar.f13077i != 1) {
            aVar.f(1);
        } else if (!z10) {
            aVar.f(0);
        } else {
            aVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.f13079k = colorStateList;
        p.a(aVar.f13070a, aVar.f13075g, colorStateList, aVar.f13080l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.c;
        aVar.f13080l = mode;
        p.a(aVar.f13070a, aVar.f13075g, aVar.f13079k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable text;
        if (this.f13052t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f13052t = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f13052t;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.s(appCompatTextView2, 2);
            f2.d d10 = d();
            this.f13058w = d10;
            d10.f17037b = 67L;
            this.f13060x = d();
            setPlaceholderTextAppearance(this.f13056v);
            setPlaceholderTextColor(this.f13054u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f13050s) {
                setPlaceholderTextEnabled(true);
            }
            this.f13048r = charSequence;
        }
        EditText editText = this.f13020d;
        if (editText == null) {
            text = null;
        } else {
            text = editText.getText();
        }
        u(text);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f13056v = i10;
        AppCompatTextView appCompatTextView = this.f13052t;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f13054u != colorStateList) {
            this.f13054u = colorStateList;
            AppCompatTextView appCompatTextView = this.f13052t;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        u uVar = this.f13017b;
        uVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        uVar.c = charSequence2;
        uVar.f19719b.setText(charSequence);
        uVar.d();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f13017b.f19719b.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f13017b.f19719b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(m mVar) {
        f9.h hVar = this.D;
        if (hVar != null && hVar.f17164a.f17186a != mVar) {
            this.J = mVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f13017b.f19720d.setCheckable(z10);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f13017b.f19720d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? m.a.a(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        u uVar = this.f13017b;
        if (i10 >= 0) {
            if (i10 != uVar.f19723g) {
                uVar.f19723g = i10;
                CheckableImageButton checkableImageButton = uVar.f19720d;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                return;
            }
            return;
        }
        uVar.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        u uVar = this.f13017b;
        View.OnLongClickListener onLongClickListener = uVar.f19725i;
        CheckableImageButton checkableImageButton = uVar.f19720d;
        checkableImageButton.setOnClickListener(onClickListener);
        p.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        u uVar = this.f13017b;
        uVar.f19725i = onLongClickListener;
        CheckableImageButton checkableImageButton = uVar.f19720d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        u uVar = this.f13017b;
        uVar.f19724h = scaleType;
        uVar.f19720d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        u uVar = this.f13017b;
        if (uVar.f19721e != colorStateList) {
            uVar.f19721e = colorStateList;
            p.a(uVar.f19718a, uVar.f19720d, colorStateList, uVar.f19722f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        u uVar = this.f13017b;
        if (uVar.f19722f != mode) {
            uVar.f19722f = mode;
            p.a(uVar.f19718a, uVar.f19720d, uVar.f19721e, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f13017b.b(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        com.google.android.material.textfield.a aVar = this.c;
        aVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        aVar.f13084p = charSequence2;
        aVar.f13085q.setText(charSequence);
        aVar.m();
    }

    public void setSuffixTextAppearance(int i10) {
        this.c.f13085q.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.f13085q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f13020d;
        if (editText != null) {
            f0.o(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.W) {
            this.W = typeface;
            com.google.android.material.internal.a aVar = this.f13051s0;
            boolean m10 = aVar.m(typeface);
            boolean o10 = aVar.o(typeface);
            if (m10 || o10) {
                aVar.i(false);
            }
            q qVar = this.f13032j;
            if (typeface != qVar.B) {
                qVar.B = typeface;
                AppCompatTextView appCompatTextView = qVar.f19701r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = qVar.f19708y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f13042o;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f13020d;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.f13020d;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        ColorStateList colorStateList3 = this.f13027g0;
        com.google.android.material.internal.a aVar = this.f13051s0;
        if (colorStateList3 != null) {
            aVar.j(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f13027g0;
            if (colorStateList4 != null) {
                i10 = colorStateList4.getColorForState(new int[]{-16842910}, this.f13047q0);
            } else {
                i10 = this.f13047q0;
            }
            aVar.j(ColorStateList.valueOf(i10));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.f13032j.f19701r;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            aVar.j(colorStateList2);
        } else if (this.f13038m && (appCompatTextView = this.f13042o) != null) {
            aVar.j(appCompatTextView.getTextColors());
        } else if (z13 && (colorStateList = this.f13029h0) != null && aVar.f12658o != colorStateList) {
            aVar.f12658o = colorStateList;
            aVar.i(false);
        }
        com.google.android.material.textfield.a aVar2 = this.c;
        u uVar = this.f13017b;
        if (!z12 && this.f13053t0 && (!isEnabled() || !z13)) {
            if (z11 || !this.f13049r0) {
                ValueAnimator valueAnimator = this.f13057v0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f13057v0.cancel();
                }
                if (z10 && this.f13055u0) {
                    a(0.0f);
                } else {
                    aVar.p(0.0f);
                }
                if (e() && (!((k9.i) this.D).f19661x.f19662v.isEmpty()) && e()) {
                    ((k9.i) this.D).x(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.f13049r0 = true;
                AppCompatTextView appCompatTextView3 = this.f13052t;
                if (appCompatTextView3 != null && this.f13050s) {
                    appCompatTextView3.setText((CharSequence) null);
                    o.a(this.f13015a, this.f13060x);
                    this.f13052t.setVisibility(4);
                }
                uVar.f19726j = true;
                uVar.d();
                aVar2.f13086r = true;
                aVar2.m();
            }
        } else if (z11 || this.f13049r0) {
            ValueAnimator valueAnimator2 = this.f13057v0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f13057v0.cancel();
            }
            if (z10 && this.f13055u0) {
                a(1.0f);
            } else {
                aVar.p(1.0f);
            }
            this.f13049r0 = false;
            if (e()) {
                j();
            }
            EditText editText3 = this.f13020d;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            u(editable);
            uVar.f19726j = false;
            uVar.d();
            aVar2.f13086r = false;
            aVar2.m();
        }
    }

    public final void u(Editable editable) {
        int i10;
        ((t5.f) this.f13040n).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        FrameLayout frameLayout = this.f13015a;
        if (i10 == 0 && !this.f13049r0) {
            if (this.f13052t != null && this.f13050s && !TextUtils.isEmpty(this.f13048r)) {
                this.f13052t.setText(this.f13048r);
                o.a(frameLayout, this.f13058w);
                this.f13052t.setVisibility(0);
                this.f13052t.bringToFront();
                announceForAccessibility(this.f13048r);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView = this.f13052t;
        if (appCompatTextView != null && this.f13050s) {
            appCompatTextView.setText((CharSequence) null);
            o.a(frameLayout, this.f13060x);
            this.f13052t.setVisibility(4);
        }
    }

    public final void v(boolean z10, boolean z11) {
        int defaultColor = this.f13037l0.getDefaultColor();
        int colorForState = this.f13037l0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f13037l0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.R = colorForState2;
        } else if (z11) {
            this.R = colorForState;
        } else {
            this.R = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.w():void");
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f13017b.a(drawable);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018044), attributeSet, i10);
        this.f13024f = -1;
        this.f13026g = -1;
        this.f13028h = -1;
        this.f13030i = -1;
        this.f13032j = new q(this);
        this.f13040n = new t5.f(7);
        this.T = new Rect();
        this.U = new Rect();
        this.V = new RectF();
        this.f13019c0 = new LinkedHashSet<>();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f13051s0 = aVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f13015a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = f8.b.f17141a;
        aVar.W = linearInterpolator;
        aVar.i(false);
        aVar.V = linearInterpolator;
        aVar.i(false);
        aVar.l(8388659);
        u0 e10 = s.e(context2, attributeSet, e8.a.f16483f0, i10, 2132018044, 22, 20, 38, 43, 47);
        u uVar = new u(this, e10);
        this.f13017b = uVar;
        this.A = e10.a(46, true);
        setHint(e10.k(4));
        this.f13055u0 = e10.a(45, true);
        this.f13053t0 = e10.a(40, true);
        if (e10.l(6)) {
            setMinEms(e10.h(6, -1));
        } else if (e10.l(3)) {
            setMinWidth(e10.d(3, -1));
        }
        if (e10.l(5)) {
            setMaxEms(e10.h(5, -1));
        } else if (e10.l(2)) {
            setMaxWidth(e10.d(2, -1));
        }
        this.J = new m(m.c(context2, attributeSet, i10, 2132018044));
        this.L = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.N = e10.c(9, 0);
        this.P = e10.d(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.Q = e10.d(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.O = this.P;
        TypedArray typedArray = e10.f2688b;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        m mVar = this.J;
        mVar.getClass();
        m.a aVar2 = new m.a(mVar);
        if (dimension >= 0.0f) {
            aVar2.e(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVar2.f(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVar2.d(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVar2.c(dimension4);
        }
        this.J = new m(aVar2);
        ColorStateList b10 = b9.c.b(context2, e10, 7);
        if (b10 != null) {
            int defaultColor = b10.getDefaultColor();
            this.f13039m0 = defaultColor;
            this.S = defaultColor;
            if (b10.isStateful()) {
                this.f13041n0 = b10.getColorForState(new int[]{-16842910}, -1);
                this.f13043o0 = b10.getColorForState(new int[]{16842908, 16842910}, -1);
                this.f13045p0 = b10.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f13043o0 = this.f13039m0;
                ColorStateList colorStateList = androidx.core.content.a.getColorStateList(context2, R.color.mtrl_filled_background_color);
                this.f13041n0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f13045p0 = colorStateList.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.S = 0;
            this.f13039m0 = 0;
            this.f13041n0 = 0;
            this.f13043o0 = 0;
            this.f13045p0 = 0;
        }
        if (e10.l(1)) {
            ColorStateList b11 = e10.b(1);
            this.f13029h0 = b11;
            this.f13027g0 = b11;
        }
        ColorStateList b12 = b9.c.b(context2, e10, 14);
        this.f13035k0 = typedArray.getColor(14, 0);
        this.f13031i0 = androidx.core.content.a.getColor(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.f13047q0 = androidx.core.content.a.getColor(context2, R.color.mtrl_textinput_disabled_color);
        this.f13033j0 = androidx.core.content.a.getColor(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b12 != null) {
            setBoxStrokeColorStateList(b12);
        }
        if (e10.l(15)) {
            setBoxStrokeErrorColor(b9.c.b(context2, e10, 15));
        }
        if (e10.i(47, -1) != -1) {
            setHintTextAppearance(e10.i(47, 0));
        }
        int i11 = e10.i(38, 0);
        CharSequence k10 = e10.k(33);
        int h10 = e10.h(32, 1);
        boolean a10 = e10.a(34, false);
        int i12 = e10.i(43, 0);
        boolean a11 = e10.a(42, false);
        CharSequence k11 = e10.k(41);
        int i13 = e10.i(55, 0);
        CharSequence k12 = e10.k(54);
        boolean a12 = e10.a(18, false);
        setCounterMaxLength(e10.h(19, -1));
        this.f13046q = e10.i(22, 0);
        this.f13044p = e10.i(20, 0);
        setBoxBackgroundMode(e10.h(8, 0));
        setErrorContentDescription(k10);
        setErrorAccessibilityLiveRegion(h10);
        setCounterOverflowTextAppearance(this.f13044p);
        setHelperTextTextAppearance(i12);
        setErrorTextAppearance(i11);
        setCounterTextAppearance(this.f13046q);
        setPlaceholderText(k12);
        setPlaceholderTextAppearance(i13);
        if (e10.l(39)) {
            setErrorTextColor(e10.b(39));
        }
        if (e10.l(44)) {
            setHelperTextColor(e10.b(44));
        }
        if (e10.l(48)) {
            setHintTextColor(e10.b(48));
        }
        if (e10.l(23)) {
            setCounterTextColor(e10.b(23));
        }
        if (e10.l(21)) {
            setCounterOverflowTextColor(e10.b(21));
        }
        if (e10.l(56)) {
            setPlaceholderTextColor(e10.b(56));
        }
        com.google.android.material.textfield.a aVar3 = new com.google.android.material.textfield.a(this, e10);
        this.c = aVar3;
        boolean a13 = e10.a(0, true);
        e10.n();
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.s(this, 2);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 26 && i14 >= 26) {
            f0.l.l(this, 1);
        }
        frameLayout.addView(uVar);
        frameLayout.addView(aVar3);
        addView(frameLayout);
        setEnabled(a13);
        setHelperTextEnabled(a11);
        setErrorEnabled(a10);
        setCounterEnabled(a12);
        setHelperText(k11);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.f13075g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.f13075g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.f13075g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        com.google.android.material.textfield.a aVar = this.c;
        CheckableImageButton checkableImageButton = aVar.f13075g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = aVar.f13079k;
            PorterDuff.Mode mode = aVar.f13080l;
            TextInputLayout textInputLayout = aVar.f13070a;
            p.a(textInputLayout, checkableImageButton, colorStateList, mode);
            p.c(textInputLayout, checkableImageButton, aVar.f13079k);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.t(!textInputLayout.f13061x0, false);
            if (textInputLayout.f13034k) {
                textInputLayout.n(editable);
            }
            if (textInputLayout.f13050s) {
                textInputLayout.u(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
