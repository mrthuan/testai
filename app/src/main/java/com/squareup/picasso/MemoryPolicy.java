// Auto-fixed: added missing class declaration
public class MemoryPolicy {
package com.squareup.picasso;

/* loaded from: classes2.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int index;

    MemoryPolicy(int i10) {
        this.index = i10;
    }

    public static boolean shouldReadFromMemoryCache(int i10) {
        if ((i10 & NO_CACHE.index) == 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldWriteToMemoryCache(int i10) {
        if ((i10 & NO_STORE.index) == 0) {
            return true;
        }
        return false;
    }
}

}
