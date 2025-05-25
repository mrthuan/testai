package com.android.billingclient.api;

import java.util.Collections;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
final class zzbu implements b, d, j, k {
    public static native void nativeOnAcknowledgePurchaseResponse(int i10, String str, long j10);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i10, String str, long j10);

    public static native void nativeOnConsumePurchaseResponse(int i10, String str, String str2, long j10);

    public static native void nativeOnPriceChangeConfirmationResult(int i10, String str, long j10);

    public static native void nativeOnPurchaseHistoryResponse(int i10, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j10);

    public static native void nativeOnPurchasesUpdated(int i10, String str, Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int i10, String str, Purchase[] purchaseArr, long j10);

    public static native void nativeOnSkuDetailsResponse(int i10, String str, SkuDetails[] skuDetailsArr, long j10);

    @Override // com.android.billingclient.api.j
    public final void a(f fVar, List<Purchase> list) {
        nativeOnQueryPurchasesResponse(fVar.f6231a, fVar.f6232b, (Purchase[]) list.toArray(new Purchase[list.size()]), 0L);
    }

    @Override // com.android.billingclient.api.k
    public final void b(f fVar, List<Purchase> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnPurchasesUpdated(fVar.f6231a, fVar.f6232b, (Purchase[]) list.toArray(new Purchase[list.size()]));
    }

    @Override // com.android.billingclient.api.b
    public final void c(f fVar) {
        nativeOnAcknowledgePurchaseResponse(fVar.f6231a, fVar.f6232b, 0L);
    }

    @Override // com.android.billingclient.api.d
    public final void d(f fVar) {
        nativeOnBillingSetupFinished(fVar.f6231a, fVar.f6232b, 0L);
    }

    @Override // com.android.billingclient.api.d
    public final void e() {
        nativeOnBillingServiceDisconnected();
    }
}
