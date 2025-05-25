package o2;

import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import o2.i;
import x2.p;

/* compiled from: WorkRequest.java */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f22690a;

    /* renamed from: b  reason: collision with root package name */
    public final p f22691b;
    public final Set<String> c;

    /* compiled from: WorkRequest.java */
    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends m> {

        /* renamed from: a  reason: collision with root package name */
        public UUID f22692a;

        /* renamed from: b  reason: collision with root package name */
        public p f22693b;
        public final HashSet c;

        public a(Class<? extends ListenableWorker> cls) {
            HashSet hashSet = new HashSet();
            this.c = hashSet;
            this.f22692a = UUID.randomUUID();
            this.f22693b = new p(this.f22692a.toString(), cls.getName());
            hashSet.add(cls.getName());
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r2 == false) goto L16;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o2.i a() {
            /*
                r6 = this;
                r0 = r6
                o2.i$a r0 = (o2.i.a) r0
                o2.i r1 = new o2.i
                r1.<init>(r0)
                x2.p r0 = r6.f22693b
                o2.b r0 = r0.f31566j
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 24
                r4 = 1
                r5 = 0
                if (r2 < r3) goto L23
                o2.c r2 = r0.f22675h
                java.util.HashSet r2 = r2.f22679a
                int r2 = r2.size()
                if (r2 <= 0) goto L20
                r2 = r4
                goto L21
            L20:
                r2 = r5
            L21:
                if (r2 != 0) goto L31
            L23:
                boolean r2 = r0.f22671d
                if (r2 != 0) goto L31
                boolean r2 = r0.f22670b
                if (r2 != 0) goto L31
                boolean r0 = r0.c
                if (r0 == 0) goto L30
                goto L31
            L30:
                r4 = r5
            L31:
                x2.p r0 = r6.f22693b
                boolean r0 = r0.f31573q
                if (r0 == 0) goto L42
                if (r4 != 0) goto L3a
                goto L42
            L3a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expedited jobs only support network and storage constraints"
                r0.<init>(r1)
                throw r0
            L42:
                java.util.UUID r0 = java.util.UUID.randomUUID()
                r6.f22692a = r0
                x2.p r0 = new x2.p
                x2.p r2 = r6.f22693b
                r0.<init>(r2)
                r6.f22693b = r0
                java.util.UUID r2 = r6.f22692a
                java.lang.String r2 = r2.toString()
                r0.f31558a = r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.m.a.a():o2.i");
        }

        public final i.a b(long j10, TimeUnit timeUnit) {
            this.f22693b.f31563g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f22693b.f31563g) {
                return (i.a) this;
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public m(UUID uuid, p pVar, HashSet hashSet) {
        this.f22690a = uuid;
        this.f22691b = pVar;
        this.c = hashSet;
    }
}
