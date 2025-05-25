package com.bykv.vk.openvk.preload.a;

/* compiled from: JsonObject.java */
/* loaded from: classes.dex */
public final class n extends k {

    /* renamed from: a  reason: collision with root package name */
    public final com.bykv.vk.openvk.preload.a.b.h<String, k> f7445a = new com.bykv.vk.openvk.preload.a.b.h<>();

    public final void a(String str, k kVar) {
        com.bykv.vk.openvk.preload.a.b.h<String, k> hVar = this.f7445a;
        if (kVar == null) {
            kVar = m.f7444a;
        }
        hVar.put(str, kVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof n) || !((n) obj).f7445a.equals(this.f7445a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7445a.hashCode();
    }
}
