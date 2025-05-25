package androidx.privacysandbox.ads.adservices.java.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.k;
import c7.e;
import c7.i;
import c7.p;
import com.facebook.internal.f;
import com.google.android.datatransport.Priority;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.tasks.OnCanceledListener;
import com.tom_roush.fontbox.ttf.NamingTable;
import d7.a;
import h5.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;
import jl.a;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.x;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.ads.d;
import pdf.pdfreader.viewer.editor.free.ads.n;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustFilterViewHolder;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g0;
import ud.m;
import v5.g;
import v6.h;
import v6.s;
import x0.s0;
import x0.u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements g.a, p.a, OnPaidEventListener, x, dn.b, CropImageView.b, xn.a, a.d, OnCanceledListener, a.InterfaceC0194a, a.e, u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f4150a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4151b;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.f4150a = obj;
        this.f4151b = obj2;
    }

    @Override // jl.a.d
    public void B(boolean z10) {
        OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) this.f4150a;
        Bundle bundle = (Bundle) this.f4151b;
        String str = OfficeReaderActivity.D2;
        kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("F2hecxYw", "lFc72UkU"));
        if (z10) {
            officeReaderActivity.P2(bundle);
        } else {
            officeReaderActivity.s2();
        }
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void a(AdValue adValue) {
        String str;
        ResponseInfo responseInfo;
        Context context = (Context) this.f4150a;
        m this$0 = (m) this.f4151b;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        String str2 = this$0.f30341k;
        NativeAd nativeAd = this$0.f30335e;
        if (nativeAd != null && (responseInfo = nativeAd.getResponseInfo()) != null) {
            str = responseInfo.a();
        } else {
            str = null;
        }
        wd.a.d(context, adValue, str2, str, this$0.f30333b, this$0.f30340j);
    }

    @Override // c7.p.a
    public Object apply(Object obj) {
        Priority[] values;
        p pVar = (p) this.f4150a;
        s sVar = (s) this.f4151b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        e eVar = pVar.f5656d;
        ArrayList j10 = pVar.j(sQLiteDatabase, sVar, eVar.c());
        for (Priority priority : Priority.values()) {
            if (priority != sVar.d()) {
                int c = eVar.c() - j10.size();
                if (c <= 0) {
                    break;
                }
                j10.addAll(pVar.j(sQLiteDatabase, sVar.e(priority), c));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < j10.size(); i10++) {
            sb2.append(((i) j10.get(i10)).b());
            if (i10 < j10.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        p.l(sQLiteDatabase.query("event_metadata", new String[]{"event_id", NamingTable.TAG, "value"}, sb2.toString(), null, null, null, null), new androidx.appcompat.libconvert.a(hashMap, 4));
        ListIterator listIterator = j10.listIterator();
        while (listIterator.hasNext()) {
            i iVar = (i) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(iVar.b()))) {
                h.a i11 = iVar.a().i();
                for (p.b bVar : (Set) hashMap.get(Long.valueOf(iVar.b()))) {
                    i11.a(bVar.f5658a, bVar.f5659b);
                }
                listIterator.set(new c7.b(iVar.b(), iVar.c(), i11.b()));
            }
        }
        return j10;
    }

    @Override // pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView.b
    public void b() {
        ImageAdjustFilterViewHolder imageAdjustFilterViewHolder = (ImageAdjustFilterViewHolder) this.f4150a;
        ul.b bVar = (ul.b) this.f4151b;
        int i10 = ImageAdjustFilterViewHolder.f25658f;
        kotlin.jvm.internal.g.e(imageAdjustFilterViewHolder, ea.a.p("O2hYc10w", "MzjN6bIF"));
        kotlin.jvm.internal.g.e(bVar, ea.a.p("F2kmYRRl", "u0teDbe6"));
        imageAdjustFilterViewHolder.f25661e.a(bVar);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void c() {
        ((h5.m) this.f4150a).getClass();
        h5.m.f();
        ((m.a) this.f4151b).h(null);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.e
    public void d(Dialog dialog) {
        Activity activity = (Activity) this.f4150a;
        cg.a aVar = (cg.a) this.f4151b;
        n nVar = n.f23972a;
        kotlin.jvm.internal.g.e(activity, ea.a.p("F2l0", "RtRtb5cK"));
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        n.f23972a.a();
        d.m().n(activity, null);
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // xn.a
    public void e() {
        tf.d dVar;
        OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) this.f4150a;
        OfficeReaderActivity officeReaderActivity2 = (OfficeReaderActivity) this.f4151b;
        String str = OfficeReaderActivity.D2;
        kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("BGhQc3Uw", "41p9QTPk"));
        kotlin.jvm.internal.g.e(officeReaderActivity2, ea.a.p("F2l0", "5dt6xM47"));
        g0 g0Var = officeReaderActivity.q1;
        if (g0Var != null) {
            g0Var.show();
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            PdfPreviewEntity pdfPreviewEntity = officeReaderActivity.N0;
            String str2 = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
            pdf.pdfreader.viewer.editor.free.utils.p.b(officeReaderActivity, ea.a.p("RWkudyxtDXJl", "lgw5gDAp"), ea.a.p("RWkudx5vEGUtZFF0CGk6XydsW2Nr", "UoNM0CCU"), pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity));
            g0 g0Var2 = new g0(officeReaderActivity2, officeReaderActivity.N0);
            g0Var2.show();
            officeReaderActivity.q1 = g0Var2;
        }
    }

    @Override // lib.zj.pdfeditor.x
    public void f(PDFReaderView pDFReaderView) {
        int i10 = PDFPageView.f21175y1;
        int i11 = ((PDFPageView) this.f4150a).c;
        RectF rectF = pDFReaderView.f21419u0;
        rectF.set((RectF) this.f4151b);
        pDFReaderView.f21425x0 = i11;
        pDFReaderView.postDelayed(new androidx.activity.i(rectF, 19), 1000L);
    }

    public void g() {
        boolean z10;
        f fVar = (f) this.f4150a;
        String appId = (String) this.f4151b;
        v5.b bVar = v5.b.f30651a;
        if (!k6.a.b(v5.b.class)) {
            try {
                kotlin.jvm.internal.g.e(appId, "$appId");
                boolean z11 = false;
                if (fVar != null && fVar.f9770f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                com.facebook.d dVar = com.facebook.d.f9685a;
                com.facebook.n nVar = com.facebook.n.f9847a;
                if (!k6.a.b(com.facebook.n.class)) {
                    com.facebook.n.f9847a.e();
                    z11 = com.facebook.n.f9852g.a();
                }
                if (z10 && z11) {
                    v5.b bVar2 = v5.b.f30651a;
                    bVar2.getClass();
                    if (!k6.a.b(bVar2) && !v5.b.f30657h) {
                        v5.b.f30657h = true;
                        com.facebook.d.c().execute(new k(appId, 4));
                    }
                }
            } catch (Throwable th2) {
                k6.a.a(v5.b.class, th2);
            }
        }
    }

    @Override // dn.b
    public void h(bn.a aVar, Bitmap bitmap, boolean z10) {
        WeakReference<Bitmap> weakReference;
        Bitmap bitmap2;
        Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = (Pdf2ImageBigPicPreviewActivity) this.f4150a;
        bn.a aVar2 = (bn.a) this.f4151b;
        Pdf2ImageBigPicPreviewActivity.a aVar3 = Pdf2ImageBigPicPreviewActivity.f25491w0;
        kotlin.jvm.internal.g.e(pdf2ImageBigPicPreviewActivity, ea.a.p("RmgecxMw", "Tw2w7RNM"));
        kotlin.jvm.internal.g.e(aVar2, ea.a.p("F2l0", "52LkIGfK"));
        Object tag = pdf2ImageBigPicPreviewActivity.Z2().f1315g.getTag();
        int i10 = aVar.f5491e;
        if (kotlin.jvm.internal.g.a(tag, "selectImage_" + i10)) {
            if (bitmap != null) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                aVar.a(width + ":" + height);
            }
            if (z10) {
                aVar.c = new WeakReference<>(bitmap);
            } else {
                aVar.f5489b = new WeakReference<>(bitmap);
            }
            com.bumptech.glide.f f10 = com.bumptech.glide.b.f(pdf2ImageBigPicPreviewActivity.Z2().f1315g.getContext());
            if (!pdf2ImageBigPicPreviewActivity.f25498s0 ? (weakReference = aVar2.f5489b) != null : (weakReference = aVar2.c) != null) {
                bitmap2 = weakReference.get();
            } else {
                bitmap2 = null;
            }
            f10.l(bitmap2).E(pdf2ImageBigPicPreviewActivity.Z2().f1315g);
        }
    }

    @Override // d7.a.InterfaceC0194a
    public Object l() {
        ((b7.e) this.f4150a).c.B((Iterable) this.f4151b);
        return null;
    }

    @Override // x0.u
    public s0 m(View view, s0 s0Var) {
        Window window = (Window) this.f4150a;
        PreviewAddTextDialog previewAddTextDialog = (PreviewAddTextDialog) this.f4151b;
        int i10 = PreviewAddTextDialog.f27451o;
        kotlin.jvm.internal.g.e(window, ea.a.p("anQeaUtfBXA4bHk=", "BGNv8dCq"));
        kotlin.jvm.internal.g.e(previewAddTextDialog, ea.a.p("O2hYc10w", "VKvs8zhQ"));
        kotlin.jvm.internal.g.e(view, ea.a.p("dg==", "EF2liLSk"));
        ea.a.p("Jm5CZQ1z", "yhbrprKf");
        o0.b a10 = s0Var.a(7);
        kotlin.jvm.internal.g.d(a10, ea.a.p("Wm44ZQdzTGcXdH1uGmUic2xXW24ibzRJtoDPQ19tG2FHLh95A2VMcwtzQGUEQjdyNygbKQ==", "Ti0kmAv4"));
        if (window.getContext().getResources().getConfiguration().orientation == 2) {
            view.setPadding(0, 0, 0, 0);
        } else {
            view.setPadding(a10.f22639a, 0, a10.c, 0);
        }
        previewAddTextDialog.p().f971d.setPadding(0, 0, 0, 0);
        return s0Var;
    }
}
