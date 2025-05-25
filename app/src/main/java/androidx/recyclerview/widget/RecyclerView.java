package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.k0;
import androidx.recyclerview.widget.q;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.Api;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;
import s0.l;
import x0.f0;
import x0.h0;
import x0.n0;
import y0.f;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements x0.z, x0.o {
    public static final int[] A0 = {16843830};
    public static final Class<?>[] B0;
    public static final c C0;
    public boolean A;
    public final AccessibilityManager B;
    public ArrayList C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public i H;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public j M;
    public int N;
    public int O;
    public VelocityTracker P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public p V;
    public final int W;

    /* renamed from: a  reason: collision with root package name */
    public final v f4215a;

    /* renamed from: a0  reason: collision with root package name */
    public final int f4216a0;

    /* renamed from: b  reason: collision with root package name */
    public final t f4217b;

    /* renamed from: b0  reason: collision with root package name */
    public final float f4218b0;
    public w c;

    /* renamed from: c0  reason: collision with root package name */
    public final float f4219c0;

    /* renamed from: d  reason: collision with root package name */
    public androidx.recyclerview.widget.a f4220d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f4221d0;

    /* renamed from: e  reason: collision with root package name */
    public androidx.recyclerview.widget.g f4222e;

    /* renamed from: e0  reason: collision with root package name */
    public final a0 f4223e0;

    /* renamed from: f  reason: collision with root package name */
    public final k0 f4224f;

    /* renamed from: f0  reason: collision with root package name */
    public androidx.recyclerview.widget.q f4225f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4226g;

    /* renamed from: g0  reason: collision with root package name */
    public final q.b f4227g0;

    /* renamed from: h  reason: collision with root package name */
    public final a f4228h;

    /* renamed from: h0  reason: collision with root package name */
    public final y f4229h0;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f4230i;

    /* renamed from: i0  reason: collision with root package name */
    public r f4231i0;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f4232j;

    /* renamed from: j0  reason: collision with root package name */
    public ArrayList f4233j0;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f4234k;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f4235k0;

    /* renamed from: l  reason: collision with root package name */
    public Adapter f4236l;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f4237l0;

    /* renamed from: m  reason: collision with root package name */
    public m f4238m;

    /* renamed from: m0  reason: collision with root package name */
    public final k f4239m0;

    /* renamed from: n  reason: collision with root package name */
    public u f4240n;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f4241n0;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f4242o;

    /* renamed from: o0  reason: collision with root package name */
    public f0 f4243o0;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<l> f4244p;

    /* renamed from: p0  reason: collision with root package name */
    public final int[] f4245p0;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList<q> f4246q;

    /* renamed from: q0  reason: collision with root package name */
    public x0.p f4247q0;

    /* renamed from: r  reason: collision with root package name */
    public q f4248r;

    /* renamed from: r0  reason: collision with root package name */
    public final int[] f4249r0;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4250s;

    /* renamed from: s0  reason: collision with root package name */
    public final int[] f4251s0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4252t;

    /* renamed from: t0  reason: collision with root package name */
    public final int[] f4253t0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4254u;

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayList f4255u0;

    /* renamed from: v  reason: collision with root package name */
    public int f4256v;

    /* renamed from: v0  reason: collision with root package name */
    public final b f4257v0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4258w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f4259w0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4260x;

    /* renamed from: x0  reason: collision with root package name */
    public int f4261x0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4262y;

    /* renamed from: y0  reason: collision with root package name */
    public int f4263y0;

    /* renamed from: z  reason: collision with root package name */
    public int f4264z;

    /* renamed from: z0  reason: collision with root package name */
    public final d f4265z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4254u && !recyclerView.isLayoutRequested()) {
                if (!recyclerView.f4250s) {
                    recyclerView.requestLayout();
                } else if (recyclerView.f4260x) {
                    recyclerView.f4258w = true;
                } else {
                    recyclerView.x();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class a0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f4268a;

        /* renamed from: b  reason: collision with root package name */
        public int f4269b;
        public OverScroller c;

        /* renamed from: d  reason: collision with root package name */
        public Interpolator f4270d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4271e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4272f;

        public a0() {
            c cVar = RecyclerView.C0;
            this.f4270d = cVar;
            this.f4271e = false;
            this.f4272f = false;
            this.c = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a() {
            if (this.f4271e) {
                this.f4272f = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            f0.d.m(recyclerView, this);
        }

        public final void b(int i10, int i11, int i12, Interpolator interpolator) {
            boolean z10;
            int height;
            RecyclerView recyclerView = RecyclerView.this;
            if (i12 == Integer.MIN_VALUE) {
                int abs = Math.abs(i10);
                int abs2 = Math.abs(i11);
                if (abs > abs2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                if (!z10) {
                    abs = abs2;
                }
                i12 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), (int) AdError.SERVER_ERROR_CODE);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.C0;
            }
            if (this.f4270d != interpolator) {
                this.f4270d = interpolator;
                this.c = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f4269b = 0;
            this.f4268a = 0;
            recyclerView.setScrollState(2);
            this.c.startScroll(0, 0, i10, i11, i13);
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            int i11;
            int i12;
            int i13;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int i14;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4238m == null) {
                recyclerView.removeCallbacks(this);
                this.c.abortAnimation();
                return;
            }
            this.f4272f = false;
            this.f4271e = true;
            recyclerView.x();
            OverScroller overScroller = this.c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i15 = currX - this.f4268a;
                int i16 = currY - this.f4269b;
                this.f4268a = currX;
                this.f4269b = currY;
                int[] iArr = recyclerView.f4253t0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean D = recyclerView.D(i15, i16, 1, iArr, null);
                int[] iArr2 = recyclerView.f4253t0;
                if (D) {
                    i15 -= iArr2[0];
                    i16 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.w(i15, i16);
                }
                if (recyclerView.f4236l != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.q0(i15, iArr2, i16);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    int i19 = i15 - i17;
                    int i20 = i16 - i18;
                    x xVar = recyclerView.f4238m.f4288e;
                    if (xVar != null && !xVar.f4322d && xVar.f4323e) {
                        int b10 = recyclerView.f4229h0.b();
                        if (b10 == 0) {
                            xVar.f();
                        } else if (xVar.f4320a >= b10) {
                            xVar.f4320a = b10 - 1;
                            xVar.b(i17, i18);
                        } else {
                            xVar.b(i17, i18);
                        }
                    }
                    i13 = i17;
                    i10 = i19;
                    i11 = i20;
                    i12 = i18;
                } else {
                    i10 = i15;
                    i11 = i16;
                    i12 = 0;
                    i13 = 0;
                }
                if (!recyclerView.f4244p.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.f4253t0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i21 = i12;
                recyclerView.E(i13, i12, i10, i11, null, 1, iArr3);
                int i22 = i10 - iArr2[0];
                int i23 = i11 - iArr2[1];
                if (i13 != 0 || i21 != 0) {
                    recyclerView.F(i13, i21);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!overScroller.isFinished() && ((!z10 && i22 == 0) || (!z11 && i23 == 0))) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                x xVar2 = recyclerView.f4238m.f4288e;
                if (xVar2 != null && xVar2.f4322d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 && z12) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i22 < 0) {
                            i14 = -currVelocity;
                        } else if (i22 > 0) {
                            i14 = currVelocity;
                        } else {
                            i14 = 0;
                        }
                        if (i23 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i23 <= 0) {
                            currVelocity = 0;
                        }
                        if (i14 < 0) {
                            recyclerView.H();
                            if (recyclerView.I.isFinished()) {
                                recyclerView.I.onAbsorb(-i14);
                            }
                        } else if (i14 > 0) {
                            recyclerView.I();
                            if (recyclerView.K.isFinished()) {
                                recyclerView.K.onAbsorb(i14);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.J();
                            if (recyclerView.J.isFinished()) {
                                recyclerView.J.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.G();
                            if (recyclerView.L.isFinished()) {
                                recyclerView.L.onAbsorb(currVelocity);
                            }
                        }
                        if (i14 != 0 || currVelocity != 0) {
                            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                            f0.d.k(recyclerView);
                        }
                    }
                    q.b bVar = recyclerView.f4227g0;
                    int[] iArr4 = bVar.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    bVar.f4546d = 0;
                } else {
                    a();
                    androidx.recyclerview.widget.q qVar = recyclerView.f4225f0;
                    if (qVar != null) {
                        qVar.a(recyclerView, i13, i21);
                    }
                }
            }
            x xVar3 = recyclerView.f4238m.f4288e;
            if (xVar3 != null && xVar3.f4322d) {
                xVar3.b(0, 0);
            }
            this.f4271e = false;
            if (this.f4272f) {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, n0> weakHashMap2 = x0.f0.f31435a;
                f0.d.m(recyclerView, this);
                return;
            }
            recyclerView.setScrollState(0);
            recyclerView.x0(1);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            j jVar = recyclerView.M;
            if (jVar != null) {
                jVar.l();
            }
            recyclerView.f4241n0 = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        Adapter<? extends b0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        b0 mShadowedHolder = null;
        b0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        t mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public b0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                if (f0.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.T(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final Adapter<? extends b0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int T;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (T = this.mOwnerRecyclerView.T(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, T);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            if (i10 == -1) {
                return this.mPosition;
            }
            return i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            if (i10 == -1) {
                return this.mPosition;
            }
            return i10;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        public boolean hasAnyOfTheFlags(int i10) {
            if ((i10 & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        public boolean isAdapterPositionUnknown() {
            if ((this.mFlags & 512) == 0 && !isInvalid()) {
                return false;
            }
            return true;
        }

        public boolean isAttachedToTransitionOverlay() {
            if (this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView) {
                return true;
            }
            return false;
        }

        public boolean isBound() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean isInvalid() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                if (!f0.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isRemoved() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        public boolean isScrap() {
            if (this.mScrapContainer != null) {
                return true;
            }
            return false;
        }

        public boolean isTmpDetached() {
            if ((this.mFlags & 256) != 0) {
                return true;
            }
            return false;
        }

        public boolean isUpdated() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public boolean needsUpdate() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((n) this.itemView.getLayoutParams()).c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                View view = this.itemView;
                WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                this.mWasImportantForAccessibilityBeforeHidden = f0.d.c(view);
            }
            if (recyclerView.a0()) {
                this.mPendingAccessibilityState = 4;
                recyclerView.f4255u0.add(this);
                return;
            }
            View view2 = this.itemView;
            WeakHashMap<View, n0> weakHashMap2 = x0.f0.f31435a;
            f0.d.s(view2, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            int i10 = this.mWasImportantForAccessibilityBeforeHidden;
            if (recyclerView.a0()) {
                this.mPendingAccessibilityState = i10;
                recyclerView.f4255u0.add(this);
            } else {
                View view = this.itemView;
                WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                f0.d.s(view, i10);
            }
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.u(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10;
            int i11 = this.mIsRecyclableCount;
            if (z10) {
                i10 = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
            this.mIsRecyclableCount = i10;
            if (i10 < 0) {
                this.mIsRecyclableCount = 0;
                toString();
            } else if (!z10 && i10 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i10 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(t tVar, boolean z10) {
            this.mScrapContainer = tVar;
            this.mInChangeScrap = z10;
        }

        public boolean shouldBeKeptAsChild() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        public boolean shouldIgnore() {
            if ((this.mFlags & 128) != 0) {
                return true;
            }
            return false;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder g10 = a0.d.g(simpleName, "{");
            g10.append(Integer.toHexString(hashCode()));
            g10.append(" position=");
            g10.append(this.mPosition);
            g10.append(" id=");
            g10.append(this.mItemId);
            g10.append(", oldPos=");
            g10.append(this.mOldPosition);
            g10.append(", pLpos:");
            g10.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(g10.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.k(this);
        }

        public boolean wasReturnedFromScrap() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public d() {
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4276a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f4276a = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4276a[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Observable<g> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).e(i10, i11);
            }
        }

        public final void d(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public final void e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }

        public final void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface h {
    }

    /* loaded from: classes.dex */
    public static class i {
    }

    /* loaded from: classes.dex */
    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public b f4277a = null;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<a> f4278b = new ArrayList<>();
        public final long c = 120;

        /* renamed from: d  reason: collision with root package name */
        public final long f4279d = 120;

        /* renamed from: e  reason: collision with root package name */
        public final long f4280e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f4281f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f4282a;

            /* renamed from: b  reason: collision with root package name */
            public int f4283b;

            public final void a(b0 b0Var) {
                View view = b0Var.itemView;
                this.f4282a = view.getLeft();
                this.f4283b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void e(b0 b0Var) {
            int i10 = b0Var.mFlags & 14;
            if (!b0Var.isInvalid() && (i10 & 4) == 0) {
                b0Var.getOldPosition();
                b0Var.getAbsoluteAdapterPosition();
            }
        }

        public abstract boolean a(b0 b0Var, c cVar, c cVar2);

        public abstract boolean b(b0 b0Var, b0 b0Var2, c cVar, c cVar2);

        public abstract boolean c(b0 b0Var, c cVar, c cVar2);

        public abstract boolean d(b0 b0Var, c cVar, c cVar2);

        public abstract boolean f(b0 b0Var);

        public boolean g(b0 b0Var, List<Object> list) {
            return f(b0Var);
        }

        public final void h(b0 b0Var) {
            b bVar = this.f4277a;
            if (bVar != null) {
                k kVar = (k) bVar;
                boolean z10 = true;
                b0Var.setIsRecyclable(true);
                if (b0Var.mShadowedHolder != null && b0Var.mShadowingHolder == null) {
                    b0Var.mShadowedHolder = null;
                }
                b0Var.mShadowingHolder = null;
                if (!b0Var.shouldBeKeptAsChild()) {
                    View view = b0Var.itemView;
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.v0();
                    androidx.recyclerview.widget.g gVar = recyclerView.f4222e;
                    d0 d0Var = (d0) gVar.f4424a;
                    int indexOfChild = d0Var.f4406a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        gVar.l(view);
                    } else {
                        g.a aVar = gVar.f4425b;
                        if (aVar.d(indexOfChild)) {
                            aVar.f(indexOfChild);
                            gVar.l(view);
                            d0Var.b(indexOfChild);
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        b0 X = RecyclerView.X(view);
                        t tVar = recyclerView.f4217b;
                        tVar.k(X);
                        tVar.h(X);
                    }
                    recyclerView.w0(!z10);
                    if (!z10 && b0Var.isTmpDetached()) {
                        recyclerView.removeDetachedView(b0Var.itemView, false);
                    }
                }
            }
        }

        public abstract void i(b0 b0Var);

        public abstract void j();

        public abstract boolean k();

        public abstract void l();
    }

    /* loaded from: classes.dex */
    public class k implements j.b {
        public k() {
        }
    }

    /* loaded from: classes.dex */
    public interface o {
        void a(View view);

        void b(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class p {
    }

    /* loaded from: classes.dex */
    public interface q {
        void c(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean f(RecyclerView recyclerView, MotionEvent motionEvent);

        void j(boolean z10);
    }

    /* loaded from: classes.dex */
    public static class s {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f4307a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f4308b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<b0> f4309a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public final int f4310b = 5;
            public long c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f4311d = 0;
        }

        public final a a(int i10) {
            SparseArray<a> sparseArray = this.f4307a;
            a aVar = sparseArray.get(i10);
            if (aVar == null) {
                a aVar2 = new a();
                sparseArray.put(i10, aVar2);
                return aVar2;
            }
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public final class t {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<b0> f4312a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b0> f4313b;
        public final ArrayList<b0> c;

        /* renamed from: d  reason: collision with root package name */
        public final List<b0> f4314d;

        /* renamed from: e  reason: collision with root package name */
        public int f4315e;

        /* renamed from: f  reason: collision with root package name */
        public int f4316f;

        /* renamed from: g  reason: collision with root package name */
        public s f4317g;

        public t() {
            ArrayList<b0> arrayList = new ArrayList<>();
            this.f4312a = arrayList;
            this.f4313b = null;
            this.c = new ArrayList<>();
            this.f4314d = Collections.unmodifiableList(arrayList);
            this.f4315e = 2;
            this.f4316f = 2;
        }

        public final void a(b0 b0Var, boolean z10) {
            x0.a aVar;
            RecyclerView.u(b0Var);
            View view = b0Var.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            f0 f0Var = recyclerView.f4243o0;
            if (f0Var != null) {
                f0.a aVar2 = f0Var.f4421e;
                if (aVar2 instanceof f0.a) {
                    aVar = (x0.a) aVar2.f4423e.remove(view);
                } else {
                    aVar = null;
                }
                x0.f0.o(view, aVar);
            }
            if (z10) {
                u uVar = recyclerView.f4240n;
                if (uVar != null) {
                    uVar.a();
                }
                ArrayList arrayList = recyclerView.f4242o;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u) arrayList.get(i10)).a();
                }
                Adapter adapter = recyclerView.f4236l;
                if (adapter != null) {
                    adapter.onViewRecycled(b0Var);
                }
                if (recyclerView.f4229h0 != null) {
                    recyclerView.f4224f.d(b0Var);
                }
            }
            b0Var.mBindingAdapter = null;
            b0Var.mOwnerRecyclerView = null;
            s c = c();
            c.getClass();
            int itemViewType = b0Var.getItemViewType();
            ArrayList<b0> arrayList2 = c.a(itemViewType).f4309a;
            if (c.f4307a.get(itemViewType).f4310b > arrayList2.size()) {
                b0Var.resetInternal();
                arrayList2.add(b0Var);
            }
        }

        public final int b(int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 >= 0 && i10 < recyclerView.f4229h0.b()) {
                if (!recyclerView.f4229h0.f4336g) {
                    return i10;
                }
                return recyclerView.f4220d.f(i10, 0);
            }
            StringBuilder e10 = androidx.appcompat.view.menu.d.e("invalid position ", i10, ". State item count is ");
            e10.append(recyclerView.f4229h0.b());
            e10.append(recyclerView.K());
            throw new IndexOutOfBoundsException(e10.toString());
        }

        public final s c() {
            if (this.f4317g == null) {
                this.f4317g = new s();
            }
            return this.f4317g;
        }

        public final View d(int i10) {
            return j(Long.MAX_VALUE, i10).itemView;
        }

        public final void e() {
            ArrayList<b0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                f(size);
            }
            arrayList.clear();
            int[] iArr = RecyclerView.A0;
            q.b bVar = RecyclerView.this.f4227g0;
            int[] iArr2 = bVar.c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f4546d = 0;
        }

        public final void f(int i10) {
            ArrayList<b0> arrayList = this.c;
            a(arrayList.get(i10), true);
            arrayList.remove(i10);
        }

        public final void g(View view) {
            b0 X = RecyclerView.X(view);
            boolean isTmpDetached = X.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (isTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (X.isScrap()) {
                X.unScrap();
            } else if (X.wasReturnedFromScrap()) {
                X.clearReturnedFromScrapFlag();
            }
            h(X);
            if (recyclerView.M != null && !X.isRecyclable()) {
                recyclerView.M.i(X);
            }
        }

        public final void h(b0 b0Var) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean isScrap = b0Var.isScrap();
            boolean z15 = false;
            RecyclerView recyclerView = RecyclerView.this;
            if (!isScrap && b0Var.itemView.getParent() == null) {
                if (!b0Var.isTmpDetached()) {
                    if (!b0Var.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = b0Var.doesTransientStatePreventRecycling();
                        Adapter adapter = recyclerView.f4236l;
                        if (adapter != null && doesTransientStatePreventRecycling && adapter.onFailedToRecycleView(b0Var)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10 && !b0Var.isRecyclable()) {
                            z12 = false;
                        } else {
                            if (this.f4316f > 0 && !b0Var.hasAnyOfTheFlags(526)) {
                                ArrayList<b0> arrayList = this.c;
                                int size = arrayList.size();
                                if (size >= this.f4316f && size > 0) {
                                    f(0);
                                    size--;
                                }
                                int[] iArr = RecyclerView.A0;
                                if (size > 0) {
                                    int i10 = b0Var.mPosition;
                                    q.b bVar = recyclerView.f4227g0;
                                    if (bVar.c != null) {
                                        int i11 = bVar.f4546d * 2;
                                        for (int i12 = 0; i12 < i11; i12 += 2) {
                                            if (bVar.c[i12] == i10) {
                                                z13 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z13 = false;
                                    if (!z13) {
                                        do {
                                            size--;
                                            if (size < 0) {
                                                break;
                                            }
                                            int i13 = arrayList.get(size).mPosition;
                                            if (bVar.c != null) {
                                                int i14 = bVar.f4546d * 2;
                                                for (int i15 = 0; i15 < i14; i15 += 2) {
                                                    if (bVar.c[i15] == i13) {
                                                        z14 = true;
                                                        continue;
                                                        break;
                                                    }
                                                }
                                            }
                                            z14 = false;
                                            continue;
                                        } while (z14);
                                        size++;
                                    }
                                }
                                arrayList.add(size, b0Var);
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                a(b0Var, true);
                                z15 = true;
                            }
                            z12 = z15;
                            z15 = z11;
                        }
                        recyclerView.f4224f.d(b0Var);
                        if (!z15 && !z12 && doesTransientStatePreventRecycling) {
                            b0Var.mBindingAdapter = null;
                            b0Var.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.K());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + b0Var + recyclerView.K());
            }
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(b0Var.isScrap());
            sb2.append(" isAttached:");
            if (b0Var.itemView.getParent() != null) {
                z15 = true;
            }
            sb2.append(z15);
            sb2.append(recyclerView.K());
            throw new IllegalArgumentException(sb2.toString());
        }

        public final void i(View view) {
            boolean z10;
            b0 X = RecyclerView.X(view);
            boolean hasAnyOfTheFlags = X.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!hasAnyOfTheFlags && X.isUpdated()) {
                j jVar = recyclerView.M;
                if (jVar != null && !jVar.g(X, X.getUnmodifiedPayloads())) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    if (this.f4313b == null) {
                        this.f4313b = new ArrayList<>();
                    }
                    X.setScrapContainer(this, true);
                    this.f4313b.add(X);
                    return;
                }
            }
            if (X.isInvalid() && !X.isRemoved() && !recyclerView.f4236l.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.K());
            }
            X.setScrapContainer(this, false);
            this.f4312a.add(X);
        }

        /* JADX WARN: Code restructure failed: missing block: B:234:0x0423, code lost:
            if (r9 == false) goto L223;
         */
        /* JADX WARN: Removed duplicated region for block: B:131:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x031e  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x03bb  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x040c  */
        /* JADX WARN: Removed duplicated region for block: B:239:0x0446  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x0460  */
        /* JADX WARN: Removed duplicated region for block: B:268:0x04a1  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x04a6  */
        /* JADX WARN: Removed duplicated region for block: B:275:0x04b1  */
        /* JADX WARN: Removed duplicated region for block: B:276:0x04bd  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x04d6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.recyclerview.widget.RecyclerView.b0 j(long r20, int r22) {
            /*
                Method dump skipped, instructions count: 1280
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.j(long, int):androidx.recyclerview.widget.RecyclerView$b0");
        }

        public final void k(b0 b0Var) {
            if (b0Var.mInChangeScrap) {
                this.f4313b.remove(b0Var);
            } else {
                this.f4312a.remove(b0Var);
            }
            b0Var.mScrapContainer = null;
            b0Var.mInChangeScrap = false;
            b0Var.clearReturnedFromScrapFlag();
        }

        public final void l() {
            int i10;
            m mVar = RecyclerView.this.f4238m;
            if (mVar != null) {
                i10 = mVar.f4293j;
            } else {
                i10 = 0;
            }
            this.f4316f = this.f4315e + i10;
            ArrayList<b0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f4316f; size--) {
                f(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface u {
        void a();
    }

    /* loaded from: classes.dex */
    public class v extends g {
        public v() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.t(null);
            recyclerView.f4229h0.f4335f = true;
            recyclerView.k0(true);
            if (!recyclerView.f4220d.g()) {
                recyclerView.requestLayout();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
            if (r2.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(int r5, int r6, java.lang.Object r7) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.t(r1)
                androidx.recyclerview.widget.a r0 = r0.f4220d
                r1 = 1
                if (r6 >= r1) goto Lf
                r0.getClass()
                goto L25
            Lf:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f4383b
                r3 = 4
                androidx.recyclerview.widget.a$b r5 = r0.h(r3, r7, r5, r6)
                r2.add(r5)
                int r5 = r0.f4386f
                r5 = r5 | r3
                r0.f4386f = r5
                int r5 = r2.size()
                if (r5 != r1) goto L25
                goto L26
            L25:
                r1 = 0
            L26:
                if (r1 == 0) goto L2b
                r4.h()
            L2b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.c(int, int, java.lang.Object):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r3.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(int r5, int r6) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.t(r1)
                androidx.recyclerview.widget.a r0 = r0.f4220d
                r2 = 1
                if (r6 >= r2) goto Lf
                r0.getClass()
                goto L24
            Lf:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f4383b
                androidx.recyclerview.widget.a$b r5 = r0.h(r2, r1, r5, r6)
                r3.add(r5)
                int r5 = r0.f4386f
                r5 = r5 | r2
                r0.f4386f = r5
                int r5 = r3.size()
                if (r5 != r2) goto L24
                goto L25
            L24:
                r2 = 0
            L25:
                if (r2 == 0) goto L2a
                r4.h()
            L2a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.d(int, int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
            if (r2.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(int r5, int r6) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.t(r1)
                androidx.recyclerview.widget.a r0 = r0.f4220d
                r0.getClass()
                if (r5 != r6) goto Le
                goto L26
            Le:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f4383b
                r3 = 8
                androidx.recyclerview.widget.a$b r5 = r0.h(r3, r1, r5, r6)
                r2.add(r5)
                int r5 = r0.f4386f
                r5 = r5 | r3
                r0.f4386f = r5
                int r5 = r2.size()
                r6 = 1
                if (r5 != r6) goto L26
                goto L27
            L26:
                r6 = 0
            L27:
                if (r6 == 0) goto L2c
                r4.h()
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.e(int, int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
            if (r3.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void f(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.t(r1)
                androidx.recyclerview.widget.a r0 = r0.f4220d
                r2 = 1
                if (r7 >= r2) goto Lf
                r0.getClass()
                goto L25
            Lf:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f4383b
                r4 = 2
                androidx.recyclerview.widget.a$b r6 = r0.h(r4, r1, r6, r7)
                r3.add(r6)
                int r6 = r0.f4386f
                r6 = r6 | r4
                r0.f4386f = r6
                int r6 = r3.size()
                if (r6 != r2) goto L25
                goto L26
            L25:
                r2 = 0
            L26:
                if (r2 == 0) goto L2b
                r5.h()
            L2b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.f(int, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.c != null && (adapter = recyclerView.f4236l) != null && adapter.canRestoreState()) {
                recyclerView.requestLayout();
            }
        }

        public final void h() {
            int[] iArr = RecyclerView.A0;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4252t && recyclerView.f4250s) {
                WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                f0.d.m(recyclerView, recyclerView.f4228h);
                return;
            }
            recyclerView.A = true;
            recyclerView.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static class w extends c1.a {
        public static final Parcelable.Creator<w> CREATOR = new a();
        public Parcelable c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<w> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final w createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new w(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new w[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new w(parcel, null);
            }
        }

        public w(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeParcelable(this.c, 0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class x {

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f4321b;
        public m c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4322d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4323e;

        /* renamed from: f  reason: collision with root package name */
        public View f4324f;

        /* renamed from: a  reason: collision with root package name */
        public int f4320a = -1;

        /* renamed from: g  reason: collision with root package name */
        public final a f4325g = new a();

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: d  reason: collision with root package name */
            public int f4328d = -1;

            /* renamed from: f  reason: collision with root package name */
            public boolean f4330f = false;

            /* renamed from: a  reason: collision with root package name */
            public int f4326a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f4327b = 0;
            public int c = SlideAtom.USES_MASTER_SLIDE_ID;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f4329e = null;

            public final void a(RecyclerView recyclerView) {
                int i10 = this.f4328d;
                if (i10 >= 0) {
                    this.f4328d = -1;
                    recyclerView.b0(i10);
                    this.f4330f = false;
                } else if (this.f4330f) {
                    Interpolator interpolator = this.f4329e;
                    if (interpolator != null && this.c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i11 = this.c;
                    if (i11 >= 1) {
                        recyclerView.f4223e0.b(this.f4326a, this.f4327b, i11, interpolator);
                        this.f4330f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            m mVar = this.c;
            if (mVar instanceof b) {
                return ((b) mVar).a(i10);
            }
            return null;
        }

        public final void b(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f4321b;
            int i12 = -1;
            if (this.f4320a == -1 || recyclerView == null) {
                f();
            }
            if (this.f4322d && this.f4324f == null && this.c != null && (a10 = a(this.f4320a)) != null) {
                float f10 = a10.x;
                if (f10 != 0.0f || a10.y != 0.0f) {
                    recyclerView.q0((int) Math.signum(f10), null, (int) Math.signum(a10.y));
                }
            }
            boolean z10 = false;
            this.f4322d = false;
            View view = this.f4324f;
            a aVar = this.f4325g;
            if (view != null) {
                this.f4321b.getClass();
                b0 X = RecyclerView.X(view);
                if (X != null) {
                    i12 = X.getLayoutPosition();
                }
                if (i12 == this.f4320a) {
                    View view2 = this.f4324f;
                    y yVar = recyclerView.f4229h0;
                    e(view2, aVar);
                    aVar.a(recyclerView);
                    f();
                } else {
                    this.f4324f = null;
                }
            }
            if (this.f4323e) {
                y yVar2 = recyclerView.f4229h0;
                c(i10, i11, aVar);
                if (aVar.f4328d >= 0) {
                    z10 = true;
                }
                aVar.a(recyclerView);
                if (z10 && this.f4323e) {
                    this.f4322d = true;
                    recyclerView.f4223e0.a();
                }
            }
        }

        public abstract void c(int i10, int i11, a aVar);

        public abstract void d();

        public abstract void e(View view, a aVar);

        public final void f() {
            if (!this.f4323e) {
                return;
            }
            this.f4323e = false;
            d();
            this.f4321b.f4229h0.f4331a = -1;
            this.f4324f = null;
            this.f4320a = -1;
            this.f4322d = false;
            m mVar = this.c;
            if (mVar.f4288e == this) {
                mVar.f4288e = null;
            }
            this.c = null;
            this.f4321b = null;
        }
    }

    /* loaded from: classes.dex */
    public static class y {

        /* renamed from: a  reason: collision with root package name */
        public int f4331a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f4332b = 0;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f4333d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f4334e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4335f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4336g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4337h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f4338i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f4339j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f4340k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f4341l;

        /* renamed from: m  reason: collision with root package name */
        public long f4342m;

        /* renamed from: n  reason: collision with root package name */
        public int f4343n;

        public final void a(int i10) {
            if ((this.f4333d & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f4333d));
        }

        public final int b() {
            if (this.f4336g) {
                return this.f4332b - this.c;
            }
            return this.f4334e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f4331a + ", mData=null, mItemCount=" + this.f4334e + ", mIsMeasuring=" + this.f4338i + ", mPreviousLayoutItemCount=" + this.f4332b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.c + ", mStructureChanged=" + this.f4335f + ", mInPreLayout=" + this.f4336g + ", mRunSimpleAnimations=" + this.f4339j + ", mRunPredictiveAnimations=" + this.f4340k + '}';
        }
    }

    /* loaded from: classes.dex */
    public static abstract class z {
    }

    static {
        Class<?> cls = Integer.TYPE;
        B0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        C0 = new c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static RecyclerView Q(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView Q = Q(viewGroup.getChildAt(i10));
            if (Q != null) {
                return Q;
            }
        }
        return null;
    }

    public static int V(View view) {
        b0 X = X(view);
        if (X != null) {
            return X.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public static b0 X(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).f4304a;
    }

    public static void Y(Rect rect, View view) {
        n nVar = (n) view.getLayoutParams();
        Rect rect2 = nVar.f4305b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
    }

    private x0.p getScrollingChildHelper() {
        if (this.f4247q0 == null) {
            this.f4247q0 = new x0.p(this);
        }
        return this.f4247q0;
    }

    public static void u(b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == b0Var.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            b0Var.mNestedRecyclerView = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x032b, code lost:
        if (r17.f4222e.j(getFocusedChild()) == false) goto L240;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A() {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A():void");
    }

    public final void B() {
        View view;
        b0 b0Var;
        int absoluteAdapterPosition;
        boolean z10;
        boolean z11;
        View N;
        y yVar = this.f4229h0;
        yVar.a(1);
        L(yVar);
        yVar.f4338i = false;
        v0();
        k0 k0Var = this.f4224f;
        k0Var.f4477a.clear();
        k0Var.f4478b.c();
        e0();
        j0();
        if (this.f4221d0 && hasFocus() && this.f4236l != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view == null || (N = N(view)) == null) {
            b0Var = null;
        } else {
            b0Var = W(N);
        }
        long j10 = -1;
        if (b0Var == null) {
            yVar.f4342m = -1L;
            yVar.f4341l = -1;
            yVar.f4343n = -1;
        } else {
            if (this.f4236l.hasStableIds()) {
                j10 = b0Var.getItemId();
            }
            yVar.f4342m = j10;
            if (this.D) {
                absoluteAdapterPosition = -1;
            } else if (b0Var.isRemoved()) {
                absoluteAdapterPosition = b0Var.mOldPosition;
            } else {
                absoluteAdapterPosition = b0Var.getAbsoluteAdapterPosition();
            }
            yVar.f4341l = absoluteAdapterPosition;
            View view2 = b0Var.itemView;
            int id2 = view2.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() != -1) {
                    id2 = view2.getId();
                }
            }
            yVar.f4343n = id2;
        }
        if (yVar.f4339j && this.f4237l0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yVar.f4337h = z10;
        this.f4237l0 = false;
        this.f4235k0 = false;
        yVar.f4336g = yVar.f4340k;
        yVar.f4334e = this.f4236l.getItemCount();
        P(this.f4245p0);
        boolean z12 = yVar.f4339j;
        y.i<b0, k0.a> iVar = k0Var.f4477a;
        if (z12) {
            int e10 = this.f4222e.e();
            for (int i10 = 0; i10 < e10; i10++) {
                b0 X = X(this.f4222e.d(i10));
                if (!X.shouldIgnore() && (!X.isInvalid() || this.f4236l.hasStableIds())) {
                    j jVar = this.M;
                    j.e(X);
                    X.getUnmodifiedPayloads();
                    jVar.getClass();
                    j.c cVar = new j.c();
                    cVar.a(X);
                    k0.a orDefault = iVar.getOrDefault(X, null);
                    if (orDefault == null) {
                        orDefault = k0.a.a();
                        iVar.put(X, orDefault);
                    }
                    orDefault.f4481b = cVar;
                    orDefault.f4480a |= 4;
                    if (yVar.f4337h && X.isUpdated() && !X.isRemoved() && !X.shouldIgnore() && !X.isInvalid()) {
                        k0Var.f4478b.h(U(X), X);
                    }
                }
            }
        }
        if (yVar.f4340k) {
            int h10 = this.f4222e.h();
            for (int i11 = 0; i11 < h10; i11++) {
                b0 X2 = X(this.f4222e.g(i11));
                if (!X2.shouldIgnore()) {
                    X2.saveOldPosition();
                }
            }
            boolean z13 = yVar.f4335f;
            yVar.f4335f = false;
            this.f4238m.o0(this.f4217b, yVar);
            yVar.f4335f = z13;
            for (int i12 = 0; i12 < this.f4222e.e(); i12++) {
                b0 X3 = X(this.f4222e.d(i12));
                if (!X3.shouldIgnore()) {
                    k0.a orDefault2 = iVar.getOrDefault(X3, null);
                    if (orDefault2 != null && (orDefault2.f4480a & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        j.e(X3);
                        boolean hasAnyOfTheFlags = X3.hasAnyOfTheFlags(8192);
                        j jVar2 = this.M;
                        X3.getUnmodifiedPayloads();
                        jVar2.getClass();
                        j.c cVar2 = new j.c();
                        cVar2.a(X3);
                        if (hasAnyOfTheFlags) {
                            l0(X3, cVar2);
                        } else {
                            k0.a orDefault3 = iVar.getOrDefault(X3, null);
                            if (orDefault3 == null) {
                                orDefault3 = k0.a.a();
                                iVar.put(X3, orDefault3);
                            }
                            orDefault3.f4480a |= 2;
                            orDefault3.f4481b = cVar2;
                        }
                    }
                }
            }
            v();
        } else {
            v();
        }
        f0(true);
        w0(false);
        yVar.f4333d = 2;
    }

    public final void C() {
        boolean z10;
        v0();
        e0();
        y yVar = this.f4229h0;
        yVar.a(6);
        this.f4220d.c();
        yVar.f4334e = this.f4236l.getItemCount();
        yVar.c = 0;
        if (this.c != null && this.f4236l.canRestoreState()) {
            Parcelable parcelable = this.c.c;
            if (parcelable != null) {
                this.f4238m.q0(parcelable);
            }
            this.c = null;
        }
        yVar.f4336g = false;
        this.f4238m.o0(this.f4217b, yVar);
        yVar.f4335f = false;
        if (yVar.f4339j && this.M != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yVar.f4339j = z10;
        yVar.f4333d = 4;
        f0(true);
        w0(false);
    }

    public final boolean D(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void E(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().f(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void F(int i10, int i11) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        r rVar = this.f4231i0;
        if (rVar != null) {
            rVar.b(this, i10, i11);
        }
        ArrayList arrayList = this.f4233j0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((r) this.f4233j0.get(size)).b(this, i10, i11);
            }
        }
        this.G--;
    }

    public final void G() {
        if (this.L != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.f4226g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void H() {
        if (this.I != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.I = edgeEffect;
        if (this.f4226g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void I() {
        if (this.K != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K = edgeEffect;
        if (this.f4226g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void J() {
        if (this.J != null) {
            return;
        }
        this.H.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J = edgeEffect;
        if (this.f4226g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String K() {
        return " " + super.toString() + ", adapter:" + this.f4236l + ", layout:" + this.f4238m + ", context:" + getContext();
    }

    public final void L(y yVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f4223e0.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            yVar.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        yVar.getClass();
    }

    public final View M(float f10, float f11) {
        for (int e10 = this.f4222e.e() - 1; e10 >= 0; e10--) {
            View d10 = this.f4222e.d(e10);
            float translationX = d10.getTranslationX();
            float translationY = d10.getTranslationY();
            if (f10 >= d10.getLeft() + translationX && f10 <= d10.getRight() + translationX && f11 >= d10.getTop() + translationY && f11 <= d10.getBottom() + translationY) {
                return d10;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View N(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.N(android.view.View):android.view.View");
    }

    public final boolean O(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<q> arrayList = this.f4246q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = arrayList.get(i10);
            if (qVar.f(this, motionEvent) && action != 3) {
                this.f4248r = qVar;
                return true;
            }
        }
        return false;
    }

    public final void P(int[] iArr) {
        int e10 = this.f4222e.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i11 = SlideAtom.USES_MASTER_SLIDE_ID;
        for (int i12 = 0; i12 < e10; i12++) {
            b0 X = X(this.f4222e.d(i12));
            if (!X.shouldIgnore()) {
                int layoutPosition = X.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final b0 R(int i10) {
        b0 b0Var = null;
        if (this.D) {
            return null;
        }
        int h10 = this.f4222e.h();
        for (int i11 = 0; i11 < h10; i11++) {
            b0 X = X(this.f4222e.g(i11));
            if (X != null && !X.isRemoved() && T(X) == i10) {
                if (this.f4222e.j(X.itemView)) {
                    b0Var = X;
                } else {
                    return X;
                }
            }
        }
        return b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x013d, code lost:
        if (r0 < r13) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean S(int r20, int r21) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.S(int, int):boolean");
    }

    public final int T(b0 b0Var) {
        if (b0Var.hasAnyOfTheFlags(524) || !b0Var.isBound()) {
            return -1;
        }
        androidx.recyclerview.widget.a aVar = this.f4220d;
        int i10 = b0Var.mPosition;
        ArrayList<a.b> arrayList = aVar.f4383b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = arrayList.get(i11);
            int i12 = bVar.f4387a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 8) {
                        int i13 = bVar.f4388b;
                        if (i13 == i10) {
                            i10 = bVar.f4389d;
                        } else {
                            if (i13 < i10) {
                                i10--;
                            }
                            if (bVar.f4389d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else {
                    int i14 = bVar.f4388b;
                    if (i14 <= i10) {
                        int i15 = bVar.f4389d;
                        if (i14 + i15 > i10) {
                            return -1;
                        }
                        i10 -= i15;
                    } else {
                        continue;
                    }
                }
            } else if (bVar.f4388b <= i10) {
                i10 += bVar.f4389d;
            }
        }
        return i10;
    }

    public final long U(b0 b0Var) {
        if (this.f4236l.hasStableIds()) {
            return b0Var.getItemId();
        }
        return b0Var.mPosition;
    }

    public final b0 W(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return X(view);
    }

    public final Rect Z(View view) {
        n nVar = (n) view.getLayoutParams();
        boolean z10 = nVar.c;
        Rect rect = nVar.f4305b;
        if (!z10) {
            return rect;
        }
        y yVar = this.f4229h0;
        if (yVar.f4336g && (nVar.b() || nVar.f4304a.isInvalid())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<l> arrayList = this.f4244p;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.f4230i;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i10).d(rect2, view, this, yVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nVar.c = false;
        return rect;
    }

    public final boolean a0() {
        if (this.F > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        m mVar = this.f4238m;
        if (mVar != null) {
            mVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(int i10) {
        if (this.f4238m == null) {
            return;
        }
        setScrollState(2);
        this.f4238m.B0(i10);
        awakenScrollBars();
    }

    public final void c0() {
        int h10 = this.f4222e.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((n) this.f4222e.g(i10).getLayoutParams()).c = true;
        }
        ArrayList<b0> arrayList = this.f4217b.c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11).itemView.getLayoutParams();
            if (nVar != null) {
                nVar.c = true;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof n) && this.f4238m.r((n) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        m mVar = this.f4238m;
        if (mVar == null || !mVar.p()) {
            return 0;
        }
        return this.f4238m.v(this.f4229h0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        m mVar = this.f4238m;
        if (mVar == null || !mVar.p()) {
            return 0;
        }
        return this.f4238m.w(this.f4229h0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        m mVar = this.f4238m;
        if (mVar == null || !mVar.p()) {
            return 0;
        }
        return this.f4238m.x(this.f4229h0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        m mVar = this.f4238m;
        if (mVar == null || !mVar.q()) {
            return 0;
        }
        return this.f4238m.y(this.f4229h0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        m mVar = this.f4238m;
        if (mVar == null || !mVar.q()) {
            return 0;
        }
        return this.f4238m.z(this.f4229h0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        m mVar = this.f4238m;
        if (mVar == null || !mVar.q()) {
            return 0;
        }
        return this.f4238m.A(this.f4229h0);
    }

    public final void d0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int h10 = this.f4222e.h();
        for (int i13 = 0; i13 < h10; i13++) {
            b0 X = X(this.f4222e.g(i13));
            if (X != null && !X.shouldIgnore()) {
                int i14 = X.mPosition;
                y yVar = this.f4229h0;
                if (i14 >= i12) {
                    X.offsetPosition(-i11, z10);
                    yVar.f4335f = true;
                } else if (i14 >= i10) {
                    X.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    yVar.f4335f = true;
                }
            }
        }
        t tVar = this.f4217b;
        ArrayList<b0> arrayList = tVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                b0 b0Var = arrayList.get(size);
                if (b0Var != null) {
                    int i15 = b0Var.mPosition;
                    if (i15 >= i12) {
                        b0Var.offsetPosition(-i11, z10);
                    } else if (i15 >= i10) {
                        b0Var.addFlags(8);
                        tVar.f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        super.draw(canvas);
        ArrayList<l> arrayList = this.f4244p;
        int size = arrayList.size();
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).g(canvas, this);
        }
        EdgeEffect edgeEffect = this.I;
        boolean z14 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f4226g) {
                i11 = getPaddingBottom();
            } else {
                i11 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i11, 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4226g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f4226g) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i10, -width);
            EdgeEffect edgeEffect6 = this.K;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4226g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.M == null || arrayList.size() <= 0 || !this.M.k()) {
            z14 = z10;
        }
        if (z14) {
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            f0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0() {
        this.F++;
    }

    public final void f0(boolean z10) {
        int i10;
        boolean z11 = true;
        int i11 = this.F - 1;
        this.F = i11;
        if (i11 < 1) {
            this.F = 0;
            if (z10) {
                int i12 = this.f4264z;
                this.f4264z = 0;
                if (i12 != 0) {
                    AccessibilityManager accessibilityManager = this.B;
                    if ((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : false) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        y0.b.b(obtain, i12);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.f4255u0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b0 b0Var = (b0) arrayList.get(size);
                    if (b0Var.itemView.getParent() == this && !b0Var.shouldIgnore() && (i10 = b0Var.mPendingAccessibilityState) != -1) {
                        View view = b0Var.itemView;
                        WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                        f0.d.s(view, i10);
                        b0Var.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x015a, code lost:
        if (r4 > 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0178, code lost:
        if (r3 > 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x017b, code lost:
        if (r4 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x017e, code lost:
        if (r3 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0186, code lost:
        if ((r3 * r2) <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x018e, code lost:
        if ((r3 * r2) >= 0) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.O = motionEvent.getPointerId(i10);
            int x4 = (int) (motionEvent.getX(i10) + 0.5f);
            this.S = x4;
            this.Q = x4;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.T = y10;
            this.R = y10;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.f4238m;
        if (mVar != null) {
            return mVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + K());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.f4238m;
        if (mVar != null) {
            return mVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + K());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.f4236l;
    }

    @Override // android.view.View
    public int getBaseline() {
        m mVar = this.f4238m;
        if (mVar != null) {
            mVar.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4226g;
    }

    public f0 getCompatAccessibilityDelegate() {
        return this.f4243o0;
    }

    public i getEdgeEffectFactory() {
        return this.H;
    }

    public j getItemAnimator() {
        return this.M;
    }

    public int getItemDecorationCount() {
        return this.f4244p.size();
    }

    public m getLayoutManager() {
        return this.f4238m;
    }

    public int getMaxFlingVelocity() {
        return this.f4216a0;
    }

    public int getMinFlingVelocity() {
        return this.W;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public p getOnFlingListener() {
        return this.V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4221d0;
    }

    public s getRecycledViewPool() {
        return this.f4217b.c();
    }

    public int getScrollState() {
        return this.N;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().g(0) == null) {
            return false;
        }
        return true;
    }

    public final void i0() {
        if (!this.f4241n0 && this.f4250s) {
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            f0.d.m(this, this.f4257v0);
            this.f4241n0 = true;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f4250s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f4260x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f31472d;
    }

    public final void j0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (this.D) {
            androidx.recyclerview.widget.a aVar = this.f4220d;
            aVar.l(aVar.f4383b);
            aVar.l(aVar.c);
            aVar.f4386f = 0;
            if (this.E) {
                this.f4238m.j0();
            }
        }
        if (this.M != null && this.f4238m.N0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f4220d.j();
        } else {
            this.f4220d.c();
        }
        if (!this.f4235k0 && !this.f4237l0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f4254u && this.M != null && (((z14 = this.D) || z11 || this.f4238m.f4289f) && (!z14 || this.f4236l.hasStableIds()))) {
            z12 = true;
        } else {
            z12 = false;
        }
        y yVar = this.f4229h0;
        yVar.f4339j = z12;
        if (z12 && z11 && !this.D) {
            if (this.M != null && this.f4238m.N0()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                z15 = true;
            }
        }
        yVar.f4340k = z15;
    }

    public final void k0(boolean z10) {
        this.E = z10 | this.E;
        this.D = true;
        int h10 = this.f4222e.h();
        for (int i10 = 0; i10 < h10; i10++) {
            b0 X = X(this.f4222e.g(i10));
            if (X != null && !X.shouldIgnore()) {
                X.addFlags(6);
            }
        }
        c0();
        t tVar = this.f4217b;
        ArrayList<b0> arrayList = tVar.c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b0 b0Var = arrayList.get(i11);
            if (b0Var != null) {
                b0Var.addFlags(6);
                b0Var.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.f4236l;
        if (adapter == null || !adapter.hasStableIds()) {
            tVar.e();
        }
    }

    public final void l0(b0 b0Var, j.c cVar) {
        b0Var.setFlags(0, 8192);
        boolean z10 = this.f4229h0.f4337h;
        k0 k0Var = this.f4224f;
        if (z10 && b0Var.isUpdated() && !b0Var.isRemoved() && !b0Var.shouldIgnore()) {
            k0Var.f4478b.h(U(b0Var), b0Var);
        }
        y.i<b0, k0.a> iVar = k0Var.f4477a;
        k0.a orDefault = iVar.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = k0.a.a();
            iVar.put(b0Var, orDefault);
        }
        orDefault.f4481b = cVar;
        orDefault.f4480a |= 4;
    }

    public final void m0(l lVar) {
        boolean z10;
        m mVar = this.f4238m;
        if (mVar != null) {
            mVar.n("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList<l> arrayList = this.f4244p;
        arrayList.remove(lVar);
        if (arrayList.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            setWillNotDraw(z10);
        }
        c0();
        requestLayout();
    }

    public final void n0(View view, View view2) {
        View view3;
        boolean z10;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f4230i;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.c) {
                int i10 = rect.left;
                Rect rect2 = nVar.f4305b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        m mVar = this.f4238m;
        Rect rect3 = this.f4230i;
        boolean z11 = !this.f4254u;
        if (view2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        mVar.y0(this, view, rect3, z11, z10);
    }

    public final void o0() {
        VelocityTracker velocityTracker = this.P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        x0(0);
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.L.isFinished();
        }
        if (z10) {
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            f0.d.k(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r1 >= 30.0f) goto L16;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.F = r0
            r1 = 1
            r5.f4250s = r1
            boolean r2 = r5.f4254u
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f4254u = r2
            androidx.recyclerview.widget.RecyclerView$m r2 = r5.f4238m
            if (r2 == 0) goto L21
            r2.f4290g = r1
            r2.b0(r5)
        L21:
            r5.f4241n0 = r0
            java.lang.ThreadLocal<androidx.recyclerview.widget.q> r0 = androidx.recyclerview.widget.q.f4539e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.q r1 = (androidx.recyclerview.widget.q) r1
            r5.f4225f0 = r1
            if (r1 != 0) goto L5d
            androidx.recyclerview.widget.q r1 = new androidx.recyclerview.widget.q
            r1.<init>()
            r5.f4225f0 = r1
            java.util.WeakHashMap<android.view.View, x0.n0> r1 = x0.f0.f31435a
            android.view.Display r1 = x0.f0.e.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4f
            if (r1 == 0) goto L4f
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4f
            goto L51
        L4f:
            r1 = 1114636288(0x42700000, float:60.0)
        L51:
            androidx.recyclerview.widget.q r2 = r5.f4225f0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L5d:
            androidx.recyclerview.widget.q r0 = r5.f4225f0
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f4541a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.M;
        if (jVar != null) {
            jVar.j();
        }
        y0();
        this.f4250s = false;
        m mVar = this.f4238m;
        if (mVar != null) {
            mVar.f4290g = false;
            mVar.c0(this);
        }
        this.f4255u0.clear();
        removeCallbacks(this.f4257v0);
        this.f4224f.getClass();
        do {
        } while (k0.a.f4479d.b() != null);
        androidx.recyclerview.widget.q qVar = this.f4225f0;
        if (qVar != null) {
            qVar.f4541a.remove(this);
            this.f4225f0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<l> arrayList = this.f4244p;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).e(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f4260x) {
            return false;
        }
        this.f4248r = null;
        if (O(motionEvent)) {
            o0();
            setScrollState(0);
            return true;
        }
        m mVar = this.f4238m;
        if (mVar == null) {
            return false;
        }
        boolean p10 = mVar.p();
        boolean q5 = this.f4238m.q();
        if (this.P == null) {
            this.P = VelocityTracker.obtain();
        }
        this.P.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                g0(motionEvent);
                            }
                        } else {
                            this.O = motionEvent.getPointerId(actionIndex);
                            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.S = x4;
                            this.Q = x4;
                            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.T = y10;
                            this.R = y10;
                        }
                    } else {
                        o0();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.O);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.N != 1) {
                        int i10 = x10 - this.Q;
                        int i11 = y11 - this.R;
                        if (p10 && Math.abs(i10) > this.U) {
                            this.S = x10;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (q5 && Math.abs(i11) > this.U) {
                            this.T = y11;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.P.clear();
                x0(0);
            }
        } else {
            if (this.f4262y) {
                this.f4262y = false;
            }
            this.O = motionEvent.getPointerId(0);
            int x11 = (int) (motionEvent.getX() + 0.5f);
            this.S = x11;
            this.Q = x11;
            int y12 = (int) (motionEvent.getY() + 0.5f);
            this.T = y12;
            this.R = y12;
            if (this.N == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                x0(1);
            }
            int[] iArr = this.f4251s0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i12 = p10;
            if (q5) {
                i12 = (p10 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().i(i12, 0);
        }
        if (this.N != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = s0.l.f29698a;
        l.a.a("RV OnLayout");
        A();
        l.a.b();
        this.f4254u = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        m mVar = this.f4238m;
        if (mVar == null) {
            y(i10, i11);
            return;
        }
        boolean V = mVar.V();
        boolean z10 = false;
        y yVar = this.f4229h0;
        if (V) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f4238m.f4286b.y(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f4259w0 = z10;
            if (!z10 && this.f4236l != null) {
                if (yVar.f4333d == 1) {
                    B();
                }
                this.f4238m.E0(i10, i11);
                yVar.f4338i = true;
                C();
                this.f4238m.G0(i10, i11);
                if (this.f4238m.J0()) {
                    this.f4238m.E0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    yVar.f4338i = true;
                    C();
                    this.f4238m.G0(i10, i11);
                }
                this.f4261x0 = getMeasuredWidth();
                this.f4263y0 = getMeasuredHeight();
            }
        } else if (this.f4252t) {
            this.f4238m.f4286b.y(i10, i11);
        } else {
            if (this.A) {
                v0();
                e0();
                j0();
                f0(true);
                if (yVar.f4340k) {
                    yVar.f4336g = true;
                } else {
                    this.f4220d.c();
                    yVar.f4336g = false;
                }
                this.A = false;
                w0(false);
            } else if (yVar.f4340k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.f4236l;
            if (adapter != null) {
                yVar.f4334e = adapter.getItemCount();
            } else {
                yVar.f4334e = 0;
            }
            v0();
            this.f4238m.f4286b.y(i10, i11);
            w0(false);
            yVar.f4336g = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (a0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w wVar = (w) parcelable;
        this.c = wVar;
        super.onRestoreInstanceState(wVar.f5506a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w wVar = new w(super.onSaveInstanceState());
        w wVar2 = this.c;
        if (wVar2 != null) {
            wVar.c = wVar2.c;
        } else {
            m mVar = this.f4238m;
            if (mVar != null) {
                wVar.c = mVar.r0();
            } else {
                wVar.c = null;
            }
        }
        return wVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            this.L = null;
            this.J = null;
            this.K = null;
            this.I = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(b0 b0Var) {
        boolean z10;
        View view = b0Var.itemView;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4217b.k(W(view));
        if (b0Var.isTmpDetached()) {
            this.f4222e.b(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.f4222e.a(view, true, -1);
        } else {
            androidx.recyclerview.widget.g gVar = this.f4222e;
            int indexOfChild = ((d0) gVar.f4424a).f4406a.indexOfChild(view);
            if (indexOfChild >= 0) {
                gVar.f4425b.h(indexOfChild);
                gVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p0(int r21, int r22, android.view.MotionEvent r23, int r24) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void q(l lVar) {
        m mVar = this.f4238m;
        if (mVar != null) {
            mVar.n("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<l> arrayList = this.f4244p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(lVar);
        c0();
        requestLayout();
    }

    public final void q0(int i10, int[] iArr, int i11) {
        int i12;
        int i13;
        b0 b0Var;
        v0();
        e0();
        int i14 = s0.l.f29698a;
        l.a.a("RV Scroll");
        y yVar = this.f4229h0;
        L(yVar);
        t tVar = this.f4217b;
        if (i10 != 0) {
            i12 = this.f4238m.A0(i10, tVar, yVar);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.f4238m.C0(i11, tVar, yVar);
        } else {
            i13 = 0;
        }
        l.a.b();
        int e10 = this.f4222e.e();
        for (int i15 = 0; i15 < e10; i15++) {
            View d10 = this.f4222e.d(i15);
            b0 W = W(d10);
            if (W != null && (b0Var = W.mShadowingHolder) != null) {
                View view = b0Var.itemView;
                int left = d10.getLeft();
                int top = d10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        f0(true);
        w0(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    public final void r(q qVar) {
        this.f4246q.add(qVar);
    }

    public final void r0(int i10) {
        if (this.f4260x) {
            return;
        }
        y0();
        m mVar = this.f4238m;
        if (mVar == null) {
            return;
        }
        mVar.B0(i10);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        b0 X = X(view);
        if (X != null) {
            if (X.isTmpDetached()) {
                X.clearTmpDetachFlag();
            } else if (!X.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + X + K());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        boolean z10;
        x xVar = this.f4238m.f4288e;
        boolean z11 = true;
        if (xVar != null && xVar.f4323e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !a0()) {
            z11 = false;
        }
        if (!z11 && view2 != null) {
            n0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f4238m.y0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList<q> arrayList = this.f4246q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).j(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4256v == 0 && !this.f4260x) {
            super.requestLayout();
        } else {
            this.f4258w = true;
        }
    }

    public final void s(r rVar) {
        if (this.f4233j0 == null) {
            this.f4233j0 = new ArrayList();
        }
        this.f4233j0.add(rVar);
    }

    public final void s0(int i10, int i11) {
        t0(i10, i11, false);
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        m mVar = this.f4238m;
        if (mVar == null || this.f4260x) {
            return;
        }
        boolean p10 = mVar.p();
        boolean q5 = this.f4238m.q();
        if (p10 || q5) {
            if (!p10) {
                i10 = 0;
            }
            if (!q5) {
                i11 = 0;
            }
            p0(i10, i11, null, 0);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10;
        int i11 = 0;
        if (a0()) {
            if (accessibilityEvent != null) {
                i10 = y0.b.a(accessibilityEvent);
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                i11 = i10;
            }
            this.f4264z |= i11;
            i11 = 1;
        }
        if (i11 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(f0 f0Var) {
        this.f4243o0 = f0Var;
        x0.f0.o(this, f0Var);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        Adapter adapter2 = this.f4236l;
        v vVar = this.f4215a;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(vVar);
            this.f4236l.onDetachedFromRecyclerView(this);
        }
        j jVar = this.M;
        if (jVar != null) {
            jVar.j();
        }
        m mVar = this.f4238m;
        t tVar = this.f4217b;
        if (mVar != null) {
            mVar.v0(tVar);
            this.f4238m.w0(tVar);
        }
        tVar.f4312a.clear();
        tVar.e();
        androidx.recyclerview.widget.a aVar = this.f4220d;
        aVar.l(aVar.f4383b);
        aVar.l(aVar.c);
        aVar.f4386f = 0;
        Adapter adapter3 = this.f4236l;
        this.f4236l = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(vVar);
            adapter.onAttachedToRecyclerView(this);
        }
        m mVar2 = this.f4238m;
        if (mVar2 != null) {
            mVar2.a0();
        }
        Adapter adapter4 = this.f4236l;
        tVar.f4312a.clear();
        tVar.e();
        s c10 = tVar.c();
        if (adapter3 != null) {
            c10.f4308b--;
        }
        if (c10.f4308b == 0) {
            int i10 = 0;
            while (true) {
                SparseArray<s.a> sparseArray = c10.f4307a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                sparseArray.valueAt(i10).f4309a.clear();
                i10++;
            }
        }
        if (adapter4 != null) {
            c10.f4308b++;
        }
        this.f4229h0.f4335f = true;
        k0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        boolean z10;
        if (hVar == null) {
            return;
        }
        if (hVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setChildrenDrawingOrderEnabled(z10);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f4226g) {
            this.L = null;
            this.J = null;
            this.K = null;
            this.I = null;
        }
        this.f4226g = z10;
        super.setClipToPadding(z10);
        if (this.f4254u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        iVar.getClass();
        this.H = iVar;
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f4252t = z10;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.M;
        if (jVar2 != null) {
            jVar2.j();
            this.M.f4277a = null;
        }
        this.M = jVar;
        if (jVar != null) {
            jVar.f4277a = this.f4239m0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        t tVar = this.f4217b;
        tVar.f4315e = i10;
        tVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(m mVar) {
        g.b bVar;
        RecyclerView recyclerView;
        if (mVar == this.f4238m) {
            return;
        }
        y0();
        m mVar2 = this.f4238m;
        int i10 = 0;
        t tVar = this.f4217b;
        if (mVar2 != null) {
            j jVar = this.M;
            if (jVar != null) {
                jVar.j();
            }
            this.f4238m.v0(tVar);
            this.f4238m.w0(tVar);
            tVar.f4312a.clear();
            tVar.e();
            if (this.f4250s) {
                m mVar3 = this.f4238m;
                mVar3.f4290g = false;
                mVar3.c0(this);
            }
            this.f4238m.H0(null);
            this.f4238m = null;
        } else {
            tVar.f4312a.clear();
            tVar.e();
        }
        androidx.recyclerview.widget.g gVar = this.f4222e;
        gVar.f4425b.g();
        ArrayList arrayList = gVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            bVar = gVar.f4424a;
            if (size < 0) {
                break;
            }
            d0 d0Var = (d0) bVar;
            d0Var.getClass();
            b0 X = X((View) arrayList.get(size));
            if (X != null) {
                X.onLeftHiddenState(d0Var.f4406a);
            }
            arrayList.remove(size);
        }
        d0 d0Var2 = (d0) bVar;
        int a10 = d0Var2.a();
        while (true) {
            recyclerView = d0Var2.f4406a;
            if (i10 >= a10) {
                break;
            }
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.z(childAt);
            childAt.clearAnimation();
            i10++;
        }
        recyclerView.removeAllViews();
        this.f4238m = mVar;
        if (mVar != null) {
            if (mVar.f4286b == null) {
                mVar.H0(this);
                if (this.f4250s) {
                    m mVar4 = this.f4238m;
                    mVar4.f4290g = true;
                    mVar4.b0(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + mVar + " is already attached to a RecyclerView:" + mVar.f4286b.K());
            }
        }
        tVar.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().h(z10);
    }

    public void setOnFlingListener(p pVar) {
        this.V = pVar;
    }

    @Deprecated
    public void setOnScrollListener(r rVar) {
        this.f4231i0 = rVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f4221d0 = z10;
    }

    public void setRecycledViewPool(s sVar) {
        s sVar2;
        t tVar = this.f4217b;
        if (tVar.f4317g != null) {
            sVar2.f4308b--;
        }
        tVar.f4317g = sVar;
        if (sVar != null && RecyclerView.this.getAdapter() != null) {
            tVar.f4317g.f4308b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(u uVar) {
        this.f4240n = uVar;
    }

    void setScrollState(int i10) {
        x xVar;
        if (i10 == this.N) {
            return;
        }
        this.N = i10;
        if (i10 != 2) {
            a0 a0Var = this.f4223e0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.c.abortAnimation();
            m mVar = this.f4238m;
            if (mVar != null && (xVar = mVar.f4288e) != null) {
                xVar.f();
            }
        }
        m mVar2 = this.f4238m;
        if (mVar2 != null) {
            mVar2.s0(i10);
        }
        h0(i10);
        r rVar = this.f4231i0;
        if (rVar != null) {
            rVar.a(i10, this);
        }
        ArrayList arrayList = this.f4233j0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((r) this.f4233j0.get(size)).a(i10, this);
                } else {
                    return;
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 1) {
            this.U = viewConfiguration.getScaledTouchSlop();
        } else {
            this.U = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(z zVar) {
        this.f4217b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().i(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().j(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f4260x) {
            t("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.f4260x = false;
                if (this.f4258w && this.f4238m != null && this.f4236l != null) {
                    requestLayout();
                }
                this.f4258w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4260x = true;
            this.f4262y = true;
            y0();
        }
    }

    public final void t(String str) {
        if (a0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + K());
            }
            throw new IllegalStateException(str);
        } else if (this.G > 0) {
            new IllegalStateException("" + K());
        }
    }

    public final void t0(int i10, int i11, boolean z10) {
        m mVar = this.f4238m;
        if (mVar == null || this.f4260x) {
            return;
        }
        int i12 = 0;
        if (!mVar.p()) {
            i10 = 0;
        }
        if (!this.f4238m.q()) {
            i11 = 0;
        }
        if (i10 != 0 || i11 != 0) {
            if (z10) {
                if (i10 != 0) {
                    i12 = 1;
                }
                if (i11 != 0) {
                    i12 |= 2;
                }
                getScrollingChildHelper().i(i12, 1);
            }
            this.f4223e0.b(i10, i11, SlideAtom.USES_MASTER_SLIDE_ID, null);
        }
    }

    public final void u0(int i10) {
        m mVar;
        if (this.f4260x || (mVar = this.f4238m) == null) {
            return;
        }
        mVar.L0(this, i10);
    }

    public final void v() {
        int h10 = this.f4222e.h();
        for (int i10 = 0; i10 < h10; i10++) {
            b0 X = X(this.f4222e.g(i10));
            if (!X.shouldIgnore()) {
                X.clearOldPosition();
            }
        }
        t tVar = this.f4217b;
        ArrayList<b0> arrayList = tVar.c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).clearOldPosition();
        }
        ArrayList<b0> arrayList2 = tVar.f4312a;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.get(i12).clearOldPosition();
        }
        ArrayList<b0> arrayList3 = tVar.f4313b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                tVar.f4313b.get(i13).clearOldPosition();
            }
        }
    }

    public final void v0() {
        int i10 = this.f4256v + 1;
        this.f4256v = i10;
        if (i10 == 1 && !this.f4260x) {
            this.f4258w = false;
        }
    }

    public final void w(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null && !edgeEffect.isFinished() && i10 > 0) {
            this.I.onRelease();
            z10 = this.I.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.K.onRelease();
            z10 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.J.onRelease();
            z10 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.L.onRelease();
            z10 |= this.L.isFinished();
        }
        if (z10) {
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            f0.d.k(this);
        }
    }

    public final void w0(boolean z10) {
        if (this.f4256v < 1) {
            this.f4256v = 1;
        }
        if (!z10 && !this.f4260x) {
            this.f4258w = false;
        }
        if (this.f4256v == 1) {
            if (z10 && this.f4258w && !this.f4260x && this.f4238m != null && this.f4236l != null) {
                A();
            }
            if (!this.f4260x) {
                this.f4258w = false;
            }
        }
        this.f4256v--;
    }

    public final void x() {
        boolean z10;
        boolean z11;
        if (this.f4254u && !this.D) {
            if (!this.f4220d.g()) {
                return;
            }
            androidx.recyclerview.widget.a aVar = this.f4220d;
            int i10 = aVar.f4386f;
            boolean z12 = false;
            if ((4 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if ((i10 & 11) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    int i11 = s0.l.f29698a;
                    l.a.a("RV PartialInvalidate");
                    v0();
                    e0();
                    this.f4220d.j();
                    if (!this.f4258w) {
                        int e10 = this.f4222e.e();
                        int i12 = 0;
                        while (true) {
                            if (i12 < e10) {
                                b0 X = X(this.f4222e.d(i12));
                                if (X != null && !X.shouldIgnore() && X.isUpdated()) {
                                    z12 = true;
                                    break;
                                }
                                i12++;
                            } else {
                                break;
                            }
                        }
                        if (z12) {
                            A();
                        } else {
                            this.f4220d.b();
                        }
                    }
                    w0(true);
                    f0(true);
                    l.a.b();
                    return;
                }
            }
            if (aVar.g()) {
                int i13 = s0.l.f29698a;
                l.a.a("RV FullInvalidate");
                A();
                l.a.b();
                return;
            }
            return;
        }
        int i14 = s0.l.f29698a;
        l.a.a("RV FullInvalidate");
        A();
        l.a.b();
    }

    public final void x0(int i10) {
        getScrollingChildHelper().j(i10);
    }

    public final void y(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
        setMeasuredDimension(m.s(i10, paddingRight, f0.d.e(this)), m.s(i11, getPaddingBottom() + getPaddingTop(), f0.d.d(this)));
    }

    public final void y0() {
        x xVar;
        setScrollState(0);
        a0 a0Var = this.f4223e0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.c.abortAnimation();
        m mVar = this.f4238m;
        if (mVar != null && (xVar = mVar.f4288e) != null) {
            xVar.f();
        }
    }

    public final void z(View view) {
        b0 X = X(view);
        Adapter adapter = this.f4236l;
        if (adapter != null && X != null) {
            adapter.onViewDetachedFromWindow(X);
        }
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((o) this.C.get(size)).a(view);
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Adapter<VH extends b0> {
        private final f mObservable = new f();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        /* loaded from: classes.dex */
        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh2, int i10) {
            boolean z10;
            if (vh2.mBindingAdapter == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                vh2.mPosition = i10;
                if (hasStableIds()) {
                    vh2.mItemId = getItemId(i10);
                }
                vh2.setFlags(1, 519);
                int i11 = s0.l.f29698a;
                l.a.a("RV OnBindView");
            }
            vh2.mBindingAdapter = this;
            onBindViewHolder(vh2, i10, vh2.getUnmodifiedPayloads());
            if (z10) {
                vh2.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
                if (layoutParams instanceof n) {
                    ((n) layoutParams).c = true;
                }
                int i12 = s0.l.f29698a;
                l.a.b();
            }
        }

        public boolean canRestoreState() {
            int i10 = e.f4276a[this.mStateRestorationPolicy.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2 && getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                int i11 = s0.l.f29698a;
                l.a.a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i10;
                    l.a.b();
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th2) {
                int i12 = s0.l.f29698a;
                l.a.b();
                throw th2;
            }
        }

        public int findRelativeAdapterPositionIn(Adapter<? extends b0> adapter, b0 b0Var, int i10) {
            if (adapter == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1, null);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.e(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11, null);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.e(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.f(i10, 1);
        }

        public abstract void onBindViewHolder(VH vh2, int i10);

        public void onBindViewHolder(VH vh2, int i10, List<Object> list) {
            onBindViewHolder(vh2, i10);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i10);

        public boolean onFailedToRecycleView(VH vh2) {
            return false;
        }

        public void registerAdapterDataObserver(g gVar) {
            this.mObservable.registerObserver(gVar);
        }

        public void setHasStableIds(boolean z10) {
            if (!hasObservers()) {
                this.mHasStableIds = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(g gVar) {
            this.mObservable.unregisterObserver(gVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.d(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.d(i10, i11, obj);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(VH vh2) {
        }

        public void onViewDetachedFromWindow(VH vh2) {
        }

        public void onViewRecycled(VH vh2) {
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float a10;
        float a11;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.f4215a = new v();
        this.f4217b = new t();
        this.f4224f = new k0();
        this.f4228h = new a();
        this.f4230i = new Rect();
        this.f4232j = new Rect();
        this.f4234k = new RectF();
        this.f4242o = new ArrayList();
        this.f4244p = new ArrayList<>();
        this.f4246q = new ArrayList<>();
        this.f4256v = 0;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = new i();
        this.M = new androidx.recyclerview.widget.h();
        this.N = 0;
        this.O = -1;
        this.f4218b0 = Float.MIN_VALUE;
        this.f4219c0 = Float.MIN_VALUE;
        this.f4221d0 = true;
        this.f4223e0 = new a0();
        this.f4227g0 = new q.b();
        this.f4229h0 = new y();
        this.f4235k0 = false;
        this.f4237l0 = false;
        k kVar = new k();
        this.f4239m0 = kVar;
        this.f4241n0 = false;
        char c10 = 2;
        this.f4245p0 = new int[2];
        this.f4249r0 = new int[2];
        this.f4251s0 = new int[2];
        this.f4253t0 = new int[2];
        this.f4255u0 = new ArrayList();
        this.f4257v0 = new b();
        this.f4261x0 = 0;
        this.f4263y0 = 0;
        this.f4265z0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.U = viewConfiguration.getScaledTouchSlop();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = x0.h0.f31454a;
            a10 = h0.a.a(viewConfiguration);
        } else {
            a10 = x0.h0.a(viewConfiguration, context);
        }
        this.f4218b0 = a10;
        if (i11 >= 26) {
            a11 = h0.a.b(viewConfiguration);
        } else {
            a11 = x0.h0.a(viewConfiguration, context);
        }
        this.f4219c0 = a11;
        this.W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4216a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.M.f4277a = kVar;
        this.f4220d = new androidx.recyclerview.widget.a(new e0(this));
        this.f4222e = new androidx.recyclerview.widget.g(new d0(this));
        WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
        if ((i11 >= 26 ? f0.l.b(this) : 0) == 0 && i11 >= 26) {
            f0.l.l(this, 8);
        }
        if (f0.d.c(this) == 0) {
            f0.d.s(this, 1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new f0(this));
        int[] iArr = v1.a.f30480a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        x0.f0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f4226g = obtainStyledAttributes.getBoolean(1, true);
        int i12 = 4;
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                new androidx.recyclerview.widget.p(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
                i12 = 4;
                c10 = 2;
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + K());
            }
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(m.class);
                    try {
                        constructor = asSubclass.getConstructor(B0);
                        objArr = new Object[i12];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c10] = Integer.valueOf(i10);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((m) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e16);
                }
            }
        }
        int[] iArr2 = A0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        x0.f0.n(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10);
        boolean z10 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
    }

    /* loaded from: classes.dex */
    public static class n extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public b0 f4304a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f4305b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4306d;

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4305b = new Rect();
            this.c = true;
            this.f4306d = false;
        }

        public final int a() {
            return this.f4304a.getLayoutPosition();
        }

        public final boolean b() {
            return this.f4304a.isUpdated();
        }

        public final boolean d() {
            return this.f4304a.isRemoved();
        }

        public n(int i10, int i11) {
            super(i10, i11);
            this.f4305b = new Rect();
            this.c = true;
            this.f4306d = false;
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4305b = new Rect();
            this.c = true;
            this.f4306d = false;
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4305b = new Rect();
            this.c = true;
            this.f4306d = false;
        }

        public n(n nVar) {
            super((ViewGroup.LayoutParams) nVar);
            this.f4305b = new Rect();
            this.c = true;
            this.f4306d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.f4238m;
        if (mVar != null) {
            return mVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + K());
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public void c(int i10, int i11, Object obj) {
            b();
        }

        public void a() {
        }

        public void b() {
        }

        public void g() {
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11) {
        }

        public void f(int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {

        /* renamed from: a  reason: collision with root package name */
        public androidx.recyclerview.widget.g f4285a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f4286b;
        public final j0 c;

        /* renamed from: d  reason: collision with root package name */
        public final j0 f4287d;

        /* renamed from: e  reason: collision with root package name */
        public x f4288e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4289f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4290g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f4291h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f4292i;

        /* renamed from: j  reason: collision with root package name */
        public int f4293j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f4294k;

        /* renamed from: l  reason: collision with root package name */
        public int f4295l;

        /* renamed from: m  reason: collision with root package name */
        public int f4296m;

        /* renamed from: n  reason: collision with root package name */
        public int f4297n;

        /* renamed from: o  reason: collision with root package name */
        public int f4298o;

        /* loaded from: classes.dex */
        public class a implements j0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.j0.b
            public final int a(View view) {
                m.this.getClass();
                return (view.getLeft() - m.O(view)) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.j0.b
            public final int b() {
                return m.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.j0.b
            public final int c() {
                m mVar = m.this;
                return mVar.f4297n - mVar.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.j0.b
            public final View d(int i10) {
                return m.this.H(i10);
            }

            @Override // androidx.recyclerview.widget.j0.b
            public final int e(View view) {
                m.this.getClass();
                return m.R(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements j0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.j0.b
            public final int a(View view) {
                m.this.getClass();
                return (view.getTop() - m.T(view)) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.j0.b
            public final int b() {
                return m.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.j0.b
            public final int c() {
                m mVar = m.this;
                return mVar.f4298o - mVar.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.j0.b
            public final View d(int i10) {
                return m.this.H(i10);
            }

            @Override // androidx.recyclerview.widget.j0.b
            public final int e(View view) {
                m.this.getClass();
                return m.G(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f4301a;

            /* renamed from: b  reason: collision with root package name */
            public int f4302b;
            public boolean c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f4303d;
        }

        public m() {
            a aVar = new a();
            b bVar = new b();
            this.c = new j0(aVar);
            this.f4287d = new j0(bVar);
            this.f4289f = false;
            this.f4290g = false;
            this.f4291h = true;
            this.f4292i = true;
        }

        public static int G(View view) {
            return ((n) view.getLayoutParams()).f4305b.bottom;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int J(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.J(int, int, int, int, boolean):int");
        }

        public static int O(View view) {
            return ((n) view.getLayoutParams()).f4305b.left;
        }

        public static int P(View view) {
            return ((n) view.getLayoutParams()).a();
        }

        public static d Q(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v1.a.f30480a, i10, i11);
            dVar.f4301a = obtainStyledAttributes.getInt(0, 1);
            dVar.f4302b = obtainStyledAttributes.getInt(10, 1);
            dVar.c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f4303d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int R(View view) {
            return ((n) view.getLayoutParams()).f4305b.right;
        }

        public static int T(View view) {
            return ((n) view.getLayoutParams()).f4305b.top;
        }

        public static boolean W(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i10) {
                    return false;
                }
                return true;
            } else if (size < i10) {
                return false;
            } else {
                return true;
            }
        }

        public static void X(View view, int i10, int i11, int i12, int i13) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.f4305b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) nVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) nVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) nVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public static int s(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i11, i12);
                }
                return size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        public int A(y yVar) {
            return 0;
        }

        public int A0(int i10, t tVar, y yVar) {
            return 0;
        }

        public final void B(t tVar) {
            int I = I();
            while (true) {
                I--;
                if (I >= 0) {
                    View H = H(I);
                    b0 X = RecyclerView.X(H);
                    if (!X.shouldIgnore()) {
                        if (X.isInvalid() && !X.isRemoved() && !this.f4286b.f4236l.hasStableIds()) {
                            if (H(I) != null) {
                                this.f4285a.k(I);
                            }
                            tVar.h(X);
                        } else {
                            H(I);
                            this.f4285a.c(I);
                            tVar.i(H);
                            this.f4286b.f4224f.c(X);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public View C(int i10) {
            int I = I();
            for (int i11 = 0; i11 < I; i11++) {
                View H = H(i11);
                b0 X = RecyclerView.X(H);
                if (X != null && X.getLayoutPosition() == i10 && !X.shouldIgnore() && (this.f4286b.f4229h0.f4336g || !X.isRemoved())) {
                    return H;
                }
            }
            return null;
        }

        public int C0(int i10, t tVar, y yVar) {
            return 0;
        }

        public abstract n D();

        public final void D0(RecyclerView recyclerView) {
            E0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public n E(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public final void E0(int i10, int i11) {
            this.f4297n = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f4295l = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.A0;
            }
            this.f4298o = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f4296m = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.A0;
            }
        }

        public n F(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof n) {
                return new n((n) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new n((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new n(layoutParams);
        }

        public void F0(Rect rect, int i10, int i11) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
            int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
            RecyclerView recyclerView = this.f4286b;
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            this.f4286b.setMeasuredDimension(s(i10, paddingRight, f0.d.e(recyclerView)), s(i11, paddingBottom, f0.d.d(this.f4286b)));
        }

        public final void G0(int i10, int i11) {
            int I = I();
            if (I == 0) {
                this.f4286b.y(i10, i11);
                return;
            }
            int i12 = SlideAtom.USES_MASTER_SLIDE_ID;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < I; i16++) {
                View H = H(i16);
                Rect rect = this.f4286b.f4230i;
                L(rect, H);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f4286b.f4230i.set(i15, i13, i12, i14);
            F0(this.f4286b.f4230i, i10, i11);
        }

        public final View H(int i10) {
            androidx.recyclerview.widget.g gVar = this.f4285a;
            if (gVar != null) {
                return gVar.d(i10);
            }
            return null;
        }

        public final void H0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4286b = null;
                this.f4285a = null;
                this.f4297n = 0;
                this.f4298o = 0;
            } else {
                this.f4286b = recyclerView;
                this.f4285a = recyclerView.f4222e;
                this.f4297n = recyclerView.getWidth();
                this.f4298o = recyclerView.getHeight();
            }
            this.f4295l = 1073741824;
            this.f4296m = 1073741824;
        }

        public final int I() {
            androidx.recyclerview.widget.g gVar = this.f4285a;
            if (gVar != null) {
                return gVar.e();
            }
            return 0;
        }

        public final boolean I0(View view, int i10, int i11, n nVar) {
            if (!view.isLayoutRequested() && this.f4291h && W(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) nVar).width) && W(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) nVar).height)) {
                return false;
            }
            return true;
        }

        public boolean J0() {
            return false;
        }

        public int K(t tVar, y yVar) {
            return -1;
        }

        public final boolean K0(View view, int i10, int i11, n nVar) {
            if (this.f4291h && W(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) nVar).width) && W(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) nVar).height)) {
                return false;
            }
            return true;
        }

        public void L(Rect rect, View view) {
            RecyclerView.Y(rect, view);
        }

        public final int M() {
            Adapter adapter;
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public final void M0(androidx.recyclerview.widget.v vVar) {
            x xVar = this.f4288e;
            if (xVar != null && vVar != xVar && xVar.f4323e) {
                xVar.f();
            }
            this.f4288e = vVar;
            RecyclerView recyclerView = this.f4286b;
            vVar.getClass();
            a0 a0Var = recyclerView.f4223e0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.c.abortAnimation();
            vVar.f4321b = recyclerView;
            vVar.c = this;
            int i10 = vVar.f4320a;
            if (i10 != -1) {
                recyclerView.f4229h0.f4331a = i10;
                vVar.f4323e = true;
                vVar.f4322d = true;
                vVar.f4324f = recyclerView.f4238m.C(i10);
                vVar.f4321b.f4223e0.a();
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final int N() {
            RecyclerView recyclerView = this.f4286b;
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            return f0.e.d(recyclerView);
        }

        public boolean N0() {
            return false;
        }

        public int S(t tVar, y yVar) {
            return -1;
        }

        public final void U(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((n) view.getLayoutParams()).f4305b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f4286b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f4286b.f4234k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean V() {
            return false;
        }

        public void Y(int i10) {
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView != null) {
                int e10 = recyclerView.f4222e.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f4222e.d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        public void Z(int i10) {
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView != null) {
                int e10 = recyclerView.f4222e.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f4222e.d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        public View d0(View view, int i10, t tVar, y yVar) {
            return null;
        }

        public void e0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4286b;
            t tVar = recyclerView.f4217b;
            y yVar = recyclerView.f4229h0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f4286b.canScrollVertically(-1) && !this.f4286b.canScrollHorizontally(-1) && !this.f4286b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                Adapter adapter = this.f4286b.f4236l;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.getItemCount());
                }
            }
        }

        public void f0(t tVar, y yVar, y0.f fVar) {
            if (this.f4286b.canScrollVertically(-1) || this.f4286b.canScrollHorizontally(-1)) {
                fVar.a(8192);
                fVar.l(true);
            }
            if (this.f4286b.canScrollVertically(1) || this.f4286b.canScrollHorizontally(1)) {
                fVar.a(4096);
                fVar.l(true);
            }
            fVar.f31951a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(S(tVar, yVar), K(tVar, yVar), 0).f31967a);
        }

        public final void g0(View view, y0.f fVar) {
            b0 X = RecyclerView.X(view);
            if (X != null && !X.isRemoved() && !this.f4285a.j(X.itemView)) {
                RecyclerView recyclerView = this.f4286b;
                h0(recyclerView.f4217b, recyclerView.f4229h0, view, fVar);
            }
        }

        public final int getPaddingBottom() {
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int getPaddingEnd() {
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView != null) {
                WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                return f0.e.e(recyclerView);
            }
            return 0;
        }

        public final int getPaddingLeft() {
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int getPaddingRight() {
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int getPaddingStart() {
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView != null) {
                WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                return f0.e.f(recyclerView);
            }
            return 0;
        }

        public final int getPaddingTop() {
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m(android.view.View r9, boolean r10, int r11) {
            /*
                Method dump skipped, instructions count: 335
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.m(android.view.View, boolean, int):void");
        }

        public void n(String str) {
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView != null) {
                recyclerView.t(str);
            }
        }

        public void n0(RecyclerView recyclerView, int i10, int i11) {
            m0(i10);
        }

        public final void o(Rect rect, View view) {
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.Z(view));
            }
        }

        public boolean p() {
            return this instanceof CarouselLayoutManager;
        }

        public boolean q() {
            return false;
        }

        public boolean r(n nVar) {
            if (nVar != null) {
                return true;
            }
            return false;
        }

        public Parcelable r0() {
            return null;
        }

        public boolean t0(t tVar, y yVar, int i10, Bundle bundle) {
            int i11;
            int paddingLeft;
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView == null) {
                return false;
            }
            if (i10 != 4096) {
                if (i10 != 8192) {
                    i11 = 0;
                    paddingLeft = 0;
                } else {
                    if (recyclerView.canScrollVertically(-1)) {
                        i11 = -((this.f4298o - getPaddingTop()) - getPaddingBottom());
                    } else {
                        i11 = 0;
                    }
                    if (this.f4286b.canScrollHorizontally(-1)) {
                        paddingLeft = -((this.f4297n - getPaddingLeft()) - getPaddingRight());
                    }
                    paddingLeft = 0;
                }
            } else {
                if (recyclerView.canScrollVertically(1)) {
                    i11 = (this.f4298o - getPaddingTop()) - getPaddingBottom();
                } else {
                    i11 = 0;
                }
                if (this.f4286b.canScrollHorizontally(1)) {
                    paddingLeft = (this.f4297n - getPaddingLeft()) - getPaddingRight();
                }
                paddingLeft = 0;
            }
            if (i11 == 0 && paddingLeft == 0) {
                return false;
            }
            this.f4286b.t0(paddingLeft, i11, true);
            return true;
        }

        public final void u0() {
            int I = I();
            while (true) {
                I--;
                if (I >= 0) {
                    this.f4285a.k(I);
                } else {
                    return;
                }
            }
        }

        public int v(y yVar) {
            return 0;
        }

        public final void v0(t tVar) {
            int I = I();
            while (true) {
                I--;
                if (I >= 0) {
                    if (!RecyclerView.X(H(I)).shouldIgnore()) {
                        View H = H(I);
                        if (H(I) != null) {
                            this.f4285a.k(I);
                        }
                        tVar.g(H);
                    }
                } else {
                    return;
                }
            }
        }

        public int w(y yVar) {
            return 0;
        }

        public final void w0(t tVar) {
            ArrayList<b0> arrayList;
            int size = tVar.f4312a.size();
            int i10 = size - 1;
            while (true) {
                arrayList = tVar.f4312a;
                if (i10 < 0) {
                    break;
                }
                View view = arrayList.get(i10).itemView;
                b0 X = RecyclerView.X(view);
                if (!X.shouldIgnore()) {
                    X.setIsRecyclable(false);
                    if (X.isTmpDetached()) {
                        this.f4286b.removeDetachedView(view, false);
                    }
                    j jVar = this.f4286b.M;
                    if (jVar != null) {
                        jVar.i(X);
                    }
                    X.setIsRecyclable(true);
                    b0 X2 = RecyclerView.X(view);
                    X2.mScrapContainer = null;
                    X2.mInChangeScrap = false;
                    X2.clearReturnedFromScrapFlag();
                    tVar.h(X2);
                }
                i10--;
            }
            arrayList.clear();
            ArrayList<b0> arrayList2 = tVar.f4313b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f4286b.invalidate();
            }
        }

        public int x(y yVar) {
            return 0;
        }

        public final void x0(View view, t tVar) {
            androidx.recyclerview.widget.g gVar = this.f4285a;
            d0 d0Var = (d0) gVar.f4424a;
            int indexOfChild = d0Var.f4406a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (gVar.f4425b.f(indexOfChild)) {
                    gVar.l(view);
                }
                d0Var.b(indexOfChild);
            }
            tVar.g(view);
        }

        public int y(y yVar) {
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
            if (r10 == false) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean y0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.getPaddingLeft()
                int r1 = r8.getPaddingTop()
                int r2 = r8.f4297n
                int r3 = r8.getPaddingRight()
                int r2 = r2 - r3
                int r3 = r8.f4298o
                int r4 = r8.getPaddingBottom()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.N()
                r7 = 1
                if (r3 != r7) goto L5c
                if (r2 == 0) goto L57
                goto L64
            L57:
                int r2 = java.lang.Math.max(r6, r10)
                goto L64
            L5c:
                if (r6 == 0) goto L5f
                goto L63
            L5f:
                int r6 = java.lang.Math.min(r4, r2)
            L63:
                r2 = r6
            L64:
                if (r1 == 0) goto L67
                goto L6b
            L67:
                int r1 = java.lang.Math.min(r5, r11)
            L6b:
                if (r13 == 0) goto Laa
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L75
            L73:
                r10 = r0
                goto La8
            L75:
                int r11 = r8.getPaddingLeft()
                int r13 = r8.getPaddingTop()
                int r3 = r8.f4297n
                int r4 = r8.getPaddingRight()
                int r3 = r3 - r4
                int r4 = r8.f4298o
                int r5 = r8.getPaddingBottom()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f4286b
                android.graphics.Rect r5 = r5.f4230i
                r8.L(r5, r10)
                int r10 = r5.left
                int r10 = r10 - r2
                if (r10 >= r3) goto L73
                int r10 = r5.right
                int r10 = r10 - r2
                if (r10 <= r11) goto L73
                int r10 = r5.top
                int r10 = r10 - r1
                if (r10 >= r4) goto L73
                int r10 = r5.bottom
                int r10 = r10 - r1
                if (r10 > r13) goto La7
                goto L73
            La7:
                r10 = r7
            La8:
                if (r10 == 0) goto Laf
            Laa:
                if (r2 != 0) goto Lb0
                if (r1 == 0) goto Laf
                goto Lb0
            Laf:
                return r0
            Lb0:
                if (r12 == 0) goto Lb6
                r9.scrollBy(r2, r1)
                goto Lb9
            Lb6:
                r9.s0(r2, r1)
            Lb9:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.y0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public int z(y yVar) {
            return 0;
        }

        public final void z0() {
            RecyclerView recyclerView = this.f4286b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void a0() {
        }

        public void j0() {
        }

        public void B0(int i10) {
        }

        public void b0(RecyclerView recyclerView) {
        }

        public void c0(RecyclerView recyclerView) {
        }

        public void m0(int i10) {
        }

        public void p0(y yVar) {
        }

        public void q0(Parcelable parcelable) {
        }

        public void s0(int i10) {
        }

        public void L0(RecyclerView recyclerView, int i10) {
        }

        public void i0(int i10, int i11) {
        }

        public void k0(int i10, int i11) {
        }

        public void l0(int i10, int i11) {
        }

        public void o0(t tVar, y yVar) {
        }

        public void u(int i10, c cVar) {
        }

        public void h0(t tVar, y yVar, View view, y0.f fVar) {
        }

        public void t(int i10, int i11, y yVar, c cVar) {
        }
    }

    public void h0(int i10) {
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public void d(Rect rect, View view, RecyclerView recyclerView, y yVar) {
            ((n) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void e(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public void a(int i10, RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
    }
}
