package com.tom_roush.pdfbox.io;

import android.support.v4.media.session.h;
import java.io.File;

/* loaded from: classes2.dex */
public final class MemoryUsageSetting {
    private final long maxMainMemoryBytes;
    private final long maxStorageBytes;
    private File tempDir;
    private final boolean useMainMemory;
    private final boolean useTempFile;

    private MemoryUsageSetting(boolean z10, boolean z11, long j10, long j11) {
        boolean z12;
        if (z11) {
            z12 = z10;
        } else {
            z12 = true;
        }
        j10 = z10 ? j10 : -1L;
        j11 = j11 <= 0 ? -1L : j11;
        j10 = j10 < -1 ? -1L : j10;
        if (z12 && j10 == 0) {
            if (z11) {
                z12 = false;
            } else {
                j10 = j11;
            }
        }
        if (z12 && j11 > -1 && (j10 == -1 || j10 > j11)) {
            j11 = j10;
        }
        this.useMainMemory = z12;
        this.useTempFile = z11;
        this.maxMainMemoryBytes = j10;
        this.maxStorageBytes = j11;
    }

    public static MemoryUsageSetting setupMainMemoryOnly() {
        return setupMainMemoryOnly(-1L);
    }

    public static MemoryUsageSetting setupMixed(long j10) {
        return setupMixed(j10, -1L);
    }

    public static MemoryUsageSetting setupTempFileOnly() {
        return setupTempFileOnly(-1L);
    }

    public long getMaxMainMemoryBytes() {
        return this.maxMainMemoryBytes;
    }

    public long getMaxStorageBytes() {
        return this.maxStorageBytes;
    }

    public MemoryUsageSetting getPartitionedCopy(int i10) {
        long j10 = this.maxMainMemoryBytes;
        if (j10 > 0) {
            j10 /= i10;
        }
        long j11 = j10;
        long j12 = this.maxStorageBytes;
        if (j12 > 0) {
            j12 /= i10;
        }
        MemoryUsageSetting memoryUsageSetting = new MemoryUsageSetting(this.useMainMemory, this.useTempFile, j11, j12);
        memoryUsageSetting.tempDir = this.tempDir;
        return memoryUsageSetting;
    }

    public File getTempDir() {
        return this.tempDir;
    }

    public boolean isMainMemoryRestricted() {
        if (this.maxMainMemoryBytes >= 0) {
            return true;
        }
        return false;
    }

    public boolean isStorageRestricted() {
        if (this.maxStorageBytes > 0) {
            return true;
        }
        return false;
    }

    public MemoryUsageSetting setTempDir(File file) {
        this.tempDir = file;
        return this;
    }

    public String toString() {
        String str;
        if (this.useMainMemory) {
            if (this.useTempFile) {
                StringBuilder sb2 = new StringBuilder("Mixed mode with max. of ");
                sb2.append(this.maxMainMemoryBytes);
                sb2.append(" main memory bytes");
                if (isStorageRestricted()) {
                    str = h.e(new StringBuilder(" and max. of "), this.maxStorageBytes, " storage bytes");
                } else {
                    str = " and unrestricted scratch file size";
                }
                sb2.append(str);
                return sb2.toString();
            } else if (isMainMemoryRestricted()) {
                return h.e(new StringBuilder("Main memory only with max. of "), this.maxMainMemoryBytes, " bytes");
            } else {
                return "Main memory only with no size restriction";
            }
        } else if (isStorageRestricted()) {
            return h.e(new StringBuilder("Scratch file only with max. of "), this.maxStorageBytes, " bytes");
        } else {
            return "Scratch file only with no size restriction";
        }
    }

    public boolean useMainMemory() {
        return this.useMainMemory;
    }

    public boolean useTempFile() {
        return this.useTempFile;
    }

    public static MemoryUsageSetting setupMainMemoryOnly(long j10) {
        return new MemoryUsageSetting(true, false, j10, j10);
    }

    public static MemoryUsageSetting setupMixed(long j10, long j11) {
        return new MemoryUsageSetting(true, true, j10, j11);
    }

    public static MemoryUsageSetting setupTempFileOnly(long j10) {
        return new MemoryUsageSetting(false, true, 0L, j10);
    }
}
