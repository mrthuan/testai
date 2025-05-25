package wk;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: SubscriberMethod.java */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Method f31340a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadMode f31341b;
    public final Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31342d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f31343e;

    /* renamed from: f  reason: collision with root package name */
    public String f31344f;

    public k(Method method, Class<?> cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f31340a = method;
        this.f31341b = threadMode;
        this.c = cls;
        this.f31342d = i10;
        this.f31343e = z10;
    }

    public final synchronized void a() {
        if (this.f31344f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f31340a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f31340a.getName());
            sb2.append('(');
            sb2.append(this.c.getName());
            this.f31344f = sb2.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            a();
            k kVar = (k) obj;
            kVar.a();
            return this.f31344f.equals(kVar.f31344f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31340a.hashCode();
    }
}
