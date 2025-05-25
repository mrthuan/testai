package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.f;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class FastScrollRecyclerView extends RecyclerView implements RecyclerView.q {
    public final FastScroller D0;
    public boolean E0;
    public final c F0;
    public int G0;
    public int H0;
    public int I0;
    public final SparseIntArray J0;
    public final b K0;

    /* loaded from: classes3.dex */
    public interface a<VH extends RecyclerView.b0> {
        int a();
    }

    /* loaded from: classes3.dex */
    public class b extends RecyclerView.g {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b() {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i10, int i11, Object obj) {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i10, int i11) {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i10, int i11) {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i10, int i11) {
            h();
        }

        public final void h() {
            FastScrollRecyclerView.this.J0.clear();
        }
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f25393a;

        /* renamed from: b  reason: collision with root package name */
        public int f25394b;
        public int c;
    }

    /* loaded from: classes3.dex */
    public interface d {
        String a();
    }

    static {
        ea.a.p("JGEmdDpjRW8kbDRlV3k0bF1yBGksdw==", "mtbUi7QA");
    }

    public FastScrollRecyclerView(Context context) {
        this(context, null);
    }

    public final int A0(int i10) {
        if (getAdapter() instanceof a) {
            SparseIntArray sparseIntArray = this.J0;
            if (sparseIntArray.indexOfKey(i10) >= 0) {
                return sparseIntArray.get(i10);
            }
            a aVar = (a) getAdapter();
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sparseIntArray.put(i12, i11);
                getAdapter().getItemViewType(i12);
                R(i12);
                i11 += aVar.a();
            }
            sparseIntArray.put(i10, i11);
            return i11;
        }
        throw new IllegalStateException(ea.a.p("LGFdYwxsVnQ_UylyGmwERFxzGmErYwBUW1ArcyV0UW8hKBggCmhYdTZkam8bbBEgV2VOYyRsCWVQIDNoKXJdIDtoVCArZVR5OWwvciNpDXcbQQphNXQAchRpNyAtbhhpIXNFYRdjUiA1ZmpNEGEbdUdhDGwgQQFhRHQhcg==", "UVUn4DL8"));
    }

    public final float B0(float f10) {
        if (getAdapter() instanceof a) {
            a aVar = (a) getAdapter();
            int z02 = (int) (z0() * f10);
            for (int i10 = 0; i10 < getAdapter().getItemCount(); i10++) {
                int A0 = A0(i10);
                R(i10);
                getAdapter().getItemViewType(i10);
                int a10 = aVar.a() + A0;
                if (i10 == getAdapter().getItemCount() - 1) {
                    if (z02 >= A0 && z02 <= a10) {
                        return i10;
                    }
                } else if (z02 >= A0 && z02 < a10) {
                    return i10;
                }
            }
            ea.a.p("dWEibBZkQnQdIFJpB2R2YWR2W2UxICJ0eXQ7ZVlwGG9FaS9lFyARYwBvWGxJZiRhJ3RbbyggKA==", "YSyjYN13");
            ea.a.p("KQ==", "hp3GXCL0");
            return f10 * getAdapter().getItemCount();
        }
        return getAdapter().getItemCount() * f10;
    }

    public final int C0(int i10) {
        int i11;
        int height = getHeight();
        int i12 = 0;
        if (getClipToPadding()) {
            i11 = getPaddingTop();
        } else {
            i11 = 0;
        }
        int i13 = i11 + 0 + i10;
        if (getClipToPadding()) {
            i12 = getPaddingBottom();
        }
        return (i13 + i12) - height;
    }

    public final void D0(c cVar) {
        int i10;
        cVar.f25393a = -1;
        cVar.f25394b = -1;
        cVar.c = -1;
        if (getAdapter() != null) {
            i10 = getAdapter().getItemCount();
        } else {
            i10 = 0;
        }
        if (i10 != 0 && getChildCount() != 0) {
            View childAt = getChildAt(0);
            cVar.f25393a = RecyclerView.V(childAt);
            if (getLayoutManager() instanceof GridLayoutManager) {
                cVar.f25393a /= ((GridLayoutManager) getLayoutManager()).F;
            }
            if (getLayoutManager() != null) {
                if (getAdapter() instanceof a) {
                    getLayoutManager().getClass();
                    cVar.f25394b = childAt.getTop() - RecyclerView.m.T(childAt);
                    R(cVar.f25393a);
                    getAdapter().getItemViewType(cVar.f25393a);
                    cVar.c = ((a) getAdapter()).a();
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                getLayoutManager().getClass();
                cVar.f25394b = (childAt.getTop() - RecyclerView.m.T(childAt)) - marginLayoutParams.topMargin;
                int height = childAt.getHeight();
                getLayoutManager().getClass();
                int T = RecyclerView.m.T(childAt) + height;
                getLayoutManager().getClass();
                cVar.c = RecyclerView.m.G(childAt) + T + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r0 != 3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E0(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            float r1 = r5.getX()
            int r1 = (int) r1
            float r2 = r5.getY()
            int r2 = (int) r2
            pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.FastScroller r3 = r4.D0
            if (r0 == 0) goto L30
            r1 = 1
            if (r0 == r1) goto L26
            r1 = 2
            if (r0 == r1) goto L1c
            r1 = 3
            if (r0 == r1) goto L26
            goto L39
        L1c:
            r4.I0 = r2
            int r0 = r4.G0
            int r1 = r4.H0
            r3.a(r5, r0, r1, r2)
            goto L39
        L26:
            int r0 = r4.G0
            int r1 = r4.H0
            int r2 = r4.I0
            r3.a(r5, r0, r1, r2)
            goto L39
        L30:
            r4.G0 = r1
            r4.I0 = r2
            r4.H0 = r2
            r3.a(r5, r1, r2, r2)
        L39:
            boolean r5 = r3.f25408o
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.FastScrollRecyclerView.E0(android.view.MotionEvent):boolean");
    }

    public final boolean F0() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).f4188t;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void c(RecyclerView recyclerView, MotionEvent motionEvent) {
        E0(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int C0;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int width;
        int i17;
        super.draw(canvas);
        if (this.E0) {
            RecyclerView.Adapter adapter = getAdapter();
            int i18 = 0;
            FastScroller fastScroller = this.D0;
            if (adapter != null) {
                int itemCount = getAdapter().getItemCount();
                if (getLayoutManager() instanceof GridLayoutManager) {
                    itemCount = (int) Math.ceil(itemCount / ((GridLayoutManager) getLayoutManager()).F);
                }
                if (itemCount == 0) {
                    fastScroller.c(-1, -1);
                } else {
                    c cVar = this.F0;
                    D0(cVar);
                    if (cVar.f25393a < 0) {
                        fastScroller.c(-1, -1);
                    } else {
                        if (getAdapter() instanceof a) {
                            C0 = C0(z0());
                            i12 = A0(cVar.f25393a);
                        } else {
                            C0 = C0(itemCount * cVar.c);
                            i12 = cVar.f25393a * cVar.c;
                        }
                        int availableScrollBarHeight = getAvailableScrollBarHeight();
                        if (C0 <= 0) {
                            fastScroller.c(-1, -1);
                        } else {
                            if (getClipToPadding()) {
                                i13 = getPaddingTop();
                            } else {
                                i13 = 0;
                            }
                            int min = Math.min(C0, i13 + i12);
                            if (F0()) {
                                i14 = (min + cVar.f25394b) - availableScrollBarHeight;
                            } else {
                                i14 = min - cVar.f25394b;
                            }
                            int i19 = (int) ((i14 / C0) * availableScrollBarHeight);
                            if (F0()) {
                                int i20 = availableScrollBarHeight - i19;
                                if (getClipToPadding()) {
                                    i17 = getPaddingBottom();
                                } else {
                                    i17 = 0;
                                }
                                i16 = i20 + i17;
                            } else {
                                if (getClipToPadding()) {
                                    i15 = getPaddingTop();
                                } else {
                                    i15 = 0;
                                }
                                i16 = i19 + i15;
                            }
                            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(getContext())) {
                                width = 0;
                            } else {
                                width = getWidth() - Math.max(fastScroller.f25399f, fastScroller.c);
                            }
                            fastScroller.c(width, i16);
                        }
                    }
                }
            }
            Point point = fastScroller.f25406m;
            int i21 = point.x;
            if (i21 >= 0 && point.y >= 0 && fastScroller.A) {
                RectF rectF = fastScroller.B;
                Point point2 = fastScroller.f25407n;
                int i22 = i21 + point2.x;
                int i23 = fastScroller.c;
                int i24 = fastScroller.f25399f;
                int i25 = i23 - i24;
                float f10 = i22 + i25;
                int i26 = point2.y;
                FastScrollRecyclerView fastScrollRecyclerView = fastScroller.f25395a;
                if (fastScrollRecyclerView.getClipToPadding()) {
                    i10 = fastScrollRecyclerView.getPaddingTop();
                } else {
                    i10 = 0;
                }
                float f11 = i26 + i10;
                float g10 = f.g(point.x, point2.x, i24, i25);
                int height = fastScrollRecyclerView.getHeight() + point2.y;
                if (fastScrollRecyclerView.getClipToPadding()) {
                    i18 = fastScrollRecyclerView.getPaddingBottom();
                }
                rectF.set(f10, f11, g10, height - i18);
                float f12 = i24;
                canvas.drawRoundRect(rectF, f12, f12, fastScroller.f25398e);
                int i27 = point.x + point2.x;
                int i28 = i25 / 2;
                rectF.set(i28 + i27, point.y + point2.y, i27 + i23 + i28, i11 + fastScroller.f25396b);
                Bitmap bitmap = fastScroller.f25419z;
                if (bitmap != null && !bitmap.isRecycled()) {
                    boolean j10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(fastScrollRecyclerView.getContext());
                    Paint paint = fastScroller.f25397d;
                    Rect rect = fastScroller.f25403j;
                    if (j10) {
                        canvas.save();
                        canvas.rotate(180.0f, rectF.centerX(), rectF.centerY());
                        canvas.drawBitmap(bitmap, rect, rectF, paint);
                        canvas.restore();
                        return;
                    }
                    canvas.drawBitmap(bitmap, rect, rectF, paint);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final boolean f(RecyclerView recyclerView, MotionEvent motionEvent) {
        return E0(motionEvent);
    }

    public int getAvailableScrollBarHeight() {
        int i10;
        int height = getHeight();
        int i11 = 0;
        if (getClipToPadding()) {
            i10 = getPaddingTop();
        } else {
            i10 = 0;
        }
        int i12 = height - i10;
        if (getClipToPadding()) {
            i11 = getPaddingBottom();
        }
        return (i12 - i11) - this.D0.f25396b;
    }

    public int getScrollBarThumbHeight() {
        return this.D0.f25396b;
    }

    public int getScrollBarWidth() {
        FastScroller fastScroller = this.D0;
        return Math.max(fastScroller.f25399f, fastScroller.c);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        r(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = getAdapter();
        b bVar = this.K0;
        if (adapter2 != null) {
            getAdapter().unregisterAdapterDataObserver(bVar);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(bVar);
        }
        super.setAdapter(adapter);
    }

    public void setAutoHideDelay(int i10) {
        FastScroller fastScroller = this.D0;
        fastScroller.f25411r = i10;
        if (fastScroller.f25412s) {
            fastScroller.b();
        }
    }

    public void setAutoHideEnabled(boolean z10) {
        FastScroller fastScroller = this.D0;
        fastScroller.f25412s = z10;
        if (z10) {
            fastScroller.b();
            return;
        }
        FastScrollRecyclerView fastScrollRecyclerView = fastScroller.f25395a;
        if (fastScrollRecyclerView != null) {
            fastScrollRecyclerView.removeCallbacks(fastScroller.f25413t);
        }
    }

    public void setFastScrollEnabled(boolean z10) {
        this.E0 = z10;
    }

    @Deprecated
    public void setStateChangeListener(xm.a aVar) {
        setOnFastScrollStateChangeListener(aVar);
    }

    public void setThumbColor(int i10) {
        FastScroller fastScroller = this.D0;
        fastScroller.f25414u = i10;
        fastScroller.f25397d.setColor(i10);
        fastScroller.f25395a.invalidate(fastScroller.f25401h);
    }

    @Deprecated
    public void setThumbEnabled(boolean z10) {
        setFastScrollEnabled(z10);
    }

    public void setThumbInactiveColor(int i10) {
        FastScroller fastScroller = this.D0;
        fastScroller.f25415v = i10;
        fastScroller.f25416w = true;
        fastScroller.f25397d.setColor(i10);
    }

    public void setTrackColor(int i10) {
        FastScroller fastScroller = this.D0;
        fastScroller.f25398e.setColor(i10);
        fastScroller.f25395a.invalidate(fastScroller.f25401h);
    }

    public final int z0() {
        if (getAdapter() instanceof a) {
            return A0(getAdapter().getItemCount());
        }
        throw new IllegalStateException(ea.a.p("UGEnYwZsA3QXQVBhGXQzcgxlW2cudGspYXMcbwJsCiBcbid5U2IHIBFhWGwMZHZ3LGVAZWZ0K2VhUhFjDmMCZUFWImUELiNkE3BAZRsgP3NkYVwgL24wdCBuF2VXbwggfmUqcwZyA2IeZXVkCHAiZXI=", "Atwn2Lae"));
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.E0 = true;
        this.F0 = new c();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, pdf.pdfreader.viewer.editor.free.a.f23892b, 0, 0);
        try {
            this.E0 = obtainStyledAttributes.getBoolean(4, true);
            obtainStyledAttributes.recycle();
            this.D0 = new FastScroller(context, this, attributeSet);
            this.K0 = new b();
            this.J0 = new SparseIntArray();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Deprecated
    public void setThumbInactiveColor(boolean z10) {
        FastScroller fastScroller = this.D0;
        fastScroller.f25416w = z10;
        fastScroller.f25397d.setColor(z10 ? fastScroller.f25415v : fastScroller.f25414u);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void j(boolean z10) {
    }

    public void setOnFastScrollStateChangeListener(xm.a aVar) {
    }
}
