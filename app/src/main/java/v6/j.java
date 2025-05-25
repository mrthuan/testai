package v6;

import com.google.android.datatransport.Priority;
import java.util.Arrays;
import v6.s;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes.dex */
public final class j extends s {

    /* renamed from: a  reason: collision with root package name */
    public final String f30711a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f30712b;
    public final Priority c;

    /* compiled from: AutoValue_TransportContext.java */
    /* loaded from: classes.dex */
    public static final class a extends s.a {

        /* renamed from: a  reason: collision with root package name */
        public String f30713a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f30714b;
        public Priority c;

        public final j a() {
            String str;
            if (this.f30713a == null) {
                str = " backendName";
            } else {
                str = "";
            }
            if (this.c == null) {
                str = str.concat(" priority");
            }
            if (str.isEmpty()) {
                return new j(this.f30713a, this.f30714b, this.c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(String str) {
            if (str != null) {
                this.f30713a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public final a c(Priority priority) {
            if (priority != null) {
                this.c = priority;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public j(String str, byte[] bArr, Priority priority) {
        this.f30711a = str;
        this.f30712b = bArr;
        this.c = priority;
    }

    @Override // v6.s
    public final String b() {
        return this.f30711a;
    }

    @Override // v6.s
    public final byte[] c() {
        return this.f30712b;
    }

    @Override // v6.s
    public final Priority d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        byte[] c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f30711a.equals(sVar.b())) {
            if (sVar instanceof j) {
                c = ((j) sVar).f30712b;
            } else {
                c = sVar.c();
            }
            if (Arrays.equals(this.f30712b, c) && this.c.equals(sVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f30711a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f30712b)) * 1000003) ^ this.c.hashCode();
    }
}
