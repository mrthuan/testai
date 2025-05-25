package a1;

import a1.i;
import android.content.ClipData;
import android.content.ClipDescription;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.lifecycle.w;
import c7.p;
import cg.l;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.K0;
import com.lib.flutter.encrypt.NativeAppGlobalApi;
import d7.a;
import db.a;
import gf.b;
import h5.m;
import io.flutter.plugins.pathprovider.Messages;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.x;
import ma.i0;
import ma.z;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;
import x0.c;
import x0.f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements h, androidx.activity.result.b, a.InterfaceC0194a, p.a, a.InterfaceC0196a, Continuation, OnSuccessListener, b.c, x, qg.h, x.a, pdf.pdfreader.viewer.editor.free.utils.extension.e, ro.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f17a = i10;
        this.f18b = obj;
    }

    public final boolean a(i iVar, int i10, Bundle bundle) {
        c.b c0401c;
        View view = (View) this.f18b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f21a.b();
                InputContentInfo d10 = d.d(iVar.f21a.d());
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", d10);
            } catch (Exception unused) {
            }
        }
        ClipDescription description = iVar.f21a.getDescription();
        i.c cVar = iVar.f21a;
        ClipData clipData = new ClipData(description, new ClipData.Item(cVar.a()));
        if (i11 >= 31) {
            c0401c = new c.a(clipData, 2);
        } else {
            c0401c = new c.C0401c(clipData, 2);
        }
        c0401c.a(cVar.c());
        c0401c.setExtras(bundle);
        if (f0.k(view, c0401c.build()) == null) {
            return true;
        }
        return false;
    }

    @Override // c7.p.a
    public final Object apply(Object obj) {
        p pVar = (p) this.f18b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s6.b bVar = p.f5653f;
        pVar.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + pVar.f5655b.a()).execute();
        return null;
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        m mVar = (m) this.f18b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        mVar.getClass();
        aVar.toString();
        m.f();
        int i10 = aVar.f1828a;
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 == 1) {
                    if (mVar.f18039e) {
                        mVar.f18039e = false;
                    }
                    if (mVar.f18040f) {
                        mVar.f18040f = false;
                        return;
                    }
                    return;
                }
                return;
            }
            if (mVar.f18039e) {
                mVar.f18039e = false;
                com.google.android.tools.d dVar = mVar.f18042h;
                if (dVar != null) {
                    h5.b this$0 = (h5.b) dVar.f13485b;
                    kotlin.jvm.internal.g.e(this$0, "this$0");
                    this$0.i();
                }
            }
            if (mVar.f18040f) {
                mVar.f18040f = false;
                com.google.android.tools.d dVar2 = mVar.f18042h;
                if (dVar2 != null) {
                    h5.b this$02 = (h5.b) dVar2.f13485b;
                    kotlin.jvm.internal.g.e(this$02, "this$0");
                    this$02.i();
                    return;
                }
                return;
            }
            return;
        }
        if (mVar.f18039e) {
            mVar.f18039e = false;
            d5.c cVar = mVar.f18043i;
            if (cVar != null) {
                cVar.e(true);
            }
        }
        if (mVar.f18040f) {
            mVar.f18040f = false;
            d5.c cVar2 = mVar.f18043i;
            if (cVar2 != null) {
                cVar2.e(false);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.x.a
    public final void d() {
        int i10 = this.f17a;
        Object obj = this.f18b;
        switch (i10) {
            case 11:
                Word2PDFConvertActivity word2PDFConvertActivity = (Word2PDFConvertActivity) obj;
                Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("R2gic1cw", "5lRy8EVp"));
                pdf.pdfreader.viewer.editor.free.utils.p.j(word2PDFConvertActivity, word2PDFConvertActivity.s2().concat("_space"));
                return;
            default:
                ReaderImg2PDFConvertActivity readerImg2PDFConvertActivity = (ReaderImg2PDFConvertActivity) obj;
                ReaderImg2PDFConvertActivity.a aVar2 = ReaderImg2PDFConvertActivity.f27381i0;
                kotlin.jvm.internal.g.e(readerImg2PDFConvertActivity, ea.a.p("O2hYc10w", "EleMrVBt"));
                pdf.pdfreader.viewer.editor.free.utils.p.j(readerImg2PDFConvertActivity, readerImg2PDFConvertActivity.a2().concat("_space"));
                return;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.extension.e
    public final void e(Object obj) {
        int i10 = this.f17a;
        Object obj2 = this.f18b;
        switch (i10) {
            case 12:
                ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) obj2;
                List list = (List) obj;
                if (!ReaderHomeActivity.f26650n2) {
                    if (!readerHomeActivity.G1 && list != null) {
                        readerHomeActivity.U.clear();
                        readerHomeActivity.U.addAll(list);
                        if (readerHomeActivity.M != null) {
                            if (readerHomeActivity.U.isEmpty()) {
                                readerHomeActivity.M.J0();
                                return;
                            } else {
                                readerHomeActivity.M.H0();
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                readerHomeActivity.getClass();
                return;
            default:
                pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = (pdf.pdfreader.viewer.editor.free.ui.frag.a) obj2;
                List list2 = (List) obj;
                ro.c cVar = pdf.pdfreader.viewer.editor.free.ui.frag.a.f27997y0;
                aVar.getClass();
                if (list2 != null) {
                    aVar.K0(ea.a.p("ckxM", "ICoSGAOd"));
                    return;
                }
                return;
        }
    }

    @Override // lib.zj.pdfeditor.x
    public final void f(PDFReaderView pDFReaderView) {
        int i10 = PDFPageView.f21175y1;
        pDFReaderView.z((RectF) this.f18b);
    }

    @Override // db.a.InterfaceC0196a
    public final void g(db.b bVar) {
        ja.c cVar = (ja.c) this.f18b;
        cVar.getClass();
        Log.isLoggable("FirebaseCrashlytics", 3);
        cVar.f19073b.set((ja.a) bVar.get());
    }

    @Override // d7.a.InterfaceC0194a
    public final Object l() {
        return Integer.valueOf(((c7.d) this.f18b).A());
    }

    @Override // gf.b.c
    public final void n(Object obj, gf.a aVar) {
        File[] externalCacheDirs;
        Object h10;
        int i10 = this.f17a;
        Object obj2 = this.f18b;
        switch (i10) {
            case 7:
                NativeAppGlobalApi nativeAppGlobalApi = (NativeAppGlobalApi) obj2;
                NativeAppGlobalApi.Companion companion = NativeAppGlobalApi.Companion.f15737a;
                ea.a.p("N2UlbHk=", "O8EU3YHd");
                kotlin.jvm.internal.g.c(obj, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuWG4ZbkBsWCBHeTtlU2sNdB5pWi4KbzpsIWNGaSluMC57aUd0CWtbdF9pJS4ybhs_Pg==", "7454cjAm"));
                Object obj3 = ((List) obj).get(0);
                kotlin.jvm.internal.g.c(obj3, ea.a.p("V3UtbEdjN24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBNeTFlR2s5dCRpCC5ndCVpVmc=", "3t9AgVHe"));
                try {
                    nativeAppGlobalApi.b((String) obj3);
                    h10 = ge.a.H(null);
                } catch (Throwable th2) {
                    h10 = b.b.h(th2);
                }
                aVar.i(h10);
                return;
            default:
                Messages.a aVar2 = (Messages.a) obj2;
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    io.flutter.plugins.pathprovider.a aVar3 = (io.flutter.plugins.pathprovider.a) aVar2;
                    aVar3.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : aVar3.f18831a.getExternalCacheDirs()) {
                        if (file != null) {
                            arrayList2.add(file.getAbsolutePath());
                        }
                    }
                    arrayList.add(0, arrayList2);
                } catch (Throwable th3) {
                    arrayList = Messages.a(th3);
                }
                aVar.i(arrayList);
                return;
        }
    }

    @Override // ro.a
    public final void o(Object obj) {
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.g gVar = (pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.g) this.f18b;
        int i10 = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.g.f27691d;
        kotlin.jvm.internal.g.e(gVar, ea.a.p("R2gic1cw", "7tXfDwFa"));
        gVar.c = null;
        if (!((Boolean) obj).booleanValue()) {
            w<po.b> wVar = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c.f27668m;
            c.a.a(gVar);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        K0.a((l) this.f18b, obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z10;
        ((i0) this.f18b).getClass();
        if (task.o()) {
            z zVar = (z) task.k();
            zVar.c();
            Log.isLoggable("FirebaseCrashlytics", 3);
            File b10 = zVar.b();
            if (b10.delete()) {
                b10.getPath();
                Log.isLoggable("FirebaseCrashlytics", 3);
            } else {
                b10.getPath();
            }
            z10 = true;
        } else {
            task.j();
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
