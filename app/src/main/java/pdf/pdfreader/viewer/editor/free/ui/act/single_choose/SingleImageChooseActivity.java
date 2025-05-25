package pdf.pdfreader.viewer.editor.free.ui.act.single_choose;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.RecyclerView;
import gn.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.data.ImageChooseWorkFlow;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.TranslucentImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.TurnPageMode;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.single_choose.SingleSelectImagePreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import ul.c;

/* compiled from: SingleImageChooseActivity.kt */
/* loaded from: classes3.dex */
public final class SingleImageChooseActivity extends ReaderImg2PDFChooseActivity {

    /* renamed from: p1  reason: collision with root package name */
    public static final String f26981p1 = ea.a.p("QWU4dR90MmEGaA==", "5cJj86FC");

    /* renamed from: o1  reason: collision with root package name */
    public static final a f26980o1 = new a();

    /* compiled from: SingleImageChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(jl.a context, boolean z10, String workflow, String str, boolean z11) {
            g.e(context, "context");
            g.e(workflow, "workflow");
            Intent intent = new Intent(context, SingleImageChooseActivity.class);
            intent.putExtra(ea.a.p("I3N_clltFWghcmQ=", "hpJ96AbT"), z10);
            intent.putExtra(ea.a.p("KXJebSZ3WHIxZiZvdw==", "6GKrilW4"), workflow);
            intent.putExtra(ea.a.p("VXIkbSxzDXUAY2U=", "KFfjNXae"), str);
            intent.putExtra(ea.a.p("WnMUcxtvFV8RYVllG2E=", "zykSGkL8"), z11);
            context.startActivityForResult(intent, 200);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity
    public final void A2() {
        String p10 = ea.a.p("Wm1n", "3q8oD30L");
        String p11 = ea.a.p("AWRXRShpLUkmcwNydA==", "kdq1LYtA");
        Intent intent = new Intent(this, SingleCameraActivity.class);
        intent.putExtra(ea.a.p("WnMYaBx3K20TZ1FMAHMiSSdvbg==", "DSzCmuJa"), false);
        intent.putExtra(ea.a.p("VXIkbSxzDXUAY2U=", "iNCNHS9U"), p10);
        intent.putExtra(ea.a.p("NHIFbQl3OXIjZgpvdw==", "rURjVVC7"), p11);
        startActivityForResult(intent, 200);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity
    public final void B2(long j10) {
        Intent intent = new Intent(this, ReaderImgPreviewActivity.class);
        intent.putExtra(ea.a.p("JGVIXx1pRHA2YTNfBXINdlxlGV8sZA==", "J131ZQVO"), j10);
        intent.putExtra(ea.a.p("BHJWbTh3CXIjZgpvdw==", "Cbb9gfG8"), this.f27001t);
        intent.putExtra(ea.a.p("JnNucxBuUGw_XzllGWULdGptAWRl", "gyMuAbhT"), true);
        intent.putExtra(ea.a.p("JnN3chZtY2gzcmQ=", "l2kixcxB"), this.f27364w0);
        intent.putExtra(ea.a.p("JnNuchx0Vmtl", "6TXsVlp1"), this.f27366y0);
        intent.putExtra(ea.a.p("PWVFYRJlaHA1cyN0HG9u", "fCAEvzhA"), this.f27367z0);
        intent.putExtra(ea.a.p("O3VDbi15R2U=", "ssjuQOMg"), this.f27005x);
        startActivityForResult(intent, 200);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity
    public final void D2() {
        super.D2();
        b.a aVar = b.f17937a;
        String p10 = ea.a.p("M2QCaRhnMHAgbxJva2M7aVtr", "NzRfuoAq");
        aVar.getClass();
        b.a.b(this, p10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity
    public final void E2(ul.b bVar) {
        int i10 = SingleSelectImagePreviewActivity.X;
        SingleSelectImagePreviewActivity.a.a(this, bVar, this.f27364w0, e2());
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity
    public final void I2(List<? extends ul.a> it) {
        g.e(it, "it");
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        String str;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 200 && i11 == -1) {
            String str2 = f26981p1;
            if (intent != null) {
                str = intent.getStringExtra(str2);
            } else {
                str = null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra(str2, str);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity, pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v2().f27152i = ImageChooseWorkFlow.SingleChoose;
        w2().setVisibility(4);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity
    public final void q2() {
        t2();
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity
    public final void r2() {
        String str;
        ul.b bVar;
        File file;
        c cVar;
        c cVar2;
        ArrayList arrayList = (ArrayList) x2().f30453f.d();
        if (arrayList != null) {
            boolean z10 = true;
            if (!arrayList.isEmpty()) {
                ul.b bVar2 = (ul.b) m.t0(0, arrayList);
                if (bVar2 != null) {
                    str = bVar2.f30404a;
                } else {
                    str = null;
                }
                if (this.f27366y0) {
                    if (bVar2 != null) {
                        ImageConvertDataRepository imageConvertDataRepository = ImageConvertDataRepository.f26536a;
                        imageConvertDataRepository.getClass();
                        w wVar = ImageConvertDataRepository.f26552r;
                        if (wVar.d() != 0) {
                            int i10 = this.f27367z0;
                            T d10 = wVar.d();
                            g.b(d10);
                            if (i10 < ((ArrayList) d10).size() && this.f27367z0 >= 0) {
                                T d11 = wVar.d();
                                g.b(d11);
                                bVar = (ul.b) ((ArrayList) d11).get(this.f27367z0);
                                file = new File(bVar2.f30404a);
                                if (!file.exists() && file.length() > 0) {
                                    if (bVar != null) {
                                        bVar.c = bVar2.c;
                                    }
                                    if (bVar != null) {
                                        bVar.f30404a = bVar2.f30404a;
                                    }
                                    if (bVar != null) {
                                        bVar.f30406d = file.length();
                                    }
                                    if (bVar != null) {
                                        bVar.f30421s = bVar2.f30421s;
                                    }
                                    if (bVar != null) {
                                        bVar.f30422t = bVar2.f30422t;
                                    }
                                    if (bVar != null) {
                                        bVar.f30413k = null;
                                    }
                                    if (bVar != null) {
                                        bVar.f30414l = null;
                                    }
                                    if (bVar != null) {
                                        bVar.f30415m = null;
                                    }
                                    if (bVar != null) {
                                        bVar.f30416n = null;
                                    }
                                    if (bVar != null) {
                                        bVar.f30424v = true;
                                    }
                                    if (!this.f27364w0) {
                                        jn.a.c.getClass();
                                        if (jn.a.i() != 1) {
                                            z10 = false;
                                        }
                                    }
                                    if (bVar != null && (cVar2 = bVar.f30419q) != null) {
                                        ea.a.p("PG0FZwlDNW4uaWc=", "72UdlZwB");
                                        ge.a.P(cVar2, z10);
                                    }
                                    if (bVar != null && (cVar = bVar.f30420r) != null) {
                                        ea.a.p("WGRddQl0Am0pZwNDW24xaWc=", "8G97zKnt");
                                        ge.a.P(cVar, z10);
                                    }
                                    ArrayList<ul.b> arrayList2 = ImageConvertDataRepository.f26540f;
                                    if (arrayList2 != null) {
                                        arrayList2.clear();
                                    }
                                    x2().getClass();
                                    imageConvertDataRepository.getClass();
                                    ImageConvertDataRepository.k();
                                    z2();
                                    if (this.f27005x == TurnPageMode.ConvertItemClick.ordinal()) {
                                        int i11 = TranslucentImageAdjustActivity.f25786v0;
                                        TranslucentImageAdjustActivity.a.a(this, this.f27001t);
                                    } else {
                                        ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                                        String str2 = this.f27001t;
                                        aVar.getClass();
                                        ImageAdjustActivity.a.a(this, str2);
                                    }
                                    finish();
                                    return;
                                }
                                t1.b(ea.a.p("XG4fYRhlMmgddFtGAG4_cyxlViA2YTdoGG4tdEJlN2lAdDgsU3IHdAdyWiAw", "8BbO8Sga"));
                                j1.e(this, getResources().getString(R.string.arg_res_0x7f130096), true, null, -1);
                            }
                        }
                        bVar = null;
                        file = new File(bVar2.f30404a);
                        if (!file.exists()) {
                        }
                        t1.b(ea.a.p("XG4fYRhlMmgddFtGAG4_cyxlViA2YTdoGG4tdEJlN2lAdDgsU3IHdAdyWiAw", "8BbO8Sga"));
                        j1.e(this, getResources().getString(R.string.arg_res_0x7f130096), true, null, -1);
                    }
                } else if (str != null) {
                    b.a aVar2 = b.f17937a;
                    String p10 = ea.a.p("UmQvaR5nPWQdblFfCmw_Y2s=", "X3zBmS5v");
                    aVar2.getClass();
                    b.a.b(this, p10);
                    Intent intent = new Intent();
                    intent.putExtra(f26981p1, str);
                    setResult(-1, intent);
                    finish();
                }
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity
    public final void H2() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity
    public final void F2(boolean z10) {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity
    public final void s2(RecyclerView recyclerView) {
    }
}
