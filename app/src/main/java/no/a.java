package no;

import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ui.data.HomeToolsType;

/* compiled from: HomeToolsUnit.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f22609a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22610b;
    public final HomeToolsType c;

    public a(int i10, String str, HomeToolsType homeToolsType) {
        ea.a.p("R2k_bGU=", "IYOv58OS");
        g.e(homeToolsType, ea.a.p("R3k7ZQ==", "zwH158bZ"));
        this.f22609a = i10;
        this.f22610b = str;
        this.c = homeToolsType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f22609a == aVar.f22609a && g.a(this.f22610b, aVar.f22610b) && this.c == aVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.activity.f.h(this.f22610b, this.f22609a * 31, 31);
    }

    public final String toString() {
        return "HomeToolsUnit(icon=" + this.f22609a + ", title=" + this.f22610b + ", type=" + this.c + ")";
    }
}
