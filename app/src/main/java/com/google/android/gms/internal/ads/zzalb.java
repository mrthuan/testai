package com.google.android.gms.internal.ads;

import android.text.Layout;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzalb implements zzaka {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzakz zzh = new zzakz(30.0f, 1, 1);

    public zzalb() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
        if (r13.equals("s") != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long zzd(java.lang.String r13, com.google.android.gms.internal.ads.zzakz r14) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalb.zzd(java.lang.String, com.google.android.gms.internal.ads.zzakz):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment zze(String str) {
        char c;
        String zza2 = zzfuf.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (zza2.equals("end")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (zza2.equals("left")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (zza2.equals("right")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1) {
            if (c != 2 && c != 3) {
                if (c != 4) {
                    return null;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private static zzale zzf(zzale zzaleVar) {
        if (zzaleVar == null) {
            return new zzale();
        }
        return zzaleVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (r4.equals("fontWeight") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzale zzg(org.xmlpull.v1.XmlPullParser r13, com.google.android.gms.internal.ads.zzale r14) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalb.zzg(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzale):com.google.android.gms.internal.ads.zzale");
    }

    private static String[] zzh(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i10 = zzet.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i10, int i11, zzajz zzajzVar, zzdn zzdnVar) {
        zzaju.zza(zzc(bArr, i10, i11), zzajzVar, zzdnVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026f A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, LOOP:1: B:113:0x026f->B:254:0x04e9, LOOP_START, PHI: r2 r5 r11 
      PHI: (r2v40 java.lang.String) = (r2v16 java.lang.String), (r2v78 java.lang.String) binds: [B:112:0x026d, B:254:0x04e9] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v7 java.util.HashMap) = (r5v1 java.util.HashMap), (r5v23 java.util.HashMap) binds: [B:112:0x026d, B:254:0x04e9] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v11 com.google.android.gms.internal.ads.zzakz) = (r11v5 com.google.android.gms.internal.ads.zzakz), (r11v28 com.google.android.gms.internal.ads.zzakz) binds: [B:112:0x026d, B:254:0x04e9] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01ce, B:81:0x01dc, B:83:0x01e2, B:85:0x01ea, B:87:0x01f2, B:89:0x01fa, B:91:0x0202, B:93:0x020a, B:95:0x0210, B:97:0x0218, B:99:0x0220, B:101:0x0226, B:103:0x022c, B:105:0x0234, B:107:0x023c, B:110:0x0245, B:384:0x06a1, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0630, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0181, B:66:0x018d, B:69:0x0198, B:71:0x019f, B:73:0x01ab, B:75:0x01b5, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:364:0x0650, B:367:0x065f, B:369:0x0669, B:371:0x0676, B:373:0x067e, B:377:0x0692, B:381:0x069a), top: B:426:0x0006, inners: #6, #7, #9, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x037a A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TRY_LEAVE, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01ce, B:81:0x01dc, B:83:0x01e2, B:85:0x01ea, B:87:0x01f2, B:89:0x01fa, B:91:0x0202, B:93:0x020a, B:95:0x0210, B:97:0x0218, B:99:0x0220, B:101:0x0226, B:103:0x022c, B:105:0x0234, B:107:0x023c, B:110:0x0245, B:384:0x06a1, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0630, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0181, B:66:0x018d, B:69:0x0198, B:71:0x019f, B:73:0x01ab, B:75:0x01b5, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:364:0x0650, B:367:0x065f, B:369:0x0669, B:371:0x0676, B:373:0x067e, B:377:0x0692, B:381:0x069a), top: B:426:0x0006, inners: #6, #7, #9, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03f5 A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TRY_LEAVE, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01ce, B:81:0x01dc, B:83:0x01e2, B:85:0x01ea, B:87:0x01f2, B:89:0x01fa, B:91:0x0202, B:93:0x020a, B:95:0x0210, B:97:0x0218, B:99:0x0220, B:101:0x0226, B:103:0x022c, B:105:0x0234, B:107:0x023c, B:110:0x0245, B:384:0x06a1, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0630, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0181, B:66:0x018d, B:69:0x0198, B:71:0x019f, B:73:0x01ab, B:75:0x01b5, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:364:0x0650, B:367:0x065f, B:369:0x0669, B:371:0x0676, B:373:0x067e, B:377:0x0692, B:381:0x069a), top: B:426:0x0006, inners: #6, #7, #9, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0443 A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TRY_LEAVE, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01ce, B:81:0x01dc, B:83:0x01e2, B:85:0x01ea, B:87:0x01f2, B:89:0x01fa, B:91:0x0202, B:93:0x020a, B:95:0x0210, B:97:0x0218, B:99:0x0220, B:101:0x0226, B:103:0x022c, B:105:0x0234, B:107:0x023c, B:110:0x0245, B:384:0x06a1, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0630, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0181, B:66:0x018d, B:69:0x0198, B:71:0x019f, B:73:0x01ab, B:75:0x01b5, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:364:0x0650, B:367:0x065f, B:369:0x0669, B:371:0x0676, B:373:0x067e, B:377:0x0692, B:381:0x069a), top: B:426:0x0006, inners: #6, #7, #9, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04ae A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01ce, B:81:0x01dc, B:83:0x01e2, B:85:0x01ea, B:87:0x01f2, B:89:0x01fa, B:91:0x0202, B:93:0x020a, B:95:0x0210, B:97:0x0218, B:99:0x0220, B:101:0x0226, B:103:0x022c, B:105:0x0234, B:107:0x023c, B:110:0x0245, B:384:0x06a1, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0630, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0181, B:66:0x018d, B:69:0x0198, B:71:0x019f, B:73:0x01ab, B:75:0x01b5, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:364:0x0650, B:367:0x065f, B:369:0x0669, B:371:0x0676, B:373:0x067e, B:377:0x0692, B:381:0x069a), top: B:426:0x0006, inners: #6, #7, #9, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04d8 A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01ce, B:81:0x01dc, B:83:0x01e2, B:85:0x01ea, B:87:0x01f2, B:89:0x01fa, B:91:0x0202, B:93:0x020a, B:95:0x0210, B:97:0x0218, B:99:0x0220, B:101:0x0226, B:103:0x022c, B:105:0x0234, B:107:0x023c, B:110:0x0245, B:384:0x06a1, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0630, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0181, B:66:0x018d, B:69:0x0198, B:71:0x019f, B:73:0x01ab, B:75:0x01b5, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:364:0x0650, B:367:0x065f, B:369:0x0669, B:371:0x0676, B:373:0x067e, B:377:0x0692, B:381:0x069a), top: B:426:0x0006, inners: #6, #7, #9, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04e9 A[LOOP:1: B:113:0x026f->B:254:0x04e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181 A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01ce, B:81:0x01dc, B:83:0x01e2, B:85:0x01ea, B:87:0x01f2, B:89:0x01fa, B:91:0x0202, B:93:0x020a, B:95:0x0210, B:97:0x0218, B:99:0x0220, B:101:0x0226, B:103:0x022c, B:105:0x0234, B:107:0x023c, B:110:0x0245, B:384:0x06a1, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0630, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0181, B:66:0x018d, B:69:0x0198, B:71:0x019f, B:73:0x01ab, B:75:0x01b5, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:364:0x0650, B:367:0x065f, B:369:0x0669, B:371:0x0676, B:373:0x067e, B:377:0x0692, B:381:0x069a), top: B:426:0x0006, inners: #6, #7, #9, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01dc A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TRY_ENTER, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:18:0x008e, B:21:0x0098, B:25:0x00aa, B:27:0x00c9, B:29:0x00d7, B:31:0x00de, B:33:0x00ea, B:35:0x00f5, B:61:0x0177, B:78:0x01ce, B:81:0x01dc, B:83:0x01e2, B:85:0x01ea, B:87:0x01f2, B:89:0x01fa, B:91:0x0202, B:93:0x020a, B:95:0x0210, B:97:0x0218, B:99:0x0220, B:101:0x0226, B:103:0x022c, B:105:0x0234, B:107:0x023c, B:110:0x0245, B:384:0x06a1, B:111:0x0269, B:113:0x026f, B:115:0x0278, B:117:0x0287, B:119:0x0291, B:121:0x02a5, B:123:0x02ab, B:251:0x04dd, B:124:0x02af, B:127:0x02b9, B:129:0x02bf, B:131:0x02ca, B:133:0x02d0, B:134:0x02d7, B:137:0x02e3, B:250:0x04d8, B:141:0x02f0, B:143:0x02f8, B:147:0x0311, B:149:0x0318, B:151:0x0326, B:166:0x0372, B:168:0x037a, B:171:0x0389, B:173:0x0390, B:175:0x039e, B:190:0x03ed, B:192:0x03f5, B:213:0x043b, B:215:0x0443, B:242:0x048c, B:177:0x03a9, B:178:0x03b4, B:181:0x03bc, B:184:0x03c8, B:186:0x03cf, B:188:0x03db, B:243:0x0498, B:244:0x04a3, B:245:0x04ae, B:153:0x032f, B:154:0x0339, B:157:0x0343, B:160:0x034e, B:162:0x0355, B:164:0x0361, B:246:0x04b5, B:247:0x04c0, B:248:0x04cb, B:256:0x04f5, B:259:0x0512, B:312:0x05b2, B:293:0x056e, B:296:0x0577, B:358:0x0630, B:299:0x057f, B:302:0x0589, B:309:0x059e, B:310:0x05a3, B:311:0x05ab, B:319:0x05c7, B:323:0x05d1, B:327:0x05da, B:337:0x05ee, B:345:0x0603, B:347:0x0611, B:349:0x0616, B:339:0x05f5, B:64:0x0181, B:66:0x018d, B:69:0x0198, B:71:0x019f, B:73:0x01ab, B:75:0x01b5, B:39:0x010c, B:41:0x0118, B:44:0x0123, B:46:0x012a, B:48:0x0136, B:54:0x014c, B:56:0x0153, B:60:0x016d, B:364:0x0650, B:367:0x065f, B:369:0x0669, B:371:0x0676, B:373:0x067e, B:377:0x0692, B:381:0x069a), top: B:426:0x0006, inners: #6, #7, #9, #12, #15 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzajv zzc(byte[] r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalb.zzc(byte[], int, int):com.google.android.gms.internal.ads.zzajv");
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* synthetic */ void zzb() {
    }
}
