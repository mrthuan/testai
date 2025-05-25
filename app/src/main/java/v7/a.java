package v7;

import android.os.Process;
import com.google.android.gms.measurement.internal.zzjx;
import com.google.android.gms.measurement.internal.zzjy;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30740a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f30741b;

    public a(zzjx zzjxVar) {
        this.f30741b = zzjxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30740a;
        Object obj = this.f30741b;
        switch (i10) {
            case 0:
                Process.setThreadPriority(0);
                ((Runnable) obj).run();
                return;
            default:
                zzjy zzjyVar = ((zzjx) obj).c;
                zzjyVar.f11858d = null;
                zzjyVar.w();
                return;
        }
    }

    public a(Runnable runnable) {
        this.f30741b = runnable;
    }
}
