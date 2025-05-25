package x2;

import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import com.inmobi.commons.core.configs.CrashConfig;

/* compiled from: WorkSpec.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public String f31558a;

    /* renamed from: b  reason: collision with root package name */
    public WorkInfo$State f31559b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f31560d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.work.b f31561e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.work.b f31562f;

    /* renamed from: g  reason: collision with root package name */
    public long f31563g;

    /* renamed from: h  reason: collision with root package name */
    public long f31564h;

    /* renamed from: i  reason: collision with root package name */
    public long f31565i;

    /* renamed from: j  reason: collision with root package name */
    public o2.b f31566j;

    /* renamed from: k  reason: collision with root package name */
    public int f31567k;

    /* renamed from: l  reason: collision with root package name */
    public BackoffPolicy f31568l;

    /* renamed from: m  reason: collision with root package name */
    public long f31569m;

    /* renamed from: n  reason: collision with root package name */
    public long f31570n;

    /* renamed from: o  reason: collision with root package name */
    public long f31571o;

    /* renamed from: p  reason: collision with root package name */
    public long f31572p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f31573q;

    /* renamed from: r  reason: collision with root package name */
    public OutOfQuotaPolicy f31574r;

    /* compiled from: WorkSpec.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f31575a;

        /* renamed from: b  reason: collision with root package name */
        public WorkInfo$State f31576b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f31576b != aVar.f31576b) {
                return false;
            }
            return this.f31575a.equals(aVar.f31575a);
        }

        public final int hashCode() {
            return this.f31576b.hashCode() + (this.f31575a.hashCode() * 31);
        }
    }

    static {
        o2.h.e("WorkSpec");
    }

    public p(String str, String str2) {
        this.f31559b = WorkInfo$State.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f4909b;
        this.f31561e = bVar;
        this.f31562f = bVar;
        this.f31566j = o2.b.f22668i;
        this.f31568l = BackoffPolicy.EXPONENTIAL;
        this.f31569m = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        this.f31572p = -1L;
        this.f31574r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f31558a = str;
        this.c = str2;
    }

    public final long a() {
        boolean z10;
        long j10;
        long j11;
        long scalb;
        boolean z11 = true;
        boolean z12 = false;
        if (this.f31559b == WorkInfo$State.ENQUEUED && this.f31567k > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f31568l == BackoffPolicy.LINEAR) {
                z12 = true;
            }
            if (z12) {
                scalb = this.f31569m * this.f31567k;
            } else {
                scalb = Math.scalb((float) this.f31569m, this.f31567k - 1);
            }
            j11 = this.f31570n;
            j10 = Math.min(18000000L, scalb);
        } else {
            long j12 = 0;
            if (c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j13 = this.f31570n;
                int i10 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                if (i10 == 0) {
                    j13 = this.f31563g + currentTimeMillis;
                }
                long j14 = this.f31565i;
                long j15 = this.f31564h;
                if (j14 == j15) {
                    z11 = false;
                }
                if (z11) {
                    if (i10 == 0) {
                        j12 = j14 * (-1);
                    }
                    return j13 + j15 + j12;
                }
                if (i10 != 0) {
                    j12 = j15;
                }
                return j13 + j12;
            }
            j10 = this.f31570n;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            j11 = this.f31563g;
        }
        return j10 + j11;
    }

    public final boolean b() {
        return !o2.b.f22668i.equals(this.f31566j);
    }

    public final boolean c() {
        if (this.f31564h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f31563g != pVar.f31563g || this.f31564h != pVar.f31564h || this.f31565i != pVar.f31565i || this.f31567k != pVar.f31567k || this.f31569m != pVar.f31569m || this.f31570n != pVar.f31570n || this.f31571o != pVar.f31571o || this.f31572p != pVar.f31572p || this.f31573q != pVar.f31573q || !this.f31558a.equals(pVar.f31558a) || this.f31559b != pVar.f31559b || !this.c.equals(pVar.c)) {
            return false;
        }
        String str = this.f31560d;
        if (str == null ? pVar.f31560d != null : !str.equals(pVar.f31560d)) {
            return false;
        }
        if (this.f31561e.equals(pVar.f31561e) && this.f31562f.equals(pVar.f31562f) && this.f31566j.equals(pVar.f31566j) && this.f31568l == pVar.f31568l && this.f31574r == pVar.f31574r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f31559b.hashCode();
        int h10 = androidx.activity.f.h(this.c, (hashCode + (this.f31558a.hashCode() * 31)) * 31, 31);
        String str = this.f31560d;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f31561e.hashCode();
        int hashCode3 = this.f31562f.hashCode();
        long j10 = this.f31563g;
        long j11 = this.f31564h;
        long j12 = this.f31565i;
        int hashCode4 = this.f31566j.hashCode();
        int hashCode5 = this.f31568l.hashCode();
        long j13 = this.f31569m;
        long j14 = this.f31570n;
        long j15 = this.f31571o;
        long j16 = this.f31572p;
        return this.f31574r.hashCode() + ((((((((((((hashCode5 + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((h10 + i10) * 31)) * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f31567k) * 31)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f31573q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return androidx.activity.r.g(new StringBuilder("{WorkSpec: "), this.f31558a, "}");
    }

    public p(p pVar) {
        this.f31559b = WorkInfo$State.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f4909b;
        this.f31561e = bVar;
        this.f31562f = bVar;
        this.f31566j = o2.b.f22668i;
        this.f31568l = BackoffPolicy.EXPONENTIAL;
        this.f31569m = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        this.f31572p = -1L;
        this.f31574r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f31558a = pVar.f31558a;
        this.c = pVar.c;
        this.f31559b = pVar.f31559b;
        this.f31560d = pVar.f31560d;
        this.f31561e = new androidx.work.b(pVar.f31561e);
        this.f31562f = new androidx.work.b(pVar.f31562f);
        this.f31563g = pVar.f31563g;
        this.f31564h = pVar.f31564h;
        this.f31565i = pVar.f31565i;
        this.f31566j = new o2.b(pVar.f31566j);
        this.f31567k = pVar.f31567k;
        this.f31568l = pVar.f31568l;
        this.f31569m = pVar.f31569m;
        this.f31570n = pVar.f31570n;
        this.f31571o = pVar.f31571o;
        this.f31572p = pVar.f31572p;
        this.f31573q = pVar.f31573q;
        this.f31574r = pVar.f31574r;
    }
}
