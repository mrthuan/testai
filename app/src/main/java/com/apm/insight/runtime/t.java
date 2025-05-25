package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private String f6808a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f6809b = -1;

    public t(Context context) {
    }

    public String a() {
        if (TextUtils.isEmpty(this.f6808a) || PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.equals(this.f6808a)) {
            String d10 = com.apm.insight.i.a().d();
            this.f6808a = d10;
            if (TextUtils.isEmpty(d10) || PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.equals(this.f6808a)) {
                String b10 = s.a().b();
                this.f6808a = b10;
                return b10;
            }
            return this.f6808a;
        }
        return this.f6808a;
    }

    public boolean b() {
        if (this.f6808a != null) {
            return true;
        }
        return false;
    }

    public void a(String str) {
        this.f6808a = str;
        s.a().b(str);
    }
}
