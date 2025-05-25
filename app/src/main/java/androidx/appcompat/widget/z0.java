package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.inmobi.media.C1564b1;
import com.inmobi.media.C1627f8;
import com.inmobi.media.C1666i5;
import com.inmobi.media.C1770q1;
import com.inmobi.media.C1877y5;
import com.inmobi.media.G0;
import com.inmobi.media.J5;
import com.inmobi.media.Kb;
import com.inmobi.media.M6;
import com.inmobi.media.S9;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import f6.f;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PageView;
import lib.zj.pdfeditor.text.editor.TextEditorState;
import lib.zj.reflow.ReflowLoadingView;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner$load$adRequestList$1;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderEncryptionAndDecryptionHelper;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.split.ReaderSplitPdfManager;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity;
import pdf.pdfreader.viewer.editor.free.utils.FasterFileUtil;
import vl.b;
import we.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2711a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2712b;

    public /* synthetic */ z0(Object obj, int i10) {
        this.f2711a = i10;
        this.f2712b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        x0.t0 h10;
        long j10;
        boolean z11;
        Object obj = null;
        switch (this.f2711a) {
            case 0:
                ((a1) this.f2712b).a();
                return;
            case 1:
                f6.e this$0 = (f6.e) this.f2712b;
                HashMap hashMap = f6.e.f17132d;
                if (!k6.a.b(f6.e.class)) {
                    try {
                        kotlin.jvm.internal.g.e(this$0, "this$0");
                        WeakReference<Activity> weakReference = this$0.f17133a;
                        try {
                            View b10 = c6.f.b(weakReference.get());
                            Activity activity = weakReference.get();
                            if (b10 != null && activity != null) {
                                Iterator it = f6.c.a(b10).iterator();
                                while (it.hasNext()) {
                                    View view = (View) it.next();
                                    if (!w5.b.b(view)) {
                                        String d10 = f6.c.d(view);
                                        if (d10.length() > 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10 && d10.length() <= 300) {
                                            HashSet hashSet = f6.f.f17135e;
                                            String localClassName = activity.getLocalClassName();
                                            kotlin.jvm.internal.g.d(localClassName, "activity.localClassName");
                                            f.a.b(view, b10, localClassName);
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable th2) {
                        k6.a.a(f6.e.class, th2);
                        return;
                    }
                }
                return;
            case 2:
                com.google.android.material.search.SearchView searchView = (com.google.android.material.search.SearchView) this.f2712b;
                EditText editText = searchView.f12811j;
                editText.clearFocus();
                SearchBar searchBar = searchView.f12819r;
                if (searchBar != null) {
                    searchBar.requestFocus();
                }
                if (searchView.f12824w && (h10 = x0.f0.h(editText)) != null) {
                    h10.a(8);
                    return;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) androidx.core.content.a.getSystemService(editText.getContext(), InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    return;
                }
                return;
            case 3:
                SideSheetBehavior.c cVar = (SideSheetBehavior.c) this.f2712b;
                cVar.f12870b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                d1.c cVar2 = sideSheetBehavior.f12855i;
                if (cVar2 != null && cVar2.h()) {
                    cVar.a(cVar.f12869a);
                    return;
                } else if (sideSheetBehavior.f12854h == 2) {
                    sideSheetBehavior.s(cVar.f12869a);
                    return;
                } else {
                    return;
                }
            case 4:
                G0.a((G0) this.f2712b);
                return;
            case 5:
                J5.b((J5) this.f2712b);
                return;
            case 6:
                Kb.a((Kb) this.f2712b);
                return;
            case 7:
                M6.a((M6) this.f2712b);
                return;
            case 8:
                S9.a((S9) this.f2712b);
                return;
            case 9:
                C1564b1.a((C1564b1) this.f2712b);
                return;
            case 10:
                C1627f8.a((C1627f8) this.f2712b);
                return;
            case 11:
                C1666i5.d((C1666i5) this.f2712b);
                return;
            case 12:
                C1770q1.f((C1770q1) this.f2712b);
                return;
            case 13:
                C1877y5.c((C1877y5) this.f2712b);
                return;
            case 14:
                InMobiUnifiedIdService.b((InMobiUnifiedIdInterface) this.f2712b);
                return;
            case 15:
                ((c.f) this.f2712b).b();
                return;
            case 16:
                Point point = PageView.E0;
                ((PageView) this.f2712b).W1(true, false);
                return;
            case 17:
                lib.zj.pdfeditor.text.editor.a aVar = (lib.zj.pdfeditor.text.editor.a) this.f2712b;
                aVar.g(TextEditorState.EDIT_TEXT);
                aVar.F();
                PDFPageView pDFPageView = aVar.f21687f;
                pDFPageView.f21188u1 = true;
                pDFPageView.f21187t1 = true;
                pDFPageView.G.removeCallbacks(pDFPageView.f21190w1);
                if (pDFPageView.f21187t1) {
                    Handler handler = pDFPageView.G;
                    PDFPageView.j jVar = pDFPageView.f21190w1;
                    if (pDFPageView.f21188u1) {
                        j10 = 650;
                    } else {
                        j10 = 500;
                    }
                    handler.postDelayed(jVar, j10);
                }
                pDFPageView.invalidate();
                return;
            case 18:
                mj.r rVar = (mj.r) this.f2712b;
                rVar.f22131d.f21695m = null;
                rVar.f22131d.f21687f.invalidate();
                return;
            case 19:
                ((ReflowLoadingView) this.f2712b).a();
                return;
            case 20:
                ReaderSplashActivity readerSplashActivity = (ReaderSplashActivity) this.f2712b;
                ReaderSplashActivity.a aVar2 = ReaderSplashActivity.f23873s;
                kotlin.jvm.internal.g.e(readerSplashActivity, ea.a.p("H2hYc0ow", "Ook1ntHq"));
                if (readerSplashActivity.f23879g) {
                    if (readerSplashActivity.f23884l) {
                        readerSplashActivity.f23876d = true;
                        return;
                    }
                    readerSplashActivity.f23878f = true;
                    readerSplashActivity.A1();
                    return;
                }
                return;
            case 21:
                FlutterListBanner$load$adRequestList$1.f((FlutterListBanner) this.f2712b);
                return;
            case 22:
                ((b.a) this.f2712b).c();
                return;
            case 23:
                Context context = (Context) this.f2712b;
                FileRepository fileRepository = FileRepository.f24155a;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "eF4x8SOD"));
                String p10 = ea.a.p("qryx5d6L0Ynx5sWPkqPp566Y", "V8CuMUCK");
                FileRepository.f24155a.getClass();
                FileRepository.G(p10);
                Set a10 = FasterFileUtil.f28517a.a(context);
                a10.size();
                FileRepository.F();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : a10) {
                    String str = (String) obj2;
                    if (!FileRepository.l().contains(str) && !((ArrayBlockingQueue) FileRepository.f24161h.getValue()).contains(str)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.size();
                    FileRepository.F();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        File file = new File(str2);
                        if (file.exists() && file.length() > 0) {
                            PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                            pdfPreviewEntity.setPath(str2);
                            pdfPreviewEntity.setName(bg.b.B0(file));
                            pdfPreviewEntity.setSize(file.length());
                            pdfPreviewEntity.setDate(file.lastModified());
                            pdfPreviewEntity.setOtherStrOne(pdf.pdfreader.viewer.editor.free.utils.v.y(file));
                            arrayList2.add(pdfPreviewEntity);
                        }
                    }
                    FileRepository.E(context, arrayList2);
                    ea.a.p("1KPK5-iYhJXC5rmuj4_E5cGl167K5suQ", "aV18kMlB");
                    FileRepository.F();
                } else {
                    FileRepository.k().execute(new a6.c(5));
                    ea.a.p("1KPK5-iYT2QbZlLlx4ywiNTvjoyiuM7p64CapsPm35LWhe7m5bCElcLmua4=", "wrBPtA0F");
                    FileRepository.F();
                }
                FileRepository.D(context);
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.f(context) && pdf.pdfreader.viewer.editor.free.utils.q0.i() < 0 && (!FileRepository.n().isEmpty())) {
                    Iterator it3 = FileRepository.n().iterator();
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (it3.hasNext()) {
                            long id2 = ((PdfPreviewEntity) obj).getId();
                            do {
                                Object next = it3.next();
                                long id3 = ((PdfPreviewEntity) next).getId();
                                if (id2 < id3) {
                                    obj = next;
                                    id2 = id3;
                                }
                            } while (it3.hasNext());
                        }
                    }
                    PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) obj;
                    if (pdfPreviewEntity2 != null) {
                        long id4 = pdfPreviewEntity2.getId();
                        if (id4 >= 0 && pdf.pdfreader.viewer.editor.free.utils.q0.f28746d < 0) {
                            pdf.pdfreader.viewer.editor.free.utils.q0.f28746d = id4;
                            pdf.pdfreader.viewer.editor.free.utils.q0.z(id4, ReaderPdfApplication.m(), "first_scan_max_id_153");
                        }
                    }
                }
                FileRepository.J = true;
                SystemClock.elapsedRealtime();
                ea.a.p("anAfZSBUEHN0", "tX9zDuoZ");
                return;
            case 24:
                ReaderEncryptionAndDecryptionHelper readerEncryptionAndDecryptionHelper = (ReaderEncryptionAndDecryptionHelper) this.f2712b;
                readerEncryptionAndDecryptionHelper.c(readerEncryptionAndDecryptionHelper.f24237d.getAbsolutePath(), false);
                return;
            case 25:
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.f2712b;
                int i10 = SubscriptionAIActivity.X;
                kotlin.jvm.internal.g.e(appCompatTextView, ea.a.p("R3RTeBNWGGV3", "8gc6gq3X"));
                appCompatTextView.requestLayout();
                return;
            case 26:
                ReaderConvertPreviewActivity readerConvertPreviewActivity = (ReaderConvertPreviewActivity) this.f2712b;
                int i11 = ReaderConvertPreviewActivity.R1;
                kotlin.jvm.internal.g.e(readerConvertPreviewActivity, ea.a.p("R2gic1cw", "HjBLSZJt"));
                ConstraintLayout constraintLayout = readerConvertPreviewActivity.F1;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                if (!readerConvertPreviewActivity.f19294h) {
                    Window window = readerConvertPreviewActivity.getWindow();
                    kotlin.jvm.internal.g.d(window, ea.a.p("OGlfZBZ3", "VlYsFeri"));
                    pdf.pdfreader.viewer.editor.free.utils.extension.i.g(window, 0, readerConvertPreviewActivity.F1());
                    Window window2 = readerConvertPreviewActivity.getWindow();
                    kotlin.jvm.internal.g.d(window2, ea.a.p("HWk5ZFh3", "pljW7NcM"));
                    pdf.pdfreader.viewer.editor.free.utils.extension.i.h(window2, !pdf.pdfreader.viewer.editor.free.utils.extension.c.h(readerConvertPreviewActivity));
                }
                readerConvertPreviewActivity.Q2();
                return;
            case 27:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) this.f2712b;
                ImageAdjustActivity.a aVar3 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("R2gic1cw", "NHR5YxPh"));
                imageAdjustActivity.Y.notifyDataSetChanged();
                return;
            case 28:
                ReaderSplitPdfManager readerSplitPdfManager = (ReaderSplitPdfManager) this.f2712b;
                kotlin.jvm.internal.g.e(readerSplitPdfManager, ea.a.p("R2gic1cw", "lnDF5sjP"));
                pdf.pdfreader.viewer.editor.free.split.a aVar4 = readerSplitPdfManager.f26572f;
                if (aVar4 != null) {
                    readerSplitPdfManager.f26569b.size();
                    aVar4.M(readerSplitPdfManager.f26573g);
                    return;
                }
                return;
            default:
                ReaderMergePdfActivity readerMergePdfActivity = (ReaderMergePdfActivity) this.f2712b;
                int i12 = ReaderMergePdfActivity.f26780f0;
                kotlin.jvm.internal.g.e(readerMergePdfActivity, ea.a.p("O2hYc10w", "QYMFvKKV"));
                readerMergePdfActivity.u2(1);
                return;
        }
    }
}
