package lib.zj.office.fc.doc;

import android.os.Handler;
import ej.b;
import ge.a;
import java.io.FileInputStream;
import java.util.Vector;
import lib.zj.office.fc.fs.storage.LittleEndian;
import lib.zj.office.system.e;
import lib.zj.office.system.f;
import lib.zj.office.system.g;

/* loaded from: classes3.dex */
public class TXTKit {
    private static TXTKit kit = new TXTKit();

    public static TXTKit instance() {
        return kit;
    }

    public void readText(final f fVar, final Handler handler, final String str) {
        String u7;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[16];
            fileInputStream.read(bArr);
            long j10 = LittleEndian.getLong(bArr, 0);
            if (j10 != -2226271756974174256L && j10 != 1688935826934608L) {
                if ((j10 & 72057594037927935L) == 13001919450861605L) {
                    fileInputStream.close();
                    fVar.o().c().a(true, new Exception("Format error"));
                    return;
                }
                fileInputStream.close();
                if (fVar.p()) {
                    u7 = "GBK";
                } else {
                    u7 = a.u(str);
                }
                if (u7 != null) {
                    new e(fVar, handler, str, u7).start();
                    return;
                } else if (fVar.s().L()) {
                    Vector vector = new Vector();
                    vector.add(str);
                    new b(fVar, fVar.s().m(), new g() { // from class: lib.zj.office.fc.doc.TXTKit.1
                        @Override // lib.zj.office.system.g
                        public void doAction(int i10, Vector<Object> vector2) {
                            if ("BP".equals(vector2.get(0))) {
                                fVar.s().m().onBackPressed();
                            } else {
                                new e(fVar, handler, str, vector2.get(0).toString()).start();
                            }
                        }

                        public f getControl() {
                            return fVar;
                        }

                        public void dispose() {
                        }
                    }, vector).show();
                    return;
                } else {
                    String a12 = fVar.s().a1();
                    if (a12 == null) {
                        sg.b u10 = fVar.u();
                        if (u10 != null) {
                            u10.b();
                            return;
                        } else {
                            new e(fVar, handler, str, "UTF-8").start();
                            return;
                        }
                    }
                    new e(fVar, handler, str, a12).start();
                    return;
                }
            }
            fileInputStream.close();
            fVar.o().c().a(true, new Exception("Format error"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void reopenFile(f fVar, Handler handler, String str, String str2) {
        new e(fVar, handler, str, str2).start();
    }
}
