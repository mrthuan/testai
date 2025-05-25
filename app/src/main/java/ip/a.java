package ip;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenStatus;

/* compiled from: ThirdImageOpenResult.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ThirdOpenStatus f18962a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ul.b> f18963b;

    public a(ThirdOpenStatus thirdOpenStatus, ArrayList arrayList) {
        g.e(thirdOpenStatus, ea.a.p("QHQqdAZz", "djrzdHB5"));
        this.f18962a = thirdOpenStatus;
        this.f18963b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f18962a == aVar.f18962a && g.a(this.f18963b, aVar.f18963b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f18962a.hashCode() * 31;
        List<ul.b> list = this.f18963b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ThirdImageOpenResult(status=" + this.f18962a + ", entity=" + this.f18963b + ")";
    }
}
