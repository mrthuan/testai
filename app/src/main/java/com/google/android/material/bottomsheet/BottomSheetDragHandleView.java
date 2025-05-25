package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.tools.d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;
import y0.f;

/* loaded from: classes2.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f12157m = 0;

    /* renamed from: d  reason: collision with root package name */
    public final AccessibilityManager f12158d;

    /* renamed from: e  reason: collision with root package name */
    public BottomSheetBehavior<?> f12159e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12160f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12161g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12162h;

    /* renamed from: i  reason: collision with root package name */
    public final String f12163i;

    /* renamed from: j  reason: collision with root package name */
    public final String f12164j;

    /* renamed from: k  reason: collision with root package name */
    public final String f12165k;

    /* renamed from: l  reason: collision with root package name */
    public final a f12166l;

    /* loaded from: classes2.dex */
    public class b extends x0.a {
        public b() {
        }

        @Override // x0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                int i10 = BottomSheetDragHandleView.f12157m;
                BottomSheetDragHandleView.this.c();
            }
        }
    }

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f12159e;
        a aVar = this.f12166l;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.X.remove(aVar);
            this.f12159e.B(null);
        }
        this.f12159e = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.B(this);
            d(this.f12159e.L);
            ArrayList<BottomSheetBehavior.c> arrayList = this.f12159e.X;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
        }
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r1 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r7 = this;
            boolean r0 = r7.f12161g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.view.accessibility.AccessibilityManager r0 = r7.f12158d
            if (r0 != 0) goto Lb
            goto L1d
        Lb:
            r2 = 16384(0x4000, float:2.2959E-41)
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain(r2)
            java.util.List r3 = r2.getText()
            java.lang.String r4 = r7.f12165k
            r3.add(r4)
            r0.sendAccessibilityEvent(r2)
        L1d:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r7.f12159e
            boolean r2 = r0.f12118b
            r3 = 1
            if (r2 != 0) goto L28
            r0.getClass()
            r1 = r3
        L28:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r7.f12159e
            int r2 = r0.L
            r4 = 6
            r5 = 3
            r6 = 4
            if (r2 != r6) goto L34
            if (r1 == 0) goto L41
            goto L42
        L34:
            if (r2 != r5) goto L3b
            if (r1 == 0) goto L39
            goto L42
        L39:
            r4 = r6
            goto L42
        L3b:
            boolean r1 = r7.f12162h
            if (r1 == 0) goto L40
            goto L41
        L40:
            r5 = r6
        L41:
            r4 = r5
        L42:
            r0.E(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.c():boolean");
    }

    public final void d(int i10) {
        String str;
        if (i10 == 4) {
            this.f12162h = true;
        } else if (i10 == 3) {
            this.f12162h = false;
        }
        f.a aVar = f.a.f31955g;
        if (this.f12162h) {
            str = this.f12163i;
        } else {
            str = this.f12164j;
        }
        f0.m(this, aVar, str, new d(this, 3));
    }

    public final void e() {
        boolean z10;
        int i10 = 1;
        if (this.f12160f && this.f12159e != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12161g = z10;
        if (this.f12159e == null) {
            i10 = 2;
        }
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.s(this, i10);
        setClickable(this.f12161g);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z10) {
        this.f12160f = z10;
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View] */
    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        BottomSheetDragHandleView bottomSheetDragHandleView = this;
        while (true) {
            ViewParent parent = bottomSheetDragHandleView.getParent();
            bottomSheetBehavior = null;
            if (parent instanceof View) {
                bottomSheetDragHandleView = (View) parent;
            } else {
                bottomSheetDragHandleView = null;
            }
            if (bottomSheetDragHandleView == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = bottomSheetDragHandleView.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f3487a;
                if (cVar instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) cVar;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.f12158d;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f12158d;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018059), attributeSet, i10);
        this.f12163i = getResources().getString(R.string.arg_res_0x7f13008b);
        this.f12164j = getResources().getString(R.string.arg_res_0x7f13008a);
        this.f12165k = getResources().getString(R.string.arg_res_0x7f13008d);
        this.f12166l = new a();
        this.f12158d = (AccessibilityManager) getContext().getSystemService("accessibility");
        e();
        f0.o(this, new b());
    }

    /* loaded from: classes2.dex */
    public class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void c(View view, int i10) {
            int i11 = BottomSheetDragHandleView.f12157m;
            BottomSheetDragHandleView.this.d(i10);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view) {
        }
    }
}
