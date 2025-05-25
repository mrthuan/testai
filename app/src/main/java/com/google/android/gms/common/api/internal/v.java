package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11037a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zabq f11038b;

    public v(zabq zabqVar, int i10) {
        this.f11038b = zabqVar;
        this.f11037a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11038b.g(this.f11037a);
    }
}
