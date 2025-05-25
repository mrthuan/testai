package a8;

import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class q0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f298a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzij f299b;

    public q0(zzij zzijVar, long j10) {
        this.f299b = zzijVar;
        this.f298a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10 = this.f298a;
        zzij zzijVar = this.f299b;
        zzijVar.w(j10, true);
        ((zzge) zzijVar.f3529a).o().D(new AtomicReference());
    }
}
