package lib.zj.pdfeditor;

import java.util.Objects;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: PDFCancellableTaskDefinition.java */
/* loaded from: classes3.dex */
public abstract class h<Params, Result> implements c<Params, Result> {

    /* renamed from: a  reason: collision with root package name */
    public ReaderPDFCore.Cookie f21498a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21499b;

    public h(int i10, ReaderPDFCore readerPDFCore) {
        this.f21499b = i10;
        try {
            Objects.requireNonNull(readerPDFCore);
            this.f21498a = new ReaderPDFCore.Cookie();
        } catch (RuntimeException unused) {
            pg.a.c().a().getClass();
            aj.b.K("PDFCancellableTaskDefinition cookie init error");
        }
    }

    public abstract Result a(ReaderPDFCore.Cookie cookie, Params... paramsArr);
}
