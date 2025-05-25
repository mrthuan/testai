package jm;

import kotlin.jvm.internal.g;

/* compiled from: AIResultData.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19317a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19318b;
    public final Integer c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f19319d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f19320e;

    /* renamed from: f  reason: collision with root package name */
    public final Boolean f19321f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f19322g;

    public /* synthetic */ d(boolean z10, String str, Integer num, Boolean bool, int i10) {
        this(z10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : num, null, null, (i10 & 32) != 0 ? null : bool, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f19317a == dVar.f19317a && g.a(this.f19318b, dVar.f19318b) && g.a(this.c, dVar.c) && g.a(this.f19319d, dVar.f19319d) && g.a(this.f19320e, dVar.f19320e) && g.a(this.f19321f, dVar.f19321f) && g.a(this.f19322g, dVar.f19322g)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        boolean z10 = this.f19317a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        int i11 = 0;
        String str = this.f19318b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        Integer num = this.c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num2 = this.f19319d;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Integer num3 = this.f19320e;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Boolean bool = this.f19321f;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        Integer num4 = this.f19322g;
        if (num4 != null) {
            i11 = num4.hashCode();
        }
        return i16 + i11;
    }

    public final String toString() {
        return "AIResultData(isCanceled=" + this.f19317a + ", answerMsg=" + this.f19318b + ", type=" + this.c + ", width=" + this.f19319d + ", height=" + this.f19320e + ", isEmptyAnswer=" + this.f19321f + ", handlePct=" + this.f19322g + ")";
    }

    public d(boolean z10, String str, Integer num, Integer num2, Integer num3, Boolean bool, Integer num4) {
        this.f19317a = z10;
        this.f19318b = str;
        this.c = num;
        this.f19319d = num2;
        this.f19320e = num3;
        this.f19321f = bool;
        this.f19322g = num4;
    }
}
