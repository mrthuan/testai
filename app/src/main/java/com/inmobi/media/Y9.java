package com.inmobi.media;

/* loaded from: classes2.dex */
public final class Y9 {

    /* renamed from: a  reason: collision with root package name */
    public final int f14889a;

    public Y9(int i10) {
        this.f14889a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Y9) && this.f14889a == ((Y9) obj).f14889a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14889a;
    }

    public final String toString() {
        return androidx.activity.f.n(new StringBuilder("RenderViewTelemetryData(maxTemplateEvents="), this.f14889a, ')');
    }
}
