package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f6231a;

    /* renamed from: b  reason: collision with root package name */
    public String f6232b;

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f6233a;

        /* renamed from: b  reason: collision with root package name */
        public String f6234b = "";

        public final f a() {
            f fVar = new f();
            fVar.f6231a = this.f6233a;
            fVar.f6232b = this.f6234b;
            return fVar;
        }
    }

    public static a a() {
        return new a();
    }

    public final String toString() {
        return androidx.appcompat.view.menu.d.d("Response Code: ", zzb.zzh(this.f6231a), ", Debug Message: ", this.f6232b);
    }
}
