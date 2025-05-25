package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.cJ.ac;
import com.google.android.gms.common.api.Api;

/* compiled from: UGTextWidget.java */
/* loaded from: classes.dex */
public class cJ extends com.bytedance.adsdk.ugeno.component.cJ<TextView> {
    private int Dq;
    private float HLI;
    private int Hf;
    private int NBs;
    private float Qe;
    private String Qhi;
    private int YB;
    private int cjC;
    private TextUtils.TruncateAt dI;
    private int dIT;
    private float dVA;
    private float oU;
    private int ots;
    private float pv;
    private float zjb;

    public cJ(Context context) {
        super(context);
        this.cjC = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.Hf = 2;
        this.dVA = -1.0f;
        this.zjb = -1.0f;
    }

    private int ROR(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1178781136) {
            if (hashCode != -1039745817) {
                if (hashCode == 3029637 && str.equals("bold")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (str.equals(Constants.NORMAL)) {
                    c = 2;
                }
                c = 65535;
            }
        } else {
            if (str.equals("italic")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return 1;
        }
        if (c != 1) {
            return 0;
        }
        return 2;
    }

    private int Sf(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 1;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 17;
            case 1:
                return 3;
            case 2:
                return 5;
            default:
                return 2;
        }
    }

    private TextUtils.TruncateAt Tgh(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.dI = TextUtils.TruncateAt.MIDDLE;
                break;
            case 1:
                this.dI = TextUtils.TruncateAt.END;
                break;
            case 2:
                this.dI = TextUtils.TruncateAt.START;
                break;
            default:
                this.dI = null;
                break;
        }
        return this.dI;
    }

    private int hm(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1026963764:
                if (str.equals("underline")) {
                    c = 0;
                    break;
                }
                break;
            case -972521773:
                if (str.equals("strikethrough")) {
                    c = 1;
                    break;
                }
                break;
            case 3387192:
                if (str.equals("none")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 8;
            case 1:
                return 16;
            case 2:
            default:
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    /* renamed from: Qhi */
    public TextView ac() {
        UGTextView uGTextView = new UGTextView(this.cJ);
        uGTextView.Qhi(this);
        return uGTextView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        super.cJ();
        if (TextUtils.equals("null", this.Qhi)) {
            this.Qhi = "";
        }
        fl(this.Qhi);
        ((TextView) this.f7876fl).setTextSize(1, this.Qe);
        ((TextView) this.f7876fl).setTextColor(this.dIT);
        ((TextView) this.f7876fl).setLines(this.Dq);
        ((TextView) this.f7876fl).setMaxLines(this.cjC);
        ((TextView) this.f7876fl).setGravity(this.Hf);
        ((TextView) this.f7876fl).setIncludeFontPadding(false);
        Qhi(this.NBs);
        Qhi(this.dI);
        ((TextView) this.f7876fl).setTypeface(Typeface.DEFAULT, this.YB);
        if (Build.VERSION.SDK_INT >= 28) {
            float f10 = this.dVA;
            if (f10 >= 0.0f) {
                ((TextView) this.f7876fl).setLineSpacing(0.0f, f10);
            }
        }
        ((TextView) this.f7876fl).setShadowLayer(this.pv, this.HLI, this.oU, this.ots);
    }

    public void fl(String str) {
        this.Qhi = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.Qhi = "";
        }
        ((TextView) this.f7876fl).setText(this.Qhi);
    }

    public void Qhi(int i10) {
        this.NBs = i10;
        if (i10 == Integer.MAX_VALUE) {
            return;
        }
        ((TextView) this.f7876fl).setPaintFlags(i10);
    }

    public void Qhi(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((TextView) this.f7876fl).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void Qhi(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.Qhi(str, str2);
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1621067310:
                if (str.equals("shadowRadius")) {
                    c = 0;
                    break;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    c = 1;
                    break;
                }
                break;
            case -1065511464:
                if (str.equals("textAlign")) {
                    c = 2;
                    break;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    c = 3;
                    break;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    c = 4;
                    break;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    c = 5;
                    break;
                }
                break;
            case -879295043:
                if (str.equals("textDecoration")) {
                    c = 6;
                    break;
                }
                break;
            case -756368940:
                if (str.equals("shadowDx")) {
                    c = 7;
                    break;
                }
                break;
            case -756368939:
                if (str.equals("shadowDy")) {
                    c = '\b';
                    break;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    c = '\t';
                    break;
                }
                break;
            case -515807685:
                if (str.equals("lineHeight")) {
                    c = '\n';
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = 11;
                    break;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    c = '\f';
                    break;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    c = '\r';
                    break;
                }
                break;
            case 1554823821:
                if (str.equals("ellipsize")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.pv = ac.Qhi(str2, 0.0f);
                return;
            case 1:
                this.ots = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(str2);
                return;
            case 2:
                this.Hf = Sf(str2);
                return;
            case 3:
                this.dIT = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(str2);
                return;
            case 4:
                this.YB = ROR(str2);
                return;
            case 5:
                this.Qe = ac.Qhi(str2, 0.0f);
                return;
            case 6:
                this.NBs = hm(str2);
                return;
            case 7:
                this.HLI = ac.Qhi(str2, 0.0f);
                return;
            case '\b':
                this.oU = ac.Qhi(str2, 0.0f);
                return;
            case '\t':
                this.zjb = ac.Qhi(str2, -1.0f);
                return;
            case '\n':
                this.dVA = ac.Qhi(str2, 1.0f);
                return;
            case 11:
                this.Qhi = str2;
                return;
            case '\f':
                this.Dq = ac.Qhi(str2, 0);
                return;
            case '\r':
                this.cjC = Integer.parseInt(str2);
                return;
            case 14:
                this.dI = Tgh(str2);
                return;
            default:
                return;
        }
    }
}
