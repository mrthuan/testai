package sn;

import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.l;

/* compiled from: PdfResManager.java */
/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29827a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f29828b;
    public final /* synthetic */ ArrayList c;

    public c(int i10, l lVar, ArrayList arrayList) {
        this.f29827a = i10;
        this.f29828b = lVar;
        this.c = arrayList;
    }

    @Override // sn.a
    public final void a(Exception exc) {
        this.c.add(exc);
    }

    @Override // sn.a
    public final void b(String str) {
        b bVar;
        if (this.f29827a == 0 && (bVar = this.f29828b) != null) {
            bVar.a();
        }
    }

    @Override // sn.a
    public final void c(String str) {
    }
}
