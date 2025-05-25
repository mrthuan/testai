package y4;

import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.j;
import com.android.billingclient.api.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: BillingManager.java */
/* loaded from: classes.dex */
public final class b implements z4.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f32052a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z4.d f32053b;
    public final /* synthetic */ y4.a c;

    /* compiled from: BillingManager.java */
    /* loaded from: classes.dex */
    public class a implements j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f32054a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.d f32055b;

        /* compiled from: BillingManager.java */
        /* renamed from: y4.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0416a implements j {
            public C0416a() {
            }

            @Override // com.android.billingclient.api.j
            public final void a(com.android.billingclient.api.f fVar, List<Purchase> list) {
                String str;
                a aVar = a.this;
                if (fVar != null && fVar.f6231a == 0) {
                    aVar.f32054a.addAll(list);
                    b bVar = b.this;
                    y4.a aVar2 = bVar.c;
                    Context context = bVar.f32052a;
                    aVar2.getClass();
                    y4.a.b(context, "queryPurchase OK");
                    b.this.f32053b.d(aVar.f32054a);
                    Iterator it = aVar.f32054a.iterator();
                    while (it.hasNext()) {
                        Purchase purchase = (Purchase) it.next();
                        b bVar2 = b.this;
                        y4.a aVar3 = bVar2.c;
                        Context context2 = bVar2.f32052a;
                        synchronized (aVar3) {
                            Context applicationContext = context2.getApplicationContext();
                            y4.a.b(applicationContext, "acknowledgePurchase");
                            aVar3.f(applicationContext, new f(aVar3, purchase, applicationContext));
                        }
                    }
                    return;
                }
                if (fVar == null) {
                    str = "queryPurchase error:billingResult == null";
                } else {
                    str = "queryPurchase error:" + fVar.f6231a + " # " + y4.a.e(fVar.f6231a);
                }
                b bVar3 = b.this;
                y4.a aVar4 = bVar3.c;
                Context context3 = bVar3.f32052a;
                aVar4.getClass();
                y4.a.b(context3, str);
                b.this.f32053b.b(str);
            }
        }

        public a(ArrayList arrayList, androidx.privacysandbox.ads.adservices.topics.d dVar) {
            this.f32054a = arrayList;
            this.f32055b = dVar;
        }

        @Override // com.android.billingclient.api.j
        public final void a(com.android.billingclient.api.f fVar, List<Purchase> list) {
            String str;
            if (fVar != null && fVar.f6231a == 0) {
                this.f32054a.addAll(list);
                m.a aVar = new m.a();
                aVar.f6266a = "subs";
                this.f32055b.h(new m(aVar), new C0416a());
                return;
            }
            if (fVar == null) {
                str = "queryPurchase error:billingResult == null";
            } else {
                str = "queryPurchase error:" + fVar.f6231a + " # " + y4.a.e(fVar.f6231a);
            }
            b bVar = b.this;
            bVar.c.getClass();
            y4.a.b(bVar.f32052a, str);
            bVar.f32053b.b(str);
        }
    }

    public b(y4.a aVar, Context context, pdf.pdfreader.viewer.editor.free.billing.e eVar) {
        this.c = aVar;
        this.f32052a = context;
        this.f32053b = eVar;
    }

    @Override // z4.b
    public final void a(String str) {
        this.f32053b.f(str);
    }

    @Override // z4.b
    public final void b(androidx.privacysandbox.ads.adservices.topics.d dVar) {
        if (dVar != null) {
            ArrayList arrayList = new ArrayList();
            m.a aVar = new m.a();
            aVar.f6266a = "inapp";
            dVar.h(new m(aVar), new a(arrayList, dVar));
            return;
        }
        this.f32053b.f("init billing client return null");
        this.c.getClass();
        y4.a.b(this.f32052a, "init billing client return null");
    }
}
