package oa;

import oa.d0;

/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* loaded from: classes2.dex */
public final class a0 extends d0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f22891a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22892b;
    public final boolean c;

    public a0(String str, String str2, boolean z10) {
        if (str != null) {
            this.f22891a = str;
            if (str2 != null) {
                this.f22892b = str2;
                this.c = z10;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override // oa.d0.c
    public final boolean a() {
        return this.c;
    }

    @Override // oa.d0.c
    public final String b() {
        return this.f22892b;
    }

    @Override // oa.d0.c
    public final String c() {
        return this.f22891a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.c)) {
            return false;
        }
        d0.c cVar = (d0.c) obj;
        if (this.f22891a.equals(cVar.c()) && this.f22892b.equals(cVar.b()) && this.c == cVar.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((this.f22891a.hashCode() ^ 1000003) * 1000003) ^ this.f22892b.hashCode()) * 1000003;
        if (this.c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f22891a + ", osCodeName=" + this.f22892b + ", isRooted=" + this.c + "}";
    }
}
