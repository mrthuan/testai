package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.ROR.Qhi.cJ;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdInfoFactory.java */
/* loaded from: classes.dex */
public class cJ {

    /* compiled from: AdInfoFactory.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        public String Qhi;
        public int cJ;

        public Qhi(String str, int i10) {
            this.Qhi = str;
            this.cJ = i10;
        }
    }

    private static AdSlot CJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("mCodeId", "");
        int optInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        int optInt3 = jSONObject.optInt("mAdCount", 6);
        boolean optBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        String optString2 = jSONObject.optString("mRewardName", "");
        int optInt4 = jSONObject.optInt("mRewardAmount", 0);
        String optString3 = jSONObject.optString("mMediaExtra", "");
        String optString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int optInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean optBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean optBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        String optString5 = jSONObject.optString("mBidAdm", "");
        return new AdSlot.Builder().setCodeId(optString).setImageAcceptedSize(optInt, optInt2).setExpressViewAcceptedSize((float) jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d), (float) jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d)).setAdCount(optInt3).setSupportDeepLink(optBoolean).setRewardName(optString2).setRewardAmount(optInt4).setMediaExtra(optString3).setUserID(optString4).setNativeAdType(optInt5).setIsAutoPlay(optBoolean2).isExpressAd(optBoolean3).withBid(optString5).setDurationSlotType(jSONObject.optInt("mDurationSlotType", 0)).build();
    }

    private static Map<String, Object> Gm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        return hashMap;
    }

    private static boolean Qhi(int i10) {
        return i10 == 2 || i10 == 3 || i10 == 8;
    }

    private static com.bytedance.sdk.openadsdk.core.model.kYc ROR(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.kYc kyc = new com.bytedance.sdk.openadsdk.core.model.kYc();
        if (jSONObject == null) {
            kyc.Qhi(10L);
            kyc.cJ(20L);
            kyc.ac(10L);
            kyc.CJ(20L);
            kyc.Qhi("");
            return kyc;
        }
        kyc.Qhi(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        kyc.cJ(jSONObject.optLong("straight_lp_showtime", 20L));
        kyc.ac(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        kyc.CJ(jSONObject.optLong("straight_agg_showtime", 20L));
        kyc.Qhi(jSONObject.optString("loading_text", ""));
        return kyc;
    }

    private static com.bytedance.sdk.openadsdk.core.model.Tgh Sf(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.Tgh tgh = new com.bytedance.sdk.openadsdk.core.model.Tgh();
        if (jSONObject == null) {
            tgh.Qhi(0);
            tgh.cJ(0);
            tgh.cJ(new ArrayList());
            tgh.ac(0);
            tgh.Qhi(new ArrayList());
            return tgh;
        }
        tgh.Qhi(jSONObject.optInt("interceptor_x", 0));
        tgh.cJ(jSONObject.optInt("interceptor_y", 0));
        JSONArray optJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(Integer.valueOf(optJSONArray.optInt(i10)));
            }
        }
        tgh.cJ(arrayList);
        tgh.ac(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray optJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                arrayList2.add(optJSONArray2.optString(i11));
            }
        }
        tgh.Qhi(arrayList2);
        return tgh;
    }

    private static com.bytedance.sdk.openadsdk.core.model.ac Tgh(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.ac acVar = new com.bytedance.sdk.openadsdk.core.model.ac();
        acVar.cJ(jSONObject.optString("app_name"));
        acVar.ac(jSONObject.optString(InMobiNetworkValues.PACKAGE_NAME));
        acVar.Qhi(jSONObject.optString("download_url"));
        acVar.Qhi(jSONObject.optDouble("score", -1.0d));
        acVar.Qhi(jSONObject.optInt("comment_num", -1));
        acVar.cJ(jSONObject.optInt("app_size", 0));
        acVar.CJ(jSONObject.optString("app_category"));
        return acVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.zc WAv(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.zc zcVar = new com.bytedance.sdk.openadsdk.core.model.zc();
        zcVar.Qhi(jSONObject.optString("deeplink_url"));
        zcVar.cJ(jSONObject.optString("fallback_url"));
        zcVar.Qhi(jSONObject.optInt("fallback_type"));
        return zcVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.fl ac(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("splash_clickarea", 2);
        int optInt2 = jSONObject.optInt("splash_layout_id", 1);
        long optLong = jSONObject.optLong("load_wait_time", 0L);
        long j10 = optLong >= 0 ? optLong : 0L;
        com.bytedance.sdk.openadsdk.core.model.fl flVar = new com.bytedance.sdk.openadsdk.core.model.fl();
        flVar.Qhi(optInt);
        flVar.cJ(optInt2);
        flVar.Qhi(j10);
        return flVar;
    }

    private static com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi cJ(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi qhi = new com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi();
        qhi.Qhi(jSONObject.optString(FacebookMediationAdapter.KEY_ID));
        qhi.cJ(jSONObject.optString("md5"));
        qhi.ac(jSONObject.optString(InMobiNetworkValues.URL));
        return qhi;
    }

    private static FilterWord fl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString(FacebookMediationAdapter.KEY_ID));
            filterWord.setName(jSONObject.optString(NamingTable.TAG));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray("options");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    FilterWord fl2 = fl(optJSONArray.optJSONObject(i10));
                    if (fl2 != null && fl2.isValid()) {
                        filterWord.addOption(fl2);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.ABk hm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.ABk aBk = new com.bytedance.sdk.openadsdk.core.model.ABk();
        aBk.Qhi(jSONObject.optInt("if_send_click", 0));
        return aBk;
    }

    public static Pair<com.bytedance.sdk.openadsdk.core.model.Qhi, ArrayList<Integer>> Qhi(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qMt qmt, com.bytedance.sdk.openadsdk.core.model.cJ cJVar) {
        com.bytedance.sdk.openadsdk.core.model.cJ cJVar2;
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.Qhi qhi = new com.bytedance.sdk.openadsdk.core.model.Qhi();
            qhi.Qhi(jSONObject.optString("request_id"));
            qhi.Qhi(jSONObject.optInt("ret"));
            int i10 = 0;
            qhi.cJ(jSONObject.optInt("multi_ad_style", 0));
            qhi.cJ(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            String optString = jSONObject.optString("gdid_encrypted");
            if (jSONObject.has("choose_ui_data")) {
                qhi.Qhi(jSONObject.optJSONObject("choose_ui_data"));
                qhi.Qhi(true);
            }
            String optString2 = jSONObject.optString("auction_price");
            if (qhi.cJ() != 0) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                ArrayList arrayList2 = qhi.Gm() ? new ArrayList() : null;
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    com.bytedance.sdk.openadsdk.core.model.tP Qhi2 = Qhi(optJSONArray.optJSONObject(i11), adSlot, qmt);
                    if (Qhi2 != null && qhi.Gm()) {
                        if (Qhi2.hpZ() == 30) {
                            Qhi2.hm(true);
                        } else {
                            qhi.cJ(0);
                            arrayList2 = null;
                        }
                    }
                    int Qhi3 = Qhi(Qhi2);
                    if (Qhi3 != 200) {
                        if (Qhi2 != null) {
                            com.bytedance.sdk.openadsdk.cJ.ac.cJ(Qhi2, js.ac(Qhi2.eN()), Qhi3);
                        } else {
                            com.bytedance.sdk.openadsdk.cJ.ac.cJ((com.bytedance.sdk.openadsdk.core.model.tP) null, "", Qhi3);
                        }
                        arrayList.add(Integer.valueOf(Qhi3));
                        if (arrayList2 != null && Qhi2 != null) {
                            arrayList2.add(new Qhi(Qhi2.DS(), Qhi3));
                        }
                    } else {
                        Qhi2.hm(optString2);
                        if (!TextUtils.isEmpty(optString)) {
                            Qhi2.pM(optString);
                        }
                        qhi.Qhi(Qhi2);
                    }
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Qhi((ArrayList<Qhi>) arrayList2);
                }
                cJVar2 = cJVar;
                i10 = length;
            } else {
                cJVar2 = cJVar;
            }
            Qhi(i10, qhi, arrayList, cJVar2);
            return new Pair<>(qhi, arrayList);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.AdInfoFactory", th2.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r3 != 8) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int cJ(com.bytedance.sdk.openadsdk.core.model.tP r8) {
        /*
            int r0 = r8.eN()
            java.lang.String r0 = com.bytedance.sdk.openadsdk.utils.js.ac(r0)
            int r1 = r8.nR()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != 0) goto L1c
            com.bytedance.sdk.openadsdk.core.model.zc r1 = r8.ReL()
            int r1 = Qhi(r1)
            com.bytedance.sdk.openadsdk.cJ.ac.ac(r8, r0, r1)
            goto L1d
        L1c:
            r1 = r2
        L1d:
            int r3 = r8.ip()
            r4 = 2
            r5 = 406(0x196, float:5.69E-43)
            r6 = 407(0x197, float:5.7E-43)
            r7 = 417(0x1a1, float:5.84E-43)
            if (r3 == r4) goto L79
            r4 = 3
            if (r3 == r4) goto L79
            r4 = 4
            if (r3 == r4) goto L35
            r4 = 8
            if (r3 == r4) goto L79
            goto L8d
        L35:
            com.bytedance.sdk.openadsdk.core.model.ac r3 = r8.pv()
            if (r3 != 0) goto L40
            com.bytedance.sdk.openadsdk.cJ.ac.ac(r8, r0, r6)
            r1 = r6
            goto L8d
        L40:
            java.lang.String r4 = r3.ac()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L59
            java.lang.String r4 = r3.Qhi()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L59
            com.bytedance.sdk.openadsdk.cJ.ac.ac(r8, r0, r7)
            r1 = r7
            goto L8d
        L59:
            java.lang.String r4 = r3.ac()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L69
            r1 = 416(0x1a0, float:5.83E-43)
            com.bytedance.sdk.openadsdk.cJ.ac.ac(r8, r0, r1)
            goto L8d
        L69:
            java.lang.String r3 = r3.Qhi()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L8d
            r1 = 408(0x198, float:5.72E-43)
            com.bytedance.sdk.openadsdk.cJ.ac.ac(r8, r0, r1)
            goto L8d
        L79:
            boolean r3 = CJ(r8)
            if (r3 == 0) goto L8d
            java.lang.String r3 = r8.YB()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L8d
            com.bytedance.sdk.openadsdk.cJ.ac.ac(r8, r0, r5)
            r1 = r5
        L8d:
            if (r1 == r7) goto L9a
            if (r1 == r6) goto L9a
            if (r1 != r5) goto L94
            goto L9a
        L94:
            if (r1 == r2) goto L99
            com.bytedance.sdk.openadsdk.cJ.ac.cJ(r8, r0, r1)
        L99:
            return r2
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cJ.cJ(com.bytedance.sdk.openadsdk.core.model.tP):int");
    }

    private static int ac(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        int i10;
        String ac2 = js.ac(tPVar.eN());
        if (tPVar.nR() == 0) {
            i10 = Qhi(tPVar.ReL());
            if (i10 != 200) {
                com.bytedance.sdk.openadsdk.cJ.ac.ac(tPVar, ac2, i10);
                return i10;
            }
        } else {
            i10 = 200;
        }
        int ip2 = tPVar.ip();
        if (ip2 != 2 && ip2 != 3) {
            if (ip2 == 4) {
                int Qhi2 = Qhi(tPVar.pv());
                if (Qhi2 != 200) {
                    com.bytedance.sdk.openadsdk.cJ.ac.ac(tPVar, ac2, Qhi2);
                    return Qhi2;
                }
                return Qhi2;
            } else if (ip2 != 8) {
                return i10;
            }
        }
        if (CJ(tPVar) && TextUtils.isEmpty(tPVar.YB())) {
            com.bytedance.sdk.openadsdk.cJ.ac.ac(tPVar, ac2, (int) TTAdConstant.LANDING_PAGE_TYPE_CODE);
            return TTAdConstant.LANDING_PAGE_TYPE_CODE;
        }
        return i10;
    }

    private static boolean CJ(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        return (tPVar.IC() || tPVar.gT()) ? false : true;
    }

    private static void Qhi(int i10, final com.bytedance.sdk.openadsdk.core.model.Qhi qhi, final ArrayList<Integer> arrayList, final com.bytedance.sdk.openadsdk.core.model.cJ cJVar) {
        if (qhi == null || i10 < 2 || !qhi.ROR()) {
            return;
        }
        final int size = i10 - (qhi.ac() != null ? qhi.ac().size() : 0);
        final boolean z10 = qhi.Sf() == null;
        if (size > 0 || z10) {
            com.bytedance.sdk.openadsdk.Gm.ac.Qhi();
            com.bytedance.sdk.openadsdk.Gm.ac.Qhi("choose_ad_parsing_error", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.core.cJ.1
                @Override // com.bytedance.sdk.openadsdk.Gm.cJ
                public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", com.bytedance.sdk.openadsdk.core.model.Qhi.this.Qhi());
                    jSONObject.put("material_error", size);
                    jSONObject.put("choose_ui_error", z10 ? 1 : 0);
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) arrayList).toString());
                    }
                    com.bytedance.sdk.openadsdk.core.model.cJ cJVar2 = cJVar;
                    if (cJVar2 != null) {
                        jSONObject.put("server_res_str", cJVar2.Qhi());
                    }
                    return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("choose_ad_parsing_error").cJ(jSONObject.toString());
                }
            });
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.tP Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return Qhi(jSONObject, (AdSlot) null, (com.bytedance.sdk.openadsdk.core.model.qMt) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0599, code lost:
        if (r13.optBoolean("is_html", false) != false) goto L134;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.bytedance.sdk.openadsdk.core.model.tP Qhi(org.json.JSONObject r13, com.bytedance.sdk.openadsdk.AdSlot r14, com.bytedance.sdk.openadsdk.core.model.qMt r15) {
        /*
            Method dump skipped, instructions count: 1708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cJ.Qhi(org.json.JSONObject, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.qMt):com.bytedance.sdk.openadsdk.core.model.tP");
    }

    private static void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static void Qhi(final com.bytedance.sdk.openadsdk.core.model.tP tPVar, final String str, final com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi, final long j10, final cJ.Qhi qhi2) {
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(new com.bytedance.sdk.component.Sf.hm("vast_parser") { // from class: com.bytedance.sdk.openadsdk.core.cJ.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi3 = qhi;
                    String str2 = "load_vast_fail";
                    if (qhi3 != null) {
                        if (!TextUtils.isEmpty(qhi3.hm()) && !TextUtils.isEmpty(qhi.Tgh()) && qhi.Sf() > 0.0d) {
                            jSONObject.put("duration", System.currentTimeMillis() - j10);
                            cJ.Qhi qhi4 = qhi2;
                            if (qhi4 != null) {
                                jSONObject.put("wrapper_count", qhi4.cJ);
                                jSONObject.put("impression_links_null", qhi2.f8952ac);
                            }
                            str2 = "load_vast_success";
                        }
                        jSONObject.put("reason_code", -3);
                        jSONObject.put("error_code", -3);
                    } else {
                        jSONObject.put("reason_code", -2);
                        cJ.Qhi qhi5 = qhi2;
                        if (qhi5 != null) {
                            jSONObject.put("error_code", qhi5.Qhi);
                        }
                    }
                    com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi6 = qhi;
                    if (qhi6 != null && qhi6.cJ() != null && TextUtils.isEmpty(qhi.cJ().Tgh())) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("error_code", 1000);
                            jSONObject2.put(InMobiNetworkValues.DESCRIPTION, "1000:Image url is null");
                        } catch (Throwable unused) {
                        }
                        com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, str, "load_vast_icon_fail", jSONObject2);
                        qhi.Qhi((com.bytedance.sdk.openadsdk.core.ROR.cJ) null);
                    }
                } catch (Exception unused2) {
                }
            }
        });
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.ROR.Qhi, cJ.Qhi> Qhi(String str, int i10, int i11) {
        int i12;
        int i13;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i11 == 1 || i11 == 5) {
            i12 = 0;
            i13 = 0;
        } else {
            i12 = zn.ac(HzH.Qhi());
            i13 = zn.CJ(HzH.Qhi());
            if (i10 == 2) {
                i13 = i12;
                i12 = i13;
            }
        }
        com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.Tgh tgh = new com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.Tgh(HzH.Qhi(), i12, i13);
        return new Pair<>(tgh.Qhi(str, new ArrayList()), tgh.Tgh);
    }

    private static void Qhi(com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi, com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        qhi.Qhi(tPVar);
        if (!Qhi(tPVar.ip())) {
            tPVar.tP(2);
        }
        tPVar.CJ(1);
        tPVar.Qhi(qhi);
        if (!TextUtils.isEmpty(qhi.CJ())) {
            tPVar.pA(qhi.CJ());
        }
        if (!TextUtils.isEmpty(qhi.fl())) {
            tPVar.hpZ(qhi.fl());
        }
        tPVar.ABk(qhi.Tgh());
        tPVar.Qhi((com.bytedance.sdk.openadsdk.core.model.ac) null);
        com.bykv.vk.openvk.component.video.api.ac.cJ FQ = tPVar.FQ();
        if (FQ == null) {
            FQ = new com.bykv.vk.openvk.component.video.api.ac.cJ();
        }
        FQ.ac(qhi.ROR());
        FQ.Qhi(qhi.Sf());
        FQ.Tgh((String) null);
        FQ.cJ((String) null);
        FQ.CJ((String) null);
        tPVar.Qhi(FQ);
        if (qhi.cJ() != null && !TextUtils.isEmpty(qhi.cJ().fl())) {
            com.bytedance.sdk.openadsdk.core.model.hpZ hpz = new com.bytedance.sdk.openadsdk.core.model.hpZ();
            hpz.Qhi(qhi.cJ().fl());
            hpz.Qhi(qhi.cJ().cJ());
            hpz.cJ(qhi.cJ().ac());
            tPVar.Qhi(hpz);
        } else if (tPVar.dIT() == null) {
            com.bytedance.sdk.openadsdk.core.model.hpZ hpz2 = new com.bytedance.sdk.openadsdk.core.model.hpZ();
            hpz2.Qhi("https://sf16-fe-tos-sg.i18n-pglstatp.com/obj/ad-pattern-sg/static/images/2023620white.jpeg");
            hpz2.Qhi(98);
            hpz2.cJ(98);
            tPVar.Qhi(hpz2);
        }
    }

    private static com.bykv.vk.openvk.component.video.api.ac.cJ Qhi(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tP tPVar, boolean z10) {
        int optInt;
        if (jSONObject == null) {
            return null;
        }
        com.bykv.vk.openvk.component.video.api.ac.cJ cJVar = new com.bykv.vk.openvk.component.video.api.ac.cJ();
        cJVar.cJ(jSONObject.optInt("cover_height"));
        cJVar.ac(jSONObject.optInt("cover_width"));
        cJVar.Qhi(jSONObject.optString("resolution"));
        cJVar.Qhi(jSONObject.optLong("size"));
        double optDouble = jSONObject.optDouble("video_duration", 0.0d);
        cJVar.Qhi(optDouble);
        int i10 = 1;
        int optInt2 = jSONObject.optInt("replay_time", 1);
        if (optDouble <= 15.0d && tPVar.EBS() != 1 && com.bytedance.sdk.openadsdk.core.model.tP.fl(tPVar)) {
            i10 = optInt2;
        }
        cJVar.WAv(i10);
        cJVar.cJ(jSONObject.optString("cover_url"));
        cJVar.ac(jSONObject.optString("video_url"));
        cJVar.CJ(jSONObject.optString("endcard"));
        cJVar.fl(jSONObject.optString("playable_download_url"));
        cJVar.Tgh(jSONObject.optString("file_hash"));
        cJVar.Sf(jSONObject.optInt("if_playable_loading_show", 0));
        cJVar.hm(jSONObject.optInt("remove_loading_page_type", 0));
        cJVar.Qhi(jSONObject.optInt("fallback_endcard_judge", 0));
        cJVar.fl(jSONObject.optInt("video_preload_size", 307200));
        cJVar.Tgh(jSONObject.optInt("reward_video_cached_type", 0));
        cJVar.ROR(jSONObject.optInt("execute_cached_type", 0));
        if (z10) {
            optInt = jSONObject.optInt("endcard_render", 0);
        } else {
            optInt = jSONObject.optInt("endcard_render", -1);
        }
        cJVar.CJ(optInt);
        return cJVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
        if (r0 != 50) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int Qhi(com.bytedance.sdk.openadsdk.core.model.tP r5) {
        /*
            r0 = 401(0x191, float:5.62E-43)
            r1 = 0
            if (r5 != 0) goto Lb
            java.lang.String r5 = ""
            com.bytedance.sdk.openadsdk.cJ.ac.ac(r1, r5, r0)
            return r0
        Lb:
            int r2 = r5.eN()
            java.lang.String r2 = com.bytedance.sdk.openadsdk.utils.js.ac(r2)
            java.lang.String r3 = r5.HLI()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Lbd
            java.lang.String r3 = r5.HLI()
            int r3 = r3.length()
            r4 = 1
            if (r3 > r4) goto L2a
            goto Lbd
        L2a:
            boolean r3 = r5.gT()
            if (r3 == 0) goto L64
            int r3 = r5.eN()
            if (r3 >= 0) goto L47
            com.bytedance.sdk.openadsdk.AdSlot r3 = r5.lB()
            if (r3 == 0) goto L44
            com.bytedance.sdk.openadsdk.AdSlot r3 = r5.lB()
            r3.getDurationSlotType()
            goto L47
        L44:
            r5.sqa()
        L47:
            boolean r3 = r5.Ewb()
            if (r3 == 0) goto L4f
            java.lang.String r2 = "fullscreen_interstitial_ad"
        L4f:
            java.lang.String r3 = r5.bM()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L5f
            java.lang.String r3 = "load_html_fail"
            com.bytedance.sdk.openadsdk.cJ.ac.cJ(r5, r2, r3, r1)
            return r0
        L5f:
            java.lang.String r0 = "load_html_success"
            com.bytedance.sdk.openadsdk.cJ.ac.cJ(r5, r2, r0, r1)
        L64:
            int r0 = r5.nR()
            if (r0 != 0) goto La9
            int r0 = r5.gga()
            r1 = 2
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L9b
            r1 = 3
            if (r0 == r1) goto L9b
            r1 = 4
            if (r0 == r1) goto L9b
            r1 = 5
            if (r0 == r1) goto L89
            r1 = 15
            if (r0 == r1) goto L89
            r1 = 16
            if (r0 == r1) goto L9b
            r1 = 50
            if (r0 == r1) goto L89
            goto La9
        L89:
            com.bykv.vk.openvk.component.video.api.ac.cJ r0 = r5.FQ()
            boolean r1 = r5.IC()
            int r0 = Qhi(r0, r1)
            if (r0 == r3) goto La9
            com.bytedance.sdk.openadsdk.cJ.ac.ac(r5, r2, r0)
            return r0
        L9b:
            java.util.List r0 = r5.cjC()
            int r0 = Qhi(r0)
            if (r0 == r3) goto La9
            com.bytedance.sdk.openadsdk.cJ.ac.ac(r5, r2, r0)
            return r0
        La9:
            com.bytedance.sdk.openadsdk.core.settings.ROR r0 = com.bytedance.sdk.openadsdk.core.settings.HzH.YD()
            boolean r0 = r0.pF()
            if (r0 == 0) goto Lb8
            int r5 = ac(r5)
            goto Lbc
        Lb8:
            int r5 = cJ(r5)
        Lbc:
            return r5
        Lbd:
            r0 = 402(0x192, float:5.63E-43)
            com.bytedance.sdk.openadsdk.cJ.ac.ac(r5, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cJ.Qhi(com.bytedance.sdk.openadsdk.core.model.tP):int");
    }

    private static int Qhi(com.bytedance.sdk.openadsdk.core.model.zc zcVar) {
        if (zcVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(zcVar.Qhi())) {
            return TTAdConstant.DEEPLINK_UNAVAILABLE_CODE;
        }
        if (TextUtils.isEmpty(zcVar.cJ())) {
            return TTAdConstant.DEEPLINK_FALLBACK_CODE;
        }
        if (zcVar.ac() == 1 || zcVar.ac() == 2) {
            return 200;
        }
        return TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE;
    }

    private static int Qhi(com.bykv.vk.openvk.component.video.api.ac.cJ cJVar, boolean z10) {
        if (cJVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(cJVar.Gm())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z10 || !TextUtils.isEmpty(cJVar.WAv())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int Qhi(com.bytedance.sdk.openadsdk.core.model.ac acVar) {
        if (acVar == null) {
            return TTAdConstant.DOWNLOAD_APP_INFO_CODE;
        }
        if (TextUtils.isEmpty(acVar.Qhi())) {
            return TTAdConstant.DOWNLOAD_URL_CODE;
        }
        if (TextUtils.isEmpty(acVar.ac())) {
            return TTAdConstant.PACKAGE_NAME_CODE;
        }
        return 200;
    }

    private static int Qhi(List<com.bytedance.sdk.openadsdk.core.model.hpZ> list) {
        if (list == null) {
            return TTAdConstant.IMAGE_LIST_CODE;
        }
        if (list.size() <= 0) {
            return TTAdConstant.IMAGE_LIST_SIZE_CODE;
        }
        for (com.bytedance.sdk.openadsdk.core.model.hpZ hpz : list) {
            if (hpz == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(hpz.Qhi())) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }

    private static void Qhi(final ArrayList<Qhi> arrayList) {
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.core.cJ.3
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Qhi qhi = (Qhi) it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cid", qhi.Qhi);
                    jSONObject2.put("error_msg", qhi.cJ);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("multiple_ads_parsing_error").cJ(jSONObject.toString());
            }
        });
    }
}
