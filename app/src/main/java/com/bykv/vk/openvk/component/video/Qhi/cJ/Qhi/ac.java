package com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.Qhi.cJ.Tgh;
import com.bykv.vk.openvk.component.video.Qhi.cJ.fl;
import com.bytedance.sdk.component.Sf.ROR;
import com.bytedance.sdk.component.Sf.hm;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public class ac extends com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.Qhi {
    private final ReentrantReadWriteLock.ReadLock CJ;
    private final Handler Gm;
    public final File Qhi;
    private volatile long ROR;
    private volatile float Sf;
    private final Set<Qhi> Tgh;
    private final Runnable WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final ReentrantReadWriteLock f7134ac;
    private final LinkedHashMap<String, File> cJ = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: fl  reason: collision with root package name */
    private final ReentrantReadWriteLock.WriteLock f7135fl;

    /* renamed from: hm  reason: collision with root package name */
    private final cJ f7136hm;

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(String str);

        void Qhi(Set<String> set);
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public static final class cJ {
        private final Map<String, Integer> Qhi;

        private cJ() {
            this.Qhi = new HashMap();
        }

        public synchronized void Qhi(String str) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = this.Qhi.get(str);
                if (num == null) {
                    this.Qhi.put(str, 1);
                    return;
                }
                this.Qhi.put(str, Integer.valueOf(num.intValue() + 1));
            }
        }

        public synchronized boolean ac(String str) {
            if (!TextUtils.isEmpty(str)) {
                return this.Qhi.containsKey(str);
            }
            return false;
        }

        public synchronized void cJ(String str) {
            Integer num;
            if (!TextUtils.isEmpty(str) && (num = this.Qhi.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.Qhi.remove(str);
                    return;
                }
                this.Qhi.put(str, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public ac(File file) {
        String str;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f7134ac = reentrantReadWriteLock;
        this.CJ = reentrantReadWriteLock.readLock();
        this.f7135fl = reentrantReadWriteLock.writeLock();
        this.Tgh = Collections.newSetFromMap(new ConcurrentHashMap());
        this.ROR = 104857600L;
        this.Sf = 0.5f;
        this.f7136hm = new cJ();
        this.WAv = new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac.1
            @Override // java.lang.Runnable
            public void run() {
                ROR.cJ(new hm("cleanupCmd", 1) { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ac acVar = ac.this;
                        acVar.cJ(acVar.ROR);
                    }
                });
            }
        };
        this.Gm = new Handler(Looper.getMainLooper());
        if (file != null && file.exists() && file.isDirectory() && file.canRead() && file.canWrite()) {
            this.Qhi = file;
            ROR.cJ(new hm("DiskLruCache", 5) { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac.2
                @Override // java.lang.Runnable
                public void run() {
                    ac.this.cJ();
                }
            });
            return;
        }
        if (file == null) {
            str = " dir null";
        } else {
            str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
        }
        throw new IOException("dir error!  ".concat(String.valueOf(str)));
    }

    private void ac() {
        this.Gm.removeCallbacks(this.WAv);
        this.Gm.postDelayed(this.WAv, 10000L);
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.Qhi
    public File CJ(String str) {
        if (this.CJ.tryLock()) {
            File file = this.cJ.get(str);
            this.CJ.unlock();
            return file;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ() {
        this.f7135fl.lock();
        try {
            File[] listFiles = this.Qhi.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                final HashMap hashMap = new HashMap(listFiles.length);
                ArrayList arrayList = new ArrayList(listFiles.length);
                for (File file : listFiles) {
                    if (file.isFile()) {
                        arrayList.add(file);
                        hashMap.put(file, Long.valueOf(file.lastModified()));
                    }
                }
                Collections.sort(arrayList, new Comparator<File>() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac.3
                    @Override // java.util.Comparator
                    /* renamed from: Qhi */
                    public int compare(File file2, File file3) {
                        int i10 = ((((Long) hashMap.get(file2)).longValue() - ((Long) hashMap.get(file3)).longValue()) > 0L ? 1 : ((((Long) hashMap.get(file2)).longValue() - ((Long) hashMap.get(file3)).longValue()) == 0L ? 0 : -1));
                        if (i10 < 0) {
                            return -1;
                        }
                        if (i10 > 0) {
                            return 1;
                        }
                        return 0;
                    }
                });
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    this.cJ.put(Qhi(file2), file2);
                }
            }
            this.f7135fl.unlock();
            ac();
        } catch (Throwable th2) {
            this.f7135fl.unlock();
            throw th2;
        }
    }

    public void Qhi(Qhi qhi) {
        if (qhi != null) {
            this.Tgh.add(qhi);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.Qhi
    public File ac(String str) {
        this.CJ.lock();
        File file = this.cJ.get(str);
        this.CJ.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.Qhi, str);
        this.f7135fl.lock();
        this.cJ.put(str, file2);
        this.f7135fl.unlock();
        for (Qhi qhi : this.Tgh) {
            qhi.Qhi(str);
        }
        ac();
        return file2;
    }

    public void Qhi(long j10) {
        this.ROR = j10;
        ac();
    }

    public void Qhi() {
        fl.ac().CJ();
        Context Qhi2 = Tgh.Qhi();
        if (Qhi2 != null) {
            com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac.Qhi(Qhi2).Qhi(0);
        }
        this.Gm.removeCallbacks(this.WAv);
        ROR.cJ(new hm("clear", 1) { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac.4
            @Override // java.lang.Runnable
            public void run() {
                ac.this.cJ(0L);
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.Qhi
    public void Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f7136hm.Qhi(str);
    }

    private String Qhi(File file) {
        return file.getName();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.Qhi
    public void cJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f7136hm.cJ(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(long j10) {
        HashSet hashSet;
        long j11;
        final HashSet hashSet2 = new HashSet();
        this.f7135fl.lock();
        try {
            j11 = 0;
            for (Map.Entry<String, File> entry : this.cJ.entrySet()) {
                j11 += entry.getValue().length();
            }
        } catch (Throwable unused) {
            hashSet = null;
        }
        if (j11 <= j10) {
            this.f7135fl.unlock();
            return;
        }
        long j12 = ((float) j10) * this.Sf;
        hashSet = new HashSet();
        try {
            for (Map.Entry<String, File> entry2 : this.cJ.entrySet()) {
                File value = entry2.getValue();
                if (value != null && value.exists()) {
                    if (!this.f7136hm.ac(Qhi(value))) {
                        long length = value.length();
                        File file = new File(value.getAbsolutePath() + "-tmp");
                        if (value.renameTo(file)) {
                            hashSet2.add(file);
                            j11 -= length;
                            hashSet.add(entry2.getKey());
                        }
                    }
                } else {
                    hashSet.add(entry2.getKey());
                }
                if (j11 <= j12) {
                    break;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.cJ.remove((String) it.next());
            }
        } catch (Throwable unused2) {
        }
        this.f7135fl.unlock();
        for (Qhi qhi : this.Tgh) {
            qhi.Qhi(hashSet);
        }
        ROR.cJ(new hm("trimSize", 1) { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac.5
            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    try {
                        ((File) it2.next()).delete();
                    } catch (Throwable unused3) {
                    }
                }
            }
        });
    }
}
