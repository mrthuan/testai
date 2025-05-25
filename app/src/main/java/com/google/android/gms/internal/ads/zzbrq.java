package com.google.android.gms.internal.ads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import lib.zj.office.fc.ss.util.CellUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzbrq {
    private final zzcej zza;
    private final String zzb;

    public zzbrq(zzcej zzcejVar, String str) {
        this.zza = zzcejVar;
        this.zzb = str;
    }

    public final void zzg(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i10).put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, i11).put(InMobiNetworkValues.WIDTH, i12).put(InMobiNetworkValues.HEIGHT, i13));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    public final void zzh(String str) {
        try {
            JSONObject put = new JSONObject().put(PglCryptUtils.KEY_MESSAGE, str).put("action", this.zzb);
            zzcej zzcejVar = this.zza;
            if (zzcejVar != null) {
                zzcejVar.zze("onError", put);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    public final void zzi(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    public final void zzj(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put(InMobiNetworkValues.WIDTH, i10).put(InMobiNetworkValues.HEIGHT, i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put(CellUtil.ROTATION, i14));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    public final void zzk(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i10).put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, i11).put(InMobiNetworkValues.WIDTH, i12).put(InMobiNetworkValues.HEIGHT, i13));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    public final void zzl(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }
}
