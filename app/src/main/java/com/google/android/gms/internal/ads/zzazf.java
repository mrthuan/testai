package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzazf {
    public static long zza(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        int i11 = i10 >> 1;
        long j11 = (j10 * j10) % 1073807359;
        if ((i10 & 1) == 0) {
            return zza(j11, i11) % 1073807359;
        }
        return ((zza(j11, i11) % 1073807359) * j10) % 1073807359;
    }

    public static String zzb(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 < i13) {
                sb2.append(strArr[i10]);
                sb2.append(' ');
                i10++;
            } else {
                sb2.append(strArr[i13]);
                return sb2.toString();
            }
        }
    }

    public static void zzc(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzd(i10, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzd(i10, zze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i12 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i12 < length2 - 5) {
                String zzb = zzb(strArr, i12, 6);
                long zza = (zzazb.zza(strArr[i12 + 5]) + 2147483647L) % 1073807359;
                zze = (zza + (((((zze + 1073807359) - ((((zzazb.zza(strArr[i12 - 1]) + 2147483647L) % 1073807359) * zza(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                zzd(i10, zze, zzb, length2, priorityQueue);
                i12++;
            } else {
                return;
            }
        }
    }

    public static void zzd(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        zzaze zzazeVar = new zzaze(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((zzaze) priorityQueue.peek()).zzc <= zzazeVar.zzc && ((zzaze) priorityQueue.peek()).zza <= zzazeVar.zza)) && !priorityQueue.contains(zzazeVar)) {
            priorityQueue.add(zzazeVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i10, int i11) {
        long zza = (zzazb.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            zza = (((zzazb.zza(strArr[i12]) + 2147483647L) % 1073807359) + ((zza * 16785407) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
