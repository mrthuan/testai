package com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi;

import android.text.TextUtils;
import com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdLogEvent.java */
/* loaded from: classes.dex */
public class cJ implements Tgh {
    private byte CJ;
    private String Gm;
    protected JSONObject Qhi;
    private long ROR;
    private String Sf;
    private long Tgh;
    private byte WAv;

    /* renamed from: ac  reason: collision with root package name */
    private byte f8051ac;
    private ac cJ;

    /* renamed from: fl  reason: collision with root package name */
    private long f8052fl;

    /* renamed from: hm  reason: collision with root package name */
    private String f8053hm;

    /* renamed from: zc  reason: collision with root package name */
    private int f8054zc;

    public cJ(String str, JSONObject jSONObject) {
        this.f8053hm = str;
        this.Qhi = jSONObject;
    }

    public static Tgh ac(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            int optInt2 = jSONObject.optInt("priority");
            cJ cJVar = new cJ();
            cJVar.Qhi((byte) optInt);
            cJVar.cJ((byte) optInt2);
            cJVar.Qhi(jSONObject.optJSONObject("event"));
            cJVar.Qhi(jSONObject.optString("localId"));
            cJVar.cJ(jSONObject.optString("genTime"));
            cJVar.Qhi(jSONObject.optInt("channel"));
            return cJVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public byte CJ() {
        return this.f8051ac;
    }

    public String Gm() {
        return this.Gm;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public ac Qhi() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public synchronized JSONObject ROR() {
        ac acVar;
        if (this.Qhi == null && (acVar = this.cJ) != null) {
            this.Qhi = acVar.Qhi(Gm());
        }
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public long Sf() {
        return this.f8052fl;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public String Tgh() {
        if (!TextUtils.isEmpty(this.f8053hm)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("localId", this.f8053hm);
                jSONObject.put("event", ROR());
                jSONObject.put("genTime", zc());
                jSONObject.put("priority", (int) this.CJ);
                jSONObject.put("type", (int) this.f8051ac);
                jSONObject.put("channel", this.f8054zc);
            } catch (Throwable unused) {
            }
            return jSONObject.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public int WAv() {
        return this.f8054zc;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public byte cJ() {
        return this.WAv;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public byte fl() {
        return this.CJ;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public long hm() {
        return this.Tgh;
    }

    public String zc() {
        return this.Sf;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public void Qhi(JSONObject jSONObject) {
        this.Qhi = jSONObject;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public void cJ(String str) {
        this.Sf = str;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public void Qhi(byte b10) {
        this.f8051ac = b10;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public void cJ(long j10) {
        this.Tgh = j10;
    }

    public cJ(String str, ac acVar) {
        this.f8053hm = str;
        this.cJ = acVar;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public void Qhi(String str) {
        this.f8053hm = str;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public void cJ(byte b10) {
        this.CJ = b10;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public void Qhi(long j10) {
        this.f8052fl = j10;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public void Qhi(int i10) {
        this.f8054zc = i10;
    }

    private cJ() {
    }

    public void ac(byte b10) {
        this.WAv = b10;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public String ac() {
        return this.f8053hm;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh
    public void ac(long j10) {
        this.ROR = j10;
    }
}
