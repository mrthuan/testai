package tf;

import kotlin.jvm.internal.g;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: KotlinVersion.kt */
/* loaded from: classes.dex */
public final class b implements Comparable<b> {

    /* renamed from: e  reason: collision with root package name */
    public static final b f30005e = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f30006a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final int f30007b = 9;
    public final int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f30008d;

    public b() {
        boolean z10 = true;
        if ((new hg.c(0, FunctionEval.FunctionID.EXTERNAL_FUNC).b(1) && new hg.c(0, FunctionEval.FunctionID.EXTERNAL_FUNC).b(9) && new hg.c(0, FunctionEval.FunctionID.EXTERNAL_FUNC).b(0)) ? z10 : false) {
            this.f30008d = 67840;
            return;
        }
        throw new IllegalArgumentException("Version components are out of range: 1.9.0".toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        b other = bVar;
        g.e(other, "other");
        return this.f30008d - other.f30008d;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            bVar = (b) obj;
        } else {
            bVar = null;
        }
        if (bVar != null && this.f30008d == bVar.f30008d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30008d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30006a);
        sb2.append('.');
        sb2.append(this.f30007b);
        sb2.append('.');
        sb2.append(this.c);
        return sb2.toString();
    }
}
