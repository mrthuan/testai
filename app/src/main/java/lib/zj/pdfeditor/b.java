package lib.zj.pdfeditor;

import android.graphics.Bitmap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: CancellableAsyncTask.java */
/* loaded from: classes3.dex */
public class b<Params, Result> {

    /* renamed from: a  reason: collision with root package name */
    public final a f21464a;

    /* renamed from: b  reason: collision with root package name */
    public final c<Params, Result> f21465b;

    /* compiled from: CancellableAsyncTask.java */
    /* loaded from: classes3.dex */
    public class a extends AsyncTask<Params, Void, Result> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ c f21466i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Bitmap f21467j;

        public a(c cVar, Bitmap bitmap) {
            this.f21466i = cVar;
            this.f21467j = bitmap;
        }

        @Override // lib.zj.pdfeditor.AsyncTask
        public final Result b(Params... paramsArr) {
            h hVar = (h) this.f21466i;
            return (Result) hVar.a(hVar.f21498a, paramsArr);
        }

        @Override // lib.zj.pdfeditor.AsyncTask
        public final void e(Result result) {
            Bitmap bitmap;
            nj.b.a();
            h hVar = (h) this.f21466i;
            if (hVar.f21498a != null) {
                hVar.f21498a = null;
            }
            Bitmap bitmap2 = this.f21467j;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                pg.a.c().a().getClass();
                aj.b.K("onCancelled recycle bitmap " + bitmap2.getWidth() + " " + bitmap2.getHeight());
                bitmap2.recycle();
            }
            if ((result instanceof oj.b) && (bitmap = ((oj.b) result).f23101b) != null && !bitmap.isRecycled()) {
                pg.a.c().a().getClass();
                aj.b.K("onCancelled recycle reflowBitmap " + bitmap.getWidth() + " " + bitmap.getHeight());
                bitmap.recycle();
            }
        }

        @Override // lib.zj.pdfeditor.AsyncTask
        public final void f(Result result) {
            nj.b.a();
            b.this.c(result);
            h hVar = (h) this.f21466i;
            if (hVar.f21498a != null) {
                hVar.f21498a = null;
            }
        }

        @Override // lib.zj.pdfeditor.AsyncTask
        public final void g() {
            nj.b.a();
            b.this.d();
        }
    }

    public b(c<Params, Result> cVar, Bitmap bitmap) {
        if (cVar != null) {
            this.f21465b = cVar;
            this.f21464a = new a(cVar, bitmap);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void a() {
        a aVar = this.f21464a;
        aVar.a();
        ReaderPDFCore.Cookie cookie = ((h) this.f21465b).f21498a;
        if (cookie != null) {
            cookie.a();
        }
        try {
            aVar.f21142b.get();
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
        }
    }

    public final void b(Params... paramsArr) {
        this.f21464a.c(paramsArr);
    }

    public void c(Result result) {
        throw null;
    }

    public void d() {
    }
}
