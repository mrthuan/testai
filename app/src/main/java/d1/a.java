package d1;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.api.Api;
import d1.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hslf.record.SlideAtom;
import x0.f0;
import x0.n0;
import y0.f;
import y0.g;
import y0.i;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes.dex */
public abstract class a extends x0.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f16034n = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID);

    /* renamed from: o  reason: collision with root package name */
    public static final C0189a f16035o = new C0189a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f16036p = new b();

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f16041h;

    /* renamed from: i  reason: collision with root package name */
    public final View f16042i;

    /* renamed from: j  reason: collision with root package name */
    public c f16043j;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f16037d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f16038e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f16039f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f16040g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public int f16044k = SlideAtom.USES_MASTER_SLIDE_ID;

    /* renamed from: l  reason: collision with root package name */
    public int f16045l = SlideAtom.USES_MASTER_SLIDE_ID;

    /* renamed from: m  reason: collision with root package name */
    public int f16046m = SlideAtom.USES_MASTER_SLIDE_ID;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: d1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0189a implements b.a<f> {
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class b {
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class c extends g {
        public c() {
        }

        @Override // y0.g
        public final f a(int i10) {
            return new f(AccessibilityNodeInfo.obtain(a.this.r(i10).f31951a));
        }

        @Override // y0.g
        public final f b(int i10) {
            int i11;
            a aVar = a.this;
            if (i10 == 2) {
                i11 = aVar.f16044k;
            } else {
                i11 = aVar.f16045l;
            }
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i11);
        }

        @Override // y0.g
        public final boolean c(int i10, int i11, Bundle bundle) {
            int i12;
            a aVar = a.this;
            View view = aVar.f16042i;
            if (i10 != -1) {
                boolean z10 = true;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 64) {
                            if (i11 != 128) {
                                return aVar.s(i10, i11, bundle);
                            }
                            if (aVar.f16044k == i10) {
                                aVar.f16044k = SlideAtom.USES_MASTER_SLIDE_ID;
                                view.invalidate();
                                aVar.x(i10, 65536);
                            }
                            z10 = false;
                        } else {
                            AccessibilityManager accessibilityManager = aVar.f16041h;
                            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = aVar.f16044k) != i10) {
                                if (i12 != Integer.MIN_VALUE) {
                                    aVar.f16044k = SlideAtom.USES_MASTER_SLIDE_ID;
                                    aVar.f16042i.invalidate();
                                    aVar.x(i12, 65536);
                                }
                                aVar.f16044k = i10;
                                view.invalidate();
                                aVar.x(i10, Variant.VT_RESERVED);
                            }
                            z10 = false;
                        }
                        return z10;
                    }
                    return aVar.j(i10);
                }
                return aVar.w(i10);
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            return f0.d.j(view, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f16042i = view;
            this.f16041h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.d.c(view) == 0) {
                f0.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // x0.a
    public final g b(View view) {
        if (this.f16043j == null) {
            this.f16043j = new c();
        }
        return this.f16043j;
    }

    @Override // x0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // x0.a
    public final void d(View view, f fVar) {
        this.f31416a.onInitializeAccessibilityNodeInfo(view, fVar.f31951a);
        t(fVar);
    }

    public final boolean j(int i10) {
        if (this.f16045l != i10) {
            return false;
        }
        this.f16045l = SlideAtom.USES_MASTER_SLIDE_ID;
        v(i10, false);
        x(i10, 8);
        return true;
    }

    public final AccessibilityEvent k(int i10, int i11) {
        View view = this.f16042i;
        if (i10 != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
            f r4 = r(i10);
            obtain.getText().add(r4.e());
            AccessibilityNodeInfo accessibilityNodeInfo = r4.f31951a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            i.a(obtain, view, i10);
            obtain.setPackageName(view.getContext().getPackageName());
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i11);
        view.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    public final f l(int i10) {
        boolean z10;
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        f fVar = new f(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        fVar.h("android.view.View");
        Rect rect = f16034n;
        fVar.g(rect);
        obtain.setBoundsInScreen(rect);
        fVar.f31952b = -1;
        View view = this.f16042i;
        obtain.setParent(view);
        u(i10, fVar);
        if (fVar.e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f16038e;
        fVar.d(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    fVar.c = i10;
                    obtain.setSource(view, i10);
                    boolean z11 = false;
                    if (this.f16044k == i10) {
                        obtain.setAccessibilityFocused(true);
                        fVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        fVar.a(64);
                    }
                    if (this.f16045l == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        fVar.a(2);
                    } else if (obtain.isFocusable()) {
                        fVar.a(1);
                    }
                    obtain.setFocused(z10);
                    int[] iArr = this.f16040g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f16037d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        fVar.d(rect3);
                        if (fVar.f31952b != -1) {
                            f fVar2 = new f(AccessibilityNodeInfo.obtain());
                            int i11 = fVar.f31952b;
                            while (true) {
                                accessibilityNodeInfo = fVar2.f31951a;
                                if (i11 == -1) {
                                    break;
                                }
                                fVar2.f31952b = -1;
                                accessibilityNodeInfo.setParent(view, -1);
                                fVar2.g(rect);
                                u(i11, fVar2);
                                fVar2.d(rect2);
                                rect3.offset(rect2.left, rect2.top);
                                i11 = fVar2.f31952b;
                            }
                            accessibilityNodeInfo.recycle();
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f16039f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            AccessibilityNodeInfo accessibilityNodeInfo2 = fVar.f31951a;
                            accessibilityNodeInfo2.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                ViewParent parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        z11 = true;
                                    }
                                }
                            }
                            if (z11) {
                                accessibilityNodeInfo2.setVisibleToUser(true);
                            }
                        }
                    }
                    return fVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final boolean m(MotionEvent motionEvent) {
        int i10;
        AccessibilityManager accessibilityManager = this.f16041h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || (i10 = this.f16046m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f16046m = SlideAtom.USES_MASTER_SLIDE_ID;
                x(SlideAtom.USES_MASTER_SLIDE_ID, 128);
                x(i10, 256);
            }
            return true;
        }
        int n10 = n(motionEvent.getX(), motionEvent.getY());
        int i11 = this.f16046m;
        if (i11 != n10) {
            this.f16046m = n10;
            x(n10, 128);
            x(i11, 256);
        }
        if (n10 == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public abstract int n(float f10, float f11);

    public abstract void o(ArrayList arrayList);

    public final void p(int i10) {
        View view;
        ViewParent parent;
        if (i10 != Integer.MIN_VALUE && this.f16041h.isEnabled() && (parent = (view = this.f16042i).getParent()) != null) {
            AccessibilityEvent k10 = k(i10, 2048);
            y0.b.b(k10, 0);
            parent.requestSendAccessibilityEvent(view, k10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0145, code lost:
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.a.q(int, android.graphics.Rect):boolean");
    }

    public final f r(int i10) {
        if (i10 == -1) {
            View view = this.f16042i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            f fVar = new f(obtain);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            o(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                fVar.f31951a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
            }
            return fVar;
        }
        return l(i10);
    }

    public abstract boolean s(int i10, int i11, Bundle bundle);

    public abstract void u(int i10, f fVar);

    public final boolean w(int i10) {
        int i11;
        View view = this.f16042i;
        if ((!view.isFocused() && !view.requestFocus()) || (i11 = this.f16045l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f16045l = i10;
        v(i10, true);
        x(i10, 8);
        return true;
    }

    public final void x(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f16041h.isEnabled() || (parent = (view = this.f16042i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i10, i11));
    }

    public void t(f fVar) {
    }

    public void v(int i10, boolean z10) {
    }
}
