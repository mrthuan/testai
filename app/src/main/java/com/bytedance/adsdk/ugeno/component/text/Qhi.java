package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;

/* compiled from: RichTextWidget.java */
/* loaded from: classes.dex */
public class Qhi extends com.bytedance.adsdk.ugeno.component.cJ<RichTextView> {
    private int Dq;
    private String Hf;
    private int NBs;
    private float Qe;
    private String Qhi;
    private String YB;
    private int cjC;
    private int dIT;

    public Qhi(Context context) {
        super(context);
        this.cjC = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.NBs = 2;
    }

    private int fl(String str) {
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

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    /* renamed from: Qhi */
    public RichTextView ac() {
        return new RichTextView(this.cJ);
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        super.cJ();
        ((RichTextView) this.f7876fl).setRichText(this.Qhi);
        ((RichTextView) this.f7876fl).setTextSize(1, this.Qe);
        ((RichTextView) this.f7876fl).setTextColor(this.dIT);
        ((RichTextView) this.f7876fl).setLines(this.Dq);
        ((RichTextView) this.f7876fl).setMaxLines(this.cjC);
        ((RichTextView) this.f7876fl).setGravity(this.NBs);
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
            case -1065511464:
                if (str.equals("textAlign")) {
                    c = 0;
                    break;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    c = 1;
                    break;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    c = 2;
                    break;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    c = 3;
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = 4;
                    break;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    c = 5;
                    break;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    c = 6;
                    break;
                }
                break;
            case 1554823821:
                if (str.equals("ellipsize")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.NBs = fl(str2);
                return;
            case 1:
                this.dIT = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(str2);
                return;
            case 2:
                this.YB = str2;
                return;
            case 3:
                this.Qe = Float.parseFloat(str2);
                return;
            case 4:
                this.Qhi = str2;
                return;
            case 5:
                this.Dq = Integer.parseInt(str2);
                return;
            case 6:
                this.cjC = Integer.parseInt(str2);
                return;
            case 7:
                this.Hf = str2;
                return;
            default:
                return;
        }
    }
}
