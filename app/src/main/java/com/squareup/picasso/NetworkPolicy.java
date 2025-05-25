// Auto-fixed: added missing class declaration
public class NetworkPolicy {
package com.squareup.picasso;

/* loaded from: classes2.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int index;

    NetworkPolicy(int i10) {
        this.index = i10;
    }

    public static boolean isOfflineOnly(int i10) {
        if ((i10 & OFFLINE.index) != 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldReadFromDiskCache(int i10) {
        if ((i10 & NO_CACHE.index) == 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldWriteToDiskCache(int i10) {
        if ((i10 & NO_STORE.index) == 0) {
            return true;
        }
        return false;
    }
}

}
