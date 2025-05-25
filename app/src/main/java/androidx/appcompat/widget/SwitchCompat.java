package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.g;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final a R = new a();
    public static final int[] S = {16842912};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public ColorStateList J;
    public StaticLayout K;
    public StaticLayout L;
    public p.a M;
    public ObjectAnimator N;
    public j O;
    public c P;
    public final Rect Q;

    /* renamed from: a  reason: collision with root package name */
    public Drawable f2417a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f2418b;
    public PorterDuff.Mode c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2419d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2420e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f2421f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2422g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f2423h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2424i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2425j;

    /* renamed from: k  reason: collision with root package name */
    public int f2426k;

    /* renamed from: l  reason: collision with root package name */
    public int f2427l;

    /* renamed from: m  reason: collision with root package name */
    public int f2428m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2429n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f2430o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f2431p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f2432q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f2433r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2434s;

    /* renamed from: t  reason: collision with root package name */
    public int f2435t;

    /* renamed from: u  reason: collision with root package name */
    public final int f2436u;

    /* renamed from: v  reason: collision with root package name */
    public float f2437v;

    /* renamed from: w  reason: collision with root package name */
    public float f2438w;

    /* renamed from: x  reason: collision with root package name */
    public final VelocityTracker f2439x;

    /* renamed from: y  reason: collision with root package name */
    public final int f2440y;

    /* renamed from: z  reason: collision with root package name */
    public float f2441z;

    /* loaded from: classes.dex */
    public class a extends Property<SwitchCompat, Float> {
        public a() {
            super(Float.class, "thumbPos");
        }

        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f2441z);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends g.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f2442a;

        public c(SwitchCompat switchCompat) {
            this.f2442a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.g.e
        public final void a() {
            SwitchCompat switchCompat = (SwitchCompat) this.f2442a.get();
            if (switchCompat != null) {
                switchCompat.d();
            }
        }

        @Override // androidx.emoji2.text.g.e
        public final void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f2442a.get();
            if (switchCompat != null) {
                switchCompat.d();
            }
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private j getEmojiTextViewHelper() {
        if (this.O == null) {
            this.O = new j(this);
        }
        return this.O;
    }

    private boolean getTargetCheckedState() {
        if (this.f2441z > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f10;
        if (d1.a(this)) {
            f10 = 1.0f - this.f2441z;
        } else {
            f10 = this.f2441z;
        }
        return (int) ((f10 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f2421f;
        if (drawable != null) {
            Rect rect2 = this.Q;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f2417a;
            if (drawable2 != null) {
                rect = a0.b(drawable2);
            } else {
                rect = a0.c;
            }
            return ((((this.A - this.C) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f2432q = charSequence;
        j emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e10 = emojiTextViewHelper.f2610b.f18420a.e(this.M);
        if (e10 != null) {
            charSequence = e10.getTransformation(charSequence, this);
        }
        this.f2433r = charSequence;
        this.L = null;
        if (this.f2434s) {
            e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f2430o = charSequence;
        j emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e10 = emojiTextViewHelper.f2610b.f18420a.e(this.M);
        if (e10 != null) {
            charSequence = e10.getTransformation(charSequence, this);
        }
        this.f2431p = charSequence;
        this.K = null;
        if (this.f2434s) {
            e();
        }
    }

    public final void a() {
        Drawable drawable = this.f2417a;
        if (drawable != null) {
            if (this.f2419d || this.f2420e) {
                Drawable mutate = drawable.mutate();
                this.f2417a = mutate;
                if (this.f2419d) {
                    a.b.h(mutate, this.f2418b);
                }
                if (this.f2420e) {
                    a.b.i(this.f2417a, this.c);
                }
                if (this.f2417a.isStateful()) {
                    this.f2417a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f2421f;
        if (drawable != null) {
            if (this.f2424i || this.f2425j) {
                Drawable mutate = drawable.mutate();
                this.f2421f = mutate;
                if (this.f2424i) {
                    a.b.h(mutate, this.f2422g);
                }
                if (this.f2425j) {
                    a.b.i(this.f2421f, this.f2423h);
                }
                if (this.f2421f.isStateful()) {
                    this.f2421f.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        int i10;
        TextPaint textPaint = this.I;
        if (charSequence != null) {
            i10 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i10 = 0;
        }
        return new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void d() {
        setTextOnInternal(this.f2430o);
        setTextOffInternal(this.f2432q);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i10;
        int i11;
        int i12 = this.D;
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f2417a;
        if (drawable != null) {
            rect = a0.b(drawable);
        } else {
            rect = a0.c;
        }
        Drawable drawable2 = this.f2421f;
        Rect rect2 = this.Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i16 = rect2.left;
            thumbOffset += i16;
            if (rect != null) {
                int i17 = rect.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rect.top;
                int i19 = rect2.top;
                if (i18 > i19) {
                    i10 = (i18 - i19) + i13;
                } else {
                    i10 = i13;
                }
                int i20 = rect.right;
                int i21 = rect2.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rect.bottom;
                int i23 = rect2.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f2421f.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f2421f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f2417a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i24 = thumbOffset - rect2.left;
            int i25 = thumbOffset + this.C + rect2.right;
            this.f2417a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                a.b.f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f2417a;
        if (drawable != null) {
            a.b.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.f2421f;
        if (drawable2 != null) {
            a.b.e(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2417a;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f2421f;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        boolean z10;
        if (this.P == null && this.O.f2610b.f18420a.b()) {
            if (androidx.emoji2.text.g.f3618j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                androidx.emoji2.text.g a10 = androidx.emoji2.text.g.a();
                int b10 = a10.b();
                if (b10 == 3 || b10 == 0) {
                    c cVar = new c(this);
                    this.P = cVar;
                    a10.g(cVar);
                }
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!d1.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f2428m;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (d1.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f2428m;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return b1.m.g(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f2434s;
    }

    public boolean getSplitTrack() {
        return this.f2429n;
    }

    public int getSwitchMinWidth() {
        return this.f2427l;
    }

    public int getSwitchPadding() {
        return this.f2428m;
    }

    public CharSequence getTextOff() {
        return this.f2432q;
    }

    public CharSequence getTextOn() {
        return this.f2430o;
    }

    public Drawable getThumbDrawable() {
        return this.f2417a;
    }

    public final float getThumbPosition() {
        return this.f2441z;
    }

    public int getThumbTextPadding() {
        return this.f2426k;
    }

    public ColorStateList getThumbTintList() {
        return this.f2418b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f2421f;
    }

    public ColorStateList getTrackTintList() {
        return this.f2422g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f2423h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2417a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2421f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.N.end();
            this.N = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, S);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f2421f;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.E;
        int i11 = this.G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f2417a;
        if (drawable != null) {
            if (this.f2429n && drawable2 != null) {
                Rect b10 = a0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b10.left;
                rect.right -= b10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.K;
        } else {
            staticLayout = this.L;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            TextPaint textPaint = this.I;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f2430o;
            } else {
                charSequence = this.f2432q;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        int i16;
        int i17;
        super.onLayout(z10, i10, i11, i12, i13);
        int i18 = 0;
        if (this.f2417a != null) {
            Drawable drawable = this.f2421f;
            Rect rect = this.Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b10 = a0.b(this.f2417a);
            i14 = Math.max(0, b10.left - rect.left);
            i18 = Math.max(0, b10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (d1.a(this)) {
            i15 = getPaddingLeft() + i14;
            width = ((this.A + i15) - i14) - i18;
        } else {
            width = (getWidth() - getPaddingRight()) - i18;
            i15 = (width - this.A) + i14 + i18;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i17 = getPaddingTop();
                i16 = this.B + i17;
            } else {
                i16 = getHeight() - getPaddingBottom();
                i17 = i16 - this.B;
            }
        } else {
            int paddingTop = getPaddingTop();
            int i19 = this.B;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i19 / 2);
            i16 = i19 + height;
            i17 = height;
        }
        this.D = i15;
        this.E = i17;
        this.G = i16;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f2434s) {
            if (this.K == null) {
                this.K = c(this.f2431p);
            }
            if (this.L == null) {
                this.L = c(this.f2433r);
            }
        }
        Drawable drawable = this.f2417a;
        int i16 = 0;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            i12 = (this.f2417a.getIntrinsicWidth() - rect.left) - rect.right;
            i13 = this.f2417a.getIntrinsicHeight();
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (this.f2434s) {
            i14 = (this.f2426k * 2) + Math.max(this.K.getWidth(), this.L.getWidth());
        } else {
            i14 = 0;
        }
        this.C = Math.max(i14, i12);
        Drawable drawable2 = this.f2421f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i16 = this.f2421f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i17 = rect.left;
        int i18 = rect.right;
        Drawable drawable3 = this.f2417a;
        if (drawable3 != null) {
            Rect b10 = a0.b(drawable3);
            i17 = Math.max(i17, b10.left);
            i18 = Math.max(i18, b10.right);
        }
        if (this.H) {
            i15 = Math.max(this.f2427l, (this.C * 2) + i17 + i18);
        } else {
            i15 = this.f2427l;
        }
        int max = Math.max(i16, i13);
        this.A = i15;
        this.B = max;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f2430o;
        } else {
            charSequence = this.f2432q;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f2430o;
                if (obj == null) {
                    obj = getResources().getString(R.string.arg_res_0x7f130008);
                }
                WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
                new x0.d0().e(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.f2432q;
            if (obj2 == null) {
                obj2 = getResources().getString(R.string.arg_res_0x7f130007);
            }
            WeakHashMap<View, x0.n0> weakHashMap2 = x0.f0.f31435a;
            new x0.d0().e(this, obj2);
        }
        float f10 = 1.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, x0.n0> weakHashMap3 = x0.f0.f31435a;
            if (f0.g.c(this)) {
                if (!isChecked) {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, R, f10);
                this.N = ofFloat;
                ofFloat.setDuration(250L);
                b.a(this.N, true);
                this.N.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f10 = 0.0f;
        }
        setThumbPosition(f10);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b1.m.h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.f2430o);
        setTextOffInternal(this.f2432q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f2434s != z10) {
            this.f2434s = z10;
            requestLayout();
            if (z10) {
                e();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f2429n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f2427l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f2428m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.I;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f2432q;
            if (obj == null) {
                obj = getResources().getString(R.string.arg_res_0x7f130007);
            }
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            new x0.d0().e(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f2430o;
            if (obj == null) {
                obj = getResources().getString(R.string.arg_res_0x7f130008);
            }
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            new x0.d0().e(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2417a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2417a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f2441z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(m.a.a(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f2426k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2418b = colorStateList;
        this.f2419d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.f2420e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2421f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2421f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(m.a.a(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2422g = colorStateList;
        this.f2424i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f2423h = mode;
        this.f2425j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f2417a && drawable != this.f2421f) {
            return false;
        }
        return true;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Typeface typeface;
        Typeface create;
        int resourceId;
        this.f2418b = null;
        this.c = null;
        this.f2419d = false;
        this.f2420e = false;
        this.f2422g = null;
        this.f2423h = null;
        this.f2424i = false;
        this.f2425j = false;
        this.f2439x = VelocityTracker.obtain();
        this.H = true;
        this.Q = new Rect();
        p0.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = k.a.f19452y;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        u0 u0Var = new u0(context, obtainStyledAttributes);
        x0.f0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        Drawable e10 = u0Var.e(2);
        this.f2417a = e10;
        if (e10 != null) {
            e10.setCallback(this);
        }
        Drawable e11 = u0Var.e(11);
        this.f2421f = e11;
        if (e11 != null) {
            e11.setCallback(this);
        }
        setTextOnInternal(u0Var.k(0));
        setTextOffInternal(u0Var.k(1));
        this.f2434s = u0Var.a(3, true);
        this.f2426k = u0Var.d(8, 0);
        this.f2427l = u0Var.d(5, 0);
        this.f2428m = u0Var.d(6, 0);
        this.f2429n = u0Var.a(4, false);
        ColorStateList b10 = u0Var.b(9);
        if (b10 != null) {
            this.f2418b = b10;
            this.f2419d = true;
        }
        PorterDuff.Mode c10 = a0.c(u0Var.h(10, -1), null);
        if (this.c != c10) {
            this.c = c10;
            this.f2420e = true;
        }
        if (this.f2419d || this.f2420e) {
            a();
        }
        ColorStateList b11 = u0Var.b(12);
        if (b11 != null) {
            this.f2422g = b11;
            this.f2424i = true;
        }
        PorterDuff.Mode c11 = a0.c(u0Var.h(13, -1), null);
        if (this.f2423h != c11) {
            this.f2423h = c11;
            this.f2425j = true;
        }
        if (this.f2424i || this.f2425j) {
            b();
        }
        int i11 = u0Var.i(7, 0);
        if (i11 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i11, k.a.f19453z);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = androidx.core.content.a.getColorStateList(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.J = colorStateList;
            } else {
                this.J = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i12 = obtainStyledAttributes2.getInt(1, -1);
            int i13 = obtainStyledAttributes2.getInt(2, -1);
            if (i12 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i12 != 2) {
                typeface = i12 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i13 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i13);
                } else {
                    create = Typeface.create(typeface, i13);
                }
                setSwitchTypeface(create);
                int i14 = (~(create != null ? create.getStyle() : 0)) & i13;
                textPaint.setFakeBoldText((i14 & 1) != 0);
                textPaint.setTextSkewX((i14 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                this.M = new p.a(getContext());
            } else {
                this.M = null;
            }
            setTextOnInternal(this.f2430o);
            setTextOffInternal(this.f2432q);
            obtainStyledAttributes2.recycle();
        }
        new r(this).f(attributeSet, i10);
        u0Var.n();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2436u = viewConfiguration.getScaledTouchSlop();
        this.f2440y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
