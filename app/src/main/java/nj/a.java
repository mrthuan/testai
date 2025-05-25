package nj;

import android.app.Activity;
import android.content.Context;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import qg.g;

/* compiled from: ContextHolder.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f22497a;

    /* renamed from: b  reason: collision with root package name */
    public g f22498b;
    public int c = 0;

    /* compiled from: ContextHolder.java */
    /* renamed from: nj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0300a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f22499a = new a();
    }

    public final void a() {
        g gVar = this.f22498b;
        if (gVar != null) {
            ReaderPdfApplication readerPdfApplication = (ReaderPdfApplication) gVar;
            Activity l10 = ReaderPdfApplication.l();
            if (l10 != null) {
                ReaderPdfApplication.o(l10);
            } else {
                ReaderPdfApplication.o(readerPdfApplication);
            }
        }
    }
}
