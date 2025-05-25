package com.bytedance.sdk.openadsdk.core;

import a6.h;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Jma;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.ads.mediation.pangle.PangleConstants;
import com.inmobi.sdk.InMobiSdk;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NetApiImpl.java */
/* loaded from: classes.dex */
public class MQ implements tP<com.bytedance.sdk.openadsdk.cJ.Qhi> {
    private final Context Qhi;

    /* compiled from: NetApiImpl.java */
    /* loaded from: classes.dex */
    public static class cJ {
        public final int Qhi;

        /* renamed from: ac  reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.core.model.pM f8926ac;
        public final boolean cJ;

        private cJ(int i10, boolean z10, com.bytedance.sdk.openadsdk.core.model.pM pMVar) {
            this.Qhi = i10;
            this.cJ = z10;
            this.f8926ac = pMVar;
        }

        public static cJ Qhi(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt("code");
            boolean optBoolean = jSONObject.optBoolean("verify");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.pM pMVar = new com.bytedance.sdk.openadsdk.core.model.pM();
            if (optJSONObject != null) {
                try {
                    pMVar.Qhi(optJSONObject.optInt("reason"));
                    pMVar.cJ(optJSONObject.optInt("corp_type"));
                    pMVar.ac(optJSONObject.optInt("reward_amount"));
                    pMVar.Qhi(optJSONObject.optString("reward_name"));
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", th2.getMessage());
                }
            }
            return new cJ(optInt, optBoolean, pMVar);
        }
    }

    public MQ(Context context) {
        this.Qhi = context;
    }

    private Map<String, String> CJ(JSONObject jSONObject) {
        HashMap h10 = h.h("Content-Type", "application/json; charset=utf-8");
        if (ac(jSONObject)) {
            h10.put("Content-Encoding", "union_sdk_encode");
        }
        return h10;
    }

    @DungeonFlag
    private void Tgh(JSONObject jSONObject) {
        try {
            jSONObject.put(InMobiNetworkValues.PACKAGE_NAME, js.fl());
            jSONObject.put("version_code", js.Tgh());
            jSONObject.put("version", js.ROR());
        } catch (Exception unused) {
        }
    }

    private boolean ac(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    private Map<String, String> cJ() {
        return h.h("Content-Type", "application/octet-stream;tt-data=a");
    }

    private boolean fl(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return jSONObject.optString(PglCryptUtils.KEY_MESSAGE).equalsIgnoreCase("success");
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    @DungeonFlag
    private JSONObject ac() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PangleConstants.APP_ID, hm.cJ().CJ());
            jSONObject.put(NamingTable.TAG, hm.cJ().Tgh());
            Tgh(jSONObject);
            Context Qhi2 = HzH.Qhi();
            jSONObject.put("package_install_path", Qhi2 != null ? Qhi2.getPackageResourcePath() : "");
            jSONObject.put("is_paid_app", hm.cJ().Gm());
            jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.Qhi.ROR());
            jSONObject.put("app_running_time", (System.currentTimeMillis() - iMK.Qhi()) / 1000);
            jSONObject.put("fmwname", DeviceUtils.hm(this.Qhi));
            int i10 = 0;
            jSONObject.put("is_init", iMK.fl() ? 1 : 0);
            if (Qhi2 != null) {
                int rotation = ((WindowManager) Qhi2.getSystemService("window")).getDefaultDisplay().getRotation();
                if (rotation == 0) {
                    i10 = 1;
                } else if (rotation == 1) {
                    i10 = 3;
                } else if (rotation == 2) {
                    i10 = 2;
                } else if (rotation == 3) {
                    i10 = 4;
                }
                jSONObject.put("orientation_support", new JSONArray().put(i10));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private byte[] fl(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream2.write(str.getBytes("utf-8"));
                            try {
                                gZIPOutputStream2.close();
                            } catch (IOException e10) {
                                com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", e10.toString());
                            }
                            bArr = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (IOException e11) {
                            e = e11;
                            gZIPOutputStream = gZIPOutputStream2;
                            com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e12) {
                                    com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", e12.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                bArr = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return bArr;
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e13) {
                                    com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", e13.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e14) {
                                    com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", e14.toString());
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e15) {
                    e = e15;
                }
            } catch (IOException e16) {
                e = e16;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (IOException e17) {
            com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", e17.toString());
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.qMt qmt, final int i10, final tP.Qhi qhi) {
        iMK.Tgh();
        final com.bytedance.sdk.openadsdk.core.model.cJ cJVar = new com.bytedance.sdk.openadsdk.core.model.cJ();
        cJVar.Qhi(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.ABk.Qhi()) {
            if (qhi != null) {
                qhi.Qhi(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
                cJVar.Qhi(1000);
                com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
            }
        } else if (!HzH.CJ().jPH()) {
            if (qhi != null) {
                qhi.Qhi(-16, Sf.Qhi(-16));
                cJVar.Qhi(1001);
                com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
            }
        } else if (qhi != null) {
            if (CJ(adSlot.getCodeId())) {
                qhi.Qhi(-8, Sf.Qhi(-8));
            } else if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !qmt.Tgh) {
                cJVar.cJ(2);
                cJVar.Qhi(adSlot.getBidAdm());
                if (com.bytedance.sdk.component.utils.ABk.CJ()) {
                    com.bykv.vk.openvk.component.video.api.Tgh.cJ.Qhi(adSlot.getBidAdm());
                }
                if (HzH.CJ().cjC() && Eh.Qhi().ROR() == 1) {
                    js.Qhi("Pangle_Debug_Mode", adSlot.getBidAdm(), this.Qhi);
                }
                try {
                    JSONObject cJ2 = cJ(new JSONObject(adSlot.getBidAdm()));
                    if (cJ2 == null) {
                        Qhi(qhi, cJVar);
                        return;
                    }
                    Qhi Qhi2 = Qhi.Qhi(cJ2, adSlot, qmt, cJVar);
                    cJVar.Qhi(Qhi2.WAv);
                    zc.Qhi(this.Qhi, Qhi2.f8925hm);
                    int i11 = Qhi2.CJ;
                    if (i11 != 20000) {
                        qhi.Qhi(i11, Qhi2.f8924fl);
                        cJVar.Qhi(Qhi2.CJ);
                        com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.model.Qhi qhi2 = Qhi2.Sf;
                    if (qhi2 == null) {
                        Qhi(qhi, cJVar);
                        return;
                    }
                    if (qhi2.ac() != null && Qhi2.Sf.ac().size() > 0) {
                        com.bytedance.sdk.openadsdk.Gm.ac.Qhi(Qhi2.Sf.ac().get(0));
                    }
                    Qhi2.Sf.ac(cJ2.toString());
                    qhi.Qhi(Qhi2.Sf, cJVar);
                    Map<String, com.bytedance.sdk.openadsdk.core.model.tP> Qhi3 = com.bytedance.sdk.openadsdk.core.model.Qhi.Qhi(Qhi2.Sf);
                    if (Qhi3 != null) {
                        com.bytedance.sdk.openadsdk.fl.cJ.Qhi().Qhi(Qhi3);
                    }
                    Qhi(Qhi2.Sf);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", "get ad error: ", th2);
                    Qhi(qhi, cJVar);
                }
            } else {
                JSONObject Qhi4 = Qhi(adSlot, qmt, i10);
                if (Qhi4 == null) {
                    qhi.Qhi(-9, Sf.Qhi(-9));
                    cJVar.Qhi(-9);
                    com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
                    return;
                }
                if (HzH.CJ().cjC() && Eh.Qhi().ROR() == 1) {
                    js.Qhi("Pangle_Debug_Mode", Qhi4.toString(), this.Qhi);
                }
                String Qhi5 = js.Qhi(adSlot.getBiddingTokens() != null ? "/api/ad/union/mediation/get_ads/" : "/api/ad/union/sdk/get_ads/", true);
                com.bytedance.sdk.component.ROR.cJ.fl cJ3 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().cJ();
                final com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh tgh = new com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh(2);
                try {
                    String Qhi6 = com.bytedance.sdk.openadsdk.Tgh.fl.Qhi(cJ3, Qhi5);
                    cJ3.cJ(Qhi6);
                    tgh.Qhi(Qhi6);
                } catch (Exception unused) {
                }
                cJ3.Qhi(Qhi4.toString(), HzH.CJ().kYc());
                tgh.Qhi(cJ3.ac()).Qhi();
                Map<String, String> Qhi7 = com.bytedance.sdk.openadsdk.core.fl.ac.Qhi(Qhi5, Qhi4.toString());
                if (Qhi7 != null && Qhi7.size() > 0) {
                    for (String str : Qhi7.keySet()) {
                        try {
                            cJ3.cJ(str, Qhi7.get(str));
                        } catch (Exception e10) {
                            com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", e10.getMessage());
                        }
                    }
                }
                try {
                    cJ3.cJ("User-Agent", js.ac());
                    Qhi(cJ3, Qhi4);
                } catch (Exception unused2) {
                }
                final Jma Qhi8 = Jma.Qhi();
                final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
                boolean z10 = hm.cJ().HzH() && requestExtraMap != 0;
                if (z10) {
                    requestExtraMap.put("pgad_start", Qhi8);
                }
                if (adSlot.getBiddingTokens() != null) {
                    Qhi(adSlot, qmt, cJ3, requestExtraMap, z10, Qhi8, qhi);
                    return;
                }
                cJ3.Qhi(10);
                cJ3.Qhi("get_ad");
                com.bytedance.sdk.openadsdk.ABk.ac.Qhi(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.core.MQ.3
                    @Override // com.bytedance.sdk.openadsdk.ABk.fl
                    public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                        com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi3 = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                        qhi3.cJ("get_ad");
                        qhi3.ac(adSlot.getCodeId());
                        qhi3.CJ(js.ac(adSlot.getDurationSlotType()));
                        return qhi3;
                    }
                });
                final boolean z11 = z10;
                cJ3.Qhi(new com.bytedance.sdk.component.ROR.Qhi.cJ() { // from class: com.bytedance.sdk.openadsdk.core.MQ.4
                    @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                    public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar2) {
                        com.bytedance.sdk.openadsdk.core.model.CQU cqu;
                        System.currentTimeMillis();
                        tgh.cJ();
                        if (z11) {
                            requestExtraMap.put("pgad_end", Qhi8);
                        }
                        if (cJVar2 != null) {
                            if (cJVar2.Tgh()) {
                                com.bytedance.sdk.openadsdk.ABk.ac.cJ(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.core.MQ.4.1
                                    @Override // com.bytedance.sdk.openadsdk.ABk.fl
                                    public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                                        com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi3 = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                                        qhi3.cJ("get_ad");
                                        qhi3.ac(adSlot.getCodeId());
                                        qhi3.CJ(js.ac(adSlot.getDurationSlotType()));
                                        qhi3.Qhi(BuildConfig.VERSION_NAME);
                                        return qhi3;
                                    }
                                });
                                com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.cJ.incrementAndGet();
                                com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.Qhi.incrementAndGet();
                                try {
                                    Jma Qhi9 = Jma.Qhi();
                                    String CJ = cJVar2.CJ();
                                    JSONObject jSONObject = new JSONObject(CJ);
                                    if (HzH.CJ().cjC() && Eh.Qhi().ROR() == 1) {
                                        js.Qhi("Pangle_Debug_Mode", jSONObject.toString(), MQ.this.Qhi);
                                    }
                                    cJVar.Qhi(CJ);
                                    JSONObject cJ4 = MQ.this.cJ(jSONObject);
                                    if (cJ4 == null) {
                                        MQ.this.Qhi(qhi, cJVar);
                                        cJVar2.ROR();
                                        adSlot.getCodeId();
                                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.Tgh.incrementAndGet();
                                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.ac();
                                        tgh.Qhi(true).Qhi(cJVar2.Qhi()).ac(CJ).ac();
                                        return;
                                    }
                                    Qhi Qhi10 = Qhi.Qhi(cJ4, adSlot, qmt, cJVar);
                                    cJVar.Qhi(Qhi10.WAv);
                                    zc.Qhi(MQ.this.Qhi, Qhi10.f8925hm);
                                    int i12 = Qhi10.CJ;
                                    if (i12 != 20000) {
                                        cJVar.Qhi(i12);
                                        if (!HzH.CJ().lG() && Qhi10.CJ == 40029) {
                                            qhi.Qhi(-100, Sf.Qhi(-100));
                                        } else {
                                            qhi.Qhi(Qhi10.CJ, Qhi10.f8924fl);
                                        }
                                        com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
                                        cJVar2.ROR();
                                        adSlot.getCodeId();
                                        String.valueOf(Qhi10.Tgh);
                                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.Tgh.incrementAndGet();
                                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.ac();
                                        tgh.Qhi(true).Qhi(cJVar2.Qhi()).ac(CJ).ac();
                                        return;
                                    }
                                    com.bytedance.sdk.openadsdk.core.model.Qhi qhi3 = Qhi10.Sf;
                                    if (qhi3 == null) {
                                        MQ.this.Qhi(qhi, cJVar);
                                        cJVar2.ROR();
                                        adSlot.getCodeId();
                                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.f8650fl.incrementAndGet();
                                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.ac();
                                        tgh.Qhi(true).Qhi(cJVar2.Qhi()).ac(CJ).ac();
                                        return;
                                    }
                                    qhi3.ac(cJ4.toString());
                                    Jma Qhi11 = Jma.Qhi();
                                    com.bytedance.sdk.openadsdk.core.model.qMt qmt2 = qmt;
                                    if (qmt2 != null && (cqu = qmt2.WAv) != null) {
                                        cqu.Qhi(Qhi8, Qhi9, Qhi10.Qhi, Qhi11);
                                    }
                                    qhi.Qhi(Qhi10.Sf, cJVar);
                                    MQ.this.Qhi(Qhi10.Sf);
                                    Map<String, com.bytedance.sdk.openadsdk.core.model.tP> Qhi12 = com.bytedance.sdk.openadsdk.core.model.Qhi.Qhi(Qhi10.Sf);
                                    if (Qhi12 != null) {
                                        com.bytedance.sdk.openadsdk.fl.cJ.Qhi().Qhi(Qhi12);
                                    }
                                    if (Qhi10.Sf.ac() != null && !Qhi10.Sf.ac().isEmpty()) {
                                        MQ.this.Qhi(cJVar2.Sf(), qmt, Qhi8, Qhi9, Qhi10.Qhi, Qhi11, Qhi10.Sf.ac().get(0), js.ac(i10), Qhi10.Sf.ROR());
                                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.CJ.incrementAndGet();
                                    }
                                    com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.ac();
                                    tgh.Qhi(true).Qhi(cJVar2.Qhi()).ac(CJ).ac();
                                    return;
                                } catch (Throwable th3) {
                                    com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", "get ad error: ", th3);
                                    MQ.this.Qhi(qhi, cJVar);
                                    cJVar2.ROR();
                                    adSlot.getCodeId();
                                    com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.f8650fl.incrementAndGet();
                                    com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.ac();
                                    tgh.Qhi(cJVar2.Tgh()).Qhi(cJVar2.Qhi()).ac(cJVar2.CJ()).CJ(th3.getMessage()).ac();
                                    return;
                                }
                            }
                            com.bytedance.sdk.openadsdk.ABk.ac.ac(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.core.MQ.4.2
                                @Override // com.bytedance.sdk.openadsdk.ABk.fl
                                public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                                    com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi4 = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                                    qhi4.cJ("get_ad");
                                    qhi4.ac(adSlot.getCodeId());
                                    qhi4.CJ(js.ac(adSlot.getDurationSlotType()));
                                    qhi4.Qhi(BuildConfig.VERSION_NAME);
                                    return qhi4;
                                }
                            });
                            int Qhi13 = cJVar2.Qhi();
                            String cJ5 = cJVar2.cJ();
                            qhi.Qhi(Qhi13, cJ5);
                            cJVar.Qhi(Qhi13);
                            com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
                            cJVar2.ROR();
                            adSlot.getCodeId();
                            com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.Sf.incrementAndGet();
                            com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.f8649ac.incrementAndGet();
                            com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.Qhi.incrementAndGet();
                            com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.fl();
                            com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.Qhi(Qhi13, cJ5);
                            com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.ac();
                            tgh.Qhi(false).Qhi(Qhi13).CJ(cJ5).ac(cJVar2.CJ()).ac();
                        }
                    }

                    @Override // com.bytedance.sdk.component.ROR.Qhi.cJ
                    public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException, com.bytedance.sdk.component.ROR.cJ cJVar2) {
                        String message;
                        int i12;
                        com.bytedance.sdk.openadsdk.ABk.ac.ac(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.core.MQ.4.3
                            @Override // com.bytedance.sdk.openadsdk.ABk.fl
                            public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                                com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi3 = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                                qhi3.cJ("get_ad");
                                qhi3.ac(adSlot.getCodeId());
                                qhi3.CJ(js.ac(adSlot.getDurationSlotType()));
                                qhi3.Qhi(BuildConfig.VERSION_NAME);
                                return qhi3;
                            }
                        });
                        tgh.cJ();
                        if (cJVar2 != null) {
                            message = cJVar2.cJ();
                        } else {
                            message = iOException != null ? iOException.getMessage() : "";
                        }
                        Jma Qhi9 = Jma.Qhi();
                        if (z11) {
                            requestExtraMap.put("pgad_end", Long.valueOf(Qhi9.Qhi));
                        }
                        if (HzH.CJ().cjC() && Eh.Qhi().ROR() == 1) {
                            js.Qhi("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, MQ.this.Qhi);
                        }
                        if (cJVar2 != null) {
                            i12 = cJVar2.Qhi();
                        } else {
                            i12 = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? 601 : 602;
                        }
                        tP.Qhi qhi3 = qhi;
                        if (qhi3 != null) {
                            qhi3.Qhi(i12, message);
                        }
                        cJVar.Qhi(i12);
                        com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
                        Qhi9.Qhi(Qhi8);
                        adSlot.getCodeId();
                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.f8649ac.incrementAndGet();
                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.Qhi.incrementAndGet();
                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.ROR.incrementAndGet();
                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.fl();
                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.Qhi(i12, message);
                        com.bytedance.sdk.openadsdk.cJ.Qhi.ROR.ac();
                        tgh.CJ(message).Qhi(false).ac();
                    }
                });
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|2|3|(16:8|9|(1:(1:14))(2:43|(1:(1:48))(2:49|(1:54)))|15|16|(1:19)|(1:24)|25|(1:27)(1:41)|28|(1:31)|32|(1:34)|35|(1:37)|39)|55|9|(0)(0)|15|16|(1:19)|(2:22|24)|25|(0)(0)|28|(1:31)|32|(0)|35|(0)|39) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:3:0x000d, B:5:0x0014, B:8:0x001d, B:13:0x002b, B:15:0x002f, B:33:0x0077, B:35:0x007d, B:36:0x00a9, B:40:0x00c3, B:43:0x0132, B:44:0x0142, B:46:0x0151, B:47:0x015e, B:49:0x016d, B:19:0x0039, B:21:0x003d, B:25:0x0046, B:27:0x004a, B:9:0x0020), top: B:57:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016d A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #1 {all -> 0x0176, blocks: (B:3:0x000d, B:5:0x0014, B:8:0x001d, B:13:0x002b, B:15:0x002f, B:33:0x0077, B:35:0x007d, B:36:0x00a9, B:40:0x00c3, B:43:0x0132, B:44:0x0142, B:46:0x0151, B:47:0x015e, B:49:0x016d, B:19:0x0039, B:21:0x003d, B:25:0x0046, B:27:0x004a, B:9:0x0020), top: B:57:0x000d }] */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject Qhi(com.bytedance.sdk.openadsdk.AdSlot r13, com.bytedance.sdk.openadsdk.core.model.qMt r14, int r15) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.MQ.Qhi(com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.qMt, int):org.json.JSONObject");
    }

