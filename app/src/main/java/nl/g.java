package nl;

import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;

/* compiled from: ToolsOperateResult.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ToolsType f22605a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22606b;

    public g(ToolsType toolsType, String str) {
        kotlin.jvm.internal.g.e(toolsType, ea.a.p("F3kSZQ==", "tUcboLyH"));
        ea.a.p("P2FFaA==", "kKsGzbyB");
        this.f22605a = toolsType;
        this.f22606b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f22605a == gVar.f22605a && kotlin.jvm.internal.g.a(this.f22606b, gVar.f22606b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22606b.hashCode() + (this.f22605a.hashCode() * 31);
    }

    public final String toString() {
        return "ToolsOperateResult(type=" + this.f22605a + ", path=" + this.f22606b + ")";
    }
}
