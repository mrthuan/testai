package lib.zj.office.system.beans.pagelist;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import java.util.LinkedList;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: classes3.dex */
public class APageListView extends AdapterView<Adapter> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f21003a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21004b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21005d;

    /* renamed from: e  reason: collision with root package name */
    public float f21006e;

    /* renamed from: f  reason: collision with root package name */
    public int f21007f;

    /* renamed from: g  reason: collision with root package name */
    public final ri.c f21008g;

    /* renamed from: h  reason: collision with root package name */
    public Adapter f21009h;

    /* renamed from: i  reason: collision with root package name */
    public final ri.a f21010i;

    /* renamed from: j  reason: collision with root package name */
    public final SparseArray<APageListItem> f21011j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedList<APageListItem> f21012k;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            APageListView aPageListView = APageListView.this;
            ri.c cVar = aPageListView.f21008g;
            if (cVar != null) {
                cVar.c();
                aPageListView.c = true;
                aPageListView.requestLayout();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            APageListView aPageListView = APageListView.this;
            aPageListView.c = true;
            aPageListView.f21005d = true;
            aPageListView.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f21015a;

        public c(int i10) {
            this.f21015a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            APageListView aPageListView = APageListView.this;
            if (this.f21015a == aPageListView.f21007f) {
                aPageListView.f21005d = true;
                aPageListView.requestLayout();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            APageListView aPageListView = APageListView.this;
            aPageListView.f21005d = true;
            aPageListView.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f21018a;

        public e(boolean z10) {
            this.f21018a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            APageListView aPageListView;
            APageListItem currentPageView;
            if (this.f21018a && (currentPageView = (aPageListView = APageListView.this).getCurrentPageView()) != null) {
                aPageListView.l(currentPageView);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ APageListItem f21020a;

        public f(APageListItem aPageListItem) {
            this.f21020a = aPageListItem;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21020a.b();
        }
    }

    public APageListView(Context context) {
        super(context);
        this.f21003a = true;
        this.f21006e = 1.0f;
        this.f21011j = new SparseArray<>(3);
        this.f21012k = new LinkedList<>();
    }

    public static Point c(Rect rect) {
        return new Point(Math.min(Math.max(0, rect.left), rect.right), Math.min(Math.max(0, rect.top), rect.bottom));
    }

    public final APageListItem a(int i10) {
        APageListItem removeFirst;
        SparseArray<APageListItem> sparseArray = this.f21011j;
        APageListItem aPageListItem = sparseArray.get(i10);
        if (aPageListItem == null) {
            Adapter adapter = this.f21009h;
            LinkedList<APageListItem> linkedList = this.f21012k;
            if (linkedList.size() == 0) {
                removeFirst = null;
            } else {
                removeFirst = linkedList.removeFirst();
            }
            aPageListItem = (APageListItem) adapter.getView(i10, removeFirst, this);
            ViewGroup.LayoutParams layoutParams = aPageListItem.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            addViewInLayout(aPageListItem, 0, layoutParams, true);
            sparseArray.append(i10, aPageListItem);
            aPageListItem.measure(((int) (aPageListItem.getPageWidth() * this.f21006e)) | 1073741824, 1073741824 | ((int) (aPageListItem.getPageHeight() * this.f21006e)));
        }
        return aPageListItem;
    }

    public final void b(APageListItem aPageListItem) {
        if (aPageListItem.getPageIndex() == this.f21007f) {
            ri.a aVar = this.f21010i;
            if (!aVar.f29585e && aVar.f29595o.isFinished()) {
                this.f21008g.a();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r4 != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        r1 = androidx.activity.s.f1867v / lib.zj.office.fc.hpsf.Constants.CP_MAC_ROMAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r9 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r2.l() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        return java.lang.Math.min(r3 / r0.width(), r4 / r0.height());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        return java.lang.Math.min(java.lang.Math.min(r3 / r0.width(), r4 / r0.height()), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r9 != 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
        return java.lang.Math.min(r3 / r0.width(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
        if (r9 != 2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
        return java.lang.Math.min(r4 / r0.height(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
        return getWidth() / r0.width();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float d(int r9) {
        /*
            r8 = this;
            int r0 = r8.f21007f
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 < 0) goto La3
            ri.c r2 = r8.f21008g
            int r3 = r2.getPageCount()
            if (r0 < r3) goto L10
            goto La3
        L10:
            int r0 = r8.f21007f
            android.graphics.Rect r0 = r2.g(r0)
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            android.view.ViewParent r5 = r8.getParent()
        L22:
            if (r3 != 0) goto L3e
            if (r5 == 0) goto L3e
            boolean r6 = r5 instanceof android.view.View
            if (r6 != 0) goto L2b
            goto L3e
        L2b:
            r3 = r5
            android.view.View r3 = (android.view.View) r3
            int r4 = r3.getWidth()
            int r3 = r3.getHeight()
            android.view.ViewParent r5 = r5.getParent()
            r7 = r4
            r4 = r3
            r3 = r7
            goto L22
        L3e:
            if (r3 == 0) goto La3
            if (r4 != 0) goto L43
            goto La3
        L43:
            int r1 = androidx.activity.s.f1867v
            int r1 = r1 / 10000
            float r1 = (float) r1
            if (r9 != 0) goto L7a
            boolean r9 = r2.l()
            if (r9 != 0) goto L63
            float r9 = (float) r3
            int r1 = r0.width()
            float r1 = (float) r1
            float r9 = r9 / r1
            float r1 = (float) r4
            int r0 = r0.height()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r9 = java.lang.Math.min(r9, r1)
            return r9
        L63:
            float r9 = (float) r3
            int r2 = r0.width()
            float r2 = (float) r2
            float r9 = r9 / r2
            float r2 = (float) r4
            int r0 = r0.height()
            float r0 = (float) r0
            float r2 = r2 / r0
            float r9 = java.lang.Math.min(r9, r2)
            float r9 = java.lang.Math.min(r9, r1)
            return r9
        L7a:
            r2 = 1
            if (r9 != r2) goto L89
            float r9 = (float) r3
            int r0 = r0.width()
            float r0 = (float) r0
            float r9 = r9 / r0
            float r9 = java.lang.Math.min(r9, r1)
            return r9
        L89:
            r2 = 2
            if (r9 != r2) goto L98
            float r9 = (float) r4
            int r0 = r0.height()
            float r0 = (float) r0
            float r9 = r9 / r0
            float r9 = java.lang.Math.min(r9, r1)
            return r9
        L98:
            int r9 = r8.getWidth()
            int r0 = r0.width()
            int r9 = r9 / r0
            float r9 = (float) r9
            return r9
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.system.beans.pagelist.APageListView.d(int):float");
    }

    public final Point e(View view) {
        return new Point(Math.max((getWidth() - view.getMeasuredWidth()) / 2, 0), Math.max((getHeight() - view.getMeasuredHeight()) / 2, 0));
    }

    public final Rect f(int i10, int i11, int i12, int i13) {
        int width = getWidth() - i12;
        int i14 = -i10;
        int height = getHeight() - i13;
        int i15 = -i11;
        if (width > i14) {
            width = (width + i14) / 2;
            i14 = width;
        }
        if (height > i15) {
            height = (height + i15) / 2;
            i15 = height;
        }
        return new Rect(width, height, i14, i15);
    }

    public final Rect g(View view) {
        int left = view.getLeft();
        ri.a aVar = this.f21010i;
        return f(left + aVar.f29589i, view.getTop() + aVar.f29590j, view.getMeasuredWidth() + view.getLeft() + aVar.f29589i, view.getMeasuredHeight() + view.getTop() + aVar.f29590j);
    }

    @Override // android.widget.AdapterView
    public Adapter getAdapter() {
        return this.f21009h;
    }

    public int getCurrentPageNumber() {
        return this.f21007f + 1;
    }

    public APageListItem getCurrentPageView() {
        SparseArray<APageListItem> sparseArray = this.f21011j;
        if (sparseArray != null) {
            return sparseArray.get(this.f21007f);
        }
        return null;
    }

    public int getDisplayedPageIndex() {
        return this.f21007f;
    }

    public int getFitSizeState() {
        APageListItem currentPageView = getCurrentPageView();
        if (currentPageView != null) {
            int abs = Math.abs(currentPageView.getWidth() - getWidth());
            int abs2 = Math.abs(currentPageView.getHeight() - getHeight());
            if (abs < 2 && abs2 < 2) {
                return 3;
            }
            if (abs < 2 && abs2 >= 2) {
                return 2;
            }
            if (abs >= 2 && abs2 < 2) {
                return 1;
            }
        }
        return 0;
    }

    public float getFitZoom() {
        return d(0);
    }

    public Object getModel() {
        return this.f21008g.getModel();
    }

    public int getPageCount() {
        return this.f21008g.getPageCount();
    }

    public ri.c getPageListViewListener() {
        return this.f21008g;
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
        return null;
    }

    public float getZoom() {
        return this.f21006e;
    }

    public final boolean h(int i10, int i11) {
        float f10 = this.f21006e;
        int i12 = (int) (i10 * f10);
        int i13 = (int) (i11 * f10);
        APageListItem currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return false;
        }
        int max = Math.max(currentPageView.getLeft(), 0) - currentPageView.getLeft();
        int max2 = Math.max(currentPageView.getTop(), 0) - currentPageView.getTop();
        if (max >= getWidth() + max || max2 >= getHeight() + max2 || i12 < max || i12 >= getWidth() + max || i13 < max2 || i13 >= getHeight() + max2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.system.beans.pagelist.APageListView.i():void");
    }

    public final void j() {
        boolean z10;
        int left;
        int top;
        Point e10;
        SparseArray<APageListItem> sparseArray = this.f21011j;
        APageListItem aPageListItem = sparseArray.get(this.f21007f);
        boolean z11 = this.f21005d;
        LinkedList<APageListItem> linkedList = this.f21012k;
        ri.a aVar = this.f21010i;
        if (!z11) {
            if (aPageListItem != null && Math.abs(aPageListItem.getTop()) < aPageListItem.getHeight()) {
                if (aPageListItem.getMeasuredHeight() + aPageListItem.getTop() + e(aPageListItem).y + 10 + aVar.f29590j < getHeight() / 2 && this.f21007f + 1 < this.f21009h.getCount() && !aVar.f29582a) {
                    post(new ri.b(aPageListItem));
                    post(aVar);
                    int i10 = this.f21007f + 1;
                    this.f21007f = i10;
                    String.valueOf(i10);
                } else if (((aPageListItem.getTop() - e10.y) - 10) + aVar.f29590j >= getHeight() / 2 && this.f21007f > 0 && !aVar.f29582a) {
                    post(new ri.b(aPageListItem));
                    post(aVar);
                    int i11 = this.f21007f - 1;
                    this.f21007f = i11;
                    String.valueOf(i11);
                }
            }
            int size = sparseArray.size();
            int[] iArr = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = sparseArray.keyAt(i12);
            }
            for (int i13 = 0; i13 < size; i13++) {
                int i14 = iArr[i13];
                int i15 = this.f21007f;
                if (i14 < i15 - 1 || i14 > i15 + 1) {
                    APageListItem aPageListItem2 = sparseArray.get(i14);
                    aPageListItem2.e();
                    linkedList.add(aPageListItem2);
                    removeViewInLayout(aPageListItem2);
                    sparseArray.remove(iArr[i13]);
                }
            }
        } else {
            this.f21005d = false;
            aVar.f29589i = 0;
            aVar.f29590j = 0;
            int size2 = sparseArray.size();
            int[] iArr2 = new int[size2];
            for (int i16 = 0; i16 < size2; i16++) {
                iArr2[i16] = sparseArray.keyAt(i16);
            }
            boolean z12 = false;
            for (int i17 = 0; i17 < size2; i17++) {
                int i18 = iArr2[i17];
                int i19 = this.f21007f;
                if (i18 < i19 - 1 || i18 > i19 + 1) {
                    APageListItem aPageListItem3 = sparseArray.get(i18);
                    aPageListItem3.e();
                    linkedList.add(aPageListItem3);
                    removeViewInLayout(aPageListItem3);
                    sparseArray.remove(iArr2[i17]);
                    if (iArr2[i17] == this.f21007f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
            }
            if (((int) (this.f21006e * 100.0f)) != 100 || !z12) {
                post(aVar);
            }
        }
        if (aPageListItem == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        APageListItem a10 = a(this.f21007f);
        Point e11 = e(a10);
        if (z10) {
            left = e11.x;
            top = e11.y;
        } else {
            left = a10.getLeft() + aVar.f29589i;
            top = a10.getTop() + aVar.f29590j;
        }
        aVar.f29589i = 0;
        aVar.f29590j = 0;
        int measuredWidth = a10.getMeasuredWidth() + left;
        int measuredHeight = a10.getMeasuredHeight() + top;
        if (!aVar.f29585e && aVar.f29595o.isFinished()) {
            Point c10 = c(f(left, top, measuredWidth, measuredHeight));
            int i20 = c10.x;
            measuredWidth += i20;
            left += i20;
            int i21 = c10.y;
            top += i21;
            measuredHeight += i21;
        } else if (a10.getMeasuredWidth() <= getWidth()) {
            int i22 = c(f(left, top, measuredWidth, measuredHeight)).x;
            measuredWidth += i22;
            left += i22;
        }
        a10.layout(left, top, measuredWidth, measuredHeight);
        int i23 = this.f21007f;
        if (i23 > 0) {
            APageListItem a11 = a(i23 - 1);
            int i24 = e(a11).y + 20 + e11.y;
            a11.layout(left, (top - i24) - a11.getMeasuredHeight(), measuredWidth, (measuredHeight - i24) - a11.getMeasuredHeight());
        }
        if (this.f21007f + 1 < this.f21009h.getCount()) {
            APageListItem a12 = a(this.f21007f + 1);
            int i25 = e11.y + 20 + e(a12).y;
            a12.layout(left, a12.getMeasuredHeight() + top + i25, measuredWidth, a12.getMeasuredHeight() + measuredHeight + i25);
        }
    }

    public final void k() {
        if (this.f21007f + 1 >= this.f21009h.getCount()) {
            return;
        }
        APageListItem aPageListItem = this.f21011j.get(this.f21007f + 1);
        if (aPageListItem != null) {
            this.f21007f++;
            this.f21010i.b(aPageListItem);
            return;
        }
        postDelayed(new d(), 1L);
        this.f21008g.f();
    }

    public final void l(APageListItem aPageListItem) {
        if (aPageListItem == null) {
            return;
        }
        post(new f(aPageListItem));
    }

    public final void m() {
        APageListItem aPageListItem;
        int i10 = this.f21007f;
        if (i10 != 0 && (aPageListItem = this.f21011j.get(i10 - 1)) != null) {
            this.f21007f--;
            this.f21010i.b(aPageListItem);
        }
    }

    public final void n(int i10, int i11) {
        APageListItem currentPageView;
        int i12;
        View view;
        View view2;
        if ((i10 >= 0 || i11 >= 0) && (currentPageView = getCurrentPageView()) != null && !h(i10, i11)) {
            float f10 = this.f21006e;
            int i13 = (int) (i10 * f10);
            int i14 = (int) (i11 * f10);
            int i15 = 0;
            if (i13 > 0) {
                if (getWidth() + i13 > currentPageView.getMeasuredWidth()) {
                    i13 = currentPageView.getMeasuredWidth() - getWidth();
                }
                i12 = -i13;
            } else {
                i12 = 0;
            }
            if (i14 > 0) {
                if (getHeight() + i14 > currentPageView.getMeasuredHeight()) {
                    i14 = currentPageView.getMeasuredHeight() - getHeight();
                }
                i15 = -i14;
            }
            Point e10 = e(currentPageView);
            int measuredWidth = currentPageView.getMeasuredWidth() + i12;
            int measuredHeight = currentPageView.getMeasuredHeight() + i15;
            if (currentPageView.getMeasuredHeight() <= getHeight()) {
                int i16 = c(f(i12, i15, measuredWidth, measuredHeight)).y;
                i15 += i16;
                measuredHeight += i16;
            }
            currentPageView.layout(i12, i15, measuredWidth, measuredHeight);
            int i17 = this.f21007f;
            SparseArray<APageListItem> sparseArray = this.f21011j;
            if (i17 > 0 && (view2 = sparseArray.get(i17 - 1)) != null) {
                int i18 = e(view2).x + 20 + e10.x;
                int i19 = measuredHeight + i15;
                view2.layout((i12 - view2.getMeasuredWidth()) - i18, (i19 - view2.getMeasuredHeight()) / 2, i12 - i18, (view2.getMeasuredHeight() + i19) / 2);
            }
            if (this.f21007f + 1 < this.f21009h.getCount() && (view = sparseArray.get(this.f21007f + 1)) != null) {
                int i20 = e10.x + 20 + e(view).x;
                int i21 = measuredHeight + i15;
                view.layout(measuredWidth + i20, (i21 - view.getMeasuredHeight()) / 2, view.getMeasuredWidth() + measuredWidth + i20, (view.getMeasuredHeight() + i21) / 2);
            }
            l(currentPageView);
        }
    }

    public final void o(float f10, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        if (((int) (f10 * 1.0E7f)) == ((int) (this.f21006e * 1.0E7f))) {
            return;
        }
        if (i10 == Integer.MIN_VALUE && i11 == Integer.MIN_VALUE) {
            i10 = getWidth() / 2;
            i11 = getHeight() / 2;
        }
        float f11 = this.f21006e;
        this.f21006e = f10;
        this.f21008g.i();
        post(new e(z10));
        if (z10) {
            APageListItem currentPageView = getCurrentPageView();
            if (currentPageView != null) {
                i12 = currentPageView.getLeft();
                i13 = currentPageView.getTop();
            } else {
                i12 = 0;
                i13 = 0;
            }
            float f12 = this.f21006e / f11;
            ri.a aVar = this.f21010i;
            int i14 = i10 - (i12 + aVar.f29589i);
            int i15 = i11 - (i13 + aVar.f29590j);
            float f13 = i14;
            float f14 = i15;
            aVar.f29589i = (int) (f13 - (f13 * f12));
            aVar.f29590j = (int) (f14 - (f12 * f14));
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21004b = true;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.c) {
            return;
        }
        if (this.f21008g.getPageListViewMovingPosition() == 0) {
            i();
        } else {
            j();
        }
        invalidate();
        if (this.f21004b) {
            this.f21004b = false;
            APageListItem currentPageView = getCurrentPageView();
            if (currentPageView != null) {
                l(currentPageView);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof APageListItem) {
                APageListItem aPageListItem = (APageListItem) childAt;
                aPageListItem.measure(((int) (aPageListItem.getPageWidth() * this.f21006e)) | 1073741824, 1073741824 | ((int) (aPageListItem.getPageHeight() * this.f21006e)));
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f21004b) {
            float fitZoom = getFitZoom();
            boolean z10 = true;
            if (getContext().getResources().getConfiguration().orientation != 1) {
                z10 = false;
            }
            if (!z10) {
                float f10 = this.f21006e;
                if (f10 > fitZoom) {
                    fitZoom = f10;
                }
            }
            o(fitZoom, SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID, false);
            this.c = false;
            postDelayed(new b(), 1L);
            this.f21008g.i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
        if (r11 != false) goto L164;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.system.beans.pagelist.APageListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i10) {
        if (i10 >= 0 && i10 < this.f21009h.getCount()) {
            this.f21007f = i10;
            postDelayed(new c(i10), 1L);
            this.f21008g.f();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f21003a) {
            super.requestLayout();
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(Adapter adapter) {
        this.f21009h = adapter;
    }

    public void setCurrentPageNumber(int i10) {
        this.f21007f = i10 - 1;
    }

    public void setDoRequstLayout(boolean z10) {
        this.f21003a = z10;
    }

    public void setFitSize(int i10) {
        o(d(i10), SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID, true);
        postInvalidate();
    }

    public APageListView(Context context, ri.c cVar) {
        super(context);
        this.f21003a = true;
        this.f21006e = 1.0f;
        this.f21011j = new SparseArray<>(3);
        this.f21012k = new LinkedList<>();
        this.f21008g = cVar;
        this.f21010i = new ri.a(this);
        this.f21009h = new APageListAdapter(this);
        setLongClickable(true);
        post(new a());
    }

    public void setInitZoom(boolean z10) {
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i10) {
    }
}
