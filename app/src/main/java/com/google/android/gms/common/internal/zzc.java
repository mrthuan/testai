package com.google.android.gms.common.internal;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public abstract class zzc {

    /* renamed from: a  reason: collision with root package name */
    public Object f11293a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11294b = false;
    public final /* synthetic */ BaseGmsClient c;

    public zzc(BaseGmsClient baseGmsClient, Boolean bool) {
        this.c = baseGmsClient;
        this.f11293a = bool;
    }

    public abstract void a();

    public abstract void b();

    public final void c() {
        synchronized (this) {
            this.f11293a = null;
        }
    }

    public final void d() {
        ArrayList arrayList;
        ArrayList arrayList2;
        c();
        arrayList = this.c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.c.zzt;
            arrayList2.remove(this);
        }
    }
}
