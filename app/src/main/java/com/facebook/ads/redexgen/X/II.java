package com.facebook.ads.redexgen.X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.annotation.DataClassGenerate;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointQeConfig;", "", "enableMultipleUsersPerManager", "", "(Z)V", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {1, 9, 0}, xi = 48)
@DataClassGenerate
/* loaded from: assets/audience_network.dex */
public final class II extends T3 {
    public final boolean A00;

    public II() {
        this(false, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof II) && this.A00 == ((II) obj).A00;
    }

    public final int hashCode() {
        return AbstractC1536di.A00(this.A00);
    }

    public final String toString() {
        return super.toString();
    }

    public II(boolean z10) {
        this.A00 = z10;
    }

    public /* synthetic */ II(boolean z10, int i10, AbstractC1513d8 abstractC1513d8) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
