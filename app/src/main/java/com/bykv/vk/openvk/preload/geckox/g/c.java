package com.bykv.vk.openvk.preload.geckox.g;

import android.os.Process;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: UsingLock.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Pair<FileLock, AtomicLong>> f7597a = new HashMap();

    public static void a(String str) {
        Map<String, Pair<FileLock, AtomicLong>> map = f7597a;
        synchronized (map) {
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair == null) {
                Pair<FileLock, AtomicLong> pair2 = new Pair<>(FileLock.a(str, Process.myPid()), new AtomicLong(0L));
                map.put(str, pair2);
                pair = pair2;
            }
            ((AtomicLong) pair.second).incrementAndGet();
        }
    }

    public static void b(String str) {
        Map<String, Pair<FileLock, AtomicLong>> map = f7597a;
        synchronized (map) {
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair != null) {
                int i10 = (((AtomicLong) pair.second).decrementAndGet() > 0L ? 1 : (((AtomicLong) pair.second).decrementAndGet() == 0L ? 0 : -1));
                if (i10 >= 0) {
                    if (i10 == 0) {
                        ((FileLock) pair.first).a();
                        map.remove(str);
                    }
                } else {
                    throw new RuntimeException("using.lock count illegal");
                }
            } else {
                throw new RuntimeException("using.lock illegal state");
            }
        }
    }

    public static void c(String str) {
        Map<String, Pair<FileLock, AtomicLong>> map = f7597a;
        synchronized (map) {
            FileLock b10 = FileLock.b(str);
            if (b10 == null) {
                return;
            }
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair != null && ((AtomicLong) pair.second).get() != 0) {
                b10.a();
                FileLock.a(str, Process.myPid());
                return;
            }
            File parentFile = new File(str).getParentFile();
            final File file = new File(parentFile.getAbsolutePath() + "--pending-delete");
            if (parentFile.renameTo(file)) {
                b10.a();
                b10.b();
                e.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.g.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bykv.vk.openvk.preload.geckox.utils.c.a(file);
                    }
                });
            }
        }
    }
}
