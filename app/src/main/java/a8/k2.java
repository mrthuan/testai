package a8;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzjy;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.2 */
/* loaded from: classes2.dex */
public final class k2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzcf f216a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f217b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f218d;

    public k2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2) {
        this.f218d = appMeasurementDynamiteService;
        this.f216a = zzcfVar;
        this.f217b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjy o10 = this.f218d.f11514a.o();
        zzcf zzcfVar = this.f216a;
        String str = this.f217b;
        String str2 = this.c;
        o10.m();
        o10.n();
        o10.y(new q1(o10, str, str2, o10.v(false), zzcfVar));
    }
}
