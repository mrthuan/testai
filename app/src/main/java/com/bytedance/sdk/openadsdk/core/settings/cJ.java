package com.bytedance.sdk.openadsdk.core.settings;

import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdSlotSetter.java */
/* loaded from: classes.dex */
public class cJ {
    public int ABk;
    public int CJ;
    public int CQU;
    public int Dww;
    public int EBS;
    public int Eh;
    public int FQ;
    public int Gm;
    public int HzH;
    public int Jma;
    public List<hm> MND;
    public int MQ;
    public boolean NFd;
    public long PAe;
    public String Qhi;
    public int ROR;
    public int Sf;
    public int Tgh;
    public int WAv;
    public int aP;

    /* renamed from: ac  reason: collision with root package name */
    public int f9165ac;
    public List<String> bxS;
    public int cJ;
    public JSONObject dIT;
    public int es;

    /* renamed from: fl  reason: collision with root package name */
    public int f9166fl;

    /* renamed from: hm  reason: collision with root package name */
    public int f9167hm;
    public int hpZ;
    public int iMK;

    /* renamed from: ip  reason: collision with root package name */
    public String f9168ip;
    public List<hm> jPH;
    public boolean js;
    public int kYc;
    public boolean lB;
    public int lG;
    public int pA;
    public int pM;
    public boolean qMt;
    public boolean sDy;
    public int tP;
    public String xyz;
    public int yN;

    /* renamed from: zc  reason: collision with root package name */
    public int f9169zc;

    /* renamed from: zn  reason: collision with root package name */
    public int f9170zn;

