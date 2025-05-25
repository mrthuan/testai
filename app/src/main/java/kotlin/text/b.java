package kotlin.text;

import cg.p;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* compiled from: Strings.kt */
/* loaded from: classes.dex */
public final class b implements jg.f<hg.c> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f19969a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19970b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, Pair<Integer, Integer>> f19971d;

    /* compiled from: Strings.kt */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<hg.c>, dg.a {

        /* renamed from: a  reason: collision with root package name */
        public int f19972a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f19973b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public hg.c f19974d;

        /* renamed from: e  reason: collision with root package name */
        public int f19975e;

        public a() {
            int o10 = ge.a.o(b.this.f19970b, 0, b.this.f19969a.length());
            this.f19973b = o10;
            this.c = o10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
            if (r6 < r3) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.c
                r1 = 0
                if (r0 >= 0) goto Lc
                r7.f19972a = r1
                r0 = 0
                r7.f19974d = r0
                goto L80
            Lc:
                kotlin.text.b r2 = kotlin.text.b.this
                int r3 = r2.c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L1b
                int r6 = r7.f19975e
                int r6 = r6 + r5
                r7.f19975e = r6
                if (r6 >= r3) goto L23
            L1b:
                java.lang.CharSequence r3 = r2.f19969a
                int r3 = r3.length()
                if (r0 <= r3) goto L35
            L23:
                hg.c r0 = new hg.c
                int r1 = r7.f19973b
                java.lang.CharSequence r2 = r2.f19969a
                int r2 = kotlin.text.k.R(r2)
                r0.<init>(r1, r2)
                r7.f19974d = r0
                r7.c = r4
                goto L7e
            L35:
                cg.p<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r0 = r2.f19971d
                java.lang.CharSequence r3 = r2.f19969a
                int r6 = r7.c
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r0 = r0.invoke(r3, r6)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L59
                hg.c r0 = new hg.c
                int r1 = r7.f19973b
                java.lang.CharSequence r2 = r2.f19969a
                int r2 = kotlin.text.k.R(r2)
                r0.<init>(r1, r2)
                r7.f19974d = r0
                r7.c = r4
                goto L7e
            L59:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f19973b
                hg.c r3 = ge.a.f0(r3, r2)
                r7.f19974d = r3
                int r2 = r2 + r0
                r7.f19973b = r2
                if (r0 != 0) goto L7b
                r1 = r5
            L7b:
                int r2 = r2 + r1
                r7.c = r2
            L7e:
                r7.f19972a = r5
            L80:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.b.a.a():void");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f19972a == -1) {
                a();
            }
            if (this.f19972a == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final hg.c next() {
            if (this.f19972a == -1) {
                a();
            }
            if (this.f19972a != 0) {
                hg.c cVar = this.f19974d;
                kotlin.jvm.internal.g.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f19974d = null;
                this.f19972a = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(CharSequence input, int i10, int i11, p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> pVar) {
        kotlin.jvm.internal.g.e(input, "input");
        this.f19969a = input;
        this.f19970b = i10;
        this.c = i11;
        this.f19971d = pVar;
    }

    @Override // jg.f
    public final Iterator<hg.c> iterator() {
        return new a();
    }
}
