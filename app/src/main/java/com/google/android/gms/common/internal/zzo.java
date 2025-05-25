package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class zzo {

    /* renamed from: d  reason: collision with root package name */
    public static final Uri f11305d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f11306a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11307b;
    public final boolean c;

    public zzo(String str, String str2, boolean z10) {
        Preconditions.f(str);
        this.f11306a = str;
        Preconditions.f(str2);
        this.f11307b = str2;
        this.c = z10;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        Intent intent = null;
        String str = this.f11306a;
        if (str != null) {
            if (this.c) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", str);
                try {
                    bundle = context.getContentResolver().call(f11305d, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e10) {
                    "Dynamic intent resolution failed: ".concat(e10.toString());
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str));
                }
            }
            if (intent == null) {
                return new Intent(str).setPackage(this.f11307b);
            }
            return intent;
        }
        return new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzoVar = (zzo) obj;
        if (Objects.a(this.f11306a, zzoVar.f11306a) && Objects.a(this.f11307b, zzoVar.f11307b) && Objects.a(null, null) && this.c == zzoVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11306a, this.f11307b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.f11306a;
        if (str != null) {
            return str;
        }
        Preconditions.j(null);
        throw null;
    }
}
