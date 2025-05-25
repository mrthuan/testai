package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: NavigateUtil.java */
/* loaded from: classes3.dex */
public final class j0 implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h0 f28712a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f28713b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28714d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f28715e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f28716f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f28717g;

    public j0(int i10, Context context, String str, String str2, PdfPreviewEntity pdfPreviewEntity, androidx.privacysandbox.ads.adservices.topics.d dVar, boolean z10) {
        this.f28712a = dVar;
        this.f28713b = context;
        this.c = str;
        this.f28714d = pdfPreviewEntity;
        this.f28715e = z10;
        this.f28716f = i10;
        this.f28717g = str2;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.x
    public final void a() {
        h0 h0Var = this.f28712a;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.x
    public final void g() {
        h0 h0Var = this.f28712a;
        if (h0Var != null) {
            h0Var.e();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.x
    public final void h() {
        h0 h0Var = this.f28712a;
        if (h0Var != null) {
            h0Var.c();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.x
    public final void i(String str, boolean z10) {
        if (z10) {
            k0.d(this.f28713b, this.c, this.f28714d, this.f28715e, this.f28716f, str, this.f28717g, this.f28712a);
        } else {
            k0.d(this.f28713b, this.c, this.f28714d, this.f28715e, this.f28716f, "", this.f28717g, this.f28712a);
        }
    }
}
