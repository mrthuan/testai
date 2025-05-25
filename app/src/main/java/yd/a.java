package yd;

import androidx.activity.r;

/* compiled from: ADErrorMessage.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32113a;

    /* renamed from: b  reason: collision with root package name */
    public String f32114b;

    public a(String str, int i10) {
        this.f32113a = i10;
        if (i10 != 1) {
            this.f32114b = str;
        } else {
            this.f32114b = str;
        }
    }

    public final String toString() {
        switch (this.f32113a) {
            case 0:
                return r.g(new StringBuilder(), this.f32114b, "");
            default:
                return super.toString();
        }
    }
}
