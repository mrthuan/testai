package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NN implements View.OnClickListener {
    public static String[] A01 = {"XFhwvfKkSyEqyRRacFdsqa616PFWUHCh", "TE99xZ7RorqY7SfVqRabPy9CgIKsfp3m", "kdLoeHuwvZoF6PjW0V2phiTjzwiVAf2t", "RlTzAejg9EfvSUQcXL5xjQX", "GFFSxtzm", "K1qZUjF5HHG2weDv49vHRNq0ZyDtpmc", "H0qCz3fL", "PDkQY8eSanvsX5OhJAHoWikZaqKVEEl4"};
    public final /* synthetic */ V2 A00;

    public NN(V2 v22) {
        this.A00 = v22;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A8n();
        } catch (Throwable th2) {
            if (A01[0].charAt(19) == 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "TKgPwnLp";
            strArr[6] = "fznJdSDC";
            KQ.A00(th2, this);
        }
    }
}
