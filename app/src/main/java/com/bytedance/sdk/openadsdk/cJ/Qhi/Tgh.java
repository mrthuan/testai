package com.bytedance.sdk.openadsdk.cJ.Qhi;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: EventProviderWrapper.java */
/* loaded from: classes.dex */
public class Tgh implements com.bytedance.sdk.openadsdk.multipro.Qhi {
    private final com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ Qhi;

    public Tgh(com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ cJVar) {
        this.Qhi = cJVar;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public String Qhi() {
        com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ cJVar = this.Qhi;
        if (cJVar != null) {
            return cJVar.ac();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public String Qhi(Uri uri) {
        com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ cJVar = this.Qhi;
        if (cJVar != null) {
            return cJVar.Qhi(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public Cursor Qhi(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ cJVar = this.Qhi;
        if (cJVar != null) {
            return cJVar.Qhi(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public Uri Qhi(Uri uri, ContentValues contentValues) {
        com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ cJVar = this.Qhi;
        if (cJVar != null) {
            return cJVar.Qhi(uri, contentValues);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public int Qhi(Uri uri, String str, String[] strArr) {
        com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ cJVar = this.Qhi;
        if (cJVar != null) {
            return cJVar.Qhi(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public int Qhi(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ cJVar = this.Qhi;
        if (cJVar != null) {
            return cJVar.Qhi(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
