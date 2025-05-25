package com.bykv.vk.openvk.component.video.api.ac;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: VideoInfo.java */
/* loaded from: classes.dex */
public class cJ {
    private int ABk;
    private double CJ;
    private double Gm;
    private int Qhi;
    private String ROR;
    private String Sf;
    private String Tgh;
    private String WAv;

    /* renamed from: ac  reason: collision with root package name */
    private long f7180ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private String f7181fl;

    /* renamed from: hm  reason: collision with root package name */
    private String f7182hm;

    /* renamed from: zc  reason: collision with root package name */
    private int f7183zc;
    private float iMK = -1.0f;
    private int pA = 0;
    private int hpZ = 0;
    private int HzH = 0;
    private int kYc = 0;
    private int tP = 307200;
    private int MQ = 1;

    public String ABk() {
        return this.f7182hm;
    }

    public int CJ() {
        return this.ABk;
    }

    public int EBS() {
        return this.MQ;
    }

    public String Gm() {
        return this.ROR;
    }

    public int HzH() {
        return this.kYc;
    }

    public int MQ() {
        return this.hpZ;
    }

    public int Qhi() {
        return this.f7183zc;
    }

    public double ROR() {
        return this.Gm;
    }

    public float Sf() {
        return this.iMK;
    }

    public double Tgh() {
        return this.CJ;
    }

    public String WAv() {
        return this.Tgh;
    }

    public int ac() {
        return this.cJ;
    }

    public int cJ() {
        return this.Qhi;
    }

    public long fl() {
        return this.f7180ac;
    }

    public String hm() {
        return this.f7181fl;
    }

    public int hpZ() {
        return this.HzH;
    }

    public String iMK() {
        if (TextUtils.isEmpty(this.WAv)) {
            this.WAv = com.bykv.vk.openvk.component.video.api.Tgh.cJ.Qhi(this.ROR);
        }
        return this.WAv;
    }

    public JSONObject kYc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", cJ());
            jSONObject.put("cover_url", WAv());
            jSONObject.put("cover_width", ac());
            jSONObject.put("endcard", zc());
            jSONObject.put("file_hash", iMK());
            jSONObject.put("resolution", hm());
            jSONObject.put("size", fl());
            jSONObject.put("video_duration", Tgh());
            jSONObject.put("video_url", Gm());
            jSONObject.put("playable_download_url", ABk());
            jSONObject.put("if_playable_loading_show", tP());
            jSONObject.put("remove_loading_page_type", MQ());
            jSONObject.put("fallback_endcard_judge", Qhi());
            jSONObject.put("video_preload_size", pA());
            jSONObject.put("reward_video_cached_type", hpZ());
            jSONObject.put("execute_cached_type", HzH());
            jSONObject.put("endcard_render", CJ());
            jSONObject.put("replay_time", EBS());
            jSONObject.put("play_speed_ratio", Sf());
            if (ROR() > 0.0d) {
                jSONObject.put("start", ROR());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int pA() {
        if (this.tP < 0) {
            this.tP = 307200;
        }
        long j10 = this.f7180ac;
        if (this.tP > j10) {
            this.tP = (int) j10;
        }
        return this.tP;
    }

    public boolean qMt() {
        if (this.HzH == 0) {
            return true;
        }
        return false;
    }

    public int tP() {
        return this.pA;
    }

    public String zc() {
        return this.Sf;
    }

    public void CJ(int i10) {
        this.ABk = i10;
    }

    public void Qhi(int i10) {
        this.f7183zc = i10;
    }

    public void ROR(int i10) {
        this.kYc = i10;
    }

    public void Sf(int i10) {
        this.pA = i10;
    }

    public void Tgh(String str) {
        this.WAv = str;
    }

    public void WAv(int i10) {
        this.MQ = Math.min(4, Math.max(1, i10));
    }

    public void ac(int i10) {
        this.cJ = i10;
    }

    public void cJ(int i10) {
        this.Qhi = i10;
    }

    public void fl(String str) {
        this.f7182hm = str;
    }

    public void hm(int i10) {
        this.hpZ = i10;
    }

    public void CJ(String str) {
        this.Sf = str;
    }

    public void Qhi(long j10) {
        this.f7180ac = j10;
    }

    public void Tgh(int i10) {
        this.HzH = i10;
    }

    public void ac(String str) {
        this.ROR = str;
    }

    public void cJ(String str) {
        this.Tgh = str;
    }

    public void fl(int i10) {
        this.tP = i10;
    }

    public void Qhi(double d10) {
        this.CJ = d10;
    }

    public void Qhi(String str) {
        this.f7181fl = str;
    }
}
