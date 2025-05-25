package w6;

import android.content.Context;
import androidx.activity.r;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f30981a;

    /* renamed from: b  reason: collision with root package name */
    public final e7.a f30982b;
    public final e7.a c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30983d;

    public b(Context context, e7.a aVar, e7.a aVar2, String str) {
        if (context != null) {
            this.f30981a = context;
            if (aVar != null) {
                this.f30982b = aVar;
                if (aVar2 != null) {
                    this.c = aVar2;
                    if (str != null) {
                        this.f30983d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // w6.f
    public final Context a() {
        return this.f30981a;
    }

    @Override // w6.f
    public final String b() {
        return this.f30983d;
    }

    @Override // w6.f
    public final e7.a c() {
        return this.c;
    }

    @Override // w6.f
    public final e7.a d() {
        return this.f30982b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f30981a.equals(fVar.a()) && this.f30982b.equals(fVar.d()) && this.c.equals(fVar.c()) && this.f30983d.equals(fVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f30981a.hashCode() ^ 1000003) * 1000003) ^ this.f30982b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f30983d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f30981a);
        sb2.append(", wallClock=");
        sb2.append(this.f30982b);
        sb2.append(", monotonicClock=");
        sb2.append(this.c);
        sb2.append(", backendName=");
        return r.g(sb2, this.f30983d, "}");
    }
}
