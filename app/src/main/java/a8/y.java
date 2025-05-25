package a8;

import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class y extends FutureTask implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final long f383a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f384b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzgb f385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(zzgb zzgbVar, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.f385d = zzgbVar;
        long andIncrement = zzgb.f11764k.getAndIncrement();
        this.f383a = andIncrement;
        this.c = str;
        this.f384b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            zzeu zzeuVar = ((zzge) zzgbVar.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y yVar = (y) obj;
        boolean z10 = yVar.f384b;
        boolean z11 = this.f384b;
        if (z11 != z10) {
            if (!z11) {
                return 1;
            }
            return -1;
        }
        long j10 = yVar.f383a;
        long j11 = this.f383a;
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 > 0) {
            return 1;
        }
        zzeu zzeuVar = ((zzge) this.f385d.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11713g.b(Long.valueOf(j11), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        zzeu zzeuVar = ((zzge) this.f385d.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11712f.b(th2, this.c);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(zzgb zzgbVar, Callable callable, boolean z10) {
        super(callable);
        this.f385d = zzgbVar;
        long andIncrement = zzgb.f11764k.getAndIncrement();
        this.f383a = andIncrement;
        this.c = "Task exception on worker thread";
        this.f384b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            zzeu zzeuVar = ((zzge) zzgbVar.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Tasks index overflow");
        }
    }
}
