package com.android.billingclient.api;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class s implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6279a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f6280b;
    public final /* synthetic */ c c;

    public s(c cVar, String str, j jVar) {
        this.f6279a = str;
        this.f6280b = jVar;
        this.c = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        j3.h hVar;
        Bundle zzi;
        b0 b0Var;
        int i10;
        c cVar = this.c;
        String str = this.f6279a;
        zzb.zzj("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z10 = cVar.f6194n;
        boolean z11 = cVar.f6201u;
        cVar.f6205y.getClass();
        cVar.f6205y.getClass();
        int i11 = 1;
        int i12 = 0;
        Bundle zzc = zzb.zzc(z10, z11, true, false, cVar.f6183b);
        String str2 = null;
        while (true) {
            try {
                if (cVar.f6194n) {
                    zzs zzsVar = cVar.f6187g;
                    if (i11 != cVar.f6201u) {
                        i10 = 9;
                    } else {
                        i10 = 19;
                    }
                    zzi = zzsVar.zzj(i10, cVar.f6185e.getPackageName(), str, str2, zzc);
                } else {
                    zzi = cVar.f6187g.zzi(3, cVar.f6185e.getPackageName(), str, str2);
                }
                f fVar = y.f6294h;
                if (zzi == null) {
                    Object[] objArr = new Object[i11];
                    objArr[i12] = "getPurchase()";
                    zzb.zzk("BillingClient", String.format("%s got null owned items list", objArr));
                    b0Var = new b0(fVar, 54);
                } else {
                    int zzb = zzb.zzb(zzi, "BillingClient");
                    String zzg = zzb.zzg(zzi, "BillingClient");
                    f fVar2 = new f();
                    fVar2.f6231a = zzb;
                    fVar2.f6232b = zzg;
                    if (zzb != 0) {
                        Object[] objArr2 = new Object[2];
                        objArr2[i12] = "getPurchase()";
                        objArr2[1] = Integer.valueOf(zzb);
                        zzb.zzk("BillingClient", String.format("%s failed. Response code: %s", objArr2));
                        b0Var = new b0(fVar2, 23);
                    } else if (zzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && zzi.containsKey("INAPP_PURCHASE_DATA_LIST") && zzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            Object[] objArr3 = new Object[1];
                            objArr3[i12] = "getPurchase()";
                            zzb.zzk("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", objArr3));
                            b0Var = new b0(fVar, 56);
                        } else if (stringArrayList2 == null) {
                            Object[] objArr4 = new Object[1];
                            objArr4[i12] = "getPurchase()";
                            zzb.zzk("BillingClient", String.format("Bundle returned from %s contains null purchases list.", objArr4));
                            b0Var = new b0(fVar, 57);
                        } else if (stringArrayList3 == null) {
                            Object[] objArr5 = new Object[1];
                            objArr5[i12] = "getPurchase()";
                            zzb.zzk("BillingClient", String.format("Bundle returned from %s contains null signatures list.", objArr5));
                            b0Var = new b0(fVar, 58);
                        } else {
                            b0Var = new b0(y.f6295i, 1);
                        }
                    } else {
                        Object[] objArr6 = new Object[1];
                        objArr6[i12] = "getPurchase()";
                        zzb.zzk("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", objArr6));
                        b0Var = new b0(fVar, 55);
                    }
                }
                f fVar3 = (f) b0Var.f6181b;
                if (fVar3 != y.f6295i) {
                    cVar.D(w.a(b0Var.f6180a, 9, fVar3));
                    hVar = new j3.h(1, fVar3, (Serializable) null);
                    break;
                }
                ArrayList<String> stringArrayList4 = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList5 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList6 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i13 = i12;
                int i14 = i13;
                while (i13 < stringArrayList5.size()) {
                    String str3 = stringArrayList5.get(i13);
                    String str4 = stringArrayList6.get(i13);
                    zzb.zzj("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i13))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.c())) {
                            zzb.zzk("BillingClient", "BUG: empty/null token!");
                            i14 = 1;
                        }
                        arrayList.add(purchase);
                        i13++;
                    } catch (JSONException e10) {
                        zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e10);
                        f fVar4 = y.f6294h;
                        cVar.D(w.a(51, 9, fVar4));
                        hVar = new j3.h(1, fVar4, (Serializable) null);
                    }
                }
                if (i14 != 0) {
                    cVar.D(w.a(26, 9, y.f6294h));
                }
                str2 = zzi.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    hVar = new j3.h(1, y.f6295i, arrayList);
                    break;
                }
                i11 = 1;
                i12 = 0;
            } catch (Exception e11) {
                f fVar5 = y.f6296j;
                cVar.D(w.a(52, 9, fVar5));
                zzb.zzl("BillingClient", "Got exception trying to get purchasesm try to reconnect", e11);
                hVar = new j3.h(1, fVar5, (Serializable) null);
            }
        }
        List<Purchase> list = (List) hVar.f19039b;
        if (list != null) {
            this.f6280b.a((f) hVar.c, list);
            return null;
        }
        this.f6280b.a((f) hVar.c, zzai.zzk());
        return null;
    }
}
