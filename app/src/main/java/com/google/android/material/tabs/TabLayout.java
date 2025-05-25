package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.x0;
import androidx.viewpager.widget.ViewPager;
import b1.m;
import com.android.billingclient.api.b0;
import com.google.android.gms.common.api.Api;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;
import w8.w;
import x0.f0;
import x0.n0;
import x0.y;
import y0.f;

@ViewPager.e
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {
    public static final w0.e W = new w0.e(16);
    public final int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public com.google.android.material.tabs.a I;
    public final TimeInterpolator J;
    public c K;
    public final ArrayList<c> L;
    public i M;
    public ValueAnimator N;
    public ViewPager O;
    public j2.a P;
    public e Q;
    public h R;
    public b S;
    public boolean T;
    public int U;
    public final b0 V;

    /* renamed from: a  reason: collision with root package name */
    public int f12936a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<g> f12937b;
    public g c;

    /* renamed from: d  reason: collision with root package name */
    public final f f12938d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12939e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12940f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12941g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12942h;

    /* renamed from: i  reason: collision with root package name */
    public final int f12943i;

    /* renamed from: j  reason: collision with root package name */
    public final int f12944j;

    /* renamed from: k  reason: collision with root package name */
    public final int f12945k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f12946l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f12947m;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f12948n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f12949o;

    /* renamed from: p  reason: collision with root package name */
    public int f12950p;

    /* renamed from: q  reason: collision with root package name */
    public final PorterDuff.Mode f12951q;

    /* renamed from: r  reason: collision with root package name */
    public final float f12952r;

    /* renamed from: s  reason: collision with root package name */
    public final float f12953s;

    /* renamed from: t  reason: collision with root package name */
    public final int f12954t;

    /* renamed from: u  reason: collision with root package name */
    public int f12955u;

    /* renamed from: v  reason: collision with root package name */
    public final int f12956v;

    /* renamed from: w  reason: collision with root package name */
    public final int f12957w;

    /* renamed from: x  reason: collision with root package name */
    public final int f12958x;

    /* renamed from: y  reason: collision with root package name */
    public final int f12959y;

    /* renamed from: z  reason: collision with root package name */
    public int f12960z;

    /* loaded from: classes2.dex */
    public final class TabView extends LinearLayout {

        /* renamed from: l  reason: collision with root package name */
        public static final /* synthetic */ int f12961l = 0;

        /* renamed from: a  reason: collision with root package name */
        public g f12962a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f12963b;
        public ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public View f12964d;

        /* renamed from: e  reason: collision with root package name */
        public h8.a f12965e;

        /* renamed from: f  reason: collision with root package name */
        public View f12966f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f12967g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f12968h;

        /* renamed from: i  reason: collision with root package name */
        public Drawable f12969i;

        /* renamed from: j  reason: collision with root package name */
        public int f12970j;

        public TabView(Context context) {
            super(context);
            y yVar;
            this.f12970j = 2;
            e(context);
            int i10 = TabLayout.this.f12939e;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.e.k(this, i10, TabLayout.this.f12940f, TabLayout.this.f12941g, TabLayout.this.f12942h);
            setGravity(17);
            setOrientation(!TabLayout.this.D ? 1 : 0);
            setClickable(true);
            Context context2 = getContext();
            if (Build.VERSION.SDK_INT >= 24) {
                yVar = new y(y.a.b(context2, 1002));
            } else {
                yVar = new y(null);
            }
            f0.q(this, yVar);
        }

        private h8.a getBadge() {
            return this.f12965e;
        }

        private h8.a getOrCreateBadge() {
            if (this.f12965e == null) {
                this.f12965e = new h8.a(getContext(), null);
            }
            b();
            h8.a aVar = this.f12965e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            boolean z10;
            if (this.f12965e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f12964d;
            if (view != null) {
                h8.a aVar = this.f12965e;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f12964d = null;
            }
        }

        public final void b() {
            boolean z10;
            g gVar;
            g gVar2;
            boolean z11 = true;
            if (this.f12965e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            if (this.f12966f != null) {
                a();
                return;
            }
            ImageView imageView = this.c;
            if (imageView != null && (gVar2 = this.f12962a) != null && gVar2.f12978a != null) {
                if (this.f12964d != imageView) {
                    a();
                    ImageView imageView2 = this.c;
                    if (this.f12965e == null) {
                        z11 = false;
                    }
                    if (z11 && imageView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        if (viewGroup != null) {
                            viewGroup.setClipChildren(false);
                            viewGroup.setClipToPadding(false);
                        }
                        h8.a aVar = this.f12965e;
                        Rect rect = new Rect();
                        imageView2.getDrawingRect(rect);
                        aVar.setBounds(rect);
                        aVar.h(imageView2, null);
                        if (aVar.d() != null) {
                            aVar.d().setForeground(aVar);
                        } else {
                            imageView2.getOverlay().add(aVar);
                        }
                        this.f12964d = imageView2;
                        return;
                    }
                    return;
                }
                c(imageView);
                return;
            }
            TextView textView = this.f12963b;
            if (textView != null && (gVar = this.f12962a) != null && gVar.f12982f == 1) {
                if (this.f12964d != textView) {
                    a();
                    TextView textView2 = this.f12963b;
                    if (this.f12965e == null) {
                        z11 = false;
                    }
                    if (z11 && textView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.setClipChildren(false);
                            viewGroup2.setClipToPadding(false);
                        }
                        h8.a aVar2 = this.f12965e;
                        Rect rect2 = new Rect();
                        textView2.getDrawingRect(rect2);
                        aVar2.setBounds(rect2);
                        aVar2.h(textView2, null);
                        if (aVar2.d() != null) {
                            aVar2.d().setForeground(aVar2);
                        } else {
                            textView2.getOverlay().add(aVar2);
                        }
                        this.f12964d = textView2;
                        return;
                    }
                    return;
                }
                c(textView);
                return;
            }
            a();
        }

        public final void c(View view) {
            boolean z10;
            h8.a aVar = this.f12965e;
            if (aVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && view == this.f12964d) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.h(view, null);
            }
        }

        public final void d() {
            boolean z10;
            f();
            g gVar = this.f12962a;
            boolean z11 = false;
            if (gVar != null) {
                TabLayout tabLayout = gVar.f12983g;
                if (tabLayout != null) {
                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                    if (selectedTabPosition != -1 && selectedTabPosition == gVar.f12980d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z11 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z11);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f12969i;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.f12969i.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
        public final void e(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i10 = tabLayout.f12954t;
            GradientDrawable gradientDrawable = null;
            if (i10 != 0) {
                Drawable a10 = m.a.a(context, i10);
                this.f12969i = a10;
                if (a10 != null && a10.isStateful()) {
                    this.f12969i.setState(getDrawableState());
                }
            } else {
                this.f12969i = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (tabLayout.f12948n != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a11 = c9.a.a(tabLayout.f12948n);
                boolean z10 = tabLayout.H;
                if (z10) {
                    gradientDrawable2 = null;
                }
                if (!z10) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(a11, gradientDrawable2, gradientDrawable);
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.q(this, gradientDrawable2);
            tabLayout.invalidate();
        }

        public final void f() {
            View view;
            int i10;
            ViewParent parent;
            g gVar = this.f12962a;
            if (gVar != null) {
                view = gVar.f12981e;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f12966f;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f12966f);
                    }
                    addView(view);
                }
                this.f12966f = view;
                TextView textView = this.f12963b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f12967g = textView2;
                if (textView2 != null) {
                    this.f12970j = m.a.b(textView2);
                }
                this.f12968h = (ImageView) view.findViewById(16908294);
            } else {
                View view3 = this.f12966f;
                if (view3 != null) {
                    removeView(view3);
                    this.f12966f = null;
                }
                this.f12967g = null;
                this.f12968h = null;
            }
            if (this.f12966f == null) {
                if (this.c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.c = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f12963b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f12963b = textView3;
                    addView(textView3);
                    this.f12970j = m.a.b(this.f12963b);
                }
                TextView textView4 = this.f12963b;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.f12943i);
                if (isSelected() && (i10 = tabLayout.f12945k) != -1) {
                    this.f12963b.setTextAppearance(i10);
                } else {
                    this.f12963b.setTextAppearance(tabLayout.f12944j);
                }
                ColorStateList colorStateList = tabLayout.f12946l;
                if (colorStateList != null) {
                    this.f12963b.setTextColor(colorStateList);
                }
                g(this.f12963b, this.c, true);
                b();
                ImageView imageView3 = this.c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, imageView3));
                }
                TextView textView5 = this.f12963b;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, textView5));
                }
            } else {
                TextView textView6 = this.f12967g;
                if (textView6 != null || this.f12968h != null) {
                    g(textView6, this.f12968h, false);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.c)) {
                setContentDescription(gVar.c);
            }
        }

        public final void g(TextView textView, ImageView imageView, boolean z10) {
            Drawable drawable;
            CharSequence charSequence;
            int i10;
            CharSequence charSequence2;
            int i11;
            Drawable drawable2;
            g gVar = this.f12962a;
            CharSequence charSequence3 = null;
            if (gVar != null && (drawable2 = gVar.f12978a) != null) {
                drawable = drawable2.mutate();
            } else {
                drawable = null;
            }
            TabLayout tabLayout = TabLayout.this;
            if (drawable != null) {
                a.b.h(drawable, tabLayout.f12947m);
                PorterDuff.Mode mode = tabLayout.f12951q;
                if (mode != null) {
                    a.b.i(drawable, mode);
                }
            }
            g gVar2 = this.f12962a;
            if (gVar2 != null) {
                charSequence = gVar2.f12979b;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z11 = true;
            boolean z12 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (!z12 || this.f12962a.f12982f != 1) {
                    z11 = false;
                }
                if (z12) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                textView.setText(charSequence2);
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                if (z12) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z11 && imageView.getVisibility() == 0) {
                    i10 = (int) w.b(getContext(), 8);
                } else {
                    i10 = 0;
                }
                if (tabLayout.D) {
                    if (i10 != x0.h.b(marginLayoutParams)) {
                        x0.h.g(marginLayoutParams, i10);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i10;
                    x0.h.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f12962a;
            if (gVar3 != null) {
                charSequence3 = gVar3.c;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z12) {
                    charSequence = charSequence3;
                }
                x0.a(this, charSequence);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f12963b, this.c, this.f12966f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    if (z10) {
                        i11 = Math.min(i11, view.getTop());
                    } else {
                        i11 = view.getTop();
                    }
                    if (z10) {
                        i10 = Math.max(i10, view.getBottom());
                    } else {
                        i10 = view.getBottom();
                    }
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f12963b, this.c, this.f12966f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    if (z10) {
                        i11 = Math.min(i11, view.getLeft());
                    } else {
                        i11 = view.getLeft();
                    }
                    if (z10) {
                        i10 = Math.max(i10, view.getRight());
                    } else {
                        i10 = view.getRight();
                    }
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public g getTab() {
            return this.f12962a;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            h8.a aVar = this.f12965e;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f12965e.c()));
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.c.a(0, 1, this.f12962a.f12980d, false, isSelected(), 1).f31968a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.a.f31955g.f31964a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.arg_res_0x7f1301ba));
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L28;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r3 = r2.getTabMaxWidth()
                if (r3 <= 0) goto L1c
                if (r1 == 0) goto L14
                if (r0 <= r3) goto L1c
            L14:
                int r8 = r2.f12955u
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L1c:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f12963b
                if (r0 == 0) goto L9d
                float r0 = r2.f12952r
                int r1 = r7.f12970j
                android.widget.ImageView r3 = r7.c
                r4 = 1
                if (r3 == 0) goto L34
                int r3 = r3.getVisibility()
                if (r3 != 0) goto L34
                r1 = r4
                goto L40
            L34:
                android.widget.TextView r3 = r7.f12963b
                if (r3 == 0) goto L40
                int r3 = r3.getLineCount()
                if (r3 <= r4) goto L40
                float r0 = r2.f12953s
            L40:
                android.widget.TextView r3 = r7.f12963b
                float r3 = r3.getTextSize()
                android.widget.TextView r5 = r7.f12963b
                int r5 = r5.getLineCount()
                android.widget.TextView r6 = r7.f12963b
                int r6 = b1.m.a.b(r6)
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 != 0) goto L5a
                if (r6 < 0) goto L9d
                if (r1 == r6) goto L9d
            L5a:
                int r2 = r2.C
                r6 = 0
                if (r2 != r4) goto L8e
                if (r3 <= 0) goto L8e
                if (r5 != r4) goto L8e
                android.widget.TextView r2 = r7.f12963b
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L8d
                float r3 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r3
                int r3 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r3 = r3 - r5
                int r5 = r7.getPaddingRight()
                int r3 = r3 - r5
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 <= 0) goto L8e
            L8d:
                r4 = r6
            L8e:
                if (r4 == 0) goto L9d
                android.widget.TextView r2 = r7.f12963b
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f12963b
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            L9d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.onMeasure(int, int):void");
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f12962a != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                g gVar = this.f12962a;
                TabLayout tabLayout = gVar.f12983g;
                if (tabLayout != null) {
                    tabLayout.l(gVar, true);
                    return true;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f12963b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f12966f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f12962a) {
                this.f12962a = gVar;
                d();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public boolean f12973a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(ViewPager viewPager, j2.a aVar, j2.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.O == viewPager) {
                tabLayout.m(aVar2, this.f12973a);
            }
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface c<T extends g> {
        void a();

        void b(T t4);

        void c();
    }

    /* loaded from: classes2.dex */
    public interface d extends c<g> {
    }

    /* loaded from: classes2.dex */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.j();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.j();
        }
    }

    /* loaded from: classes2.dex */
    public class f extends LinearLayout {
        public static final /* synthetic */ int c = 0;

        /* renamed from: a  reason: collision with root package name */
        public ValueAnimator f12976a;

        public f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.U != 0 && (tabLayout.getTabSelectedIndicator().getBounds().left != -1 || tabLayout.getTabSelectedIndicator().getBounds().right != -1)) {
                return;
            }
            View childAt = getChildAt(i10);
            com.google.android.material.tabs.a aVar = tabLayout.I;
            Drawable drawable = tabLayout.f12949o;
            aVar.getClass();
            RectF a10 = com.google.android.material.tabs.a.a(tabLayout, childAt);
            drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
            tabLayout.f12936a = i10;
        }

        public final void b(int i10) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.f12949o.getBounds();
            tabLayout.f12949o.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void c(View view, View view2, float f10) {
            boolean z10;
            if (view != null && view.getWidth() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.I.b(tabLayout, view, view2, f10, tabLayout.f12949o);
            } else {
                TabLayout tabLayout2 = TabLayout.this;
                Drawable drawable = tabLayout2.f12949o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout2.f12949o.getBounds().bottom);
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.k(this);
        }

        public final void d(int i10, int i11, boolean z10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f12936a == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.f12936a = i10;
            com.google.android.material.tabs.b bVar = new com.google.android.material.tabs.b(this, childAt, childAt2);
            if (z10) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f12976a = valueAnimator;
                valueAnimator.setInterpolator(tabLayout.J);
                valueAnimator.setDuration(i11);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(bVar);
                valueAnimator.start();
                return;
            }
            this.f12976a.removeAllUpdateListeners();
            this.f12976a.addUpdateListener(bVar);
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int height2 = tabLayout.f12949o.getBounds().height();
            if (height2 < 0) {
                height2 = tabLayout.f12949o.getIntrinsicHeight();
            }
            int i10 = tabLayout.B;
            if (i10 != 0) {
                if (i10 != 1) {
                    height = 0;
                    if (i10 != 2) {
                        if (i10 != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (tabLayout.f12949o.getBounds().width() > 0) {
                Rect bounds = tabLayout.f12949o.getBounds();
                tabLayout.f12949o.setBounds(bounds.left, height, bounds.right, height2);
                tabLayout.f12949o.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f12976a;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.f12936a == -1) {
                tabLayout.f12936a = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.f12936a);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.f12960z == 1 || tabLayout.C == 2) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() == 0) {
                        i12 = Math.max(i12, childAt.getMeasuredWidth());
                    }
                }
                if (i12 <= 0) {
                    return;
                }
                if (i12 * childCount <= getMeasuredWidth() - (((int) w.b(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i14 = 0; i14 < childCount; i14++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                        if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i12;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    tabLayout.f12960z = 0;
                    tabLayout.p(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    /* loaded from: classes2.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f12978a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f12979b;
        public CharSequence c;

        /* renamed from: e  reason: collision with root package name */
        public View f12981e;

        /* renamed from: g  reason: collision with root package name */
        public TabLayout f12983g;

        /* renamed from: h  reason: collision with root package name */
        public TabView f12984h;

        /* renamed from: d  reason: collision with root package name */
        public int f12980d = -1;

        /* renamed from: f  reason: collision with root package name */
        public final int f12982f = 1;

        /* renamed from: i  reason: collision with root package name */
        public int f12985i = -1;

        public final void a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
                this.f12984h.setContentDescription(charSequence);
            }
            this.f12979b = charSequence;
            b();
        }

        public final void b() {
            TabView tabView = this.f12984h;
            if (tabView != null) {
                tabView.d();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class h implements ViewPager.j {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f12986a;

        /* renamed from: b  reason: collision with root package name */
        public int f12987b;
        public int c;

        public h(TabLayout tabLayout) {
            this.f12986a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i10) {
            this.f12987b = this.c;
            this.c = i10;
            TabLayout tabLayout = this.f12986a.get();
            if (tabLayout != null) {
                tabLayout.U = this.c;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i10, float f10, int i11) {
            boolean z10;
            boolean z11;
            TabLayout tabLayout = this.f12986a.get();
            if (tabLayout != null) {
                int i12 = this.c;
                if (i12 == 2 && this.f12987b != 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i12 == 2 && this.f12987b == 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                tabLayout.n(i10, f10, z10, z11, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i10) {
            boolean z10;
            TabLayout tabLayout = this.f12986a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.c;
                if (i11 != 0 && (i11 != 2 || this.f12987b != 0)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                tabLayout.l(tabLayout.h(i10), z10);
            }
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    private int getDefaultHeight() {
        ArrayList<g> arrayList = this.f12937b;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                g gVar = arrayList.get(i10);
                if (gVar != null && gVar.f12978a != null && !TextUtils.isEmpty(gVar.f12979b)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        if (z10 && !this.D) {
            return 72;
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f12956v;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.C;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        return this.f12958x;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f12938d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        boolean z10;
        boolean z11;
        f fVar = this.f12938d;
        int childCount = fVar.getChildCount();
        if (i10 < childCount) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = fVar.getChildAt(i11);
                boolean z12 = true;
                if ((i11 == i10 && !childAt.isSelected()) || (i11 != i10 && childAt.isSelected())) {
                    if (i11 == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    childAt.setSelected(z11);
                    if (i11 != i10) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).f();
                    }
                } else {
                    if (i11 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                    if (i11 != i10) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                }
            }
        }
    }

    @Deprecated
    public final void a(c cVar) {
        ArrayList<c> arrayList = this.L;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        c(view);
    }

    public final void b(g gVar, boolean z10) {
        ArrayList<g> arrayList = this.f12937b;
        int size = arrayList.size();
        if (gVar.f12983g == this) {
            gVar.f12980d = size;
            arrayList.add(size, gVar);
            int size2 = arrayList.size();
            int i10 = -1;
            for (int i11 = size + 1; i11 < size2; i11++) {
                if (arrayList.get(i11).f12980d == this.f12936a) {
                    i10 = i11;
                }
                arrayList.get(i11).f12980d = i11;
            }
            this.f12936a = i10;
            TabView tabView = gVar.f12984h;
            tabView.setSelected(false);
            tabView.setActivated(false);
            int i12 = gVar.f12980d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.C == 1 && this.f12960z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            this.f12938d.addView(tabView, i12, layoutParams);
            if (z10) {
                TabLayout tabLayout = gVar.f12983g;
                if (tabLayout != null) {
                    tabLayout.l(gVar, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void c(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            g i10 = i();
            CharSequence charSequence = tabItem.f12934a;
            if (charSequence != null) {
                i10.a(charSequence);
            }
            Drawable drawable = tabItem.f12935b;
            if (drawable != null) {
                i10.f12978a = drawable;
                TabLayout tabLayout = i10.f12983g;
                if (tabLayout.f12960z == 1 || tabLayout.C == 2) {
                    tabLayout.p(true);
                }
                i10.b();
            }
            int i11 = tabItem.c;
            if (i11 != 0) {
                i10.f12981e = LayoutInflater.from(i10.f12984h.getContext()).inflate(i11, (ViewGroup) i10.f12984h, false);
                i10.b();
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                i10.c = tabItem.getContentDescription();
                i10.b();
            }
            b(i10, this.f12937b.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void d(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.g.c(this)) {
                f fVar = this.f12938d;
                int childCount = fVar.getChildCount();
                boolean z10 = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    } else if (fVar.getChildAt(i11).getWidth() <= 0) {
                        z10 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (!z10) {
                    int scrollX = getScrollX();
                    int f10 = f(0.0f, i10);
                    if (scrollX != f10) {
                        g();
                        this.N.setIntValues(scrollX, f10);
                        this.N.start();
                    }
                    ValueAnimator valueAnimator = fVar.f12976a;
                    if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f12936a != i10) {
                        fVar.f12976a.cancel();
                    }
                    fVar.d(i10, this.A, true);
                    return;
                }
            }
        }
        n(i10, 0.0f, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r0 != 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r4 = this;
            int r0 = r4.C
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r4.f12959y
            int r3 = r4.f12939e
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap<android.view.View, x0.n0> r3 = x0.f0.f31435a
            com.google.android.material.tabs.TabLayout$f r3 = r4.f12938d
            x0.f0.e.k(r3, r0, r2, r2, r2)
            int r0 = r4.C
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L25
            if (r0 == r1) goto L25
            goto L3c
        L25:
            r3.setGravity(r2)
            goto L3c
        L29:
            int r0 = r4.f12960z
            if (r0 == 0) goto L36
            if (r0 == r2) goto L32
            if (r0 == r1) goto L36
            goto L3c
        L32:
            r3.setGravity(r2)
            goto L3c
        L36:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L3c:
            r4.p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e():void");
    }

    public final int f(float f10, int i10) {
        f fVar;
        View childAt;
        View view;
        int i11 = this.C;
        int i12 = 0;
        if ((i11 != 0 && i11 != 2) || (childAt = (fVar = this.f12938d).getChildAt(i10)) == null) {
            return 0;
        }
        int i13 = i10 + 1;
        if (i13 < fVar.getChildCount()) {
            view = fVar.getChildAt(i13);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i12 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i14 = (int) ((width + i12) * 0.5f * f10);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.e.d(this) == 0) {
            return left + i14;
        }
        return left - i14;
    }

    public final void g() {
        if (this.N == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.N = valueAnimator;
            valueAnimator.setInterpolator(this.J);
            this.N.setDuration(this.A);
            this.N.addUpdateListener(new a());
        }
    }

    public int getSelectedTabPosition() {
        g gVar = this.c;
        if (gVar != null) {
            return gVar.f12980d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f12937b.size();
    }

    public int getTabGravity() {
        return this.f12960z;
    }

    public ColorStateList getTabIconTint() {
        return this.f12947m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.G;
    }

    public int getTabIndicatorGravity() {
        return this.B;
    }

    public int getTabMaxWidth() {
        return this.f12955u;
    }

    public int getTabMode() {
        return this.C;
    }

    public ColorStateList getTabRippleColor() {
        return this.f12948n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f12949o;
    }

    public ColorStateList getTabTextColors() {
        return this.f12946l;
    }

    public final g h(int i10) {
        if (i10 >= 0 && i10 < getTabCount()) {
            return this.f12937b.get(i10);
        }
        return null;
    }

    public final g i() {
        TabView tabView;
        g gVar = (g) W.b();
        if (gVar == null) {
            gVar = new g();
        }
        gVar.f12983g = this;
        b0 b0Var = this.V;
        if (b0Var != null) {
            tabView = (TabView) b0Var.b();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(gVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.c)) {
            tabView.setContentDescription(gVar.f12979b);
        } else {
            tabView.setContentDescription(gVar.c);
        }
        gVar.f12984h = tabView;
        int i10 = gVar.f12985i;
        if (i10 != -1) {
            tabView.setId(i10);
        }
        return gVar;
    }

    public final void j() {
        int currentItem;
        k();
        j2.a aVar = this.P;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                g i11 = i();
                i11.a(this.P.getPageTitle(i10));
                b(i11, false);
            }
            ViewPager viewPager = this.O;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                l(h(currentItem), true);
            }
        }
    }

    public final void k() {
        f fVar = this.f12938d;
        for (int childCount = fVar.getChildCount() - 1; childCount >= 0; childCount--) {
            TabView tabView = (TabView) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab(null);
                tabView.setSelected(false);
                this.V.a(tabView);
            }
            requestLayout();
        }
        Iterator<g> it = this.f12937b.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f12983g = null;
            next.f12984h = null;
            next.f12978a = null;
            next.f12985i = -1;
            next.f12979b = null;
            next.c = null;
            next.f12980d = -1;
            next.f12981e = null;
            W.a(next);
        }
        this.c = null;
    }

    public final void l(g gVar, boolean z10) {
        int i10;
        g gVar2 = this.c;
        ArrayList<c> arrayList = this.L;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).a();
                }
                d(gVar.f12980d);
                return;
            }
            return;
        }
        if (gVar != null) {
            i10 = gVar.f12980d;
        } else {
            i10 = -1;
        }
        if (z10) {
            if ((gVar2 == null || gVar2.f12980d == -1) && i10 != -1) {
                n(i10, 0.0f, true, true, true);
            } else {
                d(i10);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        }
        this.c = gVar;
        if (gVar2 != null && gVar2.f12983g != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).c();
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).b(gVar);
            }
        }
    }

    public final void m(j2.a aVar, boolean z10) {
        e eVar;
        j2.a aVar2 = this.P;
        if (aVar2 != null && (eVar = this.Q) != null) {
            aVar2.unregisterDataSetObserver(eVar);
        }
        this.P = aVar;
        if (z10 && aVar != null) {
            if (this.Q == null) {
                this.Q = new e();
            }
            aVar.registerDataSetObserver(this.Q);
        }
        j();
    }

    public final void n(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f11 = i10 + f10;
        int round = Math.round(f11);
        if (round >= 0) {
            f fVar = this.f12938d;
            if (round < fVar.getChildCount()) {
                if (z11) {
                    fVar.getClass();
                    TabLayout.this.f12936a = Math.round(f11);
                    ValueAnimator valueAnimator = fVar.f12976a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        fVar.f12976a.cancel();
                    }
                    fVar.c(fVar.getChildAt(i10), fVar.getChildAt(i10 + 1), f10);
                }
                ValueAnimator valueAnimator2 = this.N;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.N.cancel();
                }
                int f12 = f(f10, i10);
                int scrollX = getScrollX();
                if ((i10 < getSelectedTabPosition() && f12 >= scrollX) || ((i10 > getSelectedTabPosition() && f12 <= scrollX) || i10 == getSelectedTabPosition())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                if (f0.e.d(this) == 1) {
                    if ((i10 < getSelectedTabPosition() && f12 <= scrollX) || ((i10 > getSelectedTabPosition() && f12 >= scrollX) || i10 == getSelectedTabPosition())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                if (z13 || this.U == 1 || z12) {
                    if (i10 < 0) {
                        f12 = 0;
                    }
                    scrollTo(f12, 0);
                }
                if (z10) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void o(ViewPager viewPager, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.O;
        if (viewPager2 != null) {
            h hVar = this.R;
            if (hVar != null && (arrayList2 = viewPager2.R) != null) {
                arrayList2.remove(hVar);
            }
            b bVar = this.S;
            if (bVar != null && (arrayList = this.O.U) != null) {
                arrayList.remove(bVar);
            }
        }
        i iVar = this.M;
        if (iVar != null) {
            this.L.remove(iVar);
            this.M = null;
        }
        if (viewPager != null) {
            this.O = viewPager;
            if (this.R == null) {
                this.R = new h(this);
            }
            h hVar2 = this.R;
            hVar2.c = 0;
            hVar2.f12987b = 0;
            viewPager.b(hVar2);
            i iVar2 = new i(viewPager);
            this.M = iVar2;
            a(iVar2);
            j2.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m(adapter, true);
            }
            if (this.S == null) {
                this.S = new b();
            }
            b bVar2 = this.S;
            bVar2.f12973a = true;
            if (viewPager.U == null) {
                viewPager.U = new ArrayList();
            }
            viewPager.U.add(bVar2);
            n(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            this.O = null;
            m(null, false);
        }
        this.T = z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.b.X(this);
        if (this.O == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                o((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            setupWithViewPager(null);
            this.T = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TabView tabView;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            f fVar = this.f12938d;
            if (i10 < fVar.getChildCount()) {
                View childAt = fVar.getChildAt(i10);
                if ((childAt instanceof TabView) && (drawable = (tabView = (TabView) childAt).f12969i) != null) {
                    drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                    tabView.f12969i.draw(canvas);
                }
                i10++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(1, getTabCount(), 1).f31967a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (getTabMode() != 0 && getTabMode() != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = w8.w.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f12957w
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = w8.w.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f12955u = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.C
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getActionMasked() == 8) {
            if (getTabMode() != 0 && getTabMode() != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10) {
        int i10 = 0;
        while (true) {
            f fVar = this.f12938d;
            if (i10 < fVar.getChildCount()) {
                View childAt = fVar.getChildAt(i10);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.C == 1 && this.f12960z == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                if (z10) {
                    childAt.requestLayout();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        b.b.V(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            int i10 = 0;
            while (true) {
                f fVar = this.f12938d;
                if (i10 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i10);
                    if (childAt instanceof TabView) {
                        TabView tabView = (TabView) childAt;
                        tabView.setOrientation(!TabLayout.this.D ? 1 : 0);
                        TextView textView = tabView.f12967g;
                        if (textView == null && tabView.f12968h == null) {
                            tabView.g(tabView.f12963b, tabView.c, true);
                        } else {
                            tabView.g(textView, tabView.f12968h, false);
                        }
                    }
                    i10++;
                } else {
                    e();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.N.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.f12949o = mutate;
        int i10 = this.f12950p;
        if (i10 != 0) {
            a.b.g(mutate, i10);
        } else {
            a.b.h(mutate, null);
        }
        int i11 = this.F;
        if (i11 == -1) {
            i11 = this.f12949o.getIntrinsicHeight();
        }
        this.f12938d.b(i11);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        boolean z10;
        this.f12950p = i10;
        Drawable drawable = this.f12949o;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a.b.g(drawable, i10);
        } else {
            a.b.h(drawable, null);
        }
        p(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.B != i10) {
            this.B = i10;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.k(this.f12938d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.F = i10;
        this.f12938d.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f12960z != i10) {
            this.f12960z = i10;
            e();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f12947m != colorStateList) {
            this.f12947m = colorStateList;
            ArrayList<g> arrayList = this.f12937b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).b();
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(androidx.core.content.a.getColorStateList(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.G = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.I = new j9.b();
                    return;
                }
                throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
            }
            this.I = new j9.a();
            return;
        }
        this.I = new com.google.android.material.tabs.a();
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.E = z10;
        int i10 = f.c;
        f fVar = this.f12938d;
        fVar.a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.k(fVar);
    }

    public void setTabMode(int i10) {
        if (i10 != this.C) {
            this.C = i10;
            e();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f12948n != colorStateList) {
            this.f12948n = colorStateList;
            int i10 = 0;
            while (true) {
                f fVar = this.f12938d;
                if (i10 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i10);
                    if (childAt instanceof TabView) {
                        Context context = getContext();
                        int i11 = TabView.f12961l;
                        ((TabView) childAt).e(context);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(androidx.core.content.a.getColorStateList(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f12946l != colorStateList) {
            this.f12946l = colorStateList;
            ArrayList<g> arrayList = this.f12937b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).b();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(j2.a aVar) {
        m(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            int i10 = 0;
            while (true) {
                f fVar = this.f12938d;
                if (i10 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i10);
                    if (childAt instanceof TabView) {
                        Context context = getContext();
                        int i11 = TabView.f12961l;
                        ((TabView) childAt).e(context);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        o(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        c(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.K;
        if (cVar2 != null) {
            this.L.remove(cVar2);
        }
        this.K = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018042), attributeSet, i10);
        this.f12936a = -1;
        this.f12937b = new ArrayList<>();
        this.f12945k = -1;
        this.f12950p = 0;
        this.f12955u = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.F = -1;
        this.L = new ArrayList<>();
        this.V = new b0(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f12938d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d10 = s.d(context2, attributeSet, e8.a.f16477c0, i10, 2132018042, 24);
        if (getBackground() instanceof ColorDrawable) {
            f9.h hVar = new f9.h();
            hVar.n(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            hVar.k(context2);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            hVar.m(f0.i.i(this));
            f0.d.q(this, hVar);
        }
        setSelectedTabIndicator(b9.c.d(context2, d10, 5));
        setSelectedTabIndicatorColor(d10.getColor(8, 0));
        fVar.b(d10.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d10.getInt(10, 0));
        setTabIndicatorAnimationMode(d10.getInt(7, 0));
        setTabIndicatorFullWidth(d10.getBoolean(9, true));
        int dimensionPixelSize = d10.getDimensionPixelSize(16, 0);
        this.f12942h = dimensionPixelSize;
        this.f12941g = dimensionPixelSize;
        this.f12940f = dimensionPixelSize;
        this.f12939e = dimensionPixelSize;
        this.f12939e = d10.getDimensionPixelSize(19, dimensionPixelSize);
        this.f12940f = d10.getDimensionPixelSize(20, dimensionPixelSize);
        this.f12941g = d10.getDimensionPixelSize(18, dimensionPixelSize);
        this.f12942h = d10.getDimensionPixelSize(17, dimensionPixelSize);
        if (b9.b.b(context2, false, R.attr.isMaterial3Theme)) {
            this.f12943i = R.attr.textAppearanceTitleSmall;
        } else {
            this.f12943i = R.attr.textAppearanceButton;
        }
        int resourceId = d10.getResourceId(24, 2132017664);
        this.f12944j = resourceId;
        int[] iArr = k.a.f19453z;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f12952r = dimensionPixelSize2;
            this.f12946l = b9.c.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d10.hasValue(22)) {
                this.f12945k = d10.getResourceId(22, resourceId);
            }
            int i11 = this.f12945k;
            if (i11 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i11, iArr);
                try {
                    obtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList a10 = b9.c.a(context2, obtainStyledAttributes, 3);
                    if (a10 != null) {
                        this.f12946l = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{a10.getColorForState(new int[]{16842913}, a10.getDefaultColor()), this.f12946l.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (d10.hasValue(25)) {
                this.f12946l = b9.c.a(context2, d10, 25);
            }
            if (d10.hasValue(23)) {
                this.f12946l = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{d10.getColor(23, 0), this.f12946l.getDefaultColor()});
            }
            this.f12947m = b9.c.a(context2, d10, 3);
            this.f12951q = w.f(d10.getInt(4, -1), null);
            this.f12948n = b9.c.a(context2, d10, 21);
            this.A = d10.getInt(6, OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
            this.J = x8.a.d(context2, R.attr.motionEasingEmphasizedInterpolator, f8.b.f17142b);
            this.f12956v = d10.getDimensionPixelSize(14, -1);
            this.f12957w = d10.getDimensionPixelSize(13, -1);
            this.f12954t = d10.getResourceId(0, 0);
            this.f12959y = d10.getDimensionPixelSize(1, 0);
            this.C = d10.getInt(15, 1);
            this.f12960z = d10.getInt(2, 0);
            this.D = d10.getBoolean(12, false);
            this.H = d10.getBoolean(26, false);
            d10.recycle();
            Resources resources = getResources();
            this.f12953s = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f12958x = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            e();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(m.a.a(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* loaded from: classes2.dex */
    public static class i implements d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f12988a;

        public i(ViewPager viewPager) {
            this.f12988a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(g gVar) {
            this.f12988a.setCurrentItem(gVar.f12980d);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c() {
        }
    }
}
