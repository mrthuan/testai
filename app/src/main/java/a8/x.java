package a8;

import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class x implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final String f376a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzgb f377b;

    public x(zzgb zzgbVar, String str) {
        this.f377b = zzgbVar;
        this.f376a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        zzeu zzeuVar = ((zzge) this.f377b.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11712f.b(th2, this.f376a);
    }
}
