package q9;

import com.google.android.play.core.assetpacks.internal.al;
import com.google.android.play.core.assetpacks.x0;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class h {
    public static void a(com.google.android.play.core.assetpacks.g0 g0Var, InputStream inputStream, x0 x0Var, long j10) {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt == -771763713) {
            int read = dataInputStream.read();
            if (read == 4) {
                long j11 = 0;
                while (true) {
                    long j12 = j10 - j11;
                    try {
                        int read2 = dataInputStream.read();
                        if (read2 != -1) {
                            if (read2 != 0) {
                                switch (read2) {
                                    case 247:
                                        read2 = dataInputStream.readUnsignedShort();
                                        c(bArr, dataInputStream, x0Var, read2, j12);
                                        break;
                                    case 248:
                                        read2 = dataInputStream.readInt();
                                        c(bArr, dataInputStream, x0Var, read2, j12);
                                        break;
                                    case 249:
                                        long readUnsignedShort = dataInputStream.readUnsignedShort();
                                        read2 = dataInputStream.read();
                                        if (read2 != -1) {
                                            b(bArr, g0Var, x0Var, readUnsignedShort, read2, j12);
                                            break;
                                        } else {
                                            throw new IOException("Unexpected end of patch");
                                        }
                                    case 250:
                                        read2 = dataInputStream.readUnsignedShort();
                                        b(bArr, g0Var, x0Var, dataInputStream.readUnsignedShort(), read2, j12);
                                        break;
                                    case 251:
                                        read2 = dataInputStream.readInt();
                                        b(bArr, g0Var, x0Var, dataInputStream.readUnsignedShort(), read2, j12);
                                        break;
                                    case 252:
                                        long readInt2 = dataInputStream.readInt();
                                        read2 = dataInputStream.read();
                                        if (read2 != -1) {
                                            b(bArr, g0Var, x0Var, readInt2, read2, j12);
                                            break;
                                        } else {
                                            throw new IOException("Unexpected end of patch");
                                        }
                                    case 253:
                                        read2 = dataInputStream.readUnsignedShort();
                                        b(bArr, g0Var, x0Var, dataInputStream.readInt(), read2, j12);
                                        break;
                                    case 254:
                                        read2 = dataInputStream.readInt();
                                        b(bArr, g0Var, x0Var, dataInputStream.readInt(), read2, j12);
                                        break;
                                    case FunctionEval.FunctionID.EXTERNAL_FUNC /* 255 */:
                                        long readLong = dataInputStream.readLong();
                                        read2 = dataInputStream.readInt();
                                        b(bArr, g0Var, x0Var, readLong, read2, j12);
                                        break;
                                    default:
                                        c(bArr, dataInputStream, x0Var, read2, j12);
                                        break;
                                }
                                j11 += read2;
                            } else {
                                return;
                            }
                        } else {
                            throw new IOException("Patch file overrun");
                        }
                    } finally {
                        x0Var.flush();
                    }
                }
            } else {
                throw new al(b.a.c("Unexpected version=", read));
            }
        } else {
            throw new al("Unexpected magic=".concat(String.valueOf(String.format("%x", Integer.valueOf(readInt)))));
        }
    }

    public static void b(byte[] bArr, com.google.android.play.core.assetpacks.g0 g0Var, x0 x0Var, long j10, int i10, long j11) {
        InputStream b10;
        int i11 = i10;
        if (i11 >= 0) {
            if (j10 >= 0) {
                long j12 = i11;
                if (j12 <= j11) {
                    try {
                        i iVar = new i(g0Var, j10, j12);
                        synchronized (iVar) {
                            b10 = iVar.b(0L, iVar.c - iVar.f29113b);
                        }
                        while (i11 > 0) {
                            int min = Math.min(i11, 16384);
                            int i12 = 0;
                            while (i12 < min) {
                                int read = b10.read(bArr, i12, min - i12);
                                if (read != -1) {
                                    i12 += read;
                                } else {
                                    throw new IOException("truncated input stream");
                                }
                            }
                            x0Var.write(bArr, 0, min);
                            i11 -= min;
                        }
                        b10.close();
                        return;
                    } catch (EOFException e10) {
                        throw new IOException("patch underrun", e10);
                    }
                }
                throw new IOException("Output length overrun");
            }
            throw new IOException("inputOffset negative");
        }
        throw new IOException("copyLength negative");
    }

    public static void c(byte[] bArr, DataInputStream dataInputStream, x0 x0Var, int i10, long j10) {
        if (i10 >= 0) {
            if (i10 <= j10) {
                while (i10 > 0) {
                    try {
                        int min = Math.min(i10, 16384);
                        dataInputStream.readFully(bArr, 0, min);
                        x0Var.write(bArr, 0, min);
                        i10 -= min;
                    } catch (EOFException unused) {
                        throw new IOException("patch underrun");
                    }
                }
                return;
            }
            throw new IOException("Output length overrun");
        }
        throw new IOException("copyLength negative");
    }
}