    /* compiled from: NetApiImpl.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        final int CJ;
        final int Qhi;
        final String ROR;
        public final com.bytedance.sdk.openadsdk.core.model.Qhi Sf;
        final int Tgh;
        final ArrayList<Integer> WAv;

        /* renamed from: ac  reason: collision with root package name */
        final long f8923ac;
        final long cJ;

        /* renamed from: fl  reason: collision with root package name */
        final String f8924fl;

        /* renamed from: hm  reason: collision with root package name */
        final String f8925hm;

        private Qhi(String str, int i10, int i11, String str2, int i12, String str3, com.bytedance.sdk.openadsdk.core.model.Qhi qhi, long j10, long j11, ArrayList<Integer> arrayList) {
            this.Qhi = i10;
            this.CJ = i11;
            this.f8924fl = str2;
            this.ROR = str3;
            this.Sf = qhi;
            this.f8925hm = str;
            this.Tgh = i12;
            this.cJ = j10;
            this.f8923ac = j11;
            this.WAv = arrayList;
        }

        public static Qhi Qhi(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qMt qmt, com.bytedance.sdk.openadsdk.core.model.cJ cJVar) {
            Object obj;
            String optString = jSONObject.optString("did");
            int optInt = jSONObject.optInt("processing_time_ms");
            long optLong = jSONObject.optLong("s_receive_ts");
            long optLong2 = jSONObject.optLong("s_send_ts");
            int optInt2 = jSONObject.optInt("status_code");
            String optString2 = jSONObject.optString("desc");
            String optString3 = jSONObject.optString("request_id");
            int optInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.Qhi, ArrayList<Integer>> Qhi = com.bytedance.sdk.openadsdk.core.cJ.Qhi(jSONObject, adSlot, qmt, cJVar);
            if (Qhi != null && (obj = Qhi.first) != null) {
                ((com.bytedance.sdk.openadsdk.core.model.Qhi) obj).Qhi(jSONObject.optLong("request_after"));
            }
            if (Qhi == null) {
                return new Qhi(optString, optInt, optInt2, optString2, optInt3, optString3, null, optLong, optLong2, null);
            }
            return new Qhi(optString, optInt, optInt2, optString2, optInt3, optString3, (com.bytedance.sdk.openadsdk.core.model.Qhi) Qhi.first, optLong, optLong2, (ArrayList) Qhi.second);
        }

