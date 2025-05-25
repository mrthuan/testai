package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class g0 extends okhttp3.z {

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap f13235a = new TreeMap();

    public g0(File file, File file2) {
        ArrayList a10 = f2.a(file, file2);
        if (!a10.isEmpty()) {
            Iterator it = a10.iterator();
            long j10 = 0;
            while (it.hasNext()) {
                File file3 = (File) it.next();
                this.f13235a.put(Long.valueOf(j10), file3);
                j10 += file3.length();
            }
            return;
        }
        throw new ck(String.format("Virtualized slice archive empty for %s, %s", file, file2));
    }

    @Override // okhttp3.z
    public final long a() {
        Map.Entry lastEntry = this.f13235a.lastEntry();
        return ((File) lastEntry.getValue()).length() + ((Long) lastEntry.getKey()).longValue();
    }

    @Override // okhttp3.z
    public final InputStream b(long j10, long j11) {
        if (j10 >= 0 && j11 >= 0) {
            long j12 = j10 + j11;
            if (j12 <= a()) {
                TreeMap treeMap = this.f13235a;
                Long l10 = (Long) treeMap.floorKey(Long.valueOf(j10));
                Long l11 = (Long) treeMap.floorKey(Long.valueOf(j12));
                if (l10.equals(l11)) {
                    return new f0(i(j10, l10), j11);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(i(j10, l10));
                Collection values = treeMap.subMap(l10, false, l11, false).values();
                if (!values.isEmpty()) {
                    arrayList.add(new o1(Collections.enumeration(values)));
                }
                arrayList.add(new f0(new FileInputStream((File) treeMap.get(l11)), j11 - (l11.longValue() - j10)));
                return new SequenceInputStream(Collections.enumeration(arrayList));
            }
            throw new ck(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(a()), Long.valueOf(j12)));
        }
        throw new ck(String.format("Invalid input parameters %s, %s", Long.valueOf(j10), Long.valueOf(j11)));
    }

    public final FileInputStream i(long j10, Long l10) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f13235a.get(l10));
        if (fileInputStream.skip(j10 - l10.longValue()) == j10 - l10.longValue()) {
            return fileInputStream;
        }
        throw new ck(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l10));
    }

    @Override // okhttp3.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
