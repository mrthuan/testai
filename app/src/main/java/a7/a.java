package a7;

import a6.h;
import am.e2;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import cg.l;
import cg.p;
import com.google.android.play.core.assetpacks.b1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import lib.zj.pdfeditor.ReaderPDFCore;
import okhttp3.n;
import okhttp3.t;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.q0;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.v;
import pdf.pdfreader.viewer.editor.free.utils.GetPDFPasswordProcess;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import pdf.pdfreader.viewer.editor.free.utils.x;
import pdf.pdfreader.viewer.editor.free.utils.y;
import s6.g;
import sb.f;
import v6.n;
import v6.s;
import w6.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f85a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f86b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f87d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f88e;

    public /* synthetic */ a(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f85a = i10;
        this.f86b = obj;
        this.c = obj2;
        this.f87d = obj3;
        this.f88e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale;
        String str;
        Locale locale2;
        String str2;
        LocaleList locales;
        LocaleList locales2;
        int i10 = this.f85a;
        String str3 = "";
        boolean z10 = false;
        Object obj = this.f88e;
        Object obj2 = this.f87d;
        Object obj3 = this.c;
        Object obj4 = this.f86b;
        switch (i10) {
            case 0:
                c cVar = (c) obj4;
                s sVar = (s) obj3;
                g gVar = (g) obj2;
                n nVar = (n) obj;
                cVar.getClass();
                Logger logger = c.f91f;
                try {
                    i iVar = cVar.c.get(sVar.b());
                    if (iVar == null) {
                        String format = String.format("Transport backend '%s' is not registered", sVar.b());
                        logger.warning(format);
                        gVar.b(new IllegalArgumentException(format));
                    } else {
                        cVar.f95e.a(new b(cVar, sVar, iVar.b(nVar)));
                        gVar.b(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar.b(e10);
                    return;
                }
            case 1:
                Map map = (Map) obj4;
                Context context = (Context) obj3;
                String url = (String) obj2;
                p callback = (p) obj;
                kotlin.jvm.internal.g.e(context, "$context");
                kotlin.jvm.internal.g.e(url, "$url");
                kotlin.jvm.internal.g.e(callback, "$callback");
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
                AtomicReference<okhttp3.e> atomicReference = sb.d.f29778a;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("lang", kl.a.b(context).getLanguage());
                if (Build.VERSION.SDK_INT >= 24) {
                    locales2 = Resources.getSystem().getConfiguration().getLocales();
                    locale = locales2.get(0);
                    kotlin.jvm.internal.g.d(locale, ea.a.p("PwpjIGcgdSBoIEYgFCAFZUtvJ3IqZUUuloDXdDhvLC4obyBhK2UmW3hdbCAUIHcgGCByfQ==", "7hDCGUl6"));
                } else {
                    locale = Resources.getSystem().getConfiguration().locale;
                    kotlin.jvm.internal.g.d(locale, ea.a.p("MAprIFUgSCBoIEYgFCAFZUtvJ3IqZUUuloDXZyRyI3QibyUuGW8LYSRlbCAUIHcgGCByfQ==", "HJKKuhmL"));
                }
                jSONObject2.put("lang_os", locale.getLanguage());
                if (TextUtils.isEmpty(kl.a.f19861a)) {
                    try {
                        Properties properties = new Properties();
                        try {
                            properties.load(context.getAssets().open(ea.a.p("LG9fZhBnGXAobzplB3QBZXM=", "dC3JOpDW")));
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        if (properties.containsKey(ea.a.p("FGUDcwpvbg==", "djbqc4iO"))) {
                            str3 = properties.getProperty(ea.a.p("OWVDcxBvbg==", "odLuDEcK"));
                        }
                        kl.a.f19861a = str3;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                String str4 = kl.a.f19861a;
                if (str4 != null) {
                    str = h.c(androidx.activity.s.f1850e, str4);
                } else {
                    str = androidx.activity.s.f1850e;
                }
                jSONObject2.put("app_version", str);
                jSONObject2.put("os_version", Build.VERSION.RELEASE);
                jSONObject2.put("brand", Build.BRAND);
                jSONObject2.put("device", Build.DEVICE);
                if (Build.VERSION.SDK_INT >= 24) {
                    locales = Resources.getSystem().getConfiguration().getLocales();
                    locale2 = locales.get(0);
                    kotlin.jvm.internal.g.d(locale2, ea.a.p("PwpjIGcgdSBoIEYgFCAFZUtvJ3IqZUUuloDXdDhvLC4obyBhK2UmW3hdbCAUIHcgGCByfQ==", "7hDCGUl6"));
                } else {
                    locale2 = Resources.getSystem().getConfiguration().locale;
                    kotlin.jvm.internal.g.d(locale2, ea.a.p("MAprIFUgSCBoIEYgFCAFZUtvJ3IqZUUuloDXZyRyI3QibyUuGW8LYSRlbCAUIHcgGCByfQ==", "HJKKuhmL"));
                }
                jSONObject2.put("country", locale2.getCountry());
                if (!TextUtils.isEmpty(b1.f13192p)) {
                    str2 = b1.f13192p;
                } else {
                    sb.c.c.getClass();
                    String str5 = (String) sb.c.f29777e.b(sb.c.f29776d[0]);
                    b1.f13192p = str5;
                    if (TextUtils.isEmpty(str5)) {
                        String uuid = UUID.randomUUID().toString();
                        kotlin.jvm.internal.g.d(uuid, "randomUUID().toString()");
                        b1.f13192p = uuid;
                    }
                    str2 = b1.f13192p;
                }
                jSONObject2.put("uuid", str2);
                jSONObject2.put("lang_fname", kl.a.b(context).getDisplayLanguage(kl.a.b(context)));
                jSONObject.put("params", jSONObject2);
                AtomicReference<okhttp3.e> atomicReference2 = sb.d.f29778a;
                String jSONObject3 = jSONObject.toString();
                kotlin.jvm.internal.g.d(jSONObject3, "jsonObject.toString()");
                String b10 = b5.a.b(context, jSONObject3);
                kotlin.jvm.internal.g.d(b10, "encryptData(context, data)");
                n.a aVar = new n.a(0);
                aVar.a("modetype", String.valueOf(sb.d.f29779b));
                aVar.a("data", b10);
                String packageName = context.getPackageName();
                kotlin.jvm.internal.g.d(packageName, "context.packageName");
                aVar.a("pkg", packageName);
                okhttp3.n nVar2 = new okhttp3.n(aVar.f23360b, aVar.c);
                t.a aVar2 = new t.a();
                aVar2.e(url);
                aVar2.a("Content-Type", "application/x-www-form-urlencoded");
                aVar2.d("POST", nVar2);
                okhttp3.internal.connection.e a10 = sb.d.f29780d.a(aVar2.b());
                sb.d.f29778a.set(a10);
                a10.e(new f(callback, context));
                if (sb.d.f29779b != 1) {
                    jSONObject.toString();
                    context.getPackageName();
                    return;
                }
                return;
            case 2:
                e2 e2Var = (e2) obj4;
                int[] iArr = (int[]) obj3;
                View view = (View) obj2;
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj;
                PDFPageManagerActivity.a aVar3 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(e2Var, ea.a.p("XHBYcChpIWQhbmc=", "J2x7jOPg"));
                kotlin.jvm.internal.g.e(iArr, ea.a.p("F2MsciplGXQeaQN3eG80YUxpPW4=", "ss3YXw9p"));
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "WLPXRT4w"));
                LinearLayout linearLayout = (LinearLayout) e2Var.f868h;
                kotlin.jvm.internal.g.d(linearLayout, ea.a.p("P29BQhBuU2k0Z2R2Nm8GdFBuGkJn", "zfFPWuX2"));
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    ((ViewGroup.MarginLayoutParams) bVar).leftMargin = (((view.getWidth() / 2) + iArr[0]) - (linearLayout.getMeasuredWidth() / 2)) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_28);
                    linearLayout.setLayoutParams(bVar);
                    return;
                }
                throw new NullPointerException(ea.a.p("JHU7bFNjVm4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA-eSdlU2FZZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdyNkMGUHLnRvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyK21z", "QGJWs7Ci"));
            case 3:
                ReaderSearchActivity readerSearchActivity = (ReaderSearchActivity) obj4;
                String str6 = ReaderSearchActivity.f26794c0;
                readerSearchActivity.getClass();
                DecryptAndCopyUIHelper decryptAndCopyUIHelper = new DecryptAndCopyUIHelper((Context) ((WeakReference) obj3).get(), (ArrayList) obj2, new q0(0, readerSearchActivity, (ArrayList) obj));
                if (readerSearchActivity.U == 1 && TextUtils.equals(readerSearchActivity.V, ea.a.p("QG8cbHM=", "Wk4s7lX9"))) {
                    decryptAndCopyUIHelper.f24225j = new ReaderSearchActivity.j();
                }
                decryptAndCopyUIHelper.g();
                return;
            case 4:
                BaseOperatePDFActivity baseOperatePDFActivity = (BaseOperatePDFActivity) obj4;
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) obj3;
                ReaderPDFCore readerPDFCore = (ReaderPDFCore) obj2;
                l lVar = (l) obj;
                int i11 = BaseOperatePDFActivity.Z;
                kotlin.jvm.internal.g.e(baseOperatePDFActivity, ea.a.p("R2gic1cw", "M7SljSF7"));
                kotlin.jvm.internal.g.e(pdfPreviewEntity, ea.a.p("F2UldBp0eQ==", "g0NO8RZe"));
                kotlin.jvm.internal.g.e(readerPDFCore, ea.a.p("QGMXcmU=", "HhdxxJil"));
                kotlin.jvm.internal.g.e(lVar, ea.a.p("a29fQxFlVGsJdSljEHNz", "Rn64yJ82"));
                try {
                    baseOperatePDFActivity.I1();
                    if (pdfPreviewEntity.isOtherBoolOne() != readerPDFCore.needsPassword()) {
                        pdfPreviewEntity.setOtherBoolOne(readerPDFCore.needsPassword());
                        pdfPreviewEntity.setOtherIntOne(1);
                        bm.c.b(baseOperatePDFActivity).i(pdfPreviewEntity);
                        baseOperatePDFActivity.w2();
                    }
                    int countPages = readerPDFCore.countPages();
                    readerPDFCore.onDestroy();
                    if (countPages > 0) {
                        z10 = true;
                    }
                    if (z10) {
                        lVar.invoke(Integer.valueOf(countPages));
                        return;
                    }
                    throw new IllegalArgumentException(ea.a.p("dWEibBZkQnIXcUFpG2U7ZSp0Lg==", "kFo25o6c").toString());
                } catch (Exception e13) {
                    e13.printStackTrace();
                    j1.e(baseOperatePDFActivity, baseOperatePDFActivity.getString(R.string.arg_res_0x7f130390), true, null, -1);
                    return;
                }
            default:
                x xVar = (x) obj4;
                ReaderPDFCore readerPDFCore2 = (ReaderPDFCore) obj3;
                GetPDFPasswordProcess getPDFPasswordProcess = (GetPDFPasswordProcess) obj2;
                kotlin.jvm.internal.g.e(xVar, ea.a.p("F2wicwdlDGVy", "qHOo7Sl9"));
                kotlin.jvm.internal.g.e(readerPDFCore2, ea.a.p("E2l0", "7B7GwHWo"));
                kotlin.jvm.internal.g.e(getPDFPasswordProcess, ea.a.p("R2gic1cw", "6RHKo5Iz"));
                kotlin.jvm.internal.g.e((String) obj, ea.a.p("a3BQdGg=", "jYZ6IbWc"));
                xVar.h();
                if (readerPDFCore2.needsPassword()) {
                    v a11 = getPDFPasswordProcess.a();
                    y yVar = new y(xVar, getPDFPasswordProcess);
                    a11.getClass();
                    a11.f23532h = yVar;
                    getPDFPasswordProcess.a().show();
                    xVar.a();
                    return;
                }
                w0.a().c.execute(new pdf.pdfreader.viewer.editor.free.ui.widget.act.a(getPDFPasswordProcess, 1));
                xVar.i("", false);
                return;
        }
    }
}
