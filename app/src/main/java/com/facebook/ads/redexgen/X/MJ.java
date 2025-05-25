package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.widget.Toast;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class MJ implements SensorEventListener {
    public static byte[] A0A;
    public static String[] A0B = {"Uaa3J2scapV8yes5b6pnu2IZk0LU1rHr", "LXJurOGNRLg3EZS8fSyHIDjya5ZXSJzZ", "hCsv3utrXnSLOEX2XFPv3VRLBGlOvh7o", "RmYGkVFgjEbS5IzY3jbSoV7saQb", "K5WWR24mbSYeRgwsb3gP0cRcHXaCk4OY", "QLQ7H5Nzwy1ReHmp", "O9fDe2IL", "IeHuYhXCHfpoc9Iu6CaN8EzSXeA"};
    public long A04;
    public long A05;
    public long A06;
    public SensorManager A07;
    public final C1314Zs A08;
    public int A03 = 0;
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public final Set<MI> A09 = new CopyOnWriteArraySet();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0B[5].length() != 16) {
                throw new RuntimeException();
            }
            A0B[6] = "nz7up3lN";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 34);
            i13++;
        }
    }

    public static void A02() {
        A0A = new byte[]{122, 76, Field.FORMCHECKBOX, Field.LISTNUM, Field.FORMTEXT, Field.HTMLCONTROL, Field.LISTNUM, 9, Field.FORMCHECKBOX, Field.FORMTEXT, Field.ADDRESSBLOCK, 9, Field.LISTNUM, Field.BIDIOUTLINE, Field.AUTOTEXTLIST, Field.AUTOTEXTLIST, Field.FORMTEXT, Field.HTMLCONTROL, Field.ADDRESSBLOCK, 76, 77, 5, Field.USERADDRESS, Field.IMPORT, 61, Field.BARCODE, 56, Field.EQ, 118, 56, Field.SYMBOL, 34, 118, Field.PAGEREF, Field.QUOTE, Field.ASK, Field.ASK, Field.SYMBOL, 36, 34, Field.MACROBUTTON, Field.GOTOBUTTON, 25, 15, 4, 25, 5, 24};
    }

    static {
        A02();
    }

    public MJ(C1314Zs c1314Zs) {
        this.A08 = c1314Zs;
    }

    private void A01() {
        this.A07 = (SensorManager) this.A08.getSystemService(A00(42, 6, 72));
        if (this.A07 == null) {
            Toast.makeText(this.A08, A00(0, 21, 11), 1).show();
        }
        boolean z10 = false;
        try {
            z10 = this.A07.registerListener(this, this.A07.getDefaultSensor(1), 3);
        } catch (Exception unused) {
            Toast.makeText(this.A08, A00(21, 21, 116), 1).show();
        }
        if (!z10 && this.A07 != null) {
            this.A07.unregisterListener(this);
        }
    }

    public final void A03(MI mi2) {
        if (this.A09.isEmpty()) {
            A01();
        } else if (this.A09.contains(mi2)) {
            return;
        }
        this.A09.add(mi2);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        long now = SystemClock.elapsedRealtime();
        if (now - this.A04 > 500) {
            this.A03 = 0;
        }
        if (now - this.A06 > 100) {
            float speed = (Math.abs(((((sensorEvent.values[0] + sensorEvent.values[1]) + sensorEvent.values[2]) - this.A00) - this.A01) - this.A02) / ((float) (now - this.A06))) * 10000.0f;
            if (speed > 800.0f) {
                int i10 = this.A03 + 1;
                this.A03 = i10;
                if (i10 >= 3 && now - this.A05 > 1000) {
                    this.A05 = now;
                    this.A03 = 0;
                    for (MI mi2 : this.A09) {
                        mi2.ADZ();
                    }
                }
                this.A04 = now;
            }
            this.A06 = now;
            this.A00 = sensorEvent.values[0];
            this.A01 = sensorEvent.values[1];
            this.A02 = sensorEvent.values[2];
        }
    }
}
