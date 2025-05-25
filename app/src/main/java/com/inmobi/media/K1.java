package com.inmobi.media;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoWcdma;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.api.Api;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class K1 {

    /* renamed from: a  reason: collision with root package name */
    public String f14385a;

    /* renamed from: b  reason: collision with root package name */
    public int f14386b;
    public int c;

    public K1() {
    }

    public static String a(String mcc, String mnc, int i10, int i11, int i12, int i13) {
        kotlin.jvm.internal.g.e(mcc, "mcc");
        kotlin.jvm.internal.g.e(mnc, "mnc");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mcc);
        sb2.append('#');
        sb2.append(mnc);
        sb2.append('#');
        sb2.append(i10);
        sb2.append('#');
        sb2.append(i11);
        sb2.append('#');
        sb2.append(i12 == -1 ? "" : Integer.valueOf(i12));
        sb2.append('#');
        sb2.append(i13 != Integer.MAX_VALUE ? Integer.valueOf(i13) : "");
        return sb2.toString();
    }

    public K1(CellInfo cellInfo, String mcc, String mnc, int i10) {
        kotlin.jvm.internal.g.e(mcc, "mcc");
        kotlin.jvm.internal.g.e(mnc, "mnc");
        if (cellInfo instanceof CellInfoGsm) {
            this.c = i10;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.f14386b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            kotlin.jvm.internal.g.d(cellIdentity, "getCellIdentity(...)");
            this.f14385a = a(mcc, mnc, cellIdentity.getLac(), cellIdentity.getCid(), -1, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else if (cellInfo instanceof CellInfoCdma) {
            this.c = i10;
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            this.f14386b = cellInfoCdma.getCellSignalStrength().getDbm();
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            kotlin.jvm.internal.g.d(cellIdentity2, "getCellIdentity(...)");
            int systemId = cellIdentity2.getSystemId();
            int networkId = cellIdentity2.getNetworkId();
            int basestationId = cellIdentity2.getBasestationId();
            this.f14385a = mcc + '#' + systemId + '#' + networkId + '#' + basestationId;
        } else if (cellInfo instanceof CellInfoWcdma) {
            this.c = i10;
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            this.f14386b = cellInfoWcdma.getCellSignalStrength().getDbm();
            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
            kotlin.jvm.internal.g.d(cellIdentity3, "getCellIdentity(...)");
            this.f14385a = a(mcc, mnc, cellIdentity3.getLac(), cellIdentity3.getCid(), cellIdentity3.getPsc(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FacebookMediationAdapter.KEY_ID, this.f14385a);
            int i10 = this.f14386b;
            if (i10 != Integer.MAX_VALUE) {
                jSONObject.put("ss", i10);
            }
            jSONObject.put("nt", this.c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
