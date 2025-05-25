package a6;

import am.e2;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.iap.e;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageRGBColor;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageSize;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f73a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f74b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f75d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f76e;

    public /* synthetic */ g(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f73a = i10;
        this.c = obj;
        this.f75d = obj2;
        this.f76e = obj3;
        this.f74b = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String f10;
        String valueOf;
        int i10 = this.f73a;
        Object obj = this.f74b;
        Object obj2 = this.f76e;
        Object obj3 = this.f75d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                com.facebook.appevents.iap.e this$0 = (com.facebook.appevents.iap.e) obj4;
                Runnable completionHandler = (Runnable) obj3;
                InAppPurchaseUtils.IAPProductType productType = (InAppPurchaseUtils.IAPProductType) obj2;
                List<String> productIds = (List) obj;
                if (!k6.a.b(com.facebook.appevents.iap.e.class)) {
                    try {
                        kotlin.jvm.internal.g.e(this$0, "this$0");
                        Class<?> cls = this$0.f9577n;
                        kotlin.jvm.internal.g.e(completionHandler, "$completionHandler");
                        kotlin.jvm.internal.g.e(productType, "$productType");
                        kotlin.jvm.internal.g.e(productIds, "$productIds");
                        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new e.b(this$0, new Object[]{completionHandler}));
                        Object d10 = this$0.d(productType, productIds);
                        if (d10 != null) {
                            Class<?> cls2 = this$0.f9566b;
                            Method method = this$0.f9585v;
                            Object obj5 = null;
                            if (!k6.a.b(this$0)) {
                                obj5 = this$0.f9565a;
                            }
                            InAppPurchaseUtils.d(cls2, method, obj5, d10, newProxyInstance);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(com.facebook.appevents.iap.e.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                PageSize pageSize = (PageSize) obj4;
                PageRGBColor pageRGBColor = (PageRGBColor) obj3;
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj2;
                List<Integer> list = (List) obj;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "FdnWe1jT"));
                kotlin.jvm.internal.g.e(list, ea.a.p("QGY4by9QInMhdA9vbg==", "HNdJBMEC"));
                ArrayList arrayList = (ArrayList) an.a.c.d();
                if (arrayList != null) {
                    if (pageSize == PageSize.Custom) {
                        f10 = ea.a.p("XHIsbA==", "dGAtf5aG");
                    } else {
                        String name = pageSize.name();
                        Locale locale = Locale.ENGLISH;
                        f10 = h.f("dk4MTDpTSA==", "a7YHWJN0", locale, name, locale);
                        kotlin.jvm.internal.g.d(f10, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnby4Sby5vIGU9Q1BzHChbbzlhJmUp", "YlumFfbW"));
                    }
                    if (pageRGBColor == PageRGBColor.NONE) {
                        valueOf = ea.a.p("V28DZQ==", "H99moj8J");
                    } else {
                        valueOf = String.valueOf(pageRGBColor.ordinal() - 1);
                    }
                    tn.a.d(pDFPageManagerActivity, ea.a.p("Im5WcBhnZQ==", "Dss4TbNY"), ea.a.p("Xm4scBJnB18CYVNlGmUiXyVwQmx5", "nW0lt4pS"), androidx.activity.f.m(f10, "_", valueOf), false);
                    ReaderPDFCore readerPDFCore = pDFPageManagerActivity.f25317x;
                    if (readerPDFCore != null) {
                        ij.e eVar = new ij.e();
                        eVar.f18535a = 5;
                        eVar.f18537d = list;
                        readerPDFCore.addPageManagerAction(eVar);
                    }
                    pDFPageManagerActivity.f25313t.post(new n0.g(28, arrayList, pDFPageManagerActivity));
                    return;
                }
                return;
            default:
                e2 e2Var = (e2) obj4;
                int[] iArr = (int[]) obj3;
                View view = (View) obj2;
                PDFPageManagerActivity pDFPageManagerActivity2 = (PDFPageManagerActivity) obj;
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(e2Var, ea.a.p("bHA7cA1pJ2Qhbmc=", "GcHTOIFH"));
                kotlin.jvm.internal.g.e(iArr, ea.a.p("F2M-cgFlDHQkaVF3JW81YTBpXW4=", "2SCWUNCg"));
                kotlin.jvm.internal.g.e(pDFPageManagerActivity2, ea.a.p("BGhdc2Aw", "hmp4DW19"));
                LinearLayout linearLayout = (LinearLayout) e2Var.f868h;
                kotlin.jvm.internal.g.d(linearLayout, ea.a.p("Cm8IQgBuIGkmZ0h2d285dF1uJkJn", "hpzxiDe9"));
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    int dimensionPixelSize = (pDFPageManagerActivity2.getResources().getDimensionPixelSize(R.dimen.dp_9) + (pDFPageManagerActivity2.getResources().getDimensionPixelSize(R.dimen.dp_42) + (((view.getWidth() / 2) + iArr[0]) - linearLayout.getMeasuredWidth()))) - pDFPageManagerActivity2.getResources().getDimensionPixelSize(R.dimen.dp_28);
                    ((ViewGroup.MarginLayoutParams) bVar).leftMargin = dimensionPixelSize;
                    if (dimensionPixelSize < 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = linearLayout.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = 0;
                    }
                    linearLayout.setLayoutParams(bVar);
                    return;
                }
                throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuOG5mbjJsXiBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQ7YTJvMnQcd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTDZ5JHUzUFNyUm1z", "WKG2GRha"));
        }
    }
}
