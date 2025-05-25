package a8;

import android.os.SystemClock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.internal.zzlg;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class h2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f190a;

    /* renamed from: b  reason: collision with root package name */
    public final long f191b;

    public h2(zzlg zzlgVar, String str) {
        this.f190a = str;
        ((DefaultClock) zzlgVar.zzax()).getClass();
        this.f191b = SystemClock.elapsedRealtime();
    }
}
