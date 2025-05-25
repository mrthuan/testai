package androidx.media;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(h2.a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4096a = aVar.j(audioAttributesImplBase.f4096a, 1);
        audioAttributesImplBase.f4097b = aVar.j(audioAttributesImplBase.f4097b, 2);
        audioAttributesImplBase.c = aVar.j(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.f4098d = aVar.j(audioAttributesImplBase.f4098d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, h2.a aVar) {
        aVar.getClass();
        aVar.s(audioAttributesImplBase.f4096a, 1);
        aVar.s(audioAttributesImplBase.f4097b, 2);
        aVar.s(audioAttributesImplBase.c, 3);
        aVar.s(audioAttributesImplBase.f4098d, 4);
    }
}
