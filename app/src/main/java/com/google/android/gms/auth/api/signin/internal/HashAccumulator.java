package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class HashAccumulator {

    /* renamed from: a  reason: collision with root package name */
    public int f10828a = 1;

    @KeepForSdk
    public final void a(Object obj) {
        int hashCode;
        int i10 = this.f10828a * 31;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.f10828a = i10 + hashCode;
    }
}
