package yd;

import androidx.activity.f;
import kotlin.jvm.internal.g;

/* compiled from: AdInfo.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f32119a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32120b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public b f32121d;

    public d(String str, String str2, String adID) {
        g.e(adID, "adID");
        this.f32119a = str;
        this.f32120b = str2;
        this.c = adID;
        this.f32121d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (g.a(this.f32119a, dVar.f32119a) && g.a(this.f32120b, dVar.f32120b) && g.a(this.c, dVar.c) && g.a(this.f32121d, dVar.f32121d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int h10 = f.h(this.c, f.h(this.f32120b, this.f32119a.hashCode() * 31, 31), 31);
        b bVar = this.f32121d;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        return h10 + hashCode;
    }

    public final String toString() {
        return "AdInfo(adSource=" + this.f32119a + ", adType=" + this.f32120b + ", adID=" + this.c + ", adOrder=" + this.f32121d + ')';
    }
}
