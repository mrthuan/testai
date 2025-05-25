package com.afollestad.materialdialogs.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.StackingBehavior;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class MDRootLayout extends ViewGroup {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f5986u = 0;

    /* renamed from: a  reason: collision with root package name */
    public final MDButton[] f5987a;

    /* renamed from: b  reason: collision with root package name */
    public int f5988b;
    public View c;

    /* renamed from: d  reason: collision with root package name */
    public View f5989d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5990e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5991f;

    /* renamed from: g  reason: collision with root package name */
    public StackingBehavior f5992g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5993h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5994i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5995j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5996k;

    /* renamed from: l  reason: collision with root package name */
    public int f5997l;

    /* renamed from: m  reason: collision with root package name */
    public int f5998m;

    /* renamed from: n  reason: collision with root package name */
    public int f5999n;

    /* renamed from: o  reason: collision with root package name */
    public GravityEnum f6000o;

    /* renamed from: p  reason: collision with root package name */
    public int f6001p;

    /* renamed from: q  reason: collision with root package name */
    public Paint f6002q;

    /* renamed from: r  reason: collision with root package name */
    public b f6003r;

    /* renamed from: s  reason: collision with root package name */
    public b f6004s;

    /* renamed from: t  reason: collision with root package name */
    public int f6005t;

    /* loaded from: classes.dex */
    public class a extends RecyclerView.r {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f6006a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f6007b;
        public final /* synthetic */ boolean c;

        public a(ViewGroup viewGroup, boolean z10, boolean z11) {
            this.f6006a = viewGroup;
            this.f6007b = z10;
            this.c = z11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            MDRootLayout mDRootLayout = MDRootLayout.this;
            MDButton[] mDButtonArr = mDRootLayout.f5987a;
            int length = mDButtonArr.length;
            boolean z10 = false;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    MDButton mDButton = mDButtonArr[i12];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            MDRootLayout.a(mDRootLayout, this.f6006a, this.f6007b, this.c, z10);
            mDRootLayout.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f6009a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f6010b;
        public final /* synthetic */ boolean c;

        public b(ViewGroup viewGroup, boolean z10, boolean z11) {
            this.f6009a = viewGroup;
            this.f6010b = z10;
            this.c = z11;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            boolean z10;
            boolean z11;
            MDRootLayout mDRootLayout = MDRootLayout.this;
            MDButton[] mDButtonArr = mDRootLayout.f5987a;
            int length = mDButtonArr.length;
            boolean z12 = false;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    MDButton mDButton = mDButtonArr[i10];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            ViewGroup viewGroup = this.f6009a;
            boolean z13 = viewGroup instanceof WebView;
            boolean z14 = this.c;
            boolean z15 = this.f6010b;
            if (z13) {
                WebView webView = (WebView) viewGroup;
                mDRootLayout.getClass();
                if (z15) {
                    View view = mDRootLayout.c;
                    if (view != null && view.getVisibility() != 8) {
                        if (webView.getPaddingTop() + webView.getScrollY() > 0) {
                            z11 = true;
                            mDRootLayout.f5990e = z11;
                        }
                    }
                    z11 = false;
                    mDRootLayout.f5990e = z11;
                }
                if (z14) {
                    if (z10) {
                        if ((webView.getMeasuredHeight() + webView.getScrollY()) - webView.getPaddingBottom() < webView.getScale() * webView.getContentHeight()) {
                            z12 = true;
                        }
                    }
                    mDRootLayout.f5991f = z12;
                }
            } else {
                MDRootLayout.a(mDRootLayout, viewGroup, z15, z14, z10);
            }
            mDRootLayout.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6012a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f6012a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6012a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MDRootLayout(Context context) {
        super(context);
        this.f5987a = new MDButton[3];
        this.f5990e = false;
        this.f5991f = false;
        this.f5992g = StackingBehavior.ADAPTIVE;
        this.f5993h = false;
        this.f5994i = true;
        this.f6000o = GravityEnum.START;
        c(context, null, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (((r4.getHeight() + r4.getScrollY()) - r4.getPaddingBottom()) < r4.getChildAt(r4.getChildCount() - 1).getBottom()) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.afollestad.materialdialogs.internal.MDRootLayout r3, android.view.ViewGroup r4, boolean r5, boolean r6, boolean r7) {
        /*
            r3.getClass()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L31
            int r5 = r4.getChildCount()
            if (r5 <= 0) goto L31
            android.view.View r5 = r3.c
            if (r5 == 0) goto L2e
            int r5 = r5.getVisibility()
            r2 = 8
            if (r5 == r2) goto L2e
            int r5 = r4.getScrollY()
            int r2 = r4.getPaddingTop()
            int r2 = r2 + r5
            android.view.View r5 = r4.getChildAt(r1)
            int r5 = r5.getTop()
            if (r2 <= r5) goto L2e
            r5 = r0
            goto L2f
        L2e:
            r5 = r1
        L2f:
            r3.f5990e = r5
        L31:
            if (r6 == 0) goto L5c
            int r5 = r4.getChildCount()
            if (r5 <= 0) goto L5c
            if (r7 == 0) goto L59
            int r5 = r4.getScrollY()
            int r6 = r4.getHeight()
            int r6 = r6 + r5
            int r5 = r4.getPaddingBottom()
            int r6 = r6 - r5
            int r5 = r4.getChildCount()
            int r5 = r5 - r0
            android.view.View r4 = r4.getChildAt(r5)
            int r4 = r4.getBottom()
            if (r6 >= r4) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            r3.f5991f = r0
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.a(com.afollestad.materialdialogs.internal.MDRootLayout, android.view.ViewGroup, boolean, boolean, boolean):void");
    }

    public static boolean d(View view) {
        boolean z10;
        boolean z11 = true;
        if (view != null && view.getVisibility() != 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (view instanceof MDButton)) {
            if (((MDButton) view).getText().toString().trim().length() <= 0) {
                z11 = false;
            }
            return z11;
        }
        return z10;
    }

    public final void b(ViewGroup viewGroup, boolean z10, boolean z11) {
        if ((!z11 && this.f6003r == null) || (z11 && this.f6004s == null)) {
            if (viewGroup instanceof RecyclerView) {
                a aVar = new a(viewGroup, z10, z11);
                RecyclerView recyclerView = (RecyclerView) viewGroup;
                recyclerView.s(aVar);
                aVar.b(recyclerView, 0, 0);
                return;
            }
            b bVar = new b(viewGroup, z10, z11);
            if (!z11) {
                this.f6003r = bVar;
                viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f6003r);
            } else {
                this.f6004s = bVar;
                viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f6004s);
            }
            bVar.onScrollChanged();
        }
    }

    public final void c(Context context, AttributeSet attributeSet, int i10) {
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b3.b.f5323a, i10, 0);
        this.f5995j = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        this.f5997l = resources.getDimensionPixelSize(R.dimen.md_notitle_vertical_padding);
        this.f5998m = resources.getDimensionPixelSize(R.dimen.md_button_frame_vertical_padding);
        this.f6001p = resources.getDimensionPixelSize(R.dimen.md_button_padding_frame_side);
        this.f5999n = resources.getDimensionPixelSize(R.dimen.md_button_height);
        this.f6002q = new Paint();
        this.f6005t = resources.getDimensionPixelSize(R.dimen.md_divider_height);
        this.f6002q.setColor(d3.b.g(context, R.attr.md_divider_color, 0));
        setWillNotDraw(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.view.View r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.e(android.view.View, boolean):void");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f5989d;
        if (view != null) {
            if (this.f5990e) {
                int top = view.getTop();
                canvas.drawRect(0.0f, top - this.f6005t, getMeasuredWidth(), top, this.f6002q);
            }
            if (this.f5991f) {
                int bottom = this.f5989d.getBottom();
                canvas.drawRect(0.0f, bottom, getMeasuredWidth(), bottom + this.f6005t, this.f6002q);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() == R.id.md_titleFrame) {
                this.c = childAt;
            } else {
                int id2 = childAt.getId();
                MDButton[] mDButtonArr = this.f5987a;
                if (id2 == R.id.md_buttonDefaultNeutral) {
                    mDButtonArr[0] = (MDButton) childAt;
                } else if (childAt.getId() == R.id.md_buttonDefaultNegative) {
                    mDButtonArr[1] = (MDButton) childAt;
                } else if (childAt.getId() == R.id.md_buttonDefaultPositive) {
                    mDButtonArr[2] = (MDButton) childAt;
                } else {
                    this.f5989d = childAt;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int measuredWidth;
        int i16;
        int i17;
        int i18;
        int measuredWidth2;
        int measuredWidth3;
        int i19;
        if (d(this.c)) {
            int measuredHeight = this.c.getMeasuredHeight() + i11;
            this.c.layout(i10, i11, i12, measuredHeight);
            i11 = measuredHeight;
        } else if (!this.f5996k && this.f5994i) {
            i11 += this.f5997l;
        }
        if (d(this.f5989d)) {
            View view = this.f5989d;
            view.layout(i10, i11, i12, view.getMeasuredHeight() + i11);
        }
        boolean z11 = this.f5993h;
        MDButton[] mDButtonArr = this.f5987a;
        if (z11) {
            int i20 = i13 - this.f5998m;
            for (MDButton mDButton : mDButtonArr) {
                if (d(mDButton)) {
                    mDButton.layout(i10, i20 - mDButton.getMeasuredHeight(), i12, i20);
                    i20 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.f5994i) {
                i13 -= this.f5998m;
            }
            int i21 = i13 - this.f5999n;
            int i22 = this.f6001p;
            if (d(mDButtonArr[2])) {
                if (this.f6000o == GravityEnum.END) {
                    measuredWidth3 = i10 + i22;
                    i19 = mDButtonArr[2].getMeasuredWidth() + measuredWidth3;
                    i14 = -1;
                } else {
                    int i23 = i12 - i22;
                    measuredWidth3 = i23 - mDButtonArr[2].getMeasuredWidth();
                    i19 = i23;
                    i14 = measuredWidth3;
                }
                mDButtonArr[2].layout(measuredWidth3, i21, i19, i13);
                i22 += mDButtonArr[2].getMeasuredWidth();
            } else {
                i14 = -1;
            }
            if (d(mDButtonArr[1])) {
                GravityEnum gravityEnum = this.f6000o;
                if (gravityEnum == GravityEnum.END) {
                    i18 = i22 + i10;
                    measuredWidth2 = mDButtonArr[1].getMeasuredWidth() + i18;
                } else if (gravityEnum == GravityEnum.START) {
                    measuredWidth2 = i12 - i22;
                    i18 = measuredWidth2 - mDButtonArr[1].getMeasuredWidth();
                } else {
                    i18 = this.f6001p + i10;
                    measuredWidth2 = mDButtonArr[1].getMeasuredWidth() + i18;
                    i15 = measuredWidth2;
                    mDButtonArr[1].layout(i18, i21, measuredWidth2, i13);
                }
                i15 = -1;
                mDButtonArr[1].layout(i18, i21, measuredWidth2, i13);
            } else {
                i15 = -1;
            }
            if (d(mDButtonArr[0])) {
                GravityEnum gravityEnum2 = this.f6000o;
                if (gravityEnum2 == GravityEnum.END) {
                    i16 = i12 - this.f6001p;
                    i17 = i16 - mDButtonArr[0].getMeasuredWidth();
                } else if (gravityEnum2 == GravityEnum.START) {
                    i17 = i10 + this.f6001p;
                    i16 = mDButtonArr[0].getMeasuredWidth() + i17;
                } else {
                    if (i15 == -1 && i14 != -1) {
                        i15 = i14 - mDButtonArr[0].getMeasuredWidth();
                    } else {
                        if (i14 == -1 && i15 != -1) {
                            measuredWidth = mDButtonArr[0].getMeasuredWidth();
                        } else if (i14 == -1) {
                            i15 = ((i12 - i10) / 2) - (mDButtonArr[0].getMeasuredWidth() / 2);
                            measuredWidth = mDButtonArr[0].getMeasuredWidth();
                        }
                        i14 = measuredWidth + i15;
                    }
                    i16 = i14;
                    i17 = i15;
                }
                mDButtonArr[0].layout(i17, i21, i16, i13);
            }
        }
        e(this.f5989d, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.onMeasure(int, int):void");
    }

    public void setButtonGravity(GravityEnum gravityEnum) {
        this.f6000o = gravityEnum;
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i10 = c.f6012a[this.f6000o.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f6000o = GravityEnum.START;
                    return;
                }
                return;
            }
            this.f6000o = GravityEnum.END;
        }
    }

    public void setButtonStackedGravity(GravityEnum gravityEnum) {
        MDButton[] mDButtonArr;
        for (MDButton mDButton : this.f5987a) {
            if (mDButton != null) {
                mDButton.setStackedGravity(gravityEnum);
            }
        }
    }

    public void setDividerColor(int i10) {
        this.f6002q.setColor(i10);
        invalidate();
    }

    public void setMaxHeight(int i10) {
        this.f5988b = i10;
    }

    public void setStackingBehavior(StackingBehavior stackingBehavior) {
        this.f5992g = stackingBehavior;
        invalidate();
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5987a = new MDButton[3];
        this.f5990e = false;
        this.f5991f = false;
        this.f5992g = StackingBehavior.ADAPTIVE;
        this.f5993h = false;
        this.f5994i = true;
        this.f6000o = GravityEnum.START;
        c(context, attributeSet, 0);
    }

    @TargetApi(11)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5987a = new MDButton[3];
        this.f5990e = false;
        this.f5991f = false;
        this.f5992g = StackingBehavior.ADAPTIVE;
        this.f5993h = false;
        this.f5994i = true;
        this.f6000o = GravityEnum.START;
        c(context, attributeSet, i10);
    }
}
