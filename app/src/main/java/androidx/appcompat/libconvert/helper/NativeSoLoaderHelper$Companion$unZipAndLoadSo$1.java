package androidx.appcompat.libconvert.helper;

import android.app.Activity;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import tf.d;
import wf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NativeSoLoaderHelper.kt */
@c(c = "androidx.appcompat.libconvert.helper.NativeSoLoaderHelper$Companion$unZipAndLoadSo$1", f = "NativeSoLoaderHelper.kt", l = {ShapeTypes.ACTION_BUTTON_FORWARD_NEXT}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NativeSoLoaderHelper$Companion$unZipAndLoadSo$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ NativeSoLoaderHelper.b $callBack;
    final /* synthetic */ String $zipPwd;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSoLoaderHelper$Companion$unZipAndLoadSo$1(Activity activity, NativeSoLoaderHelper.b bVar, String str, kotlin.coroutines.c<? super NativeSoLoaderHelper$Companion$unZipAndLoadSo$1> cVar) {
        super(2, cVar);
        this.$activity = activity;
        this.$callBack = bVar;
        this.$zipPwd = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new NativeSoLoaderHelper$Companion$unZipAndLoadSo$1(this.$activity, this.$callBack, this.$zipPwd, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03df A[Catch: all -> 0x008a, Exception -> 0x008d, TryCatch #2 {Exception -> 0x008d, blocks: (B:6:0x001d, B:74:0x01ab, B:76:0x01b3, B:78:0x01bf, B:79:0x01ce, B:81:0x01e6, B:82:0x01ec, B:85:0x01ff, B:87:0x020b, B:88:0x021b, B:90:0x0223, B:103:0x02ba, B:187:0x0416, B:157:0x03a1, B:159:0x03a5, B:164:0x03b8, B:166:0x03c0, B:168:0x03d3, B:173:0x03df, B:175:0x03e3, B:176:0x03eb, B:178:0x03ef, B:179:0x03f7, B:181:0x03ff, B:183:0x0403, B:11:0x002d, B:13:0x0031, B:15:0x0037, B:18:0x0041, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x005c, B:26:0x0077, B:31:0x0090, B:33:0x00a6, B:35:0x00af, B:36:0x00b6, B:37:0x00ba, B:39:0x00c0, B:40:0x00d6, B:42:0x00dc, B:44:0x00e7, B:45:0x00ee, B:46:0x00f2, B:54:0x010a, B:56:0x0113, B:57:0x011a, B:58:0x0124, B:60:0x014a, B:62:0x014e, B:63:0x0153, B:65:0x015b, B:67:0x015f, B:68:0x0166, B:70:0x0175, B:72:0x0180, B:73:0x018e, B:184:0x040b, B:186:0x040f, B:49:0x00ff, B:188:0x041a, B:190:0x0428, B:191:0x042f), top: B:213:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03eb A[Catch: all -> 0x008a, Exception -> 0x008d, TryCatch #2 {Exception -> 0x008d, blocks: (B:6:0x001d, B:74:0x01ab, B:76:0x01b3, B:78:0x01bf, B:79:0x01ce, B:81:0x01e6, B:82:0x01ec, B:85:0x01ff, B:87:0x020b, B:88:0x021b, B:90:0x0223, B:103:0x02ba, B:187:0x0416, B:157:0x03a1, B:159:0x03a5, B:164:0x03b8, B:166:0x03c0, B:168:0x03d3, B:173:0x03df, B:175:0x03e3, B:176:0x03eb, B:178:0x03ef, B:179:0x03f7, B:181:0x03ff, B:183:0x0403, B:11:0x002d, B:13:0x0031, B:15:0x0037, B:18:0x0041, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x005c, B:26:0x0077, B:31:0x0090, B:33:0x00a6, B:35:0x00af, B:36:0x00b6, B:37:0x00ba, B:39:0x00c0, B:40:0x00d6, B:42:0x00dc, B:44:0x00e7, B:45:0x00ee, B:46:0x00f2, B:54:0x010a, B:56:0x0113, B:57:0x011a, B:58:0x0124, B:60:0x014a, B:62:0x014e, B:63:0x0153, B:65:0x015b, B:67:0x015f, B:68:0x0166, B:70:0x0175, B:72:0x0180, B:73:0x018e, B:184:0x040b, B:186:0x040f, B:49:0x00ff, B:188:0x041a, B:190:0x0428, B:191:0x042f), top: B:213:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0451 A[Catch: all -> 0x008a, TryCatch #3 {all -> 0x008a, blocks: (B:6:0x001d, B:74:0x01ab, B:76:0x01b3, B:78:0x01bf, B:79:0x01ce, B:81:0x01e6, B:82:0x01ec, B:85:0x01ff, B:87:0x020b, B:88:0x021b, B:90:0x0223, B:103:0x02ba, B:187:0x0416, B:157:0x03a1, B:159:0x03a5, B:194:0x043a, B:196:0x0445, B:201:0x0451, B:203:0x0455, B:204:0x045d, B:206:0x0464, B:164:0x03b8, B:166:0x03c0, B:168:0x03d3, B:173:0x03df, B:175:0x03e3, B:176:0x03eb, B:178:0x03ef, B:179:0x03f7, B:181:0x03ff, B:183:0x0403, B:11:0x002d, B:13:0x0031, B:15:0x0037, B:18:0x0041, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x005c, B:26:0x0077, B:31:0x0090, B:33:0x00a6, B:35:0x00af, B:36:0x00b6, B:37:0x00ba, B:39:0x00c0, B:40:0x00d6, B:42:0x00dc, B:44:0x00e7, B:45:0x00ee, B:46:0x00f2, B:54:0x010a, B:56:0x0113, B:57:0x011a, B:58:0x0124, B:60:0x014a, B:62:0x014e, B:63:0x0153, B:65:0x015b, B:67:0x015f, B:68:0x0166, B:70:0x0175, B:72:0x0180, B:73:0x018e, B:184:0x040b, B:186:0x040f, B:49:0x00ff, B:188:0x041a, B:190:0x0428, B:191:0x042f), top: B:213:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x045d A[Catch: all -> 0x008a, TryCatch #3 {all -> 0x008a, blocks: (B:6:0x001d, B:74:0x01ab, B:76:0x01b3, B:78:0x01bf, B:79:0x01ce, B:81:0x01e6, B:82:0x01ec, B:85:0x01ff, B:87:0x020b, B:88:0x021b, B:90:0x0223, B:103:0x02ba, B:187:0x0416, B:157:0x03a1, B:159:0x03a5, B:194:0x043a, B:196:0x0445, B:201:0x0451, B:203:0x0455, B:204:0x045d, B:206:0x0464, B:164:0x03b8, B:166:0x03c0, B:168:0x03d3, B:173:0x03df, B:175:0x03e3, B:176:0x03eb, B:178:0x03ef, B:179:0x03f7, B:181:0x03ff, B:183:0x0403, B:11:0x002d, B:13:0x0031, B:15:0x0037, B:18:0x0041, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x005c, B:26:0x0077, B:31:0x0090, B:33:0x00a6, B:35:0x00af, B:36:0x00b6, B:37:0x00ba, B:39:0x00c0, B:40:0x00d6, B:42:0x00dc, B:44:0x00e7, B:45:0x00ee, B:46:0x00f2, B:54:0x010a, B:56:0x0113, B:57:0x011a, B:58:0x0124, B:60:0x014a, B:62:0x014e, B:63:0x0153, B:65:0x015b, B:67:0x015f, B:68:0x0166, B:70:0x0175, B:72:0x0180, B:73:0x018e, B:184:0x040b, B:186:0x040f, B:49:0x00ff, B:188:0x041a, B:190:0x0428, B:191:0x042f), top: B:213:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a A[Catch: all -> 0x008a, Exception -> 0x008d, TryCatch #2 {Exception -> 0x008d, blocks: (B:6:0x001d, B:74:0x01ab, B:76:0x01b3, B:78:0x01bf, B:79:0x01ce, B:81:0x01e6, B:82:0x01ec, B:85:0x01ff, B:87:0x020b, B:88:0x021b, B:90:0x0223, B:103:0x02ba, B:187:0x0416, B:157:0x03a1, B:159:0x03a5, B:164:0x03b8, B:166:0x03c0, B:168:0x03d3, B:173:0x03df, B:175:0x03e3, B:176:0x03eb, B:178:0x03ef, B:179:0x03f7, B:181:0x03ff, B:183:0x0403, B:11:0x002d, B:13:0x0031, B:15:0x0037, B:18:0x0041, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x005c, B:26:0x0077, B:31:0x0090, B:33:0x00a6, B:35:0x00af, B:36:0x00b6, B:37:0x00ba, B:39:0x00c0, B:40:0x00d6, B:42:0x00dc, B:44:0x00e7, B:45:0x00ee, B:46:0x00f2, B:54:0x010a, B:56:0x0113, B:57:0x011a, B:58:0x0124, B:60:0x014a, B:62:0x014e, B:63:0x0153, B:65:0x015b, B:67:0x015f, B:68:0x0166, B:70:0x0175, B:72:0x0180, B:73:0x018e, B:184:0x040b, B:186:0x040f, B:49:0x00ff, B:188:0x041a, B:190:0x0428, B:191:0x042f), top: B:213:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124 A[Catch: all -> 0x008a, Exception -> 0x008d, TryCatch #2 {Exception -> 0x008d, blocks: (B:6:0x001d, B:74:0x01ab, B:76:0x01b3, B:78:0x01bf, B:79:0x01ce, B:81:0x01e6, B:82:0x01ec, B:85:0x01ff, B:87:0x020b, B:88:0x021b, B:90:0x0223, B:103:0x02ba, B:187:0x0416, B:157:0x03a1, B:159:0x03a5, B:164:0x03b8, B:166:0x03c0, B:168:0x03d3, B:173:0x03df, B:175:0x03e3, B:176:0x03eb, B:178:0x03ef, B:179:0x03f7, B:181:0x03ff, B:183:0x0403, B:11:0x002d, B:13:0x0031, B:15:0x0037, B:18:0x0041, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x005c, B:26:0x0077, B:31:0x0090, B:33:0x00a6, B:35:0x00af, B:36:0x00b6, B:37:0x00ba, B:39:0x00c0, B:40:0x00d6, B:42:0x00dc, B:44:0x00e7, B:45:0x00ee, B:46:0x00f2, B:54:0x010a, B:56:0x0113, B:57:0x011a, B:58:0x0124, B:60:0x014a, B:62:0x014e, B:63:0x0153, B:65:0x015b, B:67:0x015f, B:68:0x0166, B:70:0x0175, B:72:0x0180, B:73:0x018e, B:184:0x040b, B:186:0x040f, B:49:0x00ff, B:188:0x041a, B:190:0x0428, B:191:0x042f), top: B:213:0x000d }] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.libconvert.helper.NativeSoLoaderHelper$Companion$unZipAndLoadSo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((NativeSoLoaderHelper$Companion$unZipAndLoadSo$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
