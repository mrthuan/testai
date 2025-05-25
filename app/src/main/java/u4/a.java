package u4;

import am.e2;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import cg.q;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.p;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import f6.f;
import java.io.File;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.regex.Pattern;
import okhttp3.r;
import okhttp3.t;
import okhttp3.u;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import u4.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30153a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f30154b;
    public final /* synthetic */ Serializable c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f30155d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f30156e;

    public /* synthetic */ a(Context context, SdkInitializationListener sdkInitializationListener, String str, JSONObject jSONObject) {
        this.f30153a = 2;
        this.f30155d = context;
        this.f30156e = sdkInitializationListener;
        this.c = str;
        this.f30154b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] f10;
        int i10 = this.f30153a;
        Object obj = this.f30156e;
        Object obj2 = this.f30154b;
        Serializable serializable = this.c;
        Object obj3 = this.f30155d;
        switch (i10) {
            case 0:
                Activity activity = (Activity) obj3;
                String account_id = (String) serializable;
                JSONObject consentObject = (JSONObject) obj2;
                d listener = (d) obj;
                kotlin.jvm.internal.g.e(activity, "$activity");
                kotlin.jvm.internal.g.e(account_id, "$account_id");
                kotlin.jvm.internal.g.e(consentObject, "$consentObject");
                kotlin.jvm.internal.g.e(listener, "$listener");
                InMobiSdk.init(activity.getApplicationContext(), account_id, consentObject, new b.a(listener, activity));
                if (xd.a.f31647a) {
                    InMobiSdk.setLogLevel(InMobiSdk.LogLevel.DEBUG);
                    return;
                }
                return;
            case 1:
                JSONObject viewData = (JSONObject) obj2;
                String buttonText = (String) serializable;
                f6.f this$0 = (f6.f) obj3;
                String pathID = (String) obj;
                HashSet hashSet = f6.f.f17135e;
                if (!k6.a.b(f6.f.class)) {
                    try {
                        kotlin.jvm.internal.g.e(viewData, "$viewData");
                        kotlin.jvm.internal.g.e(buttonText, "$buttonText");
                        kotlin.jvm.internal.g.e(this$0, "this$0");
                        kotlin.jvm.internal.g.e(pathID, "$pathID");
                        try {
                            String lowerCase = p.l(com.facebook.d.a()).toLowerCase();
                            kotlin.jvm.internal.g.d(lowerCase, "this as java.lang.String).toLowerCase()");
                            float[] a10 = f6.a.a(lowerCase, viewData);
                            String c = f6.a.c(buttonText, this$0.f17138d, lowerCase);
                            if (a10 != null && (f10 = ModelManager.f(ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][]{a10}, new String[]{c})) != null) {
                                String str = f10[0];
                                f6.b.a(pathID, str);
                                if (!kotlin.jvm.internal.g.a(str, "other")) {
                                    HashSet hashSet2 = f6.f.f17135e;
                                    f.a.c(str, buttonText, a10);
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable th2) {
                        k6.a.a(f6.f.class, th2);
                        return;
                    }
                }
                return;
            case 2:
                InMobiSdk.a((Context) obj3, (SdkInitializationListener) obj, (String) serializable, (JSONObject) obj2);
                return;
            case 3:
                File file = (File) obj3;
                String url = (String) serializable;
                String fileParam = (String) obj2;
                q callback = (q) obj;
                kotlin.jvm.internal.g.e(file, "$file");
                kotlin.jvm.internal.g.e(url, "$url");
                kotlin.jvm.internal.g.e(fileParam, "$fileParam");
                kotlin.jvm.internal.g.e(callback, "$callback");
                try {
                    String encode = URLEncoder.encode(file.getName(), "UTF-8");
                    Pattern pattern = r.c;
                    u uVar = new u(file, r.a.b("application/octet-stream"));
                    t.a aVar = new t.a();
                    aVar.e(url);
                    aVar.d("PUT", uVar);
                    aVar.a("x-goog-content-length-range", "1,10485760");
                    aVar.a("Content-Disposition", "form-data; name=\"" + fileParam + "\"; filename=\"" + encode + '\"');
                    okhttp3.internal.connection.e a11 = sb.d.f29780d.a(aVar.b());
                    sb.d.f29778a.set(a11);
                    a11.e(new sb.g(callback, a11));
                    return;
                } catch (Exception e10) {
                    Boolean bool = Boolean.FALSE;
                    callback.invoke(bool, bool, e10.getMessage());
                    return;
                }
            default:
                e2 e2Var = (e2) obj3;
                int[] iArr = (int[]) serializable;
                View view = (View) obj2;
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj;
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(e2Var, ea.a.p("a3BecDtpWWQzbmc=", "8xWJnGvL"));
                kotlin.jvm.internal.g.e(iArr, ea.a.p("F2M-cgFlDHQkaVF3JW81YTBpXW4=", "1R08p5l3"));
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("R2gic1cw", "h2yv5HFn"));
                LinearLayout linearLayout = (LinearLayout) e2Var.f868h;
                kotlin.jvm.internal.g.d(linearLayout, ea.a.p("P29BQhBuU2k0Z2R2Nm8GdFBuGkJn", "xeQLkJlI"));
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    int dimensionPixelSize = (pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_9) + (pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_42) + (((view.getWidth() / 2) + iArr[0]) - linearLayout.getMeasuredWidth()))) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_28);
                    ((ViewGroup.MarginLayoutParams) bVar).leftMargin = dimensionPixelSize;
                    if (dimensionPixelSize < 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = linearLayout.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = 0;
                    }
                    linearLayout.setLayoutParams(bVar);
                    return;
                }
                throw new NullPointerException(ea.a.p("N3U5bBFjV24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAteSVlEWFYZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdzBkMmVFLnVvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyOG1z", "eqYU16gN"));
        }
    }

    public /* synthetic */ a(Object obj, Serializable serializable, Object obj2, Object obj3, int i10) {
        this.f30153a = i10;
        this.f30155d = obj;
        this.c = serializable;
        this.f30154b = obj2;
        this.f30156e = obj3;
    }

    public /* synthetic */ a(JSONObject jSONObject, String str, f6.f fVar, String str2) {
        this.f30153a = 1;
        this.f30154b = jSONObject;
        this.c = str;
        this.f30155d = fVar;
        this.f30156e = str2;
    }
}
