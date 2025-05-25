package po;

import android.os.Bundle;
import kotlin.jvm.internal.g;

/* compiled from: DialogChainDismissInfo.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f28988a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f28989b;

    public b(a aVar) {
        g.e(aVar, ea.a.p("LGhQaW4=", "CYnuoQVU"));
        this.f28988a = aVar;
        this.f28989b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (g.a(this.f28988a, bVar.f28988a) && g.a(this.f28989b, bVar.f28989b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f28988a.hashCode() * 31;
        Bundle bundle = this.f28989b;
        if (bundle == null) {
            hashCode = 0;
        } else {
            hashCode = bundle.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "DialogChainDismissInfo(chain=" + this.f28988a + ", bundle=" + this.f28989b + ")";
    }
}
