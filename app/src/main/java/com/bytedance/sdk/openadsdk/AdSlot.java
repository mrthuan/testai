package com.bytedance.sdk.openadsdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.Tgh.cJ;
import com.bytedance.sdk.component.utils.ABk;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private boolean ABk;
    private float CJ;
    private Bundle CQU;
    private JSONArray Dww;
    private int EBS;
    private Map<String, Object> Eh;
    private String Gm;
    private String HzH;
    private int MQ;
    private String Qhi;
    private boolean ROR;
    private String Sf;
    private int Tgh;
    private String WAv;

    /* renamed from: ac  reason: collision with root package name */
    private int f8452ac;
    private int bxS;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private float f8453fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f8454hm;
    private String hpZ;
    private boolean iMK;
    private String kYc;
    private String pA;
    private String pM;
    private int qMt;
    private String tP;

    /* renamed from: zc  reason: collision with root package name */
    private int f8455zc;

    public static int getPosition(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 != 3 && i10 != 4 && i10 != 7 && i10 != 8) {
            return 3;
        }
        return 5;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int optInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double optDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double optDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(optInt, optInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(optDouble).floatValue(), Double.valueOf(optDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
        } catch (Exception unused) {
        }
        AdSlot build = builder.build();
        build.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return build;
    }

    public int getAdCount() {
        return this.Tgh;
    }

    public String getAdId() {
        return this.hpZ;
    }

    public String getBidAdm() {
        return this.pA;
    }

    public JSONArray getBiddingTokens() {
        return this.Dww;
    }

    public String getCodeId() {
        return this.Qhi;
    }

    public String getCreativeId() {
        return this.HzH;
    }

    public int getDurationSlotType() {
        return this.bxS;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f8453fl;
    }

    public float getExpressViewAcceptedWidth() {
        return this.CJ;
    }

    public String getExt() {
        return this.kYc;
    }

    public int getImgAcceptedHeight() {
        return this.f8452ac;
    }

    public int getImgAcceptedWidth() {
        return this.cJ;
    }

    public int getIsRotateBanner() {
        return this.MQ;
    }

    public String getLinkId() {
        return this.pM;
    }

    public String getMediaExtra() {
        return this.WAv;
    }

    public int getNativeAdType() {
        return this.f8455zc;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.CQU;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.Eh;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.f8454hm;
    }

    @Deprecated
    public String getRewardName() {
        return this.Sf;
    }

    public int getRotateOrder() {
        return this.EBS;
    }

    public int getRotateTime() {
        return this.qMt;
    }

    public String getUserData() {
        return this.tP;
    }

    public String getUserID() {
        return this.Gm;
    }

    public boolean isAutoPlay() {
        return this.ABk;
    }

    public boolean isExpressAd() {
        return this.iMK;
    }

    public boolean isSupportDeepLink() {
        return this.ROR;
    }

    public void setAdCount(int i10) {
        this.Tgh = i10;
    }

    public void setBiddingTokens(JSONArray jSONArray) {
        this.Dww = jSONArray;
    }

    public void setDurationSlotType(int i10) {
        this.bxS = i10;
    }

    public void setIsRotateBanner(int i10) {
        this.MQ = i10;
    }

    public void setNativeAdType(int i10) {
        this.f8455zc = i10;
    }

    public void setRotateOrder(int i10) {
        this.EBS = i10;
    }

    public void setRotateTime(int i10) {
        this.qMt = i10;
    }

    public void setUserData(String str) {
        this.tP = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.Qhi);
            jSONObject.put("mAdCount", this.Tgh);
            jSONObject.put("mIsAutoPlay", this.ABk);
            jSONObject.put("mImgAcceptedWidth", this.cJ);
            jSONObject.put("mImgAcceptedHeight", this.f8452ac);
            jSONObject.put("mExpressViewAcceptedWidth", this.CJ);
            jSONObject.put("mExpressViewAcceptedHeight", this.f8453fl);
            jSONObject.put("mSupportDeepLink", this.ROR);
            jSONObject.put("mRewardName", this.Sf);
            jSONObject.put("mRewardAmount", this.f8454hm);
            jSONObject.put("mMediaExtra", this.WAv);
            jSONObject.put("mUserID", this.Gm);
            jSONObject.put("mNativeAdType", this.f8455zc);
            jSONObject.put("mIsExpressAd", this.iMK);
            jSONObject.put("mAdId", this.hpZ);
            jSONObject.put("mCreativeId", this.HzH);
            jSONObject.put("mExt", this.kYc);
            jSONObject.put("mBidAdm", this.pA);
            jSONObject.put("mUserData", this.tP);
            jSONObject.put("mDurationSlotType", this.bxS);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.ABk = true;
        this.iMK = false;
        this.MQ = 0;
        this.qMt = 0;
        this.EBS = 0;
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private boolean ABk;
        private String EBS;
        private float Gm;
        private String HzH;
        private String Qhi;
        private String Sf;
        private int WAv;
        private int bxS;
        private String hpZ;
        private String iMK;
        private String kYc;
        private String pA;
        private Bundle qMt;

        /* renamed from: zc  reason: collision with root package name */
        private float f8459zc;
        private int cJ = 640;

        /* renamed from: ac  reason: collision with root package name */
        private int f8456ac = 320;
        private final boolean CJ = true;

        /* renamed from: fl  reason: collision with root package name */
        private int f8457fl = 1;
        private final String Tgh = "";
        private final int ROR = 0;

        /* renamed from: hm  reason: collision with root package name */
        private String f8458hm = "defaultUser";
        private boolean tP = true;
        private Map<String, Object> MQ = null;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.Qhi = this.Qhi;
            adSlot.Tgh = this.f8457fl;
            adSlot.ROR = true;
            adSlot.cJ = this.cJ;
            adSlot.f8452ac = this.f8456ac;
            float f10 = this.Gm;
            if (f10 <= 0.0f) {
                adSlot.CJ = this.cJ;
                adSlot.f8453fl = this.f8456ac;
            } else {
                adSlot.CJ = f10;
                adSlot.f8453fl = this.f8459zc;
            }
            adSlot.Sf = "";
            adSlot.f8454hm = 0;
            adSlot.WAv = this.Sf;
            adSlot.Gm = this.f8458hm;
            adSlot.f8455zc = this.WAv;
            adSlot.ABk = this.tP;
            adSlot.iMK = this.ABk;
            adSlot.pA = this.iMK;
            adSlot.hpZ = this.pA;
            adSlot.HzH = this.hpZ;
            adSlot.kYc = this.HzH;
            adSlot.tP = this.kYc;
            adSlot.Eh = this.MQ;
            adSlot.pM = this.EBS;
            adSlot.bxS = this.bxS;
            return adSlot;
        }

        public Builder isExpressAd(boolean z10) {
            this.ABk = z10;
            return this;
        }

        public Builder setAdCount(int i10) {
            if (i10 <= 0) {
                i10 = 1;
            }
            if (i10 > 20) {
                i10 = 20;
            }
            this.f8457fl = i10;
            return this;
        }

        public Builder setAdId(String str) {
            this.pA = str;
            return this;
        }

        public Builder setCodeId(String str) {
            this.Qhi = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.hpZ = str;
            return this;
        }

        public Builder setDurationSlotType(int i10) {
            this.bxS = i10;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f10, float f11) {
            this.Gm = f10;
            this.f8459zc = f11;
            return this;
        }

        public Builder setExt(String str) {
            this.HzH = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i10, int i11) {
            this.cJ = i10;
            this.f8456ac = i11;
            return this;
        }

        public Builder setIsAutoPlay(boolean z10) {
            this.tP = z10;
            return this;
        }

        public Builder setLinkId(String str) {
            this.EBS = str;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.Sf = str;
            return this;
        }

        public Builder setNativeAdType(int i10) {
            this.WAv = i10;
            return this;
        }

        public Builder setNetworkExtrasBundle(Bundle bundle) {
            this.qMt = bundle;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.MQ = map;
            return this;
        }

        public Builder setUserData(String str) {
            this.kYc = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.f8458hm = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (ABk.CJ()) {
                cJ.Qhi(str);
            }
            this.iMK = str;
            return this;
        }

        @Deprecated
        public Builder setRewardAmount(int i10) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z10) {
            return this;
        }
    }
}
