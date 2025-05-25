package n7;

import com.google.android.gms.ads.internal.util.client.zzr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f22342a;

    public b(String str) {
        this.f22342a = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzr(null).zza(this.f22342a);
    }
}
