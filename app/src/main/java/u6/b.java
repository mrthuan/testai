package u6;

import androidx.activity.r;

/* compiled from: AutoValue_AndroidClientInfo.java */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f30230a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30231b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30232d;

    /* renamed from: e  reason: collision with root package name */
    public final String f30233e;

    /* renamed from: f  reason: collision with root package name */
    public final String f30234f;

    /* renamed from: g  reason: collision with root package name */
    public final String f30235g;

    /* renamed from: h  reason: collision with root package name */
    public final String f30236h;

    /* renamed from: i  reason: collision with root package name */
    public final String f30237i;

    /* renamed from: j  reason: collision with root package name */
    public final String f30238j;

    /* renamed from: k  reason: collision with root package name */
    public final String f30239k;

    /* renamed from: l  reason: collision with root package name */
    public final String f30240l;

    public b(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f30230a = num;
        this.f30231b = str;
        this.c = str2;
        this.f30232d = str3;
        this.f30233e = str4;
        this.f30234f = str5;
        this.f30235g = str6;
        this.f30236h = str7;
        this.f30237i = str8;
        this.f30238j = str9;
        this.f30239k = str10;
        this.f30240l = str11;
    }

    @Override // u6.a
    public final String a() {
        return this.f30240l;
    }

    @Override // u6.a
    public final String b() {
        return this.f30238j;
    }

    @Override // u6.a
    public final String c() {
        return this.f30232d;
    }

    @Override // u6.a
    public final String d() {
        return this.f30236h;
    }

    @Override // u6.a
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f30230a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.f30231b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.f30232d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f30233e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f30234f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.f30235g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f30236h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.f30237i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.f30238j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.f30239k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.f30240l;
                                                    if (str11 == null) {
                                                        if (aVar.a() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.a())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // u6.a
    public final String f() {
        return this.f30237i;
    }

    @Override // u6.a
    public final String g() {
        return this.f30235g;
    }

    @Override // u6.a
    public final String h() {
        return this.f30239k;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int i10 = 0;
        Integer num = this.f30230a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str = this.f30231b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str2 = this.c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str3 = this.f30232d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        String str4 = this.f30233e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        String str5 = this.f30234f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i16 = (i15 ^ hashCode6) * 1000003;
        String str6 = this.f30235g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i17 = (i16 ^ hashCode7) * 1000003;
        String str7 = this.f30236h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i18 = (i17 ^ hashCode8) * 1000003;
        String str8 = this.f30237i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i19 = (i18 ^ hashCode9) * 1000003;
        String str9 = this.f30238j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i20 = (i19 ^ hashCode10) * 1000003;
        String str10 = this.f30239k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i21 = (i20 ^ hashCode11) * 1000003;
        String str11 = this.f30240l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return i10 ^ i21;
    }

    @Override // u6.a
    public final String i() {
        return this.f30231b;
    }

    @Override // u6.a
    public final String j() {
        return this.f30234f;
    }

    @Override // u6.a
    public final String k() {
        return this.f30233e;
    }

    @Override // u6.a
    public final Integer l() {
        return this.f30230a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f30230a);
        sb2.append(", model=");
        sb2.append(this.f30231b);
        sb2.append(", hardware=");
        sb2.append(this.c);
        sb2.append(", device=");
        sb2.append(this.f30232d);
        sb2.append(", product=");
        sb2.append(this.f30233e);
        sb2.append(", osBuild=");
        sb2.append(this.f30234f);
        sb2.append(", manufacturer=");
        sb2.append(this.f30235g);
        sb2.append(", fingerprint=");
        sb2.append(this.f30236h);
        sb2.append(", locale=");
        sb2.append(this.f30237i);
        sb2.append(", country=");
        sb2.append(this.f30238j);
        sb2.append(", mccMnc=");
        sb2.append(this.f30239k);
        sb2.append(", applicationBuild=");
        return r.g(sb2, this.f30240l, "}");
    }
}
