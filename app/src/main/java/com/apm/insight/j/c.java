package com.apm.insight.j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.i;
import com.apm.insight.l.p;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* loaded from: classes.dex */
public class c extends a {
    public c(Handler handler, long j10, long j11) {
        super(handler, j10, j11);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (i.c().b()) {
            return;
        }
        String d10 = i.a().d();
        if (!TextUtils.isEmpty(d10) && !PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.equals(d10)) {
            i.c().a(d10);
            str = "[DeviceIdTask] did is " + d10;
        } else {
            a(c());
            str = "[DeviceIdTask] did is null, continue check.";
        }
        p.a((Object) str);
    }
}
