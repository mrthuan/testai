package y4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z4.g;

/* compiled from: BillingManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static a f32044e;

    /* renamed from: a  reason: collision with root package name */
    public androidx.privacysandbox.ads.adservices.topics.d f32045a;

    /* renamed from: b  reason: collision with root package name */
    public z4.c f32046b;
    public final ArrayList<z4.b> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f32047d = false;

    /* compiled from: BillingManager.java */
    /* renamed from: y4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0415a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f32048a;

        public C0415a(Context context) {
            this.f32048a = context;
        }

        @Override // com.android.billingclient.api.k
        public final void b(com.android.billingclient.api.f fVar, List<Purchase> list) {
            String str;
            Context context = this.f32048a;
            a aVar = a.this;
            if (fVar != null && fVar.f6231a == 0) {
                aVar.getClass();
                a.b(context, "onPurchasesUpdated OK");
                if (list != null) {
                    for (Purchase purchase : list) {
                        synchronized (aVar) {
                            Context applicationContext = context.getApplicationContext();
                            a.b(applicationContext, "acknowledgePurchase");
                            aVar.f(applicationContext, new f(aVar, purchase, applicationContext));
                        }
                    }
                }
                z4.c cVar = aVar.f32046b;
                if (cVar != null) {
                    cVar.e(list);
                    return;
                }
                return;
            }
            if (fVar == null) {
                str = "onPurchasesUpdated error:billingResult == null";
            } else {
                str = "onPurchasesUpdated error:" + fVar.f6231a + " # " + a.e(fVar.f6231a);
            }
            aVar.getClass();
            a.b(context, str);
            z4.c cVar2 = aVar.f32046b;
            if (cVar2 != null) {
                cVar2.c(str);
            }
        }
    }

    /* compiled from: BillingManager.java */
    /* loaded from: classes.dex */
    public class b implements com.android.billingclient.api.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f32050a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.d f32051b;

        public b(Context context, com.android.billingclient.api.c cVar) {
            this.f32050a = context;
            this.f32051b = cVar;
        }

        @Override // com.android.billingclient.api.d
        public final void d(com.android.billingclient.api.f fVar) {
            String str;
            a.this.f32047d = false;
            if (fVar != null && fVar.f6231a == 0) {
                a.b(this.f32050a, "onBillingSetupFinished OK");
                a aVar = a.this;
                androidx.privacysandbox.ads.adservices.topics.d dVar = this.f32051b;
                aVar.f32045a = dVar;
                synchronized (aVar) {
                    ArrayList<z4.b> arrayList = aVar.c;
                    if (arrayList != null) {
                        Iterator<z4.b> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().b(dVar);
                        }
                        aVar.c.clear();
                    }
                }
                return;
            }
            if (fVar == null) {
                str = "onBillingSetupFinished error:billingResult == null";
            } else {
                str = "onBillingSetupFinished error:" + fVar.f6231a + " # " + a.e(fVar.f6231a);
            }
            a aVar2 = a.this;
            Context context = this.f32050a;
            aVar2.getClass();
            a.b(context, str);
            a aVar3 = a.this;
            aVar3.f32045a = null;
            a.a(aVar3, str);
        }

        @Override // com.android.billingclient.api.d
        public final void e() {
            a aVar = a.this;
            aVar.f32045a = null;
            aVar.f32047d = false;
            fe.a.a().b("onBillingServiceDisconnected");
        }
    }

    public static void a(a aVar, String str) {
        synchronized (aVar) {
            ArrayList<z4.b> arrayList = aVar.c;
            if (arrayList != null) {
                Iterator<z4.b> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().a(str);
                }
                aVar.c.clear();
            }
        }
    }

    public static void b(Context context, String str) {
        a5.d dVar;
        if (!TextUtils.isEmpty(str)) {
            fe.a.a().b(str);
            synchronized (a5.d.class) {
                if (a5.d.f61b == null) {
                    a5.d.f61b = new a5.d();
                }
                dVar = a5.d.f61b;
            }
            dVar.getClass();
            if (!TextUtils.isEmpty("Billing") && !TextUtils.isEmpty(str)) {
                boolean z10 = false;
                if (dVar.f62a == -1) {
                    dVar.f62a = 0;
                    String h10 = de.e.h("billing_analytics", "false");
                    if (!TextUtils.isEmpty(h10) && h10.equals("true")) {
                        dVar.f62a = 1;
                    }
                }
                if (dVar.f62a == 1) {
                    z10 = true;
                }
                if (z10) {
                    ge.a.U(context, "Billing", "billing_flow", str);
                }
            }
        }
    }

    public static synchronized a d() {
        a aVar;
        synchronized (a.class) {
            if (f32044e == null) {
                f32044e = new a();
            }
            aVar = f32044e;
        }
        return aVar;
    }

    public static String e(int i10) {
        if (i10 != 12) {
            switch (i10) {
                case -3:
                    return "Service timeout";
                case -2:
                    return "Feature not supported";
                case -1:
                    return "Service disconnected";
                case 0:
                    return "OK";
                case 1:
                    return "User canceled";
                case 2:
                    return "Service unavailable";
                case 3:
                    return "Billing unavailable";
                case 4:
                    return "Item unavailable";
                case 5:
                    return "Developer error";
                case 6:
                    return "Error";
                case 7:
                    return "Item already owned";
                case 8:
                    return "Item not owned";
                default:
                    return "";
            }
        }
        return "NETWORK ERROR";
    }

    public final synchronized void c(Application application, String str, g gVar) {
        Context applicationContext = application.getApplicationContext();
        b(applicationContext, "checkSupportFeature:".concat(str));
        f(applicationContext, new d(this, str, gVar, applicationContext));
    }

    public final synchronized void f(Context context, z4.b bVar) {
        Context applicationContext = context.getApplicationContext();
        fe.a.a().b("getBillingClient");
        if (this.f32045a != null) {
            fe.a.a().b("getBillingClient != null return");
            bVar.b(this.f32045a);
        } else if (this.f32047d) {
            this.c.add(bVar);
        } else {
            this.f32047d = true;
            this.c.add(bVar);
            fe.a.a().b("getBillingClient == null init");
            C0415a c0415a = new C0415a(applicationContext);
            aj.b bVar2 = new aj.b();
            if (applicationContext != null) {
                com.android.billingclient.api.c cVar = new com.android.billingclient.api.c(bVar2, applicationContext, c0415a);
                cVar.j(new b(applicationContext, cVar));
                return;
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public final synchronized void g(Activity activity, ArrayList arrayList, pdf.pdfreader.viewer.editor.free.billing.f fVar) {
        Context applicationContext = activity.getApplicationContext();
        b(applicationContext, "startBilling");
        this.f32046b = fVar;
        f(applicationContext, new e(this, arrayList, activity, applicationContext, fVar));
    }
}
