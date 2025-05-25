package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* loaded from: classes2.dex */
public final class v extends b0.e.AbstractC0316e {

    /* renamed from: a  reason: collision with root package name */
    public final int f23030a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23031b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f23032d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    /* loaded from: classes2.dex */
    public static final class a extends b0.e.AbstractC0316e.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f23033a;

        /* renamed from: b  reason: collision with root package name */
        public String f23034b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f23035d;

        public final v a() {
            String str;
            if (this.f23033a == null) {
                str = " platform";
            } else {
                str = "";
            }
            if (this.f23034b == null) {
                str = str.concat(" version");
            }
            if (this.c == null) {
                str = a6.h.c(str, " buildVersion");
            }
            if (this.f23035d == null) {
                str = a6.h.c(str, " jailbroken");
            }
            if (str.isEmpty()) {
                return new v(this.f23033a.intValue(), this.f23034b, this.c, this.f23035d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public v(int i10, String str, String str2, boolean z10) {
        this.f23030a = i10;
        this.f23031b = str;
        this.c = str2;
        this.f23032d = z10;
    }

    @Override // oa.b0.e.AbstractC0316e
    public final String a() {
        return this.c;
    }

    @Override // oa.b0.e.AbstractC0316e
    public final int b() {
        return this.f23030a;
    }

    @Override // oa.b0.e.AbstractC0316e
    public final String c() {
        return this.f23031b;
    }

    @Override // oa.b0.e.AbstractC0316e
    public final boolean d() {
        return this.f23032d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.AbstractC0316e)) {
            return false;
        }
        b0.e.AbstractC0316e abstractC0316e = (b0.e.AbstractC0316e) obj;
        if (this.f23030a == abstractC0316e.b() && this.f23031b.equals(abstractC0316e.c()) && this.c.equals(abstractC0316e.a()) && this.f23032d == abstractC0316e.d()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f23030a ^ 1000003) * 1000003) ^ this.f23031b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (this.f23032d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f23030a + ", version=" + this.f23031b + ", buildVersion=" + this.c + ", jailbroken=" + this.f23032d + "}";
    }
}
