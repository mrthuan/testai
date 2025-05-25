package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.s5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1799s5 extends G8 {

    /* renamed from: y  reason: collision with root package name */
    public final AdQualityResult f15438y;

    /* renamed from: z  reason: collision with root package name */
    public final AdConfig.AdQualityConfig f15439z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1799s5(AdQualityResult result, Ib uidMap, AdConfig.AdQualityConfig config) {
        super("POST", result.getBeaconUrl(), uidMap, false, (A4) null, "application/json", 64);
        kotlin.jvm.internal.g.e(result, "result");
        kotlin.jvm.internal.g.e(uidMap, "uidMap");
        kotlin.jvm.internal.g.e(config, "config");
        this.f15438y = result;
        this.f15439z = config;
    }

    @Override // com.inmobi.media.G8
    public final void f() {
        JSONObject jSONObject;
        String extras;
        JSONObject jSONObject2;
        boolean z10;
        JSONObject jSONObject3;
        this.f14293t = false;
        this.f14294u = false;
        this.f14297x = false;
        this.f14295v = false;
        super.f();
        if (this.f15438y.getImageLocation().length() > 0) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(this.f15438y.getImageLocation());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (decodeFile != null) {
                    decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.g.d(byteArray, "toByteArray(...)");
                if (byteArray.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((!z10) && (jSONObject3 = this.f14285l) != null) {
                    jSONObject3.put("screenshotImageByte", Base64.encodeToString(byteArray, 0));
                }
            } catch (FileNotFoundException unused) {
            }
        }
        try {
            if (AbstractC1579c2.a(this.f15438y.getExtras()) && (extras = this.f15438y.getExtras()) != null && (jSONObject2 = this.f14285l) != null) {
                jSONObject2.put("templateInfo", new JSONObject(extras));
            }
        } catch (JSONException unused2) {
        }
        if (AbstractC1579c2.a(this.f15438y.getSdkModelResult()) && (jSONObject = this.f14285l) != null) {
            jSONObject.put("sdkModelInfo", this.f15438y.getSdkModelResult());
        }
    }
}
