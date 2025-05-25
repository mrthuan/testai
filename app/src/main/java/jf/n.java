package jf;

import androidx.activity.r;
import java.util.HashMap;

/* compiled from: Prop.java */
/* loaded from: classes.dex */
public final class n<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f19200a;

    public n(String str) {
        this.f19200a = str;
    }

    public final T a(o oVar) {
        T t4 = (T) oVar.f19201a.get(this);
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(this.f19200a);
    }

    public final void b(o oVar, T t4) {
        HashMap hashMap = oVar.f19201a;
        if (t4 == null) {
            hashMap.remove(this);
        } else {
            hashMap.put(this, t4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            return this.f19200a.equals(((n) obj).f19200a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19200a.hashCode();
    }

    public final String toString() {
        return r.g(new StringBuilder("Prop{name='"), this.f19200a, "'}");
    }
}
