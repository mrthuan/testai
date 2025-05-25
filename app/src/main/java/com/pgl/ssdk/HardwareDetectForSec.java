package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;

/* renamed from: com.pgl.ssdk.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class HardwareDetectForSec {

    /* renamed from: a  reason: collision with root package name */
    public static int f15847a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static int f15848b = -1;

    /* compiled from: HardwareDetectForSec.java */
    /* renamed from: com.pgl.ssdk.t$a */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Context b10 = PglArmorCallApi.b();
            int i10 = HardwareDetectForSec.f15848b;
            if (i10 == -1) {
                CameraManager cameraManager = (CameraManager) b10.getSystemService("camera");
                if (cameraManager != null) {
                    try {
                        HardwareDetectForSec.f15848b = cameraManager.getCameraIdList().length;
                    } catch (Throwable unused) {
                        HardwareDetectForSec.f15848b = -1;
                    }
                } else {
                    HardwareDetectForSec.f15848b = -2;
                }
                i10 = HardwareDetectForSec.f15848b;
            }
            HardwareDetectForSec.f15848b = i10;
            SharedPreferences a10 = L.a(PglArmorCallApi.b());
            if (a10 != null) {
                a10.edit().putInt("camera_count", HardwareDetectForSec.f15848b).apply();
            }
        }
    }

    public static int a() {
        int i10;
        int i11 = f15848b;
        if (i11 != -1) {
            return i11;
        }
        SharedPreferences a10 = L.a(PglArmorCallApi.b());
        if (a10 != null && (i10 = a10.getInt("camera_count", -1)) != -1) {
            f15848b = i10;
            return i10;
        }
        ApkUtils.a(new a());
        return -1;
    }
}
