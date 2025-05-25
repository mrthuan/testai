package y4;

import android.content.Context;
import com.android.billingclient.api.i;
import com.android.billingclient.api.l;
import com.android.billingclient.api.p;
import com.android.billingclient.api.w;
import com.android.billingclient.api.y;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: BillingManager.java */
/* loaded from: classes.dex */
public final class c implements z4.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f32057a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f32058b = "subs";
    public final /* synthetic */ Context c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ z4.e f32059d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ y4.a f32060e;

    /* compiled from: BillingManager.java */
    /* loaded from: classes.dex */
    public class a implements i {
        public a() {
        }

        public final void a(com.android.billingclient.api.f fVar, ArrayList arrayList) {
            String str;
            c cVar = c.this;
            if (fVar != null && fVar.f6231a == 0) {
                cVar.f32060e.getClass();
                y4.a.b(cVar.c, "querySkuDetails OK");
                cVar.f32059d.g(arrayList);
                return;
            }
            if (fVar == null) {
                str = "querySkuDetails error:queryResult == null";
            } else {
                str = "querySkuDetails error:" + fVar.f6231a + " # " + y4.a.e(fVar.f6231a);
            }
            cVar.f32060e.getClass();
            y4.a.b(cVar.c, str);
            cVar.f32059d.b(str);
        }
    }

    public c(y4.a aVar, List list, Context context, pdf.pdfreader.viewer.editor.free.billing.d dVar) {
        this.f32060e = aVar;
        this.f32057a = list;
        this.c = context;
        this.f32059d = dVar;
    }

    @Override // z4.b
    public final void a(String str) {
        this.f32059d.f(str);
    }

    @Override // z4.b
    public final void b(androidx.privacysandbox.ads.adservices.topics.d dVar) {
        if (dVar != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f32057a) {
                l.b.a aVar = new l.b.a();
                aVar.f6263a = str;
                String str2 = this.f32058b;
                aVar.f6264b = str2;
                if (!"first_party".equals(str2)) {
                    if (aVar.f6263a != null) {
                        if (aVar.f6264b != null) {
                            arrayList.add(new l.b(aVar));
                        } else {
                            throw new IllegalArgumentException("Product type must be provided.");
                        }
                    } else {
                        throw new IllegalArgumentException("Product id must be provided.");
                    }
                } else {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
            }
            l.a aVar2 = new l.a();
            if (!arrayList.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    l.b bVar = (l.b) it.next();
                    if (!"play_pass_subs".equals(bVar.f6262b)) {
                        hashSet.add(bVar.f6262b);
                    }
                }
                if (hashSet.size() <= 1) {
                    aVar2.f6260a = zzai.zzj(arrayList);
                    final l lVar = new l(aVar2);
                    final a aVar3 = new a();
                    final com.android.billingclient.api.c cVar = (com.android.billingclient.api.c) dVar;
                    if (!cVar.i()) {
                        com.android.billingclient.api.f fVar = y.f6296j;
                        cVar.D(w.a(2, 7, fVar));
                        aVar3.a(fVar, new ArrayList());
                        return;
                    } else if (!cVar.f6199s) {
                        zzb.zzk("BillingClient", "Querying product details is not supported.");
                        com.android.billingclient.api.f fVar2 = y.f6304r;
                        cVar.D(w.a(20, 7, fVar2));
                        aVar3.a(fVar2, new ArrayList());
                        return;
                    } else if (cVar.C(new Callable() { // from class: com.android.billingclient.api.o
                        /* JADX WARN: Code restructure failed: missing block: B:61:0x01a7, code lost:
                            r14 = 4;
                            r0 = "Item is unavailable for purchase.";
                         */
                        @Override // java.util.concurrent.Callable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object call() {
                            /*
                                Method dump skipped, instructions count: 532
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.o.call():java.lang.Object");
                        }
                    }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new p(cVar, aVar3), cVar.k()) == null) {
                        com.android.billingclient.api.f A = cVar.A();
                        cVar.D(w.a(25, 7, A));
                        aVar3.a(A, new ArrayList());
                        return;
                    } else {
                        return;
                    }
                }
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        this.f32059d.f("init billing client return null");
        this.f32060e.getClass();
        y4.a.b(this.c, "init billing client return null");
    }
}
