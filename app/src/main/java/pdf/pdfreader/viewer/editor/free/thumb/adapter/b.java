package pdf.pdfreader.viewer.editor.free.thumb.adapter;

import kotlin.jvm.internal.g;

/* compiled from: ThumbEntity.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f26597a;

    /* renamed from: b  reason: collision with root package name */
    public int f26598b;

    public b(String str, int i10) {
        g.e(str, ea.a.p("EWgcbQlQKXRo", "wyeikH9x"));
        this.f26597a = str;
        this.f26598b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (g.a(this.f26597a, bVar.f26597a) && this.f26598b == bVar.f26598b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26597a.hashCode() * 31) + this.f26598b;
    }

    public final String toString() {
        int i10 = this.f26598b;
        return "ThumbEntity(thumbPath=" + this.f26597a + ", count=" + i10 + ")";
    }
}
