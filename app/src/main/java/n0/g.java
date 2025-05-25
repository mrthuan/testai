package n0;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.activity.k;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import com.facebook.a;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.l;
import com.facebook.appevents.s;
import com.facebook.internal.p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.AbstractC1689k0;
import com.inmobi.media.AbstractC1692k3;
import com.inmobi.media.AbstractC1701kc;
import com.inmobi.media.AbstractC1846w0;
import com.inmobi.media.C1662i1;
import com.inmobi.media.C1666i5;
import com.inmobi.media.C1682j7;
import com.inmobi.media.C1688k;
import com.inmobi.media.C1696k7;
import com.inmobi.media.C1743o0;
import com.inmobi.media.C1761p5;
import com.inmobi.media.C1820u0;
import com.inmobi.media.EnumC1648h1;
import com.inmobi.media.Kb;
import com.inmobi.media.Q7;
import com.inmobi.media.S9;
import com.inmobi.media.V6;
import com.inmobi.media.X0;
import ha.h;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.text.editor.EditorView;
import mj.m;
import mj.r;
import n0.f;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderDecryptAndCopyExecutor;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.v;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import v4.o;
import v5.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22299a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f22300b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f22299a = i10;
        this.f22300b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        String str;
        String str2;
        String p10;
        String str3;
        String str4;
        Runnable cVar;
        boolean z10;
        int i10;
        int i11;
        ReaderPDFCore readerPDFCore;
        String str5;
        Bitmap bitmap;
        Bitmap bitmap2;
        boolean z11 = false;
        switch (this.f22299a) {
            case 0:
                ((f.e) this.f22300b).d((Typeface) this.c);
                return;
            case 1:
                ExtensionEmbeddingBackend.SplitListenerWrapper.a((ExtensionEmbeddingBackend.SplitListenerWrapper) this.f22300b, (List) this.c);
                return;
            case 2:
                com.facebook.c this$0 = (com.facebook.c) this.f22300b;
                b.a.i(this.c);
                kotlin.jvm.internal.g.e(this$0, "this$0");
                this$0.a();
                return;
            case 3:
                AccessTokenAppIdPair accessTokenAppId = (AccessTokenAppIdPair) this.f22300b;
                AppEvent appEvent = (AppEvent) this.c;
                String str6 = com.facebook.appevents.i.f9526a;
                if (!k6.a.b(com.facebook.appevents.i.class)) {
                    try {
                        kotlin.jvm.internal.g.e(accessTokenAppId, "$accessTokenAppId");
                        kotlin.jvm.internal.g.e(appEvent, "$appEvent");
                        com.facebook.appevents.c cVar2 = com.facebook.appevents.i.c;
                        synchronized (cVar2) {
                            s d10 = cVar2.d(accessTokenAppId);
                            if (d10 != null) {
                                d10.a(appEvent);
                            }
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = l.c;
                        if (l.a.c() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY && com.facebook.appevents.i.c.c() > com.facebook.appevents.i.f9527b) {
                            com.facebook.appevents.i.d(FlushReason.EVENT_THRESHOLD);
                            return;
                        } else if (com.facebook.appevents.i.f9529e == null) {
                            com.facebook.appevents.i.f9529e = com.facebook.appevents.i.f9528d.schedule(com.facebook.appevents.i.f9530f, 15L, TimeUnit.SECONDS);
                            return;
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        k6.a.a(com.facebook.appevents.i.class, th2);
                        return;
                    }
                }
                return;
            case 4:
                Context context = (Context) this.f22300b;
                l logger = (l) this.c;
                kotlin.jvm.internal.g.e(context, "$context");
                kotlin.jvm.internal.g.e(logger, "$logger");
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i12 = 0;
                for (int i13 = 0; i13 < 11; i13++) {
                    String str7 = strArr[i13];
                    String str8 = strArr2[i13];
                    try {
                        Class.forName(str7);
                        bundle.putInt(str8, 1);
                        i12 |= 1 << i13;
                    } catch (ClassNotFoundException unused) {
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (sharedPreferences.getInt("kitsBitmask", 0) != i12) {
                    sharedPreferences.edit().putInt("kitsBitmask", i12).apply();
                    logger.h("fb_sdk_initialize", bundle);
                    return;
                }
                return;
            case 5:
                String tree = (String) this.f22300b;
                v5.f this$02 = (v5.f) this.c;
                String str9 = v5.f.f30674e;
                if (!k6.a.b(v5.f.class)) {
                    try {
                        kotlin.jvm.internal.g.e(tree, "$tree");
                        kotlin.jvm.internal.g.e(this$02, "this$0");
                        p.f9815a.getClass();
                        byte[] bytes = tree.getBytes(kotlin.text.a.f19966b);
                        kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                        String q5 = p.q("MD5", bytes);
                        Date date = com.facebook.a.f9420l;
                        com.facebook.a b10 = a.b.b();
                        if (q5 == null || !kotlin.jvm.internal.g.a(q5, this$02.f30677d)) {
                            this$02.b(f.a.a(tree, b10, com.facebook.d.b()), q5);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        k6.a.a(v5.f.class, th3);
                        return;
                    }
                }
                return;
            case 6:
                int i14 = JobInfoSchedulerService.f9924a;
                ((JobInfoSchedulerService) this.f22300b).jobFinished((JobParameters) this.c, false);
                return;
            case 7:
                Runnable runnable = (Runnable) this.f22300b;
                h.b bVar = (h.b) this.c;
                try {
                    runnable.run();
                    return;
                } catch (Exception e10) {
                    ha.h.this.i(e10);
                    throw e10;
                }
            case 8:
                Kb.a((Kb) this.f22300b, (EnumC1648h1) this.c);
                return;
            case 9:
                Q7.z((Q7) this.f22300b, (AdMetaInfo) this.c);
                return;
            case 10:
                S9.a((S9) this.f22300b, (String) this.c);
                return;
            case 11:
                V6.a((V6) this.f22300b, (AbstractC1701kc) this.c);
                return;
            case 12:
                X0.b((C1688k) this.f22300b, (String) this.c);
                return;
            case 13:
                C1662i1.a((C1662i1) this.f22300b, (RelativeLayout) this.c);
                return;
            case 14:
                C1666i5.a((C1666i5) this.f22300b, (AbstractC1689k0) this.c);
                return;
            case 15:
                AbstractC1692k3.a((Integer) this.f22300b, (Context) this.c);
                return;
            case 16:
                C1696k7.a(this.f22300b, (C1696k7) this.c);
                return;
            case 17:
                C1743o0.a((C1682j7) this.f22300b, (AbstractC1846w0) this.c);
                return;
            case 18:
                C1761p5.b((C1761p5) this.f22300b, (String) this.c);
                return;
            case 19:
                C1820u0.b((AbstractC1846w0) this.f22300b, (WeakReference) this.c);
                return;
            case 20:
                AbstractC1846w0.c((AbstractC1846w0) this.f22300b, (S9) this.c);
                return;
            case 21:
                lib.zj.pdfeditor.text.editor.a aVar = (lib.zj.pdfeditor.text.editor.a) this.f22300b;
                ReaderPDFCore.FontInfo fontInfo = (ReaderPDFCore.FontInfo) this.c;
                if (!aVar.S.isEmpty()) {
                    aVar.h();
                    PDFPageView pDFPageView = aVar.f21687f;
                    RectF rectF = aVar.S;
                    ViewParent parent = pDFPageView.getParent();
                    if (parent instanceof PDFReaderView) {
                        PDFReaderView pDFReaderView = (PDFReaderView) parent;
                        int i15 = pDFPageView.c;
                        RectF rectF2 = pDFReaderView.f21419u0;
                        rectF2.set(rectF);
                        pDFReaderView.f21425x0 = i15;
                        pDFReaderView.postDelayed(new androidx.activity.i(rectF2, 19), 1000L);
                    }
                }
                EditorView editorView = aVar.f21687f.getEditorView();
                if (editorView != null) {
                    editorView.f21670i = true;
                    editorView.e();
                }
                aVar.F = fontInfo;
                aVar.l();
                aVar.f21687f.invalidate();
                return;
            case 22:
                RectF rectF3 = (RectF) this.c;
                lib.zj.pdfeditor.text.editor.a aVar2 = ((m) this.f22300b).f22116e;
                aVar2.x(rectF3, rectF3, rectF3);
                aVar2.f21687f.invalidate();
                return;
            case 23:
                r rVar = (r) this.f22300b;
                rVar.f22131d.f21695m = (ArrayList) this.c;
                rVar.f22131d.f21687f.invalidate();
                return;
            case 24:
                wl.e eVar = (wl.e) this.f22300b;
                String str10 = (String) this.c;
                kotlin.jvm.internal.g.e(eVar, ea.a.p("R2gic1cw", "90Sy2BFb"));
                wl.a aVar3 = eVar.f31369f;
                if (aVar3 != null) {
                    aVar3.p(100, 100);
                }
                w0.a().f28791b.f28792a.postDelayed(new l1.a(15, (Object) eVar, str10), 200L);
                return;
            case 25:
                ReaderDecryptAndCopyExecutor readerDecryptAndCopyExecutor = (ReaderDecryptAndCopyExecutor) this.f22300b;
                Exception exc2 = (Exception) this.c;
                kotlin.jvm.internal.g.e(readerDecryptAndCopyExecutor, ea.a.p("O2hYc10w", "KnguGVwm"));
                kotlin.jvm.internal.g.e(exc2, ea.a.p("XWU=", "CTyJ1h9A"));
                readerDecryptAndCopyExecutor.w0(exc2);
                return;
            case 26:
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f fVar = (pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f) this.f22300b;
                String str11 = (String) this.c;
                String str12 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f.D;
                kotlin.jvm.internal.g.e(fVar, ea.a.p("O2hYc10w", "WDZdOrMK"));
                Handler handler = fVar.f25313t;
                kotlin.jvm.internal.g.e(str11, ea.a.p("a3BQdGg=", "u6kCsmot"));
                try {
                    try {
                        ReaderPDFCore readerPDFCore2 = new ReaderPDFCore(fVar, str11);
                        fVar.f25317x = readerPDFCore2;
                        readerPDFCore2.countPages();
                        String str13 = n0.f28727a;
                        cVar = new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.b(fVar, 0);
                    } catch (Exception e11) {
                        e11.getMessage();
                        String str14 = n0.f28727a;
                        cVar = new k(fVar, 25);
                    } catch (OutOfMemoryError e12) {
                        e12.getMessage();
                        String str15 = n0.f28727a;
                        cVar = new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.c(fVar, 0);
                    }
                    handler.post(cVar);
                    return;
                } catch (Throwable th4) {
                    handler.post(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(fVar, 1));
                    throw th4;
                }
            case 27:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) this.f22300b;
                List list = (List) this.c;
                PDFPageManagerActivity.a aVar4 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "RZrhTkAP"));
                pDFPageManagerActivity.f25273l0 = 0L;
                Handler handler2 = pDFPageManagerActivity.f25313t;
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.r rVar2 = pDFPageManagerActivity.f25274m0;
                handler2.removeCallbacks(rVar2);
                handler2.postDelayed(rVar2, 500L);
                pDFPageManagerActivity.V = true;
                ArrayList<bn.a> arrayList = (ArrayList) an.a.c.d();
                if (arrayList != null && !arrayList.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    i10 = pDFPageManagerActivity.q2().getItemCount();
                } else {
                    int i16 = 0;
                    for (bn.a aVar5 : arrayList) {
                        int i17 = aVar5.f5491e;
                        if (i17 > i16) {
                            i16 = i17;
                        }
                    }
                    i10 = i16 + 1;
                    if (i10 > pDFPageManagerActivity.q2().getItemCount()) {
                        i10 = pDFPageManagerActivity.q2().getItemCount();
                    } else if (i10 < 0) {
                        i10 = 0;
                    }
                }
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                List<ul.b> list2 = list;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g.h0(list2, 10));
                for (ul.b bVar2 : list2) {
                    ul.b bVar3 = bVar2.f30423u;
                    if (bVar3 != null) {
                        str5 = bVar3.f30410h;
                    } else {
                        str5 = null;
                    }
                    arrayList2.add(str5);
                }
                String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
                ReaderPDFCore readerPDFCore3 = pDFPageManagerActivity.f25317x;
                if (readerPDFCore3 != null) {
                    i11 = readerPDFCore3.insertFiles(strArr3, i10);
                } else {
                    i11 = 0;
                }
                ref$IntRef.element = i11;
                if (i11 < list.size()) {
                    z11 = true;
                }
                ref$BooleanRef.element = z11;
                if (ref$IntRef.element > 0 && (readerPDFCore = pDFPageManagerActivity.f25317x) != null) {
                    ij.e eVar2 = new ij.e();
                    eVar2.f18535a = 1;
                    eVar2.f18538e = i10;
                    eVar2.f18539f = ref$IntRef.element;
                    readerPDFCore.addPageManagerAction(eVar2);
                }
                pDFPageManagerActivity.f25313t.postDelayed(new o(ref$BooleanRef, pDFPageManagerActivity, ref$IntRef, i10), PDFPageManagerActivity.p2(pDFPageManagerActivity.f25273l0));
                return;
            case 28:
                ArrayList<bn.a> arrayList3 = (ArrayList) this.f22300b;
                PDFPageManagerActivity pDFPageManagerActivity2 = (PDFPageManagerActivity) this.c;
                PDFPageManagerActivity.a aVar6 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(arrayList3, ea.a.p("F3MubBZjFkQTdGE=", "gcdaf57D"));
                kotlin.jvm.internal.g.e(pDFPageManagerActivity2, ea.a.p("R2gic1cw", "mf7U5QyZ"));
                for (bn.a aVar7 : arrayList3) {
                    WeakReference<Bitmap> weakReference = aVar7.f5488a;
                    if (weakReference != null && (bitmap2 = weakReference.get()) != null) {
                        bitmap2.recycle();
                    }
                    aVar7.f5488a = null;
                    WeakReference<Bitmap> weakReference2 = aVar7.f5489b;
                    if (weakReference2 != null && (bitmap = weakReference2.get()) != null) {
                        bitmap.recycle();
                    }
                    aVar7.f5489b = null;
                    pDFPageManagerActivity2.q2().notifyItemChanged(aVar7.f5491e);
                }
                return;
            default:
                List list3 = (List) this.f22300b;
                BasePdf2ImageActivity basePdf2ImageActivity = (BasePdf2ImageActivity) this.c;
                String str16 = BasePdf2ImageActivity.f25476k0;
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("O2hYc10w", "DMTQBROY"));
                if (list3 != null) {
                    sn.d d11 = sn.d.d();
                    cn.e.f5754a.getClass();
                    String c = cn.e.c(basePdf2ImageActivity);
                    pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.l lVar = new pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.l(basePdf2ImageActivity);
                    d11.getClass();
                    if (list3.size() != 0) {
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            if (list3.get(i18) != null) {
                                String filePath = ((ImageFileInfo) list3.get(i18)).getFilePath();
                                if (filePath == null) {
                                    str = "";
                                } else {
                                    str = filePath;
                                }
                                ConcurrentHashMap<String, File> concurrentHashMap = v.f28781a;
                                int lastIndexOf = str.lastIndexOf(46);
                                if (lastIndexOf > 0 && lastIndexOf < str.length() - 1) {
                                    str2 = str.substring(lastIndexOf + 1);
                                } else {
                                    str2 = "";
                                }
                                if (ea.a.p("OW5n", "MQIQM7Av").equalsIgnoreCase(str2)) {
                                    p10 = ea.a.p("RnBYZw==", "6Ah6uZ9z");
                                    str3 = sn.d.f29834g;
                                } else {
                                    p10 = ea.a.p("HWo7Zw==", "7lr630jK");
                                    str3 = sn.d.f29833f;
                                }
                                String str17 = str3;
                                if (filePath == null) {
                                    filePath = "";
                                }
                                File file = new File(filePath);
                                StringBuilder k10 = a0.a.k(c);
                                k10.append(ea.a.p("Xw==", "KxEC88rs"));
                                k10.append(i18 + 1);
                                k10.append(p10);
                                String sb2 = k10.toString();
                                sn.c cVar3 = new sn.c(i18, lVar, arrayList5);
                                Context applicationContext = basePdf2ImageActivity.getApplicationContext();
                                boolean isEmpty = TextUtils.isEmpty("");
                                String str18 = sn.d.f29830b;
                                if (!isEmpty) {
                                    str4 = androidx.activity.r.g(a0.a.k(str18), File.separator, "");
                                } else {
                                    str4 = str18;
                                }
                                String l10 = sn.d.l(applicationContext, file, str17, sn.d.f29831d, str4, sb2, false, cVar3);
                                if (!TextUtils.isEmpty(l10)) {
                                    arrayList4.add(l10);
                                }
                            }
                        }
                        arrayList4.size();
                        arrayList5.size();
                        if (arrayList5.size() > 0) {
                            exc = (Exception) arrayList5.get(0);
                        } else {
                            exc = null;
                        }
                        lVar.b(arrayList4, exc);
                        sn.d.h(basePdf2ImageActivity, arrayList4);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
