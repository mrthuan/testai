package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class ListenerHolder<L> {

    /* renamed from: a  reason: collision with root package name */
    public final HandlerExecutor f10956a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f10957b;
    public volatile ListenerKey c;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static final class ListenerKey<L> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f10958a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10959b;

        @KeepForSdk
        public ListenerKey(L l10, String str) {
            this.f10958a = l10;
            this.f10959b = str;
        }

        @KeepForSdk
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            if (this.f10958a == listenerKey.f10958a && this.f10959b.equals(listenerKey.f10959b)) {
                return true;
            }
            return false;
        }

        @KeepForSdk
        public final int hashCode() {
            return this.f10959b.hashCode() + (System.identityHashCode(this.f10958a) * 31);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(L l10);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    @KeepForSdk
    public ListenerHolder(Looper looper, L l10, String str) {
        this.f10956a = new HandlerExecutor(looper);
        if (l10 != null) {
            this.f10957b = l10;
            Preconditions.f(str);
            this.c = new ListenerKey(l10, str);
            return;
        }
        throw new NullPointerException("Listener must not be null");
    }

    @KeepForSdk
    public final void a(final Notifier<? super L> notifier) {
        this.f10956a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                ListenerHolder listenerHolder = ListenerHolder.this;
                ListenerHolder.Notifier notifier2 = notifier;
                Object obj = listenerHolder.f10957b;
                if (obj == null) {
                    notifier2.onNotifyListenerFailed();
                    return;
                }
                try {
                    notifier2.notifyListener(obj);
                } catch (RuntimeException e10) {
                    notifier2.onNotifyListenerFailed();
                    throw e10;
                }
            }
        });
    }
}
