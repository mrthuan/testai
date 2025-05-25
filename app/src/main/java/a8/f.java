package a8;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzby;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: d  reason: collision with root package name */
    public static volatile zzby f152d;

    /* renamed from: a  reason: collision with root package name */
    public final m0 f153a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.e0 f154b;
    public volatile long c;

    public f(m0 m0Var) {
        Preconditions.j(m0Var);
        this.f153a = m0Var;
        this.f154b = new com.google.android.gms.common.api.internal.e0(1, this, m0Var);
    }

    public final void a() {
        this.c = 0L;
        d().removeCallbacks(this.f154b);
    }

    public abstract void b();

    public final void c(long j10) {
        a();
        if (j10 >= 0) {
            this.c = this.f153a.zzax().a();
            if (!d().postDelayed(this.f154b, j10)) {
                this.f153a.zzaA().f11712f.b(Long.valueOf(j10), "Failed to schedule delayed post. time");
            }
        }
    }

    public final Handler d() {
        zzby zzbyVar;
        if (f152d != null) {
            return f152d;
        }
        synchronized (f.class) {
            if (f152d == null) {
                f152d = new zzby(this.f153a.zzaw().getMainLooper());
            }
            zzbyVar = f152d;
        }
        return zzbyVar;
    }
}