        public static Qhi Qhi(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qMt qmt) {
            JSONArray jSONArray;
            int i10;
            String str;
            long j10;
            long j11;
            String optString = jSONObject.optString("did");
            int optInt = jSONObject.optInt("processing_time_ms");
            long optLong = jSONObject.optLong("s_receive_ts");
            long optLong2 = jSONObject.optLong("s_send_ts");
            int optInt2 = jSONObject.optInt("status_code");
            String optString2 = jSONObject.optString("desc");
            String optString3 = jSONObject.optString("request_id");
            int optInt3 = jSONObject.optInt("reason");
            if (adSlot != null && adSlot.getBiddingTokens() != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("adn_bid_result");
                com.bytedance.sdk.openadsdk.core.model.Qhi qhi = new com.bytedance.sdk.openadsdk.core.model.Qhi();
                if (optJSONArray != null) {
                    int i11 = 0;
                    while (i11 < optJSONArray.length()) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                        if (optJSONObject != null) {
                            String optString4 = optJSONObject.optString(NamingTable.TAG);
                            String optString5 = optJSONObject.optString("render_data");
                            jSONArray = optJSONArray;
                            String optString6 = optJSONObject.optString(InMobiNetworkValues.PRICE);
                            j11 = optLong2;
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("win_notice");
                            JSONArray optJSONArray3 = optJSONObject.optJSONArray("loss_notice");
                            j10 = optLong;
                            String optString7 = optJSONObject.optString("cid");
                            String optString8 = optJSONObject.optString("crid");
                            str = optString3;
                            JSONArray optJSONArray4 = optJSONObject.optJSONArray("adomain");
                            i10 = optInt3;
                            String optString9 = optJSONObject.optString("adn_response_id");
                            com.bytedance.sdk.openadsdk.core.model.hm hmVar = new com.bytedance.sdk.openadsdk.core.model.hm();
                            hmVar.Qhi(optString4);
                            hmVar.cJ(optString5);
                            hmVar.ac(optString6);
                            hmVar.CJ(optString7);
                            hmVar.fl(optString8);
                            hmVar.Tgh(optString9);
                            if (optJSONArray4 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i12 = 0; i12 < optJSONArray4.length(); i12++) {
                                    arrayList.add(optJSONArray4.optString(i12));
                                }
                                hmVar.ac(arrayList);
                            }
                            if (optJSONArray2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (int i13 = 0; i13 < optJSONArray2.length(); i13++) {
                                    arrayList2.add(optJSONArray2.optString(i13));
                                }
                                hmVar.Qhi(arrayList2);
                            }
                            if (optJSONArray3 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i14 = 0; i14 < optJSONArray3.length(); i14++) {
                                    arrayList3.add(optJSONArray3.optString(i14));
                                }
                                hmVar.cJ(arrayList3);
                            }
                            qhi.Qhi(hmVar);
                        } else {
                            jSONArray = optJSONArray;
                            i10 = optInt3;
                            str = optString3;
                            j10 = optLong;
                            j11 = optLong2;
                        }
                        i11++;
                        optJSONArray = jSONArray;
                        optString3 = str;
                        optLong2 = j11;
                        optLong = j10;
                        optInt3 = i10;
                    }
                }
                return new Qhi(optString, optInt, optInt2, optString2, optInt3, optString3, qhi, optLong, optLong2, null);
            }
            return new Qhi(optString, optInt, optInt2, optString2, optInt3, optString3, null, optLong, optLong2, null);
        }
    }

    private boolean CJ(String str) {
        if (com.bytedance.sdk.openadsdk.core.CJ.WAv.Qhi()) {
            return true;
        }
        if (com.bytedance.sdk.openadsdk.core.CJ.WAv.Qhi(str)) {
            String cJ2 = com.bytedance.sdk.openadsdk.core.CJ.WAv.cJ();
            if (!TextUtils.isEmpty(cJ2)) {
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(cJ2, System.currentTimeMillis());
            }
            return true;
        }
        return false;
    }

    public static JSONArray ac(String str) {
        try {
            Set<com.bytedance.sdk.openadsdk.core.ugen.Qhi.Qhi> Qhi2 = com.bytedance.sdk.openadsdk.core.ugen.Qhi.cJ.Qhi().Qhi(str);
            if (Qhi2 != null && Qhi2.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.ugen.Qhi.Qhi qhi : Qhi2) {
                    if (qhi != null && !TextUtils.isEmpty(qhi.fl())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] split = qhi.Qhi().split("_");
                        if (split.length == 2) {
                            jSONObject.put(FacebookMediationAdapter.KEY_ID, split[1]);
                            jSONObject.put("md5", qhi.cJ());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", "getUgenParentTplIds: ", e10);
            return null;
        }
    }

    private void Qhi(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.qMt qmt) {
        JSONArray jSONArray;
        if (qmt != null && (jSONArray = qmt.f9112fl) != null) {
            try {
                jSONObject.put("source_temai_product_ids", jSONArray);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tP
    public void Qhi(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.qMt qmt, final int i10, tP.Qhi qhi) {
        final com.bytedance.sdk.openadsdk.core.Qhi.Qhi qhi2 = new com.bytedance.sdk.openadsdk.core.Qhi.Qhi(qhi);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            iMK.cJ().post(new com.bytedance.sdk.component.Sf.hm("getAd") { // from class: com.bytedance.sdk.openadsdk.core.MQ.1
                @Override // java.lang.Runnable
                public void run() {
                    MQ.this.cJ(adSlot, qmt, i10, qhi2);
                }
            });
        } else {
            cJ(adSlot, qmt, i10, qhi2);
        }
    }

    private void Qhi(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.qMt qmt, com.bytedance.sdk.component.ROR.cJ.fl flVar, final Map<String, Object> map, final boolean z10, final Jma jma, final tP.Qhi qhi) {
        flVar.Qhi(new com.bytedance.sdk.component.ROR.Qhi.cJ() { // from class: com.bytedance.sdk.openadsdk.core.MQ.5
            @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
            public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar) {
                if (z10) {
                    map.put("pgad_end", jma);
                }
                if (cJVar == null || !cJVar.Tgh()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(cJVar.CJ());
                    if (HzH.CJ().cjC() && Eh.Qhi().ROR() == 1) {
                        js.Qhi("Pangle_Debug_Mode", jSONObject.toString(), MQ.this.Qhi);
                    }
                    JSONObject cJ2 = MQ.this.cJ(jSONObject);
                    if (cJ2 == null) {
                        qhi.Qhi(-1, Sf.Qhi(-1));
                        return;
                    }
                    Qhi Qhi2 = Qhi.Qhi(cJ2, adSlot, qmt);
                    if (Qhi2.CJ != 20000) {
                        if (!HzH.CJ().lG() && Qhi2.CJ == 40029) {
                            qhi.Qhi(-100, Sf.Qhi(-100));
                            return;
                        } else {
                            qhi.Qhi(Qhi2.CJ, Qhi2.f8924fl);
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.model.Qhi qhi2 = Qhi2.Sf;
                    if (qhi2 == null) {
                        qhi.Qhi(-1, Sf.Qhi(-1));
                        return;
                    }
                    qhi2.ac(cJ2.toString());
                    qhi.Qhi(Qhi2.Sf, new com.bytedance.sdk.openadsdk.core.model.cJ());
                    MQ.this.Qhi(Qhi2.Sf);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", "get ad error: ", th2);
                    qhi.Qhi(-1, Sf.Qhi(-1));
                }
            }

            @Override // com.bytedance.sdk.component.ROR.Qhi.cJ
            public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException, com.bytedance.sdk.component.ROR.cJ cJVar) {
                Jma Qhi2 = Jma.Qhi();
                if (z10) {
                    map.put("pgad_end", Long.valueOf(Qhi2.Qhi));
                }
                if (HzH.CJ().cjC() && Eh.Qhi().ROR() == 1) {
                    js.Qhi("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, MQ.this.Qhi);
                }
                if (cJVar != null) {
                    qhi.Qhi(cJVar.Qhi(), cJVar.cJ());
                } else {
                    qhi.Qhi(601, iOException != null ? iOException.getMessage() : "");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(com.bytedance.sdk.openadsdk.core.model.Qhi qhi) {
        List<com.bytedance.sdk.openadsdk.core.model.tP> ac2 = qhi.ac();
        if (ac2 == null || ac2.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < ac2.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.model.tP tPVar = ac2.get(i10);
            if (tPVar != null && tPVar.Gm() == null) {
                Qhi("", 0, 0, tPVar.dIT(), tPVar);
                Qhi("", 0, 0, tPVar.Qe(), tPVar);
                List<com.bytedance.sdk.openadsdk.core.model.hpZ> cjC = tPVar.cjC();
                if (cjC != null && cjC.size() > 0) {
                    for (int i11 = 0; i11 < cjC.size(); i11++) {
                        Qhi(tPVar, cjC.get(i11));
                    }
                }
                if (tPVar.FQ() != null) {
                    Qhi(tPVar.FQ().WAv(), tPVar.FQ().ac(), tPVar.FQ().cJ(), (com.bytedance.sdk.openadsdk.core.model.hpZ) null, tPVar);
                }
            }
        }
    }

    private void Qhi(String str, int i10, int i11, com.bytedance.sdk.openadsdk.core.model.hpZ hpz, com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.ROR.fl.Qhi(str).Qhi(i10).cJ(i11).fl(zn.CJ(HzH.Qhi())).CJ(zn.ac(HzH.Qhi())).ac(2).Qhi(new com.bytedance.sdk.openadsdk.ROR.cJ(tPVar, str, null), 4);
        } else if (hpz == null) {
        } else {
            com.bytedance.sdk.openadsdk.ROR.fl.Qhi(hpz).ac(2).Qhi(new com.bytedance.sdk.openadsdk.ROR.cJ(tPVar, hpz.Qhi(), null), 4);
        }
    }

    @DungeonFlag
    private JSONObject cJ(String str, List<FilterWord> list, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timestamp", System.currentTimeMillis());
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("extra", str);
            jSONObject2.put("filter_words", Qhi(list));
            jSONObject2.put("dislike_source", str4);
            if (com.bytedance.sdk.openadsdk.core.settings.HzH.YD().YB() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                jSONObject2.put("creative_info", com.bytedance.sdk.component.utils.Qhi.Qhi(new JSONObject(str2)).toString());
                jSONObject2.put("feedback_type", 1);
                jSONObject2.put("user_description", str3);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, com.bytedance.sdk.openadsdk.core.model.hpZ hpz) {
        if (hpz == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ROR.fl.Qhi(hpz).ac(2).Qhi(new com.bytedance.sdk.openadsdk.ROR.cJ(tPVar, hpz.Qhi(), new com.bytedance.sdk.component.fl.HzH() { // from class: com.bytedance.sdk.openadsdk.core.MQ.6
            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(int i10, String str, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(com.bytedance.sdk.component.fl.zc zcVar) {
            }
        }), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:7:0x001b, B:9:0x0023, B:11:0x0034, B:13:0x0050, B:14:0x0055, B:16:0x005f, B:20:0x0069, B:21:0x006c, B:23:0x0072, B:24:0x009a), top: B:27:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:7:0x001b, B:9:0x0023, B:11:0x0034, B:13:0x0050, B:14:0x0055, B:16:0x005f, B:20:0x0069, B:21:0x006c, B:23:0x0072, B:24:0x009a), top: B:27:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:7:0x001b, B:9:0x0023, B:11:0x0034, B:13:0x0050, B:14:0x0055, B:16:0x005f, B:20:0x0069, B:21:0x006c, B:23:0x0072, B:24:0x009a), top: B:27:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi(com.bytedance.sdk.component.cJ.Qhi.Gm r13, com.bytedance.sdk.openadsdk.core.model.qMt r14, com.bytedance.sdk.openadsdk.utils.Jma r15, com.bytedance.sdk.openadsdk.utils.Jma r16, int r17, com.bytedance.sdk.openadsdk.utils.Jma r18, com.bytedance.sdk.openadsdk.core.model.tP r19, java.lang.String r20, boolean r21) {
        /*
            r12 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r18
            com.bytedance.sdk.openadsdk.core.settings.ROR r5 = com.bytedance.sdk.openadsdk.core.HzH.CJ()
            boolean r5 = r5.Hf()
            if (r5 != 0) goto L12
            return
        L12:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r6 = 0
            if (r1 == 0) goto L33
            com.bytedance.sdk.openadsdk.utils.Jma r8 = r1.f9113hm     // Catch: java.lang.Exception -> La8
            long r9 = r8.Qhi     // Catch: java.lang.Exception -> La8
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 <= 0) goto L33
            java.lang.String r9 = "client_start_time"
            long r10 = r15.Qhi(r8)     // Catch: java.lang.Exception -> La8
            r5.put(r9, r10)     // Catch: java.lang.Exception -> La8
            com.bytedance.sdk.openadsdk.utils.Jma r1 = r1.f9113hm     // Catch: java.lang.Exception -> La8
            long r8 = r4.Qhi(r1)     // Catch: java.lang.Exception -> La8
            goto L34
        L33:
            r8 = r6
        L34:
            java.lang.String r1 = "network_time"
            long r10 = r3.Qhi(r15)     // Catch: java.lang.Exception -> La8
            r5.put(r1, r10)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "sever_time"
            r2 = r17
            r5.put(r1, r2)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "client_end_time"
            long r2 = r4.Qhi(r3)     // Catch: java.lang.Exception -> La8
            r5.put(r1, r2)     // Catch: java.lang.Exception -> La8
            r1 = 1
            if (r21 == 0) goto L55
            java.lang.String r2 = "is_choose_ad"
            r5.put(r2, r1)     // Catch: java.lang.Exception -> La8
        L55:
            java.lang.String r2 = "open_ad"
            r3 = r20
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Exception -> La8
            if (r2 == 0) goto L6c
            java.lang.String r2 = "is_icon_only"
            boolean r4 = r19.czB()     // Catch: java.lang.Exception -> La8
            if (r4 == 0) goto L68
            goto L69
        L68:
            r1 = 0
        L69:
            r5.put(r2, r1)     // Catch: java.lang.Exception -> La8
        L6c:
            long r1 = r0.cJ     // Catch: java.lang.Exception -> La8
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 <= 0) goto L9a
            java.lang.String r4 = "enqueue_2_run_ts"
            long r6 = r0.f8336ac     // Catch: java.lang.Exception -> La8
            long r6 = r6 - r1
            r5.put(r4, r6)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "run_2_connect_end_ts"
            long r6 = r0.f8337fl     // Catch: java.lang.Exception -> La8
            long r10 = r0.cJ     // Catch: java.lang.Exception -> La8
            long r6 = r6 - r10
            r5.put(r1, r6)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "connect_end_2_response_end_ts"
            long r6 = r0.Tgh     // Catch: java.lang.Exception -> La8
            long r10 = r0.f8337fl     // Catch: java.lang.Exception -> La8
            long r6 = r6 - r10
            r5.put(r1, r6)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "response_end_2_callback_end_ts"
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> La8
            long r10 = r0.Tgh     // Catch: java.lang.Exception -> La8
            long r6 = r6 - r10
            r5.put(r1, r6)     // Catch: java.lang.Exception -> La8
        L9a:
            java.lang.String r0 = "load_ad_time"
            r13 = r19
            r14 = r20
            r15 = r0
            r16 = r8
            r18 = r5
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(r13, r14, r15, r16, r18)     // Catch: java.lang.Exception -> La8
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.MQ.Qhi(com.bytedance.sdk.component.cJ.Qhi.Gm, com.bytedance.sdk.openadsdk.core.model.qMt, com.bytedance.sdk.openadsdk.utils.Jma, com.bytedance.sdk.openadsdk.utils.Jma, int, com.bytedance.sdk.openadsdk.utils.Jma, com.bytedance.sdk.openadsdk.core.model.tP, java.lang.String, boolean):void");
    }

    private static String cJ(AdSlot adSlot) {
        String ABk = hm.cJ().ABk();
        if (adSlot == null) {
            return TextUtils.isEmpty(ABk) ? "" : ABk;
        }
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(ABk)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return ABk;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(userData);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString(NamingTable.TAG, null));
                }
            }
            try {
                JSONArray jSONArray2 = new JSONArray(ABk);
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i11);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString(NamingTable.TAG, null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (Throwable unused) {
                return userData;
            }
        } catch (Throwable unused2) {
            return ABk;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[Catch: all -> 0x0181, TRY_ENTER, TryCatch #0 {all -> 0x0181, blocks: (B:3:0x0009, B:6:0x0015, B:8:0x002e, B:11:0x0038, B:13:0x004c, B:15:0x0052, B:17:0x0056, B:19:0x005c, B:27:0x0079, B:35:0x00a5, B:36:0x00a9, B:39:0x00b1, B:43:0x00da, B:45:0x00f5, B:47:0x00fb, B:49:0x0105, B:53:0x0118, B:68:0x013c, B:72:0x0144, B:76:0x0150, B:78:0x0156, B:80:0x015a, B:84:0x0165, B:83:0x0161, B:75:0x014c, B:60:0x012a, B:62:0x0130, B:41:0x00c9, B:28:0x008b, B:30:0x0091, B:31:0x009c, B:21:0x0064, B:23:0x006e), top: B:89:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:3:0x0009, B:6:0x0015, B:8:0x002e, B:11:0x0038, B:13:0x004c, B:15:0x0052, B:17:0x0056, B:19:0x005c, B:27:0x0079, B:35:0x00a5, B:36:0x00a9, B:39:0x00b1, B:43:0x00da, B:45:0x00f5, B:47:0x00fb, B:49:0x0105, B:53:0x0118, B:68:0x013c, B:72:0x0144, B:76:0x0150, B:78:0x0156, B:80:0x015a, B:84:0x0165, B:83:0x0161, B:75:0x014c, B:60:0x012a, B:62:0x0130, B:41:0x00c9, B:28:0x008b, B:30:0x0091, B:31:0x009c, B:21:0x0064, B:23:0x006e), top: B:89:0x0009, inners: #1 }] */
    @Override // com.bytedance.sdk.openadsdk.core.tP
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.cJ.Tgh Qhi(org.json.JSONObject r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.MQ.Qhi(org.json.JSONObject, java.lang.String, boolean):com.bytedance.sdk.openadsdk.cJ.Tgh");
    }

    public JSONObject cJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int optInt = jSONObject.optInt("cypher", -1);
            String optString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            String optString2 = jSONObject.optString("auction_price", "");
            String cJ2 = cJ(optInt, optString);
            if (TextUtils.isEmpty(cJ2)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(cJ2);
            try {
                jSONObject2.put("auction_price", optString2);
            } catch (Throwable unused) {
            }
            return jSONObject2;
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String cJ(int i10, String str) {
        Object obj;
        if (i10 == 3) {
            return com.bytedance.sdk.component.utils.Qhi.ac(str);
        }
        if (i10 == 4) {
            Pair<Integer, String> decryptType4 = PangleEncryptManager.decryptType4(str);
            if (decryptType4 != null && (obj = decryptType4.second) != null) {
                String str2 = (String) obj;
                EBS.Qhi(true);
                return str2;
            }
            EBS.Qhi(false);
            EBS.Qhi(2, PangleEncryptConstant.CryptDataScene.GET_ADS, decryptType4 != null ? ((Integer) decryptType4.first).intValue() : 0);
        }
        return null;
    }

    public static JSONArray cJ(String str) {
        try {
            Set<String> cJ2 = com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.cJ(str);
            if (cJ2 != null && cJ2.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (String str2 : cJ2) {
                    com.bytedance.sdk.component.adexpress.Qhi.ac.cJ Qhi2 = com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.Qhi(str2);
                    if (Qhi2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(FacebookMediationAdapter.KEY_ID, Qhi2.cJ());
                        jSONObject.put("md5", Qhi2.ac());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", "getParentTplIds: ", e10);
            return null;
        }
    }

    private void Qhi(Map<String, String> map, com.bytedance.sdk.component.ROR.cJ.fl flVar) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    flVar.cJ(entry.getKey(), entry.getValue());
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", "ADD header exceptopn", e10.getMessage());
                }
            }
        }
        try {
            flVar.cJ("User-Agent", js.ac());
        } catch (Exception e11) {
            com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", "ADD header exceptopn", e11.getMessage());
        }
    }

    private void Qhi(JSONObject jSONObject, boolean z10) {
        Object obj;
        if (hm.cJ().HzH()) {
            try {
                jSONObject.getJSONObject("header").put("aid", "4562");
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", "reportETEvent error", e10.getMessage());
            }
            com.bytedance.sdk.component.ROR.cJ.fl cJ2 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().cJ();
            cJ2.cJ(js.ABk());
            byte[] bArr = null;
            if (z10) {
                com.bytedance.sdk.openadsdk.core.settings.ROR YD = com.bytedance.sdk.openadsdk.core.settings.HzH.YD();
                PangleEncryptConstant.CryptDataScene cryptDataScene = PangleEncryptConstant.CryptDataScene.APP_LOG;
                boolean Qhi2 = YD.Qhi(cryptDataScene);
                byte[] fl2 = fl(jSONObject.toString());
                if (Qhi2) {
                    Pair<Integer, byte[]> encryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(fl2);
                    if (encryptType4WithoutBase64 != null && (obj = encryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                        EBS.cJ(true);
                        bArr = (byte[]) obj;
                    } else {
                        int intValue = encryptType4WithoutBase64 != null ? ((Integer) encryptType4WithoutBase64.first).intValue() : 0;
                        EBS.cJ(false);
                        EBS.Qhi(1, cryptDataScene, intValue);
                    }
                }
                if (bArr != null) {
                    cJ2.cJ("Content-Encoding", "union_sdk_encode");
                    cJ2.cJ("x-pgli18n", "4");
                    cJ2.Qhi("application/octet-stream;tt-data=a", bArr);
                } else {
                    bArr = PangleEncryptManager.encryptV3(fl2);
                    if (bArr != null) {
                        Qhi(cJ(), cJ2);
                        cJ2.Qhi("application/octet-stream;tt-data=a", bArr);
                    } else {
                        com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", "V3 encrypt failed");
                    }
                }
            }
            if (bArr == null) {
                JSONObject Qhi3 = com.bytedance.sdk.component.utils.Qhi.Qhi(jSONObject);
                if (ac(Qhi3)) {
                    jSONObject = Qhi3;
                }
                Qhi(CJ(jSONObject), cJ2);
                cJ2.Qhi(jSONObject.toString(), HzH.CJ().kYc());
            }
            cJ2.Qhi(7);
            cJ2.Qhi("et_applog");
            cJ2.Qhi(new com.bytedance.sdk.component.ROR.Qhi.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.MQ.7
                @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar) {
                    if (cJVar == null || !cJVar.Tgh()) {
                        return;
                    }
                    cJVar.CJ();
                }

                @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tP
    public void Qhi(String str, List<FilterWord> list, String str2, String str3, String str4) {
        JSONObject cJ2;
        if (com.bytedance.sdk.openadsdk.core.settings.ABk.Qhi() && (cJ2 = cJ(str, list, str2, str3, str4)) != null) {
            com.bytedance.sdk.component.ROR.cJ.fl cJ3 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().cJ();
            String CJ = js.CJ("/api/ad/union/dislike_event/");
            JSONObject Qhi2 = Qhi(PangleEncryptConstant.CryptDataScene.DISLIKE, cJ2);
            String jSONObject = Qhi2 != null ? Qhi2.toString() : null;
            Qhi(cJ3, Qhi2);
            cJ3.cJ(CJ);
            cJ3.CJ(jSONObject);
            final com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh tgh = new com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh(6);
            tgh.Qhi(CJ).cJ(jSONObject).Qhi();
            cJ3.Qhi(7);
            cJ3.Qhi("dislike");
            cJ3.Qhi(new com.bytedance.sdk.component.ROR.Qhi.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.MQ.8
                @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar) {
                    if (cJVar != null) {
                        tgh.Qhi(cJVar.Tgh()).Qhi(cJVar.Qhi()).CJ(cJVar.cJ()).ac(cJVar.CJ()).ac();
                        return;
                    }
                    tgh.Qhi(false).Qhi(com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh.Qhi).ac();
                }

                @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException) {
                    tgh.Qhi(false).CJ(iOException != null ? iOException.getMessage() : null).ac();
                }
            });
            try {
                String optString = new JSONObject(str).optString("cid", "");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.CJ.MQ.Qhi().Qhi("dislike", optString, (String) null, (JSONObject) null);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.ABk.cJ(e10.getMessage());
            }
        }
    }

    private static JSONObject Qhi(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        if (com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Qhi(cryptDataScene)) {
            JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject, new qMt(cryptDataScene));
            EBS.Qhi(encryptType4);
            return encryptType4;
        }
        return com.bytedance.sdk.component.utils.Qhi.Qhi(jSONObject);
    }

    private JSONArray Qhi(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (FilterWord filterWord : list) {
            jSONArray.put(filterWord.getId());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(tP.Qhi qhi, com.bytedance.sdk.openadsdk.core.model.cJ cJVar) {
        qhi.Qhi(-1, Sf.Qhi(-1));
        cJVar.Qhi(-1);
        com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(tP.cJ cJVar) {
        cJVar.Qhi(-1, Sf.Qhi(-1));
    }

    public static JSONObject Qhi(AdSlot adSlot) {
        bxS bxs;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", HzH.CJ().MND());
            jSONObject.put("lmt", DeviceUtils.ac());
            jSONObject.put("coppa", hm.cJ().WAv());
            jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, hm.cJ().hm());
            jSONObject.put("is_gdpr_user", HzH.CJ().ip());
            jSONObject.put("ccpa", hm.cJ().MQ());
            if (adSlot != null && bxS.Qhi.containsKey(Integer.valueOf(adSlot.getCodeId())) && (bxs = bxS.Qhi.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", bxs.cJ());
                jSONObject.put("lastbundle", bxs.ac());
                jSONObject.put("lastclick", bxs.CJ());
                jSONObject.put("lastskip", bxs.fl());
            }
            Qhi(jSONObject, "keywords", hm.cJ().zc());
            Qhi(jSONObject, "data", cJ(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static void Qhi(JSONObject jSONObject, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private JSONObject Qhi(AdSlot adSlot, int i10, com.bytedance.sdk.openadsdk.core.model.qMt qmt) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FacebookMediationAdapter.KEY_ID, adSlot.getCodeId());
            jSONObject.put("adtype", i10);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put("creative_id", adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (qmt != null) {
                jSONObject.put("render_method", qmt.Sf);
                int i11 = qmt.Sf;
                if (i11 == 1) {
                    Qhi(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i11 == 2) {
                    Qhi(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                Qhi(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", cJ(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", ac(adSlot.getCodeId()));
            jSONObject.put("pos", AdSlot.getPosition(i10));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (adSlot.getNativeAdType() > 0 || i10 == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (qmt != null && (obj = qmt.ROR) != null) {
                jSONObject.put("session_params", obj);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i10 == 7 || i10 == 8) {
                adCount = 1;
            }
            if (qmt != null && qmt.f9112fl != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i10 == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void Qhi(JSONObject jSONObject, String str, int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put(InMobiNetworkValues.WIDTH, i10);
            jSONObject2.put(InMobiNetworkValues.HEIGHT, i11);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    private void Qhi(JSONObject jSONObject, String str, float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put(InMobiNetworkValues.WIDTH, (int) f10);
            jSONObject2.put(InMobiNetworkValues.HEIGHT, (int) f11);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tP
    public void Qhi(JSONObject jSONObject, final tP.cJ cJVar) {
        if (!com.bytedance.sdk.openadsdk.core.settings.ABk.Qhi()) {
            if (cJVar != null) {
                cJVar.Qhi(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
            }
        } else if (jSONObject == null || cJVar == null) {
        } else {
            JSONObject Qhi2 = Qhi(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
            final com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh tgh = new com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh(5);
            com.bytedance.sdk.component.ROR.cJ.fl cJ2 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().cJ();
            try {
                String Qhi3 = com.bytedance.sdk.openadsdk.Tgh.fl.Qhi(cJ2, js.CJ("/api/ad/union/sdk/reward_video/reward/"));
                cJ2.cJ(Qhi3);
                tgh.Qhi(Qhi3);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", e10.getMessage());
            }
            Qhi(cJ2, Qhi2);
            cJ2.CJ(Qhi2 != null ? Qhi2.toString() : "");
            tgh.Qhi(cJ2.ac()).Qhi();
            cJ2.Qhi(10);
            cJ2.Qhi("reward");
            cJ2.Qhi(new com.bytedance.sdk.component.ROR.Qhi.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.MQ.9
                @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar2) {
                    if (cJVar2 != null) {
                        if (cJVar2.Tgh() && !TextUtils.isEmpty(cJVar2.CJ())) {
                            tgh.Qhi(true).Qhi(cJVar2.Qhi()).ac(cJVar2.CJ()).ac();
                            try {
                                JSONObject jSONObject2 = new JSONObject(cJVar2.CJ());
                                String cJ3 = MQ.cJ(jSONObject2.optInt("cypher", -1), jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                                if (!TextUtils.isEmpty(cJ3)) {
                                    try {
                                        jSONObject2 = new JSONObject(cJ3);
                                    } catch (Throwable unused) {
                                    }
                                }
                                cJ Qhi4 = cJ.Qhi(jSONObject2);
                                int i10 = Qhi4.Qhi;
                                if (i10 != 20000) {
                                    cJVar.Qhi(i10, Sf.Qhi(i10));
                                    return;
                                } else if (Qhi4.f8926ac == null) {
                                    MQ.this.Qhi(cJVar);
                                    return;
                                } else {
                                    cJVar.Qhi(Qhi4);
                                    return;
                                }
                            } catch (JSONException e11) {
                                com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", e11.getMessage());
                                MQ.this.Qhi(cJVar);
                                return;
                            }
                        }
                        tgh.Qhi(cJVar2.Tgh()).ac(cJVar2.CJ()).Qhi(cJVar2.Qhi()).CJ(cJVar2.cJ()).ac();
                        String Qhi5 = Sf.Qhi(-2);
                        int Qhi6 = cJVar2.Qhi();
                        if (!cJVar2.Tgh() && !TextUtils.isEmpty(cJVar2.cJ())) {
                            Qhi5 = cJVar2.cJ();
                        }
                        cJVar.Qhi(Qhi6, Qhi5);
                        return;
                    }
                    tgh.Qhi(false).Qhi(com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh.Qhi).ac();
                    MQ.this.Qhi(cJVar);
                }

                @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException) {
                    String message = iOException != null ? iOException.getMessage() : "";
                    tgh.Qhi(false).CJ(message).ac();
                    cJVar.Qhi(-2, message);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tP
    public com.bytedance.sdk.openadsdk.cJ.Tgh Qhi(JSONObject jSONObject) {
        boolean z10;
        boolean z11;
        int i10;
        String str = "error unknown";
        long currentTimeMillis = System.currentTimeMillis();
        if (com.bytedance.sdk.openadsdk.core.settings.ABk.Qhi() && jSONObject != null && jSONObject.length() > 0) {
            com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh tgh = new com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh(4);
            JSONObject Qhi2 = Qhi(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
            com.bytedance.sdk.component.ROR.cJ.fl cJ2 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().cJ();
            boolean z12 = false;
            try {
                cJ2.Qhi(Qhi2.toString(), HzH.CJ().kYc());
                String CJ = js.CJ("/api/ad/union/sdk/stats/batch/");
                tgh.Qhi(CJ).Qhi(cJ2.ac()).Qhi();
                cJ2.cJ(CJ);
                Qhi(cJ2, Qhi2);
                cJ2.cJ("User-Agent", js.ac());
                if (com.bytedance.sdk.openadsdk.core.settings.HzH.YD().et()) {
                    cJ2.cJ("_disable_retry", "1");
                }
                com.bytedance.sdk.component.ROR.cJ Qhi3 = cJ2.Qhi();
                try {
                } catch (Throwable unused) {
                    z10 = false;
                    z11 = false;
                    i10 = 0;
                }
                if (Qhi3 == null) {
                    return new com.bytedance.sdk.openadsdk.cJ.Tgh(false, 0, "error unknown", false);
                }
                if (!Qhi3.Tgh() || TextUtils.isEmpty(Qhi3.CJ())) {
                    z10 = false;
                    z11 = false;
                } else {
                    JSONObject jSONObject2 = new JSONObject(Qhi3.CJ());
                    int optInt = jSONObject2.optInt("code", -1);
                    str = jSONObject2.optString("data", "");
                    z10 = optInt == 20000;
                    z11 = optInt == 60005;
                }
                try {
                    i10 = Qhi3.Qhi();
                    try {
                        if (!Qhi3.Tgh()) {
                            str = Qhi3.cJ();
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    i10 = 0;
                }
                boolean z13 = Qhi3 == null;
                if (!z13 && Qhi3.Tgh()) {
                    z12 = true;
                }
                tgh.Qhi(z12).ac(z13 ? null : Qhi3.CJ()).Qhi(z13 ? com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh.Qhi : i10).CJ(z13 ? null : Qhi3.cJ()).ac();
                com.bytedance.sdk.openadsdk.cJ.Qhi.Qhi.Qhi(com.bytedance.sdk.openadsdk.cJ.Qhi.Qhi.cJ, z10, i10, System.currentTimeMillis() - currentTimeMillis);
                return new com.bytedance.sdk.openadsdk.cJ.Tgh(z10, i10, str, z11);
            } catch (Throwable unused4) {
                com.bytedance.sdk.openadsdk.cJ.Qhi.Qhi.Qhi(com.bytedance.sdk.openadsdk.cJ.Qhi.Qhi.cJ, false, 0, System.currentTimeMillis() - currentTimeMillis);
                return new com.bytedance.sdk.openadsdk.cJ.Tgh(false, 0, "error unknown", false);
            }
        }
        return null;
    }

    private void Qhi(com.bytedance.sdk.component.ROR.cJ.fl flVar, JSONObject jSONObject) {
        try {
            if (ac(jSONObject) && jSONObject.optInt("cypher") == 4) {
                flVar.cJ("x-pgli18n", "4");
                flVar.cJ("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tP
    public com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi Qhi() {
        com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi qhi = null;
        if (com.bytedance.sdk.openadsdk.core.settings.ABk.Qhi()) {
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tpl_fetch_model", "date", 0L);
            String FQ = HzH.CJ().FQ();
            String cJ2 = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ("tpl_fetch_model", "last_url", "");
            if (currentTimeMillis <= HzH.CJ().NFd() && currentTimeMillis >= 0 && TextUtils.equals(FQ, cJ2)) {
                String cJ3 = com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ("tpl_fetch_model", "model", "");
                try {
                    if (!TextUtils.isEmpty(cJ3)) {
                        return com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi.CJ(cJ3);
                    }
                } catch (Exception unused) {
                }
            }
            com.bytedance.sdk.component.ROR.cJ.cJ ac2 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().ac();
            try {
                ac2.cJ(com.bytedance.sdk.openadsdk.Tgh.fl.Qhi(ac2, FQ));
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("NetApiImpl", e10.getMessage());
            }
            com.bytedance.sdk.component.ROR.cJ Qhi2 = ac2.Qhi();
            if (Qhi2 != null) {
                try {
                    if (Qhi2.Tgh()) {
                        String CJ = Qhi2.CJ();
                        qhi = com.bytedance.sdk.component.adexpress.Qhi.ac.Qhi.CJ(CJ);
                        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
                        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tpl_fetch_model", "model", CJ);
                        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("tpl_fetch_model", "last_url", FQ);
                        return qhi;
                    }
                    return null;
                } catch (Exception unused2) {
                    return qhi;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tP
    public void Qhi(String str) {
        com.bytedance.sdk.component.ROR.cJ.cJ ac2 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().ac();
        ac2.cJ(str);
        ac2.Qhi("upload_bidding");
        ac2.Qhi(7);
        ac2.Qhi(new com.bytedance.sdk.component.ROR.Qhi.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.MQ.10
            @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
            public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
            public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar) {
                cJVar.CJ();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.tP
    public void Qhi(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.ROR.cJ.fl cJ2 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().cJ();
        cJ2.cJ(str);
        cJ2.Qhi(jSONObject);
        cJ2.Qhi(5);
        cJ2.Qhi("apm_pv");
        cJ2.Qhi(new com.bytedance.sdk.component.ROR.Qhi.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.MQ.2
            @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
            public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
            public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar) {
                cJVar.CJ();
            }
        });
    }
}
