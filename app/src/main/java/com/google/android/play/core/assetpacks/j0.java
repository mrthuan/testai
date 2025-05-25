package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class j0 extends d {

    /* renamed from: a  reason: collision with root package name */
    public final long f13272a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f13273b;

    public j0(long j10, HashMap hashMap) {
        this.f13272a = j10;
        this.f13273b = hashMap;
    }

    @Override // com.google.android.play.core.assetpacks.d
    public final Map<String, AssetPackState> b() {
        return this.f13273b;
    }

    @Override // com.google.android.play.core.assetpacks.d
    public final long c() {
        return this.f13272a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f13272a == dVar.c() && this.f13273b.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f13272a;
        return ((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f13273b.hashCode();
    }

    public final String toString() {
        String obj = this.f13273b.toString();
        return "AssetPackStates{totalBytes=" + this.f13272a + ", packStates=" + obj + "}";
    }
}
