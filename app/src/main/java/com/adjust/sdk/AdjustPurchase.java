package com.adjust.sdk;

/* loaded from: classes.dex */
public class AdjustPurchase {
    private final String productId;
    private final String purchaseToken;

    public AdjustPurchase(String str, String str2) {
        this.productId = str;
        this.purchaseToken = str2;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPurchaseToken() {
        return this.purchaseToken;
    }
}
