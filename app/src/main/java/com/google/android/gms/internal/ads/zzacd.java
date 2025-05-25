package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzacd implements zzacp {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzacc zzb = new zzacc(new zzacb() { // from class: com.google.android.gms.internal.ads.zzabz
        @Override // com.google.android.gms.internal.ads.zzacb
        public final Constructor zza() {
            if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return null;
            }
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzack.class).getConstructor(Integer.TYPE);
        }
    });
    private static final zzacc zzc = new zzacc(new zzacb() { // from class: com.google.android.gms.internal.ads.zzaca
        @Override // com.google.android.gms.internal.ads.zzacb
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzack.class).getConstructor(new Class[0]);
        }
    });
    private zzfxr zzd;
    private final zzajy zze = new zzajt();

    private final void zzb(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new zzalw());
                return;
            case 1:
                list.add(new zzaly());
                return;
            case 2:
                list.add(new zzama(0));
                return;
            case 3:
                list.add(new zzadw(0));
                return;
            case 4:
                zzack zza2 = zzb.zza(0);
                if (zza2 != null) {
                    list.add(zza2);
                    return;
                } else {
                    list.add(new zzaeo(0));
                    return;
                }
            case 5:
                list.add(new zzaeq());
                return;
            case 6:
                list.add(new zzahj(this.zze, 0));
                return;
            case 7:
                list.add(new zzahp(0));
                return;
            case 8:
                list.add(new zzail(this.zze, 0, null, null, zzfxr.zzm(), null));
                list.add(new zzaiq(this.zze, 0));
                return;
            case 9:
                list.add(new zzajg());
                return;
            case 10:
                list.add(new zzanf());
                return;
            case 11:
                if (this.zzd == null) {
                    this.zzd = zzfxr.zzm();
                }
                list.add(new zzano(1, 0, this.zze, new zzer(0L), new zzamc(0, this.zzd), 112800));
                return;
            case 12:
                list.add(new zzanz());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new zzaew(0));
                return;
            case 15:
                zzack zza3 = zzc.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    return;
                }
                return;
            case 16:
                list.add(new zzaeb(0, this.zze));
                return;
            case 17:
                list.add(new zzajr());
                return;
            case 18:
                list.add(new zzaoe());
                return;
            case 19:
                list.add(new zzaej());
                return;
            case 20:
                list.add(new zzaev());
                return;
            case 21:
                list.add(new zzaei());
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01fb A[Catch: all -> 0x0421, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:138:0x01fb, B:139:0x01fe, B:259:0x03c3, B:260:0x03c6, B:262:0x03cb, B:265:0x03d1, B:266:0x03d4, B:267:0x03d7, B:268:0x03de, B:270:0x03e4, B:272:0x03f2, B:274:0x03fa, B:276:0x0402, B:278:0x040a, B:280:0x0412, B:281:0x041a, B:142:0x0207, B:144:0x020f, B:147:0x0219, B:150:0x0225, B:152:0x022d, B:155:0x0237, B:158:0x0242, B:161:0x024d, B:164:0x0258, B:166:0x0260, B:168:0x0268, B:171:0x0272, B:173:0x0280, B:176:0x028a, B:179:0x0295, B:181:0x029d, B:183:0x02ab, B:185:0x02b9, B:188:0x02c9, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02f9, B:202:0x0303, B:204:0x030b, B:207:0x031b, B:209:0x0323, B:212:0x032d, B:214:0x0335, B:217:0x033f, B:219:0x0347, B:222:0x0350, B:225:0x035c, B:228:0x0368, B:231:0x0374, B:233:0x037c, B:236:0x0385, B:238:0x038d, B:241:0x0396, B:14:0x0048, B:15:0x0050, B:114:0x01c1, B:17:0x0055, B:20:0x0061, B:23:0x006c, B:26:0x0078, B:29:0x0084, B:32:0x008f, B:35:0x009b, B:38:0x00a6, B:41:0x00b2, B:44:0x00be, B:47:0x00c9, B:50:0x00d5, B:53:0x00e0, B:56:0x00eb, B:59:0x00f6, B:62:0x0102, B:65:0x010d, B:68:0x0119, B:71:0x0125, B:74:0x0131, B:77:0x013d, B:80:0x0149, B:83:0x0155, B:86:0x0161, B:89:0x016c, B:92:0x0177, B:95:0x0182, B:98:0x018d, B:101:0x0198, B:104:0x01a2, B:107:0x01ac, B:110:0x01b6), top: B:288:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0207 A[Catch: all -> 0x0421, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:138:0x01fb, B:139:0x01fe, B:259:0x03c3, B:260:0x03c6, B:262:0x03cb, B:265:0x03d1, B:266:0x03d4, B:267:0x03d7, B:268:0x03de, B:270:0x03e4, B:272:0x03f2, B:274:0x03fa, B:276:0x0402, B:278:0x040a, B:280:0x0412, B:281:0x041a, B:142:0x0207, B:144:0x020f, B:147:0x0219, B:150:0x0225, B:152:0x022d, B:155:0x0237, B:158:0x0242, B:161:0x024d, B:164:0x0258, B:166:0x0260, B:168:0x0268, B:171:0x0272, B:173:0x0280, B:176:0x028a, B:179:0x0295, B:181:0x029d, B:183:0x02ab, B:185:0x02b9, B:188:0x02c9, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02f9, B:202:0x0303, B:204:0x030b, B:207:0x031b, B:209:0x0323, B:212:0x032d, B:214:0x0335, B:217:0x033f, B:219:0x0347, B:222:0x0350, B:225:0x035c, B:228:0x0368, B:231:0x0374, B:233:0x037c, B:236:0x0385, B:238:0x038d, B:241:0x0396, B:14:0x0048, B:15:0x0050, B:114:0x01c1, B:17:0x0055, B:20:0x0061, B:23:0x006c, B:26:0x0078, B:29:0x0084, B:32:0x008f, B:35:0x009b, B:38:0x00a6, B:41:0x00b2, B:44:0x00be, B:47:0x00c9, B:50:0x00d5, B:53:0x00e0, B:56:0x00eb, B:59:0x00f6, B:62:0x0102, B:65:0x010d, B:68:0x0119, B:71:0x0125, B:74:0x0131, B:77:0x013d, B:80:0x0149, B:83:0x0155, B:86:0x0161, B:89:0x016c, B:92:0x0177, B:95:0x0182, B:98:0x018d, B:101:0x0198, B:104:0x01a2, B:107:0x01ac, B:110:0x01b6), top: B:288:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x0421, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:138:0x01fb, B:139:0x01fe, B:259:0x03c3, B:260:0x03c6, B:262:0x03cb, B:265:0x03d1, B:266:0x03d4, B:267:0x03d7, B:268:0x03de, B:270:0x03e4, B:272:0x03f2, B:274:0x03fa, B:276:0x0402, B:278:0x040a, B:280:0x0412, B:281:0x041a, B:142:0x0207, B:144:0x020f, B:147:0x0219, B:150:0x0225, B:152:0x022d, B:155:0x0237, B:158:0x0242, B:161:0x024d, B:164:0x0258, B:166:0x0260, B:168:0x0268, B:171:0x0272, B:173:0x0280, B:176:0x028a, B:179:0x0295, B:181:0x029d, B:183:0x02ab, B:185:0x02b9, B:188:0x02c9, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02f9, B:202:0x0303, B:204:0x030b, B:207:0x031b, B:209:0x0323, B:212:0x032d, B:214:0x0335, B:217:0x033f, B:219:0x0347, B:222:0x0350, B:225:0x035c, B:228:0x0368, B:231:0x0374, B:233:0x037c, B:236:0x0385, B:238:0x038d, B:241:0x0396, B:14:0x0048, B:15:0x0050, B:114:0x01c1, B:17:0x0055, B:20:0x0061, B:23:0x006c, B:26:0x0078, B:29:0x0084, B:32:0x008f, B:35:0x009b, B:38:0x00a6, B:41:0x00b2, B:44:0x00be, B:47:0x00c9, B:50:0x00d5, B:53:0x00e0, B:56:0x00eb, B:59:0x00f6, B:62:0x0102, B:65:0x010d, B:68:0x0119, B:71:0x0125, B:74:0x0131, B:77:0x013d, B:80:0x0149, B:83:0x0155, B:86:0x0161, B:89:0x016c, B:92:0x0177, B:95:0x0182, B:98:0x018d, B:101:0x0198, B:104:0x01a2, B:107:0x01ac, B:110:0x01b6), top: B:288:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03cb A[Catch: all -> 0x0421, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:138:0x01fb, B:139:0x01fe, B:259:0x03c3, B:260:0x03c6, B:262:0x03cb, B:265:0x03d1, B:266:0x03d4, B:267:0x03d7, B:268:0x03de, B:270:0x03e4, B:272:0x03f2, B:274:0x03fa, B:276:0x0402, B:278:0x040a, B:280:0x0412, B:281:0x041a, B:142:0x0207, B:144:0x020f, B:147:0x0219, B:150:0x0225, B:152:0x022d, B:155:0x0237, B:158:0x0242, B:161:0x024d, B:164:0x0258, B:166:0x0260, B:168:0x0268, B:171:0x0272, B:173:0x0280, B:176:0x028a, B:179:0x0295, B:181:0x029d, B:183:0x02ab, B:185:0x02b9, B:188:0x02c9, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02f9, B:202:0x0303, B:204:0x030b, B:207:0x031b, B:209:0x0323, B:212:0x032d, B:214:0x0335, B:217:0x033f, B:219:0x0347, B:222:0x0350, B:225:0x035c, B:228:0x0368, B:231:0x0374, B:233:0x037c, B:236:0x0385, B:238:0x038d, B:241:0x0396, B:14:0x0048, B:15:0x0050, B:114:0x01c1, B:17:0x0055, B:20:0x0061, B:23:0x006c, B:26:0x0078, B:29:0x0084, B:32:0x008f, B:35:0x009b, B:38:0x00a6, B:41:0x00b2, B:44:0x00be, B:47:0x00c9, B:50:0x00d5, B:53:0x00e0, B:56:0x00eb, B:59:0x00f6, B:62:0x0102, B:65:0x010d, B:68:0x0119, B:71:0x0125, B:74:0x0131, B:77:0x013d, B:80:0x0149, B:83:0x0155, B:86:0x0161, B:89:0x016c, B:92:0x0177, B:95:0x0182, B:98:0x018d, B:101:0x0198, B:104:0x01a2, B:107:0x01ac, B:110:0x01b6), top: B:288:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03e4 A[Catch: all -> 0x0421, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:138:0x01fb, B:139:0x01fe, B:259:0x03c3, B:260:0x03c6, B:262:0x03cb, B:265:0x03d1, B:266:0x03d4, B:267:0x03d7, B:268:0x03de, B:270:0x03e4, B:272:0x03f2, B:274:0x03fa, B:276:0x0402, B:278:0x040a, B:280:0x0412, B:281:0x041a, B:142:0x0207, B:144:0x020f, B:147:0x0219, B:150:0x0225, B:152:0x022d, B:155:0x0237, B:158:0x0242, B:161:0x024d, B:164:0x0258, B:166:0x0260, B:168:0x0268, B:171:0x0272, B:173:0x0280, B:176:0x028a, B:179:0x0295, B:181:0x029d, B:183:0x02ab, B:185:0x02b9, B:188:0x02c9, B:190:0x02d7, B:193:0x02e1, B:195:0x02e9, B:197:0x02f1, B:199:0x02f9, B:202:0x0303, B:204:0x030b, B:207:0x031b, B:209:0x0323, B:212:0x032d, B:214:0x0335, B:217:0x033f, B:219:0x0347, B:222:0x0350, B:225:0x035c, B:228:0x0368, B:231:0x0374, B:233:0x037c, B:236:0x0385, B:238:0x038d, B:241:0x0396, B:14:0x0048, B:15:0x0050, B:114:0x01c1, B:17:0x0055, B:20:0x0061, B:23:0x006c, B:26:0x0078, B:29:0x0084, B:32:0x008f, B:35:0x009b, B:38:0x00a6, B:41:0x00b2, B:44:0x00be, B:47:0x00c9, B:50:0x00d5, B:53:0x00e0, B:56:0x00eb, B:59:0x00f6, B:62:0x0102, B:65:0x010d, B:68:0x0119, B:71:0x0125, B:74:0x0131, B:77:0x013d, B:80:0x0149, B:83:0x0155, B:86:0x0161, B:89:0x016c, B:92:0x0177, B:95:0x0182, B:98:0x018d, B:101:0x0198, B:104:0x01a2, B:107:0x01ac, B:110:0x01b6), top: B:288:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzacp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzack[] zza(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacd.zza(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzack[]");
    }
}
