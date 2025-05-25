package com.bykv.vk.openvk.preload.a;

import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes.dex */
public final class p extends k {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7446a;

    public p(Boolean bool) {
        this.f7446a = com.bykv.vk.openvk.preload.a.b.a.a(bool);
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final Number a() {
        Object obj = this.f7446a;
        return obj instanceof String ? new com.bykv.vk.openvk.preload.a.b.g((String) obj) : (Number) obj;
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final String b() {
        Object obj = this.f7446a;
        if (obj instanceof Number) {
            return a().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final double c() {
        if (this.f7446a instanceof Number) {
            return a().doubleValue();
        }
        return Double.parseDouble(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final long d() {
        if (this.f7446a instanceof Number) {
            return a().longValue();
        }
        return Long.parseLong(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final int e() {
        if (this.f7446a instanceof Number) {
            return a().intValue();
        }
        return Integer.parseInt(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f7446a == null) {
            if (pVar.f7446a == null) {
                return true;
            }
            return false;
        } else if (a(this) && a(pVar)) {
            if (a().longValue() == pVar.a().longValue()) {
                return true;
            }
            return false;
        } else {
            Object obj2 = this.f7446a;
            if ((obj2 instanceof Number) && (pVar.f7446a instanceof Number)) {
                double doubleValue = a().doubleValue();
                double doubleValue2 = pVar.a().doubleValue();
                if (doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2))) {
                    return true;
                }
                return false;
            }
            return obj2.equals(pVar.f7446a);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final boolean f() {
        Object obj = this.f7446a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(b());
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.f7446a == null) {
            return 31;
        }
        if (a(this)) {
            doubleToLongBits = a().longValue();
        } else {
            Object obj = this.f7446a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(a().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    private static boolean a(p pVar) {
        Object obj = pVar.f7446a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    public p(Number number) {
        this.f7446a = com.bykv.vk.openvk.preload.a.b.a.a(number);
    }

    public p(String str) {
        this.f7446a = com.bykv.vk.openvk.preload.a.b.a.a(str);
    }
}
