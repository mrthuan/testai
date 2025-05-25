package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import s0.l;

/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal<q> f4539e = new ThreadLocal<>();

    /* renamed from: f  reason: collision with root package name */
    public static final a f4540f = new a();

    /* renamed from: b  reason: collision with root package name */
    public long f4542b;
    public long c;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<RecyclerView> f4541a = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<c> f4543d = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r0 == null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
            if (r0 != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(androidx.recyclerview.widget.q.c r7, androidx.recyclerview.widget.q.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.q$c r7 = (androidx.recyclerview.widget.q.c) r7
                androidx.recyclerview.widget.q$c r8 = (androidx.recyclerview.widget.q.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f4549d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f4549d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f4547a
                boolean r3 = r8.f4547a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f4548b
                int r2 = r7.f4548b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.c
                int r8 = r8.c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.q.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.m.c {

        /* renamed from: a  reason: collision with root package name */
        public int f4544a;

        /* renamed from: b  reason: collision with root package name */
        public int f4545b;
        public int[] c;

        /* renamed from: d  reason: collision with root package name */
        public int f4546d;

        public final void a(int i10, int i11) {
            if (i10 >= 0) {
                if (i11 >= 0) {
                    int i12 = this.f4546d * 2;
                    int[] iArr = this.c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i12 >= iArr.length) {
                        int[] iArr3 = new int[i12 * 2];
                        this.c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.c;
                    iArr4[i12] = i10;
                    iArr4[i12 + 1] = i11;
                    this.f4546d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        public final void b(RecyclerView recyclerView, boolean z10) {
            boolean z11 = false;
            this.f4546d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.f4238m;
            if (recyclerView.f4236l != null && mVar != null && mVar.f4292i) {
                if (z10) {
                    if (!recyclerView.f4220d.g()) {
                        mVar.u(recyclerView.f4236l.getItemCount(), this);
                    }
                } else {
                    if (!((!recyclerView.f4254u || recyclerView.D || recyclerView.f4220d.g()) ? true : true)) {
                        mVar.t(this.f4544a, this.f4545b, recyclerView.f4229h0, this);
                    }
                }
                int i10 = this.f4546d;
                if (i10 > mVar.f4293j) {
                    mVar.f4293j = i10;
                    mVar.f4294k = z10;
                    recyclerView.f4217b.l();
                }
            }
        }
    }

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4547a;

        /* renamed from: b  reason: collision with root package name */
        public int f4548b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f4549d;

        /* renamed from: e  reason: collision with root package name */
        public int f4550e;
    }

    public static RecyclerView.b0 c(RecyclerView recyclerView, int i10, long j10) {
        boolean z10;
        int h10 = recyclerView.f4222e.h();
        int i11 = 0;
        while (true) {
            if (i11 < h10) {
                RecyclerView.b0 X = RecyclerView.X(recyclerView.f4222e.g(i11));
                if (X.mPosition == i10 && !X.isInvalid()) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return null;
        }
        RecyclerView.t tVar = recyclerView.f4217b;
        try {
            recyclerView.e0();
            RecyclerView.b0 j11 = tVar.j(j10, i10);
            if (j11 != null) {
                if (j11.isBound() && !j11.isInvalid()) {
                    tVar.g(j11.itemView);
                } else {
                    tVar.a(j11, false);
                }
            }
            return j11;
        } finally {
            recyclerView.f0(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f4542b == 0) {
            this.f4542b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f4227g0;
        bVar.f4544a = i10;
        bVar.f4545b = i11;
    }

    public final void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        c cVar2;
        boolean z10;
        ArrayList<RecyclerView> arrayList = this.f4541a;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.f4227g0;
                bVar.b(recyclerView3, false);
                i10 += bVar.f4546d;
            }
        }
        ArrayList<c> arrayList2 = this.f4543d;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.f4227g0;
                int abs = Math.abs(bVar2.f4545b) + Math.abs(bVar2.f4544a);
                for (int i14 = 0; i14 < bVar2.f4546d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i12);
                    }
                    int[] iArr = bVar2.c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar2.f4547a = z10;
                    cVar2.f4548b = abs;
                    cVar2.c = i15;
                    cVar2.f4549d = recyclerView4;
                    cVar2.f4550e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f4540f);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i16)).f4549d) != null; i16++) {
            if (cVar.f4547a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            RecyclerView.b0 c10 = c(recyclerView, cVar.f4550e, j11);
            if (c10 != null && c10.mNestedRecyclerView != null && c10.isBound() && !c10.isInvalid() && (recyclerView2 = c10.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.D && recyclerView2.f4222e.h() != 0) {
                    RecyclerView.j jVar = recyclerView2.M;
                    if (jVar != null) {
                        jVar.j();
                    }
                    RecyclerView.m mVar = recyclerView2.f4238m;
                    RecyclerView.t tVar = recyclerView2.f4217b;
                    if (mVar != null) {
                        mVar.v0(tVar);
                        recyclerView2.f4238m.w0(tVar);
                    }
                    tVar.f4312a.clear();
                    tVar.e();
                }
                b bVar3 = recyclerView2.f4227g0;
                bVar3.b(recyclerView2, true);
                if (bVar3.f4546d != 0) {
                    try {
                        int i17 = s0.l.f29698a;
                        l.a.a("RV Nested Prefetch");
                        RecyclerView.y yVar = recyclerView2.f4229h0;
                        RecyclerView.Adapter adapter = recyclerView2.f4236l;
                        yVar.f4333d = 1;
                        yVar.f4334e = adapter.getItemCount();
                        yVar.f4336g = false;
                        yVar.f4337h = false;
                        yVar.f4338i = false;
                        for (int i18 = 0; i18 < bVar3.f4546d * 2; i18 += 2) {
                            c(recyclerView2, bVar3.c[i18], j10);
                        }
                        l.a.b();
                        cVar.f4547a = false;
                        cVar.f4548b = 0;
                        cVar.c = 0;
                        cVar.f4549d = null;
                        cVar.f4550e = 0;
                    } catch (Throwable th2) {
                        int i19 = s0.l.f29698a;
                        l.a.b();
                        throw th2;
                    }
                }
            }
            cVar.f4547a = false;
            cVar.f4548b = 0;
            cVar.c = 0;
            cVar.f4549d = null;
            cVar.f4550e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = s0.l.f29698a;
            l.a.a("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f4541a;
            if (arrayList.isEmpty()) {
                this.f4542b = 0L;
                l.a.b();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j10 = Math.max(recyclerView.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.f4542b = 0L;
                l.a.b();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j10) + this.c);
            this.f4542b = 0L;
            l.a.b();
        } catch (Throwable th2) {
            this.f4542b = 0L;
            int i12 = s0.l.f29698a;
            l.a.b();
            throw th2;
        }
    }
}
