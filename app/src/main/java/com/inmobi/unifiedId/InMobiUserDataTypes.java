package com.inmobi.unifiedId;

import androidx.activity.r;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class InMobiUserDataTypes {

    /* renamed from: a  reason: collision with root package name */
    public final String f15721a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15722b;
    public final String c;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f15723a;

        /* renamed from: b  reason: collision with root package name */
        public String f15724b;
        public String c;

        public final InMobiUserDataTypes build() {
            return new InMobiUserDataTypes(this.f15723a, this.f15724b, this.c);
        }

        public final Builder md5(String str) {
            this.f15723a = str;
            return this;
        }

        public final Builder sha1(String str) {
            this.f15724b = str;
            return this;
        }

        public final Builder sha256(String str) {
            this.c = str;
            return this;
        }
    }

    public InMobiUserDataTypes(String str, String str2, String str3) {
        this.f15721a = str;
        this.f15722b = str2;
        this.c = str3;
    }

    public static /* synthetic */ InMobiUserDataTypes copy$default(InMobiUserDataTypes inMobiUserDataTypes, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inMobiUserDataTypes.f15721a;
        }
        if ((i10 & 2) != 0) {
            str2 = inMobiUserDataTypes.f15722b;
        }
        if ((i10 & 4) != 0) {
            str3 = inMobiUserDataTypes.c;
        }
        return inMobiUserDataTypes.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f15721a;
    }

    public final String component2() {
        return this.f15722b;
    }

    public final String component3() {
        return this.c;
    }

    public final InMobiUserDataTypes copy(String str, String str2, String str3) {
        return new InMobiUserDataTypes(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataTypes)) {
            return false;
        }
        InMobiUserDataTypes inMobiUserDataTypes = (InMobiUserDataTypes) obj;
        if (g.a(this.f15721a, inMobiUserDataTypes.f15721a) && g.a(this.f15722b, inMobiUserDataTypes.f15722b) && g.a(this.c, inMobiUserDataTypes.c)) {
            return true;
        }
        return false;
    }

    public final String getMd5() {
        return this.f15721a;
    }

    public final String getSha1() {
        return this.f15722b;
    }

    public final String getSha256() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f15721a;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.f15722b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InMobiUserDataTypes(md5=");
        sb2.append(this.f15721a);
        sb2.append(", sha1=");
        sb2.append(this.f15722b);
        sb2.append(", sha256=");
        return r.f(sb2, this.c, ')');
    }
}
