package y4;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.h0;
import com.android.billingclient.api.w;
import com.android.billingclient.api.y;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzs;
import com.inmobi.commons.core.configs.CrashConfig;
import ge.h;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: BillingManager.java */
/* loaded from: classes.dex */
public final class f implements z4.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Purchase f32070a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f32071b;
    public final /* synthetic */ y4.a c;

    /* compiled from: BillingManager.java */
    /* loaded from: classes.dex */
    public class a implements com.android.billingclient.api.b {

        /* compiled from: BillingManager.java */
        /* renamed from: y4.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0417a implements a5.c {
            public C0417a() {
            }

            public final void a(int i10, String str) {
                a aVar = a.this;
                if (i10 == 200) {
                    f fVar = f.this;
                    fVar.c.getClass();
                    y4.a.b(fVar.f32071b, "acknowledgePurchase OK");
                    return;
                }
                f fVar2 = f.this;
                fVar2.c.getClass();
                y4.a.b(fVar2.f32071b, "acknowledgePurchase error:" + i10 + " # " + str);
            }
        }

        public a() {
        }

        @Override // com.android.billingclient.api.b
        public final void c(com.android.billingclient.api.f fVar) {
            f fVar2 = f.this;
            if (fVar != null && fVar.f6231a == 0) {
                fVar2.c.getClass();
                y4.a.b(fVar2.f32071b, "acknowledgePurchase OK");
                return;
            }
            Context context = fVar2.f32071b;
            C0417a c0417a = new C0417a();
            if (h.a(context)) {
                new a5.b(context, fVar2.f32070a, c0417a).start();
            } else {
                c0417a.a(12, "Network error");
            }
        }
    }

    public f(y4.a aVar, Purchase purchase, Context context) {
        this.c = aVar;
        this.f32070a = purchase;
        this.f32071b = context;
    }

    @Override // z4.b
    public final void a(String str) {
        String h10 = a0.a.h("acknowledgePurchase error:", str);
        this.c.getClass();
        y4.a.b(this.f32071b, h10);
    }

    @Override // z4.b
    public final void b(androidx.privacysandbox.ads.adservices.topics.d dVar) {
        Purchase purchase;
        boolean z10;
        if (dVar != null && (purchase = this.f32070a) != null) {
            JSONObject jSONObject = purchase.c;
            if (jSONObject.optInt("purchaseState", 1) != 4) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (z10 && !jSONObject.optBoolean("acknowledged", true)) {
                String c = purchase.c();
                if (c != null) {
                    final com.android.billingclient.api.a aVar = new com.android.billingclient.api.a();
                    aVar.f6177a = c;
                    final a aVar2 = new a();
                    final com.android.billingclient.api.c cVar = (com.android.billingclient.api.c) dVar;
                    if (!cVar.i()) {
                        com.android.billingclient.api.f fVar = y.f6296j;
                        cVar.D(w.a(2, 3, fVar));
                        aVar2.c(fVar);
                        return;
                    } else if (TextUtils.isEmpty(aVar.f6177a)) {
                        zzb.zzk("BillingClient", "Please provide a valid purchase token.");
                        com.android.billingclient.api.f fVar2 = y.f6293g;
                        cVar.D(w.a(26, 3, fVar2));
                        aVar2.c(fVar2);
                        return;
                    } else if (!cVar.f6194n) {
                        com.android.billingclient.api.f fVar3 = y.f6289b;
                        cVar.D(w.a(27, 3, fVar3));
                        aVar2.c(fVar3);
                        return;
                    } else if (cVar.C(new Callable() { // from class: com.android.billingclient.api.g0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            c cVar2 = c.this;
                            a aVar3 = aVar;
                            b bVar = aVar2;
                            cVar2.getClass();
                            try {
                                zzs zzsVar = cVar2.f6187g;
                                String packageName = cVar2.f6185e.getPackageName();
                                String str = aVar3.f6177a;
                                String str2 = cVar2.f6183b;
                                Bundle bundle = new Bundle();
                                bundle.putString("playBillingLibraryVersion", str2);
                                Bundle zzd = zzsVar.zzd(9, packageName, str, bundle);
                                bVar.c(y.a(zzb.zzb(zzd, "BillingClient"), zzb.zzg(zzd, "BillingClient")));
                                return null;
                            } catch (Exception e10) {
                                zzb.zzl("BillingClient", "Error acknowledge purchase!", e10);
                                f fVar4 = y.f6296j;
                                cVar2.D(w.a(28, 3, fVar4));
                                bVar.c(fVar4);
                                return null;
                            }
                        }
                    }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new h0(0, cVar, aVar2), cVar.k()) == null) {
                        com.android.billingclient.api.f A = cVar.A();
                        cVar.D(w.a(25, 3, A));
                        aVar2.c(A);
                        return;
                    } else {
                        return;
                    }
                }
                throw new IllegalArgumentException("Purchase token must be set");
            }
        }
    }
}
