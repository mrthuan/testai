package ln;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: SoundPoolHelper.kt */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final SoundPool f21781a;

    public b(Context context) {
        Integer num;
        g.e(context, ea.a.p("UG8ldBZ4dA==", "EXk5x4iN"));
        try {
            SoundPool.Builder builder = new SoundPool.Builder();
            builder.setMaxStreams(1);
            AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
            builder2.setLegacyStreamType(3);
            builder.setAudioAttributes(builder2.build());
            this.f21781a = builder.build();
            c cVar = (c) this;
            SoundPool soundPool = cVar.f21781a;
            if (soundPool != null) {
                num = Integer.valueOf(soundPool.load(context, R.raw.sound_camera, 1));
            } else {
                num = null;
            }
            cVar.f21782b = num;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
