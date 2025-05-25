package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import com.bytedance.sdk.component.utils.ABk;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class TTBaseActivity extends Activity {
    protected boolean ROR = false;

    public void Qhi(boolean z10) {
        this.ROR = z10;
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28 && i10 >= 24) {
            try {
                super.onResume();
                return;
            } catch (IllegalArgumentException e10) {
                ABk.Qhi("TTBaseActivity", "super.onResume() run fail", e10);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, Boolean.TRUE);
                    return;
                } catch (Exception e11) {
                    ABk.Qhi("TTBaseActivity", "onResume set mCalled fail", e11);
                    return;
                }
            }
        }
        super.onResume();
    }
}
