package a8;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzjy;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.2 */
/* loaded from: classes2.dex */
public final class t1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzcf f327a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f328b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f329d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f330e;

    public t1(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2, boolean z10) {
        this.f330e = appMeasurementDynamiteService;
        this.f327a = zzcfVar;
        this.f328b = str;
        this.c = str2;
        this.f329d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjy o10 = this.f330e.f11514a.o();
        zzcf zzcfVar = this.f327a;
        String str = this.f328b;
        String str2 = this.c;
        boolean z10 = this.f329d;
        o10.m();
        o10.n();
        o10.y(new g1(o10, str, str2, o10.v(false), z10, zzcfVar));
    }
}
