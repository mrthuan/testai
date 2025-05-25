package l7;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzu;
import l7.c;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class c extends zzb {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzm f20524a;

    public /* synthetic */ c(zzm zzmVar) {
        this.f20524a = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        zzbu zzbuVar = zzu.B.f10572v;
        zzm zzmVar = this.f20524a;
        Bitmap bitmap = (Bitmap) zzbuVar.f10436a.get(Integer.valueOf(zzmVar.f10309b.f10282o.f10540f));
        if (bitmap != null) {
            zzk zzkVar = zzmVar.f10309b.f10282o;
            boolean z10 = zzkVar.f10538d;
            Activity activity = zzmVar.f10308a;
            if (z10) {
                float f10 = zzkVar.f10539e;
                if (f10 > 0.0f && f10 <= 25.0f) {
                    try {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                        RenderScript create = RenderScript.create(activity);
                        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                        create2.setRadius(f10);
                        create2.setInput(createFromBitmap);
                        create2.forEach(createFromBitmap2);
                        createFromBitmap2.copyTo(createBitmap);
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                    } catch (RuntimeException unused) {
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    }
                    zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzj
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.this.f20524a.f10308a.getWindow().setBackgroundDrawable(bitmapDrawable);
                        }
                    });
                }
            }
            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
            zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzj
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.f20524a.f10308a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
