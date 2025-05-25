package l1;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.w;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase;
import ao.e2;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.iap.b;
import com.facebook.appevents.l;
import com.facebook.d;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.inmobi.media.A4;
import com.inmobi.media.AbstractC1846w0;
import com.inmobi.media.C1727ma;
import com.inmobi.media.G0;
import com.inmobi.media.N1;
import com.inmobi.media.RunnableC1685ja;
import com.inmobi.media.X5;
import com.inmobi.media.Y1;
import ha.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.y0;
import lib.zj.pdfeditor.ReaderPDFCore;
import mj.j;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.r;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.PDFTextEditorMode;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignCreateView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathDataBase;
import pdf.pdfreader.viewer.editor.free.utils.GetPDFPasswordProcess;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import pdf.pdfreader.viewer.editor.free.utils.x;
import u1.c;
import wl.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20436a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f20437b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f20436a = i10;
        this.f20437b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        boolean z10;
        int i10;
        ReaderPDFCore readerPDFCore;
        PointF pointF;
        float f10;
        int i11;
        RecyclerView.m layoutManager;
        int width;
        int i12 = this.f20436a;
        int i13 = 1000;
        Boolean bool = null;
        boolean z11 = false;
        Object obj = this.f20437b;
        Object obj2 = this.c;
        switch (i12) {
            case 0:
                Violation violation = (Violation) obj2;
                g.e(violation, "$violation");
                throw violation;
            case 1:
                Context context = (Context) obj2;
                ((ProfileInstallerInitializer) obj).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = ProfileInstallerInitializer.b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new c(context, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 2:
                String eventName = (String) obj;
                Bundle parameters = (Bundle) obj2;
                v5.a aVar = v5.a.f30642a;
                if (!k6.a.b(v5.a.class)) {
                    try {
                        g.e(eventName, "$eventName");
                        g.e(parameters, "$parameters");
                        new l(d.a(), (String) null).d(parameters, eventName);
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(v5.a.class, th2);
                        return;
                    }
                }
                return;
            case 3:
                InAppPurchaseUtils.BillingClientVersion billingClientVersion = (InAppPurchaseUtils.BillingClientVersion) obj;
                Context context2 = (Context) obj2;
                b bVar = b.f9542a;
                if (!k6.a.b(b.class)) {
                    try {
                        g.e(billingClientVersion, "$billingClientVersion");
                        g.e(context2, "$context");
                        b bVar2 = b.f9542a;
                        String packageName = context2.getPackageName();
                        g.d(packageName, "context.packageName");
                        bVar2.a(billingClientVersion, packageName);
                        return;
                    } catch (Throwable th3) {
                        k6.a.a(b.class, th3);
                        return;
                    }
                }
                return;
            case 4:
                h.b bVar3 = (h.b) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } catch (Exception e10) {
                    h.this.i(e10);
                    return;
                }
            case 5:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                com.google.firebase.messaging.a aVar2 = FirebaseMessaging.f13641n;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.b(firebaseMessaging.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.a(e11);
                    return;
                }
            case 6:
                G0.a((G0) obj, (ApplicationExitInfo) obj2);
                return;
            case 7:
                X5.a((X5) obj, (Context) obj2);
                return;
            case 8:
                Y1.a((N1) obj, (A4) obj2);
                return;
            case 9:
                RunnableC1685ja.a((RunnableC1685ja) obj, (C1727ma) obj2);
                return;
            case 10:
                AbstractC1846w0.a((AbstractC1846w0) obj, (JSONObject) obj2);
                return;
            case 11:
                dj.d dVar = (dj.d) obj2;
                long a10 = ((xh.b) dVar.f16236f.getHighlight()).a();
                ((String) obj).getClass();
                dVar.a(a10);
                return;
            case 12:
                lib.zj.pdfeditor.text.editor.a aVar3 = (lib.zj.pdfeditor.text.editor.a) obj;
                RectF[] rectFArr = (RectF[]) obj2;
                aVar3.getClass();
                if (rectFArr != null && rectFArr.length > 0) {
                    ArrayList<RectF> arrayList = aVar3.C;
                    arrayList.clear();
                    Collections.addAll(arrayList, rectFArr);
                    Collections.sort(arrayList, new j());
                    ArrayList<RectF> arrayList2 = aVar3.D;
                    arrayList2.clear();
                    Iterator<RectF> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new RectF(it.next()));
                    }
                    aVar3.f21687f.invalidate();
                    return;
                }
                return;
            case 13:
                CameraHelper cameraHelper = (CameraHelper) obj;
                rl.a aVar4 = (rl.a) obj2;
                g.e(cameraHelper, ea.a.p("ImhQc0kw", "TdV9mYEm"));
                g.e(aVar4, ea.a.p("Smwhc0ZlIWVy", "o4nH2OWD"));
                y0 y0Var = cameraHelper.f24081p;
                if (y0Var != null) {
                    y0Var.b(new CancellationException(ea.a.p("R2kmZVNvF3Q=", "wErS1vch")));
                }
                aVar4.s0();
                cameraHelper.i();
                return;
            case 14:
                ((vl.b) obj).c.a((TreeMap) obj2);
                return;
            case 15:
                e eVar = (e) obj2;
                String str = (String) obj;
                g.e(eVar, ea.a.p("R2gic1cw", "l0u4nqqh"));
                wl.a aVar5 = eVar.f31369f;
                if (aVar5 != null) {
                    if (str == null) {
                        str = "";
                    }
                    aVar5.i1(eVar.f31366b.size(), str);
                }
                eVar.f31369f = null;
                return;
            case 16:
                BaseAISubscriptionActivity baseAISubscriptionActivity = (BaseAISubscriptionActivity) obj;
                View view = (View) obj2;
                String str2 = BaseAISubscriptionActivity.U;
                g.e(baseAISubscriptionActivity, ea.a.p("O2hYc10w", "vlRc8PNA"));
                g.e(view, ea.a.p("a2Ndbwplfm07Zy9WHGV3", "NGMTGMRn"));
                if (!baseAISubscriptionActivity.isFinishing()) {
                    view.setVisibility(0);
                    return;
                }
                return;
            case 17:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj;
                ym.a aVar6 = (ym.a) obj2;
                PDFPageManagerActivity.a aVar7 = PDFPageManagerActivity.H0;
                g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "jCsXCpRV"));
                pDFPageManagerActivity.f25273l0 = 0L;
                Handler handler2 = pDFPageManagerActivity.f25313t;
                r rVar = pDFPageManagerActivity.f25274m0;
                handler2.removeCallbacks(rVar);
                handler2.postDelayed(rVar, 500L);
                pDFPageManagerActivity.V = true;
                ArrayList<bn.a> arrayList3 = (ArrayList) an.a.c.d();
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    i10 = pDFPageManagerActivity.q2().getItemCount();
                } else {
                    int i14 = 0;
                    for (bn.a aVar8 : arrayList3) {
                        int i15 = aVar8.f5491e;
                        if (i15 > i14) {
                            i14 = i15;
                        }
                    }
                    i10 = i14 + 1;
                    if (i10 > pDFPageManagerActivity.q2().getItemCount()) {
                        i10 = pDFPageManagerActivity.q2().getItemCount();
                    } else if (i10 < 0) {
                        i10 = 0;
                    }
                }
                aVar6.f32184f = i10;
                if (aVar6.f32180a == null) {
                    int i16 = i10 - 1;
                    if (i16 < 0) {
                        i16 = 0;
                    }
                    ReaderPDFCore readerPDFCore2 = pDFPageManagerActivity.f25317x;
                    if (readerPDFCore2 != null) {
                        pointF = readerPDFCore2.getPageSize(i16);
                    } else {
                        pointF = null;
                    }
                    ReaderPDFCore readerPDFCore3 = pDFPageManagerActivity.f25317x;
                    if (readerPDFCore3 != null) {
                        f10 = readerPDFCore3.getZoomInfo();
                    } else {
                        f10 = 1.0f;
                    }
                    if (pointF != null) {
                        i11 = (int) pointF.x;
                    } else {
                        i11 = 1000;
                    }
                    int i17 = (int) (i11 / f10);
                    if (pointF != null) {
                        i13 = (int) pointF.y;
                    }
                    aVar6.f32180a = new Rect(0, 0, i17, (int) (i13 / f10));
                }
                ReaderPDFCore readerPDFCore4 = pDFPageManagerActivity.f25317x;
                if (readerPDFCore4 != null) {
                    bool = Boolean.valueOf(readerPDFCore4.insertBlankPages(aVar6.f32180a, aVar6.f32181b, aVar6.c, aVar6.f32182d, aVar6.f32184f, aVar6.f32183e, aVar6.f32185g, aVar6.f32186h));
                }
                if (g.a(bool, Boolean.TRUE) && (readerPDFCore = pDFPageManagerActivity.f25317x) != null) {
                    ij.e eVar2 = new ij.e();
                    eVar2.f18535a = 1;
                    eVar2.f18538e = aVar6.f32184f;
                    eVar2.f18539f = aVar6.f32183e;
                    readerPDFCore.addPageManagerAction(eVar2);
                }
                handler2.postDelayed(new v4.a(5, pDFPageManagerActivity, bool, aVar6), PDFPageManagerActivity.p2(pDFPageManagerActivity.f25273l0));
                return;
            case 18:
                BasePdf2ImageActivity basePdf2ImageActivity = (BasePdf2ImageActivity) obj;
                ArrayList arrayList4 = (ArrayList) obj2;
                g.e(basePdf2ImageActivity, ea.a.p("IWgZc2kw", "7LUpMPnk"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(basePdf2ImageActivity)) {
                    basePdf2ImageActivity.B2();
                    tn.a.d(basePdf2ImageActivity, ea.a.p("LG9fdhxydA==", "cIugetPL"), ea.a.p("QzIiYxxuFGUAdGtzCHYzXzd1UWMjc3M=", "55cwrQBd"), basePdf2ImageActivity.r2(), false);
                    if (arrayList4 != null) {
                        e1.g(basePdf2ImageActivity, arrayList4);
                        BasePdf2ImageActivity.n2(basePdf2ImageActivity);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = (Pdf2ImagePicPreviewActivity) obj;
                ReaderPDFCore readerPDFCore5 = (ReaderPDFCore) obj2;
                int i18 = Pdf2ImagePicPreviewActivity.I0;
                g.e(pdf2ImagePicPreviewActivity, ea.a.p("R2gic1cw", "RHSTq8kz"));
                g.e(readerPDFCore5, ea.a.p("YGNYcmU=", "VsD74KHg"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(pdf2ImagePicPreviewActivity)) {
                    Handler handler3 = pdf2ImagePicPreviewActivity.H;
                    handler3.removeCallbacks(pdf2ImagePicPreviewActivity.f25481b0);
                    handler3.post(new pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.g(pdf2ImagePicPreviewActivity, 1));
                    boolean z12 = pdf2ImagePicPreviewActivity.L;
                    ArrayList<bn.a> images = pdf2ImagePicPreviewActivity.f25521s0;
                    if (z12 && images.size() > 24) {
                        pdf2ImagePicPreviewActivity.b3().f1123i.setVisibility(8);
                    } else {
                        pdf2ImagePicPreviewActivity.b3().f1123i.setVisibility(0);
                    }
                    Collection collection = (Collection) en.a.f16817d.d();
                    if ((collection == null || collection.isEmpty()) ? true : true) {
                        ArrayList arrayList5 = new ArrayList();
                        Iterator<bn.a> it2 = images.iterator();
                        while (it2.hasNext()) {
                            bn.a next = it2.next();
                            if (next.f5492f) {
                                arrayList5.add(next);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            pdf2ImagePicPreviewActivity.d3().e(arrayList5);
                        }
                    }
                    w<ArrayList<bn.a>> wVar = en.a.f16815a;
                    g.e(images, "images");
                    en.a.f16815a.j(images);
                    pdf2ImagePicPreviewActivity.c3().f25431g = readerPDFCore5;
                    Pdf2ImagePicPreviewAdapter c32 = pdf2ImagePicPreviewActivity.c3();
                    c32.getClass();
                    ArrayList<bn.a> arrayList6 = c32.f25429e;
                    arrayList6.clear();
                    arrayList6.addAll(images);
                    c32.notifyDataSetChanged();
                    if (pdf2ImagePicPreviewActivity.f25527y0 != null && (layoutManager = pdf2ImagePicPreviewActivity.b3().f1131q.getLayoutManager()) != null) {
                        layoutManager.q0(pdf2ImagePicPreviewActivity.f25527y0);
                    }
                    boolean e32 = pdf2ImagePicPreviewActivity.e3();
                    if (pdf2ImagePicPreviewActivity.b3().f1123i.getVisibility() == 0) {
                        pdf2ImagePicPreviewActivity.b3().f1117b.setChecked(e32);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) obj;
                View view2 = (View) obj2;
                String str3 = OfficeReaderActivity.D2;
                g.e(officeReaderActivity, ea.a.p("R2gic1cw", "PzplaCNX"));
                g.e(view2, ea.a.p("a2l0", "mMNOypkg"));
                View view3 = officeReaderActivity.f25917b0;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    if (layoutParams != null) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams;
                        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(officeReaderActivity)) {
                            width = ((view2.getWidth() / 2) + view2.getLeft()) - (view3.getWidth() / 2);
                        } else {
                            ViewGroup viewGroup = officeReaderActivity.F;
                            if (viewGroup != null) {
                                width = ((viewGroup.getWidth() - view2.getLeft()) - (view2.getWidth() / 2)) - (view3.getWidth() / 2);
                            } else {
                                g.i(ea.a.p("UmM_aRxuIGEAVl1ldw==", "aXqu9jKU"));
                                throw null;
                            }
                        }
                        bVar4.setMarginEnd(width);
                        view3.setLayoutParams(bVar4);
                        return;
                    }
                    throw new NullPointerException(ea.a.p("OXUjbHdjA24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAjeT9ld2EMZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdz5kKGUjLiFvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyNm1z", "m6WOWbK9"));
                }
                return;
            case 21:
                View view4 = (View) obj2;
                ReaderPreviewActivity readerPreviewActivity = ((e2) obj).f5034b;
                if (readerPreviewActivity.I5) {
                    readerPreviewActivity.h(view4.getResources().getString(R.string.arg_res_0x7f1300d4));
                    return;
                }
                readerPreviewActivity.K = 2;
                readerPreviewActivity.L = PDFTextEditorMode.ADD_TEXT;
                readerPreviewActivity.f26223n1 = ea.a.p("O2ksdwhvInVw", "jbMIxRR7");
                readerPreviewActivity.f26229o1 = ea.a.p("OWlUdwlvR3Vw", "O4UzhWvA");
                ReaderPreviewActivity.k2(readerPreviewActivity);
                return;
            case 22:
                ReaderMergePdfActivity.b.c((ReaderMergePdfActivity) obj, (List) obj2);
                return;
            case 23:
                SignCreateView signCreateView = (SignCreateView) obj;
                SignPathActionInfo signPathActionInfo = (SignPathActionInfo) obj2;
                int i19 = SignCreateView.f28437d;
                signCreateView.getClass();
                if (signPathActionInfo != null) {
                    w0.a().f28791b.execute(new l.r(29, signCreateView, signPathActionInfo));
                    if (g3.b.f17513b == null) {
                        g3.b.f17513b = new g3.b(7);
                    }
                    g3.b bVar5 = g3.b.f17513b;
                    String filePath = signPathActionInfo.getFilePath();
                    pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.d dVar2 = (pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.d) ((SignPathDataBase) bVar5.f17514a).k();
                    RoomDatabase roomDatabase = dVar2.f28510a;
                    roomDatabase.b();
                    pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.c cVar = dVar2.f28512d;
                    b2.e a11 = cVar.a();
                    if (filePath == null) {
                        a11.d(1);
                    } else {
                        a11.f(1, filePath);
                    }
                    roomDatabase.c();
                    try {
                        a11.h();
                        roomDatabase.j();
                        roomDatabase.g();
                        cVar.c(a11);
                        File file = new File(signPathActionInfo.getFilePath());
                        if (file.exists()) {
                            file.delete();
                        }
                        if (signCreateView.f28439b.f28371f.isEmpty()) {
                            w0.a().f28791b.execute(new xo.d(signCreateView));
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        roomDatabase.g();
                        cVar.c(a11);
                        throw th4;
                    }
                }
                return;
            default:
                x xVar = (x) obj;
                GetPDFPasswordProcess getPDFPasswordProcess = (GetPDFPasswordProcess) obj2;
                g.e(xVar, ea.a.p("a2xYcw1lWWVy", "4yKCegZ8"));
                g.e(getPDFPasswordProcess, ea.a.p("O2hYc10w", "oEF6DjT2"));
                xVar.h();
                Context context3 = getPDFPasswordProcess.f28521a;
                String string = context3.getString(R.string.arg_res_0x7f130391);
                String e12 = a6.h.e("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdpKWddchZhIWU9X1dpFWVoZSJjL3ABaQduKQ==", "bXhhGssE", string, context3, R.string.arg_res_0x7f130390);
                g.d(e12, ea.a.p("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdp04DMZg1sJl8sb0NyDHBDXzlhJG4adDdvRWUAKQ==", "f6WL1jdC"));
                i3 i3Var = new i3(context3, string, e12, null);
                i3Var.setCanceledOnTouchOutside(false);
                i3Var.setCancelable(true);
                i3Var.show();
                return;
        }
    }

    public /* synthetic */ a(int i10, Object obj, String str) {
        this.f20436a = i10;
        this.c = obj;
        this.f20437b = str;
    }
}
