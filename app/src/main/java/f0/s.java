package f0;

import am.x1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.SpecialEffectsController;
import ao.b2;
import com.adjust.sdk.Constants;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.l;
import com.facebook.e;
import com.facebook.internal.a;
import com.facebook.internal.j;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.AbstractC1692k3;
import com.inmobi.media.AbstractC1846w0;
import com.inmobi.media.C1662i1;
import com.inmobi.media.C1694k5;
import com.inmobi.media.C1780qb;
import com.inmobi.media.C1834v1;
import com.inmobi.media.C1867x8;
import com.inmobi.media.Kb;
import com.inmobi.media.L7;
import com.inmobi.media.O7;
import com.inmobi.media.Q7;
import com.inmobi.media.S9;
import ha.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.text.PDFFreeTextEditView;
import org.json.JSONException;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PreviewPageManageGuideView;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.office.m0;
import pdf.pdfreader.viewer.editor.free.pdfview.PDFTextEditorMode;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.repo.data.FileReadProgressChecker;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16986a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16987b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.f16986a = i10;
        this.f16987b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        Bitmap bitmap2;
        ReaderPDFCore readerPDFCore;
        boolean z10;
        boolean z11;
        Intent intent;
        int i10 = this.f16986a;
        bn.a aVar = null;
        int i11 = 0;
        Object obj = this.c;
        Object obj2 = this.f16987b;
        switch (i10) {
            case 0:
                androidx.constraintlayout.motion.widget.d dVar = (androidx.constraintlayout.motion.widget.d) obj2;
                View[] viewArr = (View[]) obj;
                if (dVar.f3144p != -1) {
                    for (View view : viewArr) {
                        view.setTag(dVar.f3144p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (dVar.f3145q != -1) {
                    int length = viewArr.length;
                    while (i11 < length) {
                        viewArr[i11].setTag(dVar.f3145q, null);
                        i11++;
                    }
                    return;
                }
                return;
            case 1:
                SpecialEffectsController this$0 = (SpecialEffectsController) obj2;
                SpecialEffectsController.a operation = (SpecialEffectsController.a) obj;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                kotlin.jvm.internal.g.e(operation, "$operation");
                this$0.f3718b.remove(operation);
                this$0.c.remove(operation);
                return;
            case 2:
                Activity activity = (Activity) obj2;
                h5.b this$02 = (h5.b) obj;
                kotlin.jvm.internal.g.e(activity, "$activity");
                kotlin.jvm.internal.g.e(this$02, "this$0");
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    this$02.d().d(activity, new h5.a(this$02, 0));
                    return;
                }
                return;
            case 3:
                Context applicationContext = (Context) obj2;
                String applicationId = (String) obj;
                com.facebook.d dVar2 = com.facebook.d.f9685a;
                kotlin.jvm.internal.g.e(applicationContext, "$applicationContext");
                kotlin.jvm.internal.g.e(applicationId, "$applicationId");
                com.facebook.d dVar3 = com.facebook.d.f9685a;
                dVar3.getClass();
                try {
                    if (!k6.a.b(dVar3)) {
                        try {
                            com.facebook.internal.a aVar2 = com.facebook.internal.a.f9745f;
                            com.facebook.internal.a a10 = a.C0146a.a(applicationContext);
                            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                            String concat = applicationId.concat("ping");
                            long j10 = sharedPreferences.getLong(concat, 0L);
                            try {
                                JSONObject a11 = AppEventsLoggerUtility.a(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, a10, com.facebook.appevents.k.a(applicationContext), com.facebook.d.e(applicationContext), applicationContext);
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = com.facebook.appevents.l.c;
                                String d10 = l.a.d();
                                if (d10 != null) {
                                    a11.put(Constants.INSTALL_REFERRER, d10);
                                }
                                String format = String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1));
                                kotlin.jvm.internal.g.d(format, "format(format, *args)");
                                com.facebook.d.f9699p.getClass();
                                String str = com.facebook.e.f9701j;
                                com.facebook.e h10 = e.c.h(null, format, a11, null);
                                if (j10 == 0 && h10.c().c == null) {
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    edit.putLong(concat, System.currentTimeMillis());
                                    edit.apply();
                                    j.a aVar3 = com.facebook.internal.j.f9803d;
                                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                                    String TAG = com.facebook.d.f9686b;
                                    kotlin.jvm.internal.g.d(TAG, "TAG");
                                    j.a.a(loggingBehavior, TAG, "MOBILE_APP_INSTALL has been logged");
                                    return;
                                }
                                return;
                            } catch (JSONException e10) {
                                throw new FacebookException("An error occurred while publishing install.", e10);
                            }
                        } catch (Exception unused) {
                            com.facebook.internal.p pVar = com.facebook.internal.p.f9815a;
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    k6.a.a(dVar3, th2);
                    return;
                }
            case 4:
                v5.f this$03 = (v5.f) obj2;
                TimerTask indexingTask = (TimerTask) obj;
                String str2 = v5.f.f30674e;
                if (!k6.a.b(v5.f.class)) {
                    try {
                        kotlin.jvm.internal.g.e(this$03, "this$0");
                        kotlin.jvm.internal.g.e(indexingTask, "$indexingTask");
                        try {
                            Timer timer = this$03.c;
                            if (timer != null) {
                                timer.cancel();
                            }
                            this$03.f30677d = null;
                            Timer timer2 = new Timer();
                            timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                            this$03.c = timer2;
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    } catch (Throwable th3) {
                        k6.a.a(v5.f.class, th3);
                        return;
                    }
                }
                return;
            case 5:
                ((ab.b) ((Map.Entry) obj2).getKey()).a((ab.a) obj);
                return;
            case 6:
                h.b bVar = (h.b) obj;
                try {
                    ha.h.this.h(((Callable) obj2).call());
                    return;
                } catch (Exception e11) {
                    ha.h.this.i(e11);
                    return;
                }
            case 7:
                Kb.a((Kb) obj2, (C1780qb) obj);
                return;
            case 8:
                Kb.a((Kb) obj2, (InMobiAdRequestStatus) obj);
                return;
            case 9:
                Q7.B((Q7) obj2, (AdMetaInfo) obj);
                return;
            case 10:
                C1662i1.a((C1662i1) obj2, (AdMetaInfo) obj);
                return;
            case 11:
                AbstractC1692k3.a((Map) obj2, (Context) obj);
                return;
            case 12:
                C1694k5.a((C1694k5) obj2, (AdMetaInfo) obj);
                return;
            case 13:
                C1834v1.y((C1834v1) obj2, (AdMetaInfo) obj);
                return;
            case 14:
                AbstractC1846w0.b((AbstractC1846w0) obj2, (S9) obj);
                return;
            case 15:
                C1867x8.a((L7) obj2, (O7) obj);
                return;
            case 16:
                ((oi.f) obj2).j((ei.a) obj);
                return;
            case 17:
                PDFPageView.Y1((PDFPageView) obj2, (PDFFreeTextEditView) obj);
                return;
            case 18:
                lib.zj.pdfeditor.text.editor.a aVar4 = lib.zj.pdfeditor.text.editor.a.this;
                aVar4.V.clear();
                ArrayList<RectF> arrayList = aVar4.V;
                Collections.addAll(arrayList, (RectF[]) obj);
                Collections.sort(arrayList, new l6.b(1));
                aVar4.f21687f.invalidate();
                aVar4.n();
                return;
            case 19:
                cg.l lVar = (cg.l) obj2;
                AIDataBase aIDataBase = km.e.f19907a;
                kotlin.jvm.internal.g.e(lVar, ea.a.p("F28lRxZ0JGkcaUdoDGQ=", "6XJH2cEa"));
                lVar.invoke((List) obj);
                return;
            case 20:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj2;
                ArrayList<bn.a> arrayList2 = (ArrayList) obj;
                PDFPageManagerActivity.a aVar5 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("R2gic1cw", "5xuHjv2T"));
                kotlin.jvm.internal.g.e(arrayList2, ea.a.p("F3MubBZjFkQTdGE=", "BN2l13aU"));
                tn.a.b(pDFPageManagerActivity, ea.a.p("IG4IcClnZQ==", "qmMoH9CV"), ea.a.p("Xm4scBJnB18WZVhlHWUJZCtuZQ==", "RLiRMvYa"));
                for (bn.a aVar6 : arrayList2) {
                    WeakReference<Bitmap> weakReference = aVar6.f5488a;
                    if (weakReference != null && (bitmap2 = weakReference.get()) != null) {
                        bitmap2.recycle();
                    }
                    aVar6.f5488a = null;
                    WeakReference<Bitmap> weakReference2 = aVar6.f5489b;
                    if (weakReference2 != null && (bitmap = weakReference2.get()) != null) {
                        bitmap.recycle();
                    }
                    aVar6.f5489b = null;
                }
                vm.i q22 = pDFPageManagerActivity.q2();
                Iterator<bn.a> it = q22.f30865e.iterator();
                kotlin.jvm.internal.g.d(it, ea.a.p("WnQubQAuC3QXclV0BnJ-KQ==", "Xw3jXasg"));
                while (it.hasNext()) {
                    bn.a next = it.next();
                    kotlin.jvm.internal.g.d(next, ea.a.p("AHQtclJ0C3JmbgN4QCgp", "TUiH3dLj"));
                    bn.a aVar7 = next;
                    if (aVar7.f5492f) {
                        it.remove();
                        q22.notifyItemRemoved(i11);
                    } else {
                        aVar7.f5491e = i11;
                        i11++;
                    }
                }
                pDFPageManagerActivity.s2().f();
                pDFPageManagerActivity.I2(pDFPageManagerActivity.q2().getItemCount());
                return;
            case 21:
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d dVar4 = (pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d) obj2;
                bn.a aVar8 = (bn.a) obj;
                d.a aVar9 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d.f25379j0;
                kotlin.jvm.internal.g.e(dVar4, ea.a.p("R2gic1cw", "VZLJaYT7"));
                kotlin.jvm.internal.g.e(aVar8, ea.a.p("F2l0", "55dABOHa"));
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f t4 = dVar4.t();
                if (t4 != null && (readerPDFCore = t4.f25317x) != null) {
                    dVar4.f25386i0 = readerPDFCore.getPageBackgroundColor(aVar8.f5491e);
                    dVar4.f25382e0 = readerPDFCore.getPageSize(aVar8.f5491e);
                    dVar4.f25383f0 = readerPDFCore.getZoomInfo();
                    if (dVar4.f25382e0 != null) {
                        w0.a().f28791b.execute(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.a(dVar4, 1));
                        return;
                    }
                    return;
                }
                return;
            case 22:
                Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = (Pdf2ImageBigPicPreviewActivity) obj2;
                ReaderPDFCore readerPDFCore2 = (ReaderPDFCore) obj;
                Pdf2ImageBigPicPreviewActivity.a aVar10 = Pdf2ImageBigPicPreviewActivity.f25491w0;
                kotlin.jvm.internal.g.e(pdf2ImageBigPicPreviewActivity, ea.a.p("F2gMcx0w", "sFce9pTA"));
                kotlin.jvm.internal.g.e(readerPDFCore2, ea.a.p("Y2NXcmU=", "PLG87FjD"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(pdf2ImageBigPicPreviewActivity)) {
                    pdf2ImageBigPicPreviewActivity.b3().f25453e = readerPDFCore2;
                    ArrayList arrayList3 = (ArrayList) en.a.f16816b.d();
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a b32 = pdf2ImageBigPicPreviewActivity.b3();
                    b32.getClass();
                    ArrayList<bn.a> arrayList4 = b32.f25452d;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    b32.notifyDataSetChanged();
                    int size = arrayList3.size();
                    int i12 = pdf2ImageBigPicPreviewActivity.f25496q0;
                    if (i12 >= 0 && i12 < size) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        Object obj3 = arrayList3.get(i12);
                        kotlin.jvm.internal.g.d(obj3, ea.a.p("I2lCdCJzUmw_Yz5QFGcNTkBtXQ==", "Ev4BGwtA"));
                        int i13 = ((bn.a) obj3).f5491e;
                        int i14 = pdf2ImageBigPicPreviewActivity.f25496q0;
                        if (i13 == i14) {
                            pdf2ImageBigPicPreviewActivity.f25495p0 = i14;
                            pdf2ImageBigPicPreviewActivity.Z2().f1325q.i(pdf2ImageBigPicPreviewActivity.f25495p0, false);
                        } else {
                            Iterator it2 = arrayList3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (((bn.a) next2).f5491e == pdf2ImageBigPicPreviewActivity.f25496q0) {
                                        z11 = true;
                                        continue;
                                    } else {
                                        z11 = false;
                                        continue;
                                    }
                                    if (z11) {
                                        aVar = next2;
                                    }
                                }
                            }
                            bn.a aVar11 = aVar;
                            if (aVar11 != null) {
                                pdf2ImageBigPicPreviewActivity.f25495p0 = arrayList3.indexOf(aVar11);
                                pdf2ImageBigPicPreviewActivity.Z2().f1325q.i(pdf2ImageBigPicPreviewActivity.f25495p0, false);
                            }
                        }
                    }
                    pdf2ImageBigPicPreviewActivity.e3();
                    return;
                }
                return;
            case 23:
                PreviewPageManageGuideView previewPageManageGuideView = (PreviewPageManageGuideView) obj2;
                x1 x1Var = (x1) obj;
                int i15 = PreviewPageManageGuideView.f25608s;
                kotlin.jvm.internal.g.e(previewPageManageGuideView, ea.a.p("JmgOc2Iw", "iiRgFml9"));
                kotlin.jvm.internal.g.e(x1Var, ea.a.p("a3RZaQpfRXVu", "RUtWJbZO"));
                previewPageManageGuideView.setVisibility(0);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) x1Var.f1647e;
                lottieAnimationView.setFrame(0);
                lottieAnimationView.setRepeatCount(0);
                lottieAnimationView.j();
                AppCompatTextView appCompatTextView = (AppCompatTextView) x1Var.f1646d;
                appCompatTextView.setAlpha(0.0f);
                appCompatTextView.post(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.c(x1Var, 2));
                return;
            case 24:
                m0.c((Word2PDFConvertActivity) obj2, (List) obj);
                return;
            case 25:
                View view2 = (View) obj;
                ReaderPreviewActivity readerPreviewActivity = ((b2) obj2).f5019a;
                if (readerPreviewActivity.I5) {
                    readerPreviewActivity.h(view2.getResources().getString(R.string.arg_res_0x7f1300d4));
                    return;
                }
                readerPreviewActivity.K = 2;
                readerPreviewActivity.f26223n1 = ea.a.p("RWkudwNvEnVw", "7xJO5XeU");
                readerPreviewActivity.f26229o1 = ea.a.p("OWlUdwlvR3Vw", "php3B8EE");
                readerPreviewActivity.L = PDFTextEditorMode.TEXT_AND_IMG;
                ReaderPreviewActivity.k2(readerPreviewActivity);
                return;
            case 26:
                Context context = (Context) obj2;
                tf.c cVar = FileReadProgressChecker.f26553a;
                kotlin.jvm.internal.g.e(context, ea.a.p("E2MdbiJlCHQ=", "nE7rVpIM"));
                yn.c.f32199o.i0(context, ((List) obj).size());
                return;
            case 27:
                WeakReference weakReference3 = (WeakReference) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                RecentAddedActivity.a aVar12 = RecentAddedActivity.f26850l0;
                kotlin.jvm.internal.g.e(weakReference3, ea.a.p("F3cuYRhDDW4GZUx0", "ilvFaMAp"));
                kotlin.jvm.internal.g.e(arrayList5, ea.a.p("F3QubXA=", "8SNWS5MC"));
                Object obj4 = weakReference3.get();
                kotlin.jvm.internal.g.b(obj4);
                Context context2 = (Context) obj4;
                if (arrayList5.isEmpty()) {
                    intent = new Intent(context2, ReaderMergePdfActivity.class);
                } else {
                    List a12 = DataBridge.a();
                    a12.clear();
                    a12.addAll(arrayList5);
                    intent = new Intent(context2, ReaderMergePdfActivity.class);
                }
                context2.startActivity(intent);
                return;
            default:
                cg.l lVar2 = (cg.l) obj2;
                PDFChooseActivity pDFChooseActivity = (PDFChooseActivity) obj;
                PDFChooseActivity.a aVar13 = PDFChooseActivity.f27008u0;
                kotlin.jvm.internal.g.e(pDFChooseActivity, ea.a.p("R2gic1cw", "5tivaLgG"));
                if (lVar2 != null) {
                    lVar2.invoke(pDFChooseActivity.t2());
                    return;
                }
                return;
        }
    }
}
