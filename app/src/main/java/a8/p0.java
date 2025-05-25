package a8;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzij;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class p0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f276a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f277b;
    public final /* synthetic */ long c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f278d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f279e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f280f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f281g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f282h = null;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ zzij f283i;

    public p0(zzij zzijVar, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f283i = zzijVar;
        this.f276a = str;
        this.f277b = str2;
        this.c = j10;
        this.f278d = bundle;
        this.f279e = z10;
        this.f280f = z11;
        this.f281g = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f283i.v(this.f276a, this.f277b, this.c, this.f278d, this.f279e, this.f280f, this.f281g, this.f282h);
    }
}
