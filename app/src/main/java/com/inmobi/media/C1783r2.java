package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;

/* renamed from: com.inmobi.media.r2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1783r2 {

    /* renamed from: a  reason: collision with root package name */
    public final Config f15400a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1719m2 f15401b;

    public C1783r2(Config config, InterfaceC1719m2 interfaceC1719m2) {
        kotlin.jvm.internal.g.e(config, "config");
        this.f15400a = config;
        this.f15401b = interfaceC1719m2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1783r2)) {
            return false;
        }
        C1783r2 c1783r2 = (C1783r2) obj;
        if (kotlin.jvm.internal.g.a(this.f15400a, c1783r2.f15400a) && kotlin.jvm.internal.g.a(this.f15401b, c1783r2.f15401b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f15400a.hashCode() * 31;
        InterfaceC1719m2 interfaceC1719m2 = this.f15401b;
        if (interfaceC1719m2 == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC1719m2.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ConfigFetchInputs(config=" + this.f15400a + ", listener=" + this.f15401b + ')';
    }
}
