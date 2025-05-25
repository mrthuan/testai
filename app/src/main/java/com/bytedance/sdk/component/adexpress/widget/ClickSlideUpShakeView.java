package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.adexpress.ac.Qhi;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ClickSlideUpShakeView extends SlideUpView {
    private ShakeClickView Qhi;

    public ClickSlideUpShakeView(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        Qhi(context, i10, i11, i12, jSONObject);
    }

    private void Qhi(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        ShakeClickView shakeClickView = new ShakeClickView(context, Qhi.ac(context), i10, i11, i12, jSONObject);
        this.Qhi = shakeClickView;
        addView(shakeClickView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.Qhi.setLayoutParams(layoutParams);
    }

    public ShakeClickView getShakeView() {
        return this.Qhi;
    }

    public void setShakeText(String str) {
        if (this.Qhi == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.Qhi.setShakeText("");
        } else {
            this.Qhi.setShakeText(str);
        }
    }
}
