package com.bytedance.sdk.openadsdk.core.ROR.cJ;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.ROR.cJ.ac;
import lib.zj.office.fc.hslf.record.SlideAtom;
import org.json.JSONObject;

/* compiled from: VastAbsoluteProgressTracker.java */
/* loaded from: classes.dex */
public class Qhi extends ac implements Comparable<Qhi> {
    public long Qhi;

    /* compiled from: VastAbsoluteProgressTracker.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ROR.cJ.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0114Qhi {
        private final String Qhi;
        private final long cJ;

        /* renamed from: ac  reason: collision with root package name */
        private ac.EnumC0115ac f8969ac = ac.EnumC0115ac.TRACKING_URL;
        private boolean CJ = false;

        public C0114Qhi(String str, long j10) {
            this.Qhi = str;
            this.cJ = j10;
        }

        public Qhi Qhi() {
            return new Qhi(this.cJ, this.Qhi, this.f8969ac, Boolean.valueOf(this.CJ));
        }
    }

    public Qhi(long j10, String str, ac.EnumC0115ac enumC0115ac, Boolean bool) {
        super(str, enumC0115ac, bool);
        this.Qhi = j10;
    }

    public static int Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return SlideAtom.USES_MASTER_SLIDE_ID;
        }
        String[] split = str.split(":");
        if (split.length == 3) {
            try {
                return (int) ((Float.parseFloat(split[2]) * 1000.0f) + (Integer.parseInt(split[1]) * 60 * 1000) + (Integer.parseInt(split[0]) * 60 * 60 * 1000));
            } catch (Throwable unused) {
            }
        }
        return SlideAtom.USES_MASTER_SLIDE_ID;
    }

    public boolean Qhi(long j10) {
        return this.Qhi <= j10 && !fl();
    }

    @Override // java.lang.Comparable
    /* renamed from: Qhi */
    public int compareTo(Qhi qhi) {
        if (qhi != null) {
            long j10 = this.Qhi;
            long j11 = qhi.Qhi;
            if (j10 > j11) {
                return 1;
            }
            return j10 < j11 ? -1 : 0;
        }
        return 1;
    }

    public JSONObject Qhi() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", ac());
        jSONObject.put("trackingMilliseconds", this.Qhi);
        return jSONObject;
    }
}