    public cJ(JSONObject jSONObject) {
        this.cJ = 1;
        this.f9165ac = 1;
        this.CJ = 2;
        this.f9166fl = 1;
        this.Tgh = 100;
        this.ROR = 0;
        this.Sf = 2;
        this.f9167hm = 1;
        this.WAv = 3;
        this.Gm = 30;
        this.f9169zc = 30;
        this.ABk = 1;
        this.iMK = 1;
        this.pA = 2;
        this.hpZ = TTAdConstant.STYLE_SIZE_RADIO_3_2;
        this.HzH = 2;
        this.kYc = 3500;
        this.tP = 0;
        this.MQ = 5;
        this.qMt = false;
        this.EBS = 0;
        this.Dww = 2;
        this.CQU = -1;
        this.pM = 0;
        this.Eh = 0;
        this.aP = 5;
        this.NFd = true;
        this.sDy = false;
        this.lB = false;
        this.lG = 0;
        this.Jma = -1;
        this.js = false;
        this.f9170zn = 60000;
        this.es = 2;
        this.yN = 1000;
        this.FQ = 1;
        this.jPH = new ArrayList();
        this.MND = new ArrayList();
        new JSONObject();
        this.dIT = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.Qhi = jSONObject.optString("code_id");
        this.cJ = jSONObject.optInt("auto_play", 1);
        this.Jma = jSONObject.optInt("endcard_close_time", -1);
        this.f9165ac = jSONObject.optInt("voice_control", 1);
        this.CJ = jSONObject.optInt("rv_preload", 2);
        this.f9166fl = jSONObject.optInt("nv_preload", 1);
        this.Tgh = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.ROR = jSONObject.optInt("skip_time_displayed", 0);
        this.Sf = jSONObject.optInt("video_skip_result", 2);
        this.f9167hm = jSONObject.optInt("reg_creative_control", 1);
        this.WAv = jSONObject.optInt("play_bar_show_time", 3);
        int optInt = jSONObject.optInt("rv_skip_time", 30);
        this.Gm = optInt;
        if (optInt < 0) {
            this.Gm = 30;
        }
        this.ABk = jSONObject.optInt("voice_control", 2);
        this.iMK = jSONObject.optInt("if_show_win", 1);
        this.pA = jSONObject.optInt("sp_preload", 2);
        this.hpZ = jSONObject.optInt("stop_time", TTAdConstant.STYLE_SIZE_RADIO_3_2);
        this.HzH = jSONObject.optInt("native_playable_delay", 2);
        this.kYc = jSONObject.optInt("time_out_control", -1);
        this.CQU = jSONObject.optInt("playable_close_time", -1);
        this.tP = jSONObject.optInt("playable_reward_type", 0);
        this.EBS = jSONObject.optInt("reward_is_callback", 0);
        int optInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.MQ = optInt2;
        if (optInt2 < 0) {
            this.MQ = 5;
        }
        Qhi(jSONObject.optJSONArray("parent_tpl_ids"));
        this.Dww = jSONObject.optInt("slot_type", 2);
        this.qMt = jSONObject.optBoolean("close_on_click", false);
        this.pM = jSONObject.optInt("allow_system_back", 0);
        this.Eh = jSONObject.optInt("splash_skip_time", 0);
        this.aP = jSONObject.optInt("splash_image_count_down_time", 5);
        this.sDy = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.lB = jSONObject.optBoolean("splash_close_on_click", false);
        int optInt3 = jSONObject.optInt("splash_load_strategy", 0);
        this.lG = optInt3;
        if (optInt3 < 0 || optInt3 > 1) {
            this.lG = 0;
        }
        this.NFd = jSONObject.optBoolean("allow_mediaview_click", true);
        int optInt4 = jSONObject.optInt("total_time_out", 60000);
        this.f9170zn = optInt4;
        if (optInt4 <= 0 || optInt4 > 1800000) {
            this.f9170zn = 60000;
        }
        int optInt5 = jSONObject.optInt("req_parallel_num", 2);
        this.es = optInt5;
        if (optInt5 <= 0 || optInt5 > 4) {
            this.es = 2;
        }
        this.yN = jSONObject.optInt("bidding_token_tmax", 1000);
        int optInt6 = jSONObject.optInt("ad_load_type", 1);
        this.FQ = optInt6;
        if (optInt6 <= 0 || optInt6 > 2) {
            this.FQ = 1;
        }
        boolean optBoolean = jSONObject.optBoolean("is_mediation", false);
        this.js = optBoolean;
        if (optBoolean) {
            HzH.YD().ReL();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("mediation_config");
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                String optString = optJSONObject.optString("adn_name");
                String optString2 = optJSONObject.optString("adn_slot_id");
                int optInt7 = optJSONObject.optInt("ad_expired_time", Constants.ONE_HOUR);
                int optInt8 = optJSONObject.optInt("req_bidding_type", 2);
                String optString3 = optJSONObject.optString("rit_cpm");
                int optInt9 = optJSONObject.optInt("show_sort");
                int optInt10 = optJSONObject.optInt("layer_time_out", AdError.SERVER_ERROR_CODE);
                int i11 = (optInt10 <= 0 || optInt10 > 60000) ? 2000 : optInt10;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("server_params");
                if (optInt8 == 2) {
                    arrayList.add(new hm(optString, optString2, optInt7, optInt8, optString3, optInt9, i11, optJSONObject2 == null ? "" : optJSONObject2.toString()));
                } else if (optInt8 == 0) {
                    arrayList2.add(new hm(optString, optString2, optInt7, optInt8, optString3, optInt9, i11, optJSONObject2 == null ? "" : optJSONObject2.toString()));
                }
            }
            this.jPH = arrayList;
            this.MND = arrayList2;
            Collections.sort(arrayList);
            Collections.sort(this.MND);
        }
        if (!Qhi(this.f9165ac)) {
            this.f9165ac = 1;
        }
        if (!Qhi(this.ABk)) {
            this.ABk = 1;
        }
        this.PAe = jSONObject.optLong("waterfall_id");
        String optString4 = jSONObject.optString("waterfall_version");
        this.f9168ip = optString4;
        this.xyz = optString4;
        this.f9169zc = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean Qhi(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public void Qhi(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.bxS = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                this.bxS.add(jSONArray.get(i10).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public cJ(String str, int i10) {
        this.cJ = 1;
        this.f9165ac = 1;
        this.CJ = 2;
        this.f9166fl = 1;
        this.Tgh = 100;
        this.ROR = 0;
        this.Sf = 2;
        this.f9167hm = 1;
        this.WAv = 3;
        this.Gm = 30;
        this.f9169zc = 30;
        this.ABk = 1;
        this.iMK = 1;
        this.pA = 2;
        this.hpZ = TTAdConstant.STYLE_SIZE_RADIO_3_2;
        this.HzH = 2;
        this.kYc = 3500;
        this.tP = 0;
        this.MQ = 5;
        this.qMt = false;
        this.EBS = 0;
        this.Dww = 2;
        this.CQU = -1;
        this.pM = 0;
        this.Eh = 0;
        this.aP = 5;
        this.NFd = true;
        this.sDy = false;
        this.lB = false;
        this.lG = 0;
        this.Jma = -1;
        this.js = false;
        this.f9170zn = 60000;
        this.es = 2;
        this.yN = 1000;
        this.FQ = 1;
        this.jPH = new ArrayList();
        this.MND = new ArrayList();
        this.dIT = new JSONObject();
        this.Qhi = str;
        this.f9165ac = i10;
    }
}
