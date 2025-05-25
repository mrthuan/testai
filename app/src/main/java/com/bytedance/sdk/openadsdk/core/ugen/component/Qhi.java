package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.MQ;

/* compiled from: CommentNumWidget.java */
/* loaded from: classes.dex */
public class Qhi extends com.bytedance.adsdk.ugeno.component.text.cJ {
    public Qhi(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.text.cJ
    public void fl(String str) {
        super.fl(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String format = String.format(MQ.Qhi(this.cJ, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((TextView) this.f7876fl).setText("(" + format + ")");
        } catch (Exception unused) {
        }
    }
}
