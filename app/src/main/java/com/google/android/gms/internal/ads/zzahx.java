package com.google.android.gms.internal.ads;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
class zzahx {
    public final int zzd;

    public zzahx(int i10) {
        this.zzd = i10;
    }

    public static int zze(int i10) {
        return (i10 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC;
    }

    public static String zzf(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) ((i10 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        sb2.append((char) ((i10 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        sb2.append((char) ((i10 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        sb2.append((char) (i10 & FunctionEval.FunctionID.EXTERNAL_FUNC));
        return sb2.toString();
    }

    public String toString() {
        return zzf(this.zzd);
    }
}
