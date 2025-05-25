package lib.zj.pdfeditor;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import lib.zj.pdfeditor.ReaderView;

/* loaded from: classes3.dex */
public class PDFPageAdapter extends BaseAdapter {
    private final Context mContext;
    private ReaderPDFCore mCore;
    private int mCurrentIndex;
    private final d mFilePickerSupport;
    private og.a pageCallbacks;

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qg.b f21166a;

        public a(qg.b bVar) {
            this.f21166a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int count;
            long j10 = 0;
            int i10 = 0;
            long j11 = 0;
            while (true) {
                PDFPageAdapter pDFPageAdapter = PDFPageAdapter.this;
                if (i10 >= pDFPageAdapter.mCore.countPages()) {
                    break;
                }
                pDFPageAdapter.getRepository().c(i10, pDFPageAdapter.mCore.getPageSize(i10));
                ij.c b10 = pDFPageAdapter.getRepository().b(i10);
                j10 += b10.f18531d;
                j11 += b10.f18532e;
                i10++;
            }
            ReaderView.d dVar = (ReaderView.d) this.f21166a;
            ReaderView readerView = ReaderView.this;
            if (readerView.f21379a.getCount() == 1) {
                readerView.L = j11;
                readerView.M = j10;
            } else {
                long j12 = readerView.C * (count - 1);
                readerView.L = j11 + j12;
                readerView.M = j12 + j10;
            }
            readerView.post(new l0(dVar));
        }
    }

    /* loaded from: classes3.dex */
    public class b implements qg.j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f21168a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PDFPageView f21169b;
        public final /* synthetic */ int c;

        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ PointF f21171a;

            public a(PointF pointF) {
                this.f21171a = pointF;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                b bVar = b.this;
                PDFPageAdapter.this.getRepository().c(bVar.f21168a, this.f21171a);
                ij.c b10 = PDFPageAdapter.this.getRepository().b(bVar.f21168a);
                int page = bVar.f21169b.getPage();
                int i10 = bVar.f21168a;
                if (page == i10) {
                    PDFPageView pDFPageView = bVar.f21169b;
                    PointF pointF = new PointF(b10.f18531d, b10.f18532e);
                    float f10 = b10.c;
                    if (bVar.f21168a == bVar.c) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pDFPageView.O1(i10, pointF, f10, z10);
                }
            }
        }

        public b(int i10, PDFPageView pDFPageView, int i11) {
            this.f21168a = i10;
            this.f21169b = pDFPageView;
            this.c = i11;
        }

        public final void a(PointF pointF) {
            PDFPageAdapter pDFPageAdapter = PDFPageAdapter.this;
            try {
                if (pDFPageAdapter.mContext instanceof Activity) {
                    ((Activity) pDFPageAdapter.mContext).runOnUiThread(new a(pointF));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                aj.b a10 = pg.a.c().a();
                a10.getClass();
                aj.b.J(pDFPageAdapter.mContext, "PDFPageAdapter forResult e=" + e10.getMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f21173a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ qg.j f21174b;

        public c(int i10, qg.j jVar) {
            this.f21173a = i10;
            this.f21174b = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PDFPageAdapter pDFPageAdapter = PDFPageAdapter.this;
            try {
                PointF pageSize = pDFPageAdapter.mCore.getPageSize(this.f21173a);
                qg.j jVar = this.f21174b;
                if (jVar != null) {
                    ((b) jVar).a(pageSize);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                aj.b a10 = pg.a.c().a();
                a10.getClass();
                aj.b.J(pDFPageAdapter.mContext, "PDFPageAdapter syncGetPage e=" + e10.getMessage());
            }
        }
    }

    public PDFPageAdapter(Context context, d dVar, ReaderPDFCore readerPDFCore) {
        this.mContext = context;
        this.mFilePickerSupport = dVar;
        this.mCore = readerPDFCore;
    }

    private void syncGetPage(int i10, qg.j jVar) {
        ng.d.f22480a.execute(new c(i10, jVar));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mCore.countPages();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    public synchronized z getRepository() {
        return this.mCore.getRepository();
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        PDFPageView pDFPageView;
        boolean z10;
        if (view == null) {
            pDFPageView = new PDFPageView(this.mContext, this.mFilePickerSupport, this.mCore, new Point(viewGroup.getWidth(), viewGroup.getHeight()), this.pageCallbacks);
        } else {
            pDFPageView = (PDFPageView) view;
            pDFPageView.R0(i10);
        }
        ij.c b10 = getRepository().b(i10);
        if (b10 != null) {
            PointF pointF = new PointF(b10.f18531d, b10.f18532e);
            float f10 = b10.c;
            if (i10 == this.mCurrentIndex) {
                z10 = true;
            } else {
                z10 = false;
            }
            pDFPageView.O1(i10, pointF, f10, z10);
        } else {
            pDFPageView.R0(i10);
            syncGetPage(i10, new b(i10, pDFPageView, this.mCurrentIndex));
        }
        pDFPageView.v2(i10);
        pDFPageView.c = i10;
        return pDFPageView;
    }

    public void loadAllPageSizeIfNeed(int i10, qg.b bVar) {
        if (this.mCore.countPages() <= i10) {
            ng.d.f22480a.execute(new a(bVar));
        }
    }

    public void onMoveToChild(int i10) {
        this.mCurrentIndex = i10;
    }

    public void setNewCore(ReaderPDFCore readerPDFCore) {
        ReaderPDFCore readerPDFCore2 = this.mCore;
        if (readerPDFCore2 != null) {
            readerPDFCore2.stopTextExecutor();
        }
        this.mCore = readerPDFCore;
    }

    public void setPageCallbacks(og.a aVar) {
        this.pageCallbacks = aVar;
    }
}
