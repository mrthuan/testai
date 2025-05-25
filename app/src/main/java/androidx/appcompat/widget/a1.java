package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.h0;

/* compiled from: TooltipCompatHandler.java */
/* loaded from: classes.dex */
public final class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k  reason: collision with root package name */
    public static a1 f2495k;

    /* renamed from: l  reason: collision with root package name */
    public static a1 f2496l;

    /* renamed from: a  reason: collision with root package name */
    public final View f2497a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f2498b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final y0 f2499d = new y0(this, 0);

    /* renamed from: e  reason: collision with root package name */
    public final z0 f2500e = new z0(this, 0);

    /* renamed from: f  reason: collision with root package name */
    public int f2501f;

    /* renamed from: g  reason: collision with root package name */
    public int f2502g;

    /* renamed from: h  reason: collision with root package name */
    public b1 f2503h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2504i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2505j;

    public a1(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f2497a = view;
        this.f2498b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = x0.h0.f31454a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = h0.b.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.c = scaledTouchSlop;
        this.f2505j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(a1 a1Var) {
        a1 a1Var2 = f2495k;
        if (a1Var2 != null) {
            a1Var2.f2497a.removeCallbacks(a1Var2.f2499d);
        }
        f2495k = a1Var;
        if (a1Var != null) {
            a1Var.f2497a.postDelayed(a1Var.f2499d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z10;
        a1 a1Var = f2496l;
        View view = this.f2497a;
        if (a1Var == this) {
            f2496l = null;
            b1 b1Var = this.f2503h;
            if (b1Var != null) {
                View view2 = b1Var.f2525b;
                if (view2.getParent() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((WindowManager) b1Var.f2524a.getSystemService("window")).removeView(view2);
                }
                this.f2503h = null;
                this.f2505j = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f2495k == this) {
            b(null);
        }
        view.removeCallbacks(this.f2500e);
    }

    public final void c(boolean z10) {
        boolean z11;
        int height;
        int i10;
        int i11;
        String str;
        int i12;
        String str2;
        int i13;
        long longPressTimeout;
        long j10;
        long j11;
        boolean z12;
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        View view = this.f2497a;
        if (!f0.g.b(view)) {
            return;
        }
        b(null);
        a1 a1Var = f2496l;
        if (a1Var != null) {
            a1Var.a();
        }
        f2496l = this;
        this.f2504i = z10;
        b1 b1Var = new b1(view.getContext());
        this.f2503h = b1Var;
        int i14 = this.f2501f;
        int i15 = this.f2502g;
        boolean z13 = this.f2504i;
        View view2 = b1Var.f2525b;
        if (view2.getParent() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Context context = b1Var.f2524a;
        if (z11) {
            if (view2.getParent() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
        }
        b1Var.c.setText(this.f2498b);
        WindowManager.LayoutParams layoutParams = b1Var.f2526d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i14 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i15 + dimensionPixelOffset2;
            i10 = i15 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i10 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = context.getResources();
        if (z13) {
            i11 = R.dimen.tooltip_y_offset_touch;
        } else {
            i11 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i11);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            str2 = "window";
        } else {
            Rect rect = b1Var.f2527e;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                i12 = 0;
            } else {
                Resources resources2 = context.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i13 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i13 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i12 = 0;
                rect.set(0, i13, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = b1Var.f2529g;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = b1Var.f2528f;
            view.getLocationOnScreen(iArr2);
            int i16 = iArr2[i12] - iArr[i12];
            iArr2[i12] = i16;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (i16 + i14) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i17 = iArr2[1];
            int i18 = ((i10 + i17) - dimensionPixelOffset3) - measuredHeight;
            int i19 = i17 + height + dimensionPixelOffset3;
            if (z13) {
                if (i18 >= 0) {
                    layoutParams.y = i18;
                } else {
                    layoutParams.y = i19;
                }
            } else if (measuredHeight + i19 <= rect.height()) {
                layoutParams.y = i19;
            } else {
                layoutParams.y = i18;
            }
            str2 = str;
        }
        ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
        view.addOnAttachStateChangeListener(this);
        if (this.f2504i) {
            j11 = 2500;
        } else {
            if ((f0.d.g(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 15000;
            }
            j11 = j10 - longPressTimeout;
        }
        z0 z0Var = this.f2500e;
        view.removeCallbacks(z0Var);
        view.postDelayed(z0Var, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.widget.b1 r5 = r4.f2503h
            r0 = 0
            if (r5 == 0) goto La
            boolean r5 = r4.f2504i
            if (r5 == 0) goto La
            return r0
        La:
            android.view.View r5 = r4.f2497a
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r6.getAction()
            r2 = 7
            r3 = 1
            if (r1 == r2) goto L38
            r5 = 10
            if (r1 == r5) goto L32
            goto L74
        L32:
            r4.f2505j = r3
            r4.a()
            goto L74
        L38:
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L74
            androidx.appcompat.widget.b1 r5 = r4.f2503h
            if (r5 != 0) goto L74
            float r5 = r6.getX()
            int r5 = (int) r5
            float r6 = r6.getY()
            int r6 = (int) r6
            boolean r1 = r4.f2505j
            if (r1 != 0) goto L69
            int r1 = r4.f2501f
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r4.c
            if (r1 > r2) goto L69
            int r1 = r4.f2502g
            int r1 = r6 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L67
            goto L69
        L67:
            r3 = r0
            goto L6f
        L69:
            r4.f2501f = r5
            r4.f2502g = r6
            r4.f2505j = r0
        L6f:
            if (r3 == 0) goto L74
            b(r4)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f2501f = view.getWidth() / 2;
        this.f2502g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
