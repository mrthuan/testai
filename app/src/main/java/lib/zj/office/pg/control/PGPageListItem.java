package lib.zj.office.pg.control;

import android.graphics.Canvas;
import android.os.AsyncTask;
import android.widget.ProgressBar;
import lib.zj.office.system.beans.pagelist.APageListItem;
import lib.zj.office.system.beans.pagelist.APageListView;
import lib.zj.office.system.f;
import rh.e;
import th.c;
import th.d;

/* loaded from: classes3.dex */
public class PGPageListItem extends APageListItem {

    /* renamed from: h  reason: collision with root package name */
    public ProgressBar f20906h;

    /* renamed from: i  reason: collision with root package name */
    public final c f20907i;

    /* renamed from: j  reason: collision with root package name */
    public final e f20908j;

    /* loaded from: classes3.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            while (true) {
                PGPageListItem pGPageListItem = PGPageListItem.this;
                c cVar = pGPageListItem.f20907i;
                if (cVar != null && pGPageListItem.f20997a >= cVar.c()) {
                    try {
                        Thread.sleep(200L);
                    } catch (Exception unused) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r4) {
            PGPageListItem pGPageListItem = PGPageListItem.this;
            ProgressBar progressBar = pGPageListItem.f20906h;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            pGPageListItem.postInvalidate();
            APageListView aPageListView = pGPageListItem.f20999d;
            if (aPageListView != null) {
                if (pGPageListItem.f20997a == aPageListView.getCurrentPageNumber() - 1) {
                    aPageListView.b(aPageListView.getCurrentPageView());
                }
                pGPageListItem.f21000e = false;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            PGPageListItem pGPageListItem = PGPageListItem.this;
            ProgressBar progressBar = pGPageListItem.f20906h;
            if (progressBar == null) {
                pGPageListItem.f20906h = new ProgressBar(pGPageListItem.getContext());
                pGPageListItem.f20906h.setIndeterminate(true);
                pGPageListItem.f20906h.setBackgroundResource(17301612);
                pGPageListItem.addView(pGPageListItem.f20906h);
                pGPageListItem.f20906h.setVisibility(0);
                return;
            }
            progressBar.setVisibility(0);
        }
    }

    public PGPageListItem(APageListView aPageListView, f fVar, e eVar, int i10, int i11) {
        super(aPageListView, i10, i11);
        this.f21001f = fVar;
        this.f20907i = (c) aPageListView.getModel();
        this.f20908j = eVar;
        setBackgroundColor(-1);
    }

    @Override // lib.zj.office.system.beans.pagelist.APageListItem
    public final void b() {
        postInvalidate();
        this.f20999d.b(this);
    }

    @Override // lib.zj.office.system.beans.pagelist.APageListItem
    public final void e() {
        super.e();
        vh.a g10 = vh.a.g();
        d d10 = this.f20907i.d(this.f20997a);
        g10.getClass();
        vh.a.a(d10);
    }

    @Override // lib.zj.office.system.beans.pagelist.APageListItem
    public final void g(int i10, int i11, int i12) {
        super.g(i10, i11, i12);
        if (this.f20997a >= this.f20907i.c()) {
            new a().execute(new Void[1]);
            return;
        }
        APageListView aPageListView = this.f20999d;
        if (((int) (aPageListView.getZoom() * 100.0f)) == 100 || (this.f21000e && i10 == 0)) {
            aPageListView.b(this);
        }
        this.f21000e = false;
        ProgressBar progressBar = this.f20906h;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        d d10 = this.f20907i.d(this.f20997a);
        if (d10 != null) {
            vh.a.g().d(canvas, this.f20907i, this.f20908j, d10, this.f20999d.getZoom(), null);
        }
    }

    @Override // lib.zj.office.system.beans.pagelist.APageListItem, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        if (this.f20906h != null) {
            APageListView aPageListView = this.f20999d;
            if (i16 > aPageListView.getWidth()) {
                i14 = ((aPageListView.getWidth() - 60) / 2) - i10;
            } else {
                i14 = (i16 - 60) / 2;
            }
            if (i17 > aPageListView.getHeight()) {
                i15 = ((aPageListView.getHeight() - 60) / 2) - i11;
            } else {
                i15 = (i17 - 60) / 2;
            }
            this.f20906h.layout(i14, i15, i14 + 60, i15 + 60);
        }
    }

    @Override // lib.zj.office.system.beans.pagelist.APageListItem
    public final void c() {
    }

    @Override // lib.zj.office.system.beans.pagelist.APageListItem
    public final void f() {
    }
}
