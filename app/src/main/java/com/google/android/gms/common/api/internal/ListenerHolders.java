package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class ListenerHolders {

    /* renamed from: a  reason: collision with root package name */
    public final Set f10960a = Collections.newSetFromMap(new WeakHashMap());

    @KeepForSdk
    public static ListenerHolder a(Looper looper, Object obj, String str) {
        if (obj != null) {
            if (looper != null) {
                if (str != null) {
                    return new ListenerHolder(looper, obj, str);
                }
                throw new NullPointerException("Listener type must not be null");
            }
            throw new NullPointerException("Looper must not be null");
        }
        throw new NullPointerException("Listener must not be null");
    }

    @KeepForSdk
    public static <L> ListenerHolder.ListenerKey<L> b(L l10, String str) {
        if (l10 != null) {
            Preconditions.g("Listener type must not be empty", str);
            return new ListenerHolder.ListenerKey<>(l10, str);
        }
        throw new NullPointerException("Listener must not be null");
    }
}
