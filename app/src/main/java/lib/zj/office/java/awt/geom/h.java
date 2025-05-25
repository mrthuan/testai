package lib.zj.office.java.awt.geom;

import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;

/* compiled from: Edge.java */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final e f20759a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20760b;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public double f20761d;

    /* renamed from: e  reason: collision with root package name */
    public int f20762e;

    /* renamed from: f  reason: collision with root package name */
    public h f20763f;

    /* renamed from: g  reason: collision with root package name */
    public int f20764g;

    /* renamed from: h  reason: collision with root package name */
    public double f20765h;

    public h(e eVar, int i10) {
        this.f20759a = eVar;
        this.f20760b = i10;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Edge[");
        sb2.append(this.f20759a);
        sb2.append(", ");
        if (this.f20760b == 0) {
            str = "L";
        } else {
            str = "R";
        }
        sb2.append(str);
        sb2.append(", ");
        int i10 = this.c;
        if (i10 == 1) {
            str2 = "I";
        } else if (i10 == -1) {
            str2 = PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE;
        } else {
            str2 = "N";
        }
        return androidx.activity.r.g(sb2, str2, "]");
    }
}
