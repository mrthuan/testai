package u4;

import android.app.Activity;
import com.inmobi.sdk.SdkInitializationListener;
import org.json.JSONObject;

/* compiled from: Inmobi.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f30157a = c.class.getName();

    /* renamed from: b  reason: collision with root package name */
    public static final String f30158b = k.class.getName();
    public static final String c = h.class.getName();

    /* renamed from: d  reason: collision with root package name */
    public static final String f30159d = e.class.getName();

    /* renamed from: e  reason: collision with root package name */
    public static final String f30160e = m.class.getName();

    /* renamed from: f  reason: collision with root package name */
    public static boolean f30161f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f30162g;

    /* compiled from: Inmobi.kt */
    /* loaded from: classes.dex */
    public static final class a implements SdkInitializationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f30163a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30164b;

        public a(d dVar, Activity activity) {
            this.f30163a = dVar;
            this.f30164b = activity;
        }

        @Override // com.inmobi.sdk.SdkInitializationListener
        public final void onInitializationComplete(Error error) {
            Activity activity = this.f30164b;
            d dVar = this.f30163a;
            if (error != null) {
                b.f30161f = false;
                dVar.a(false);
                fe.a a10 = fe.a.a();
                activity.getApplicationContext();
                a10.b("InMobi Init failed:" + error.getMessage());
                return;
            }
            b.f30161f = false;
            b.f30162g = true;
            dVar.a(true);
            fe.a a11 = fe.a.a();
            activity.getApplicationContext();
            a11.b("InMobi Init Successful");
        }
    }

    public static void a(Activity activity, String account_id, d dVar) {
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(account_id, "account_id");
        if (!f30161f) {
            f30161f = true;
            if (!f30162g) {
                try {
                    activity.runOnUiThread(new u4.a(activity, account_id, new JSONObject(), dVar, 0));
                    return;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    f30161f = false;
                    dVar.a(false);
                    return;
                }
            }
            f30161f = false;
            dVar.a(true);
            return;
        }
        dVar.a(false);
    }
}
